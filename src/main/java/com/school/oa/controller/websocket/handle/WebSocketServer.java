package com.school.oa.controller.websocket.handle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ServerEndpoint(value="/websocket")
@Component
public class WebSocketServer {
	
	private Session session;
	private static Map<String,Session> map = new HashMap<>();
	private static List<Session> sockets = new ArrayList<>(); 
	 private static CopyOnWriteArraySet<WebSocketServer> sessions = new CopyOnWriteArraySet<WebSocketServer>();
	
	@OnOpen
	public void open(Session session) {
		try 
		{
			this.session = session;
			sockets.add(session);
			sessions.add(this);
			System.out.println("连接成功");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@OnMessage
	public void message(Session session,String msg) {
		System.out.println("接收前端信息:"+msg);
		try
		{
			sendMessage("你好");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@OnClose
	public void close() {
		sessions.remove(this);
	}
	
	@OnError
	public void error(Session session,Throwable error) {
		if(session.isOpen()) {
	
			error.printStackTrace();
			System.out.println("发生错误，已关闭连接。。。");
		
		}
	}
	
	public void sendMessage(String message) throws IOException {  
        this.session.getBasicRemote().sendText(message);  
    } 
	
	public static void sendMessageToUsers(String message) {
		
		for(WebSocketServer item : sessions) {
			try 
			{
				if(item!=null) {
					item.session.getBasicRemote().sendText(message);
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
