package com.school.oa.controller.util;

import java.io.Serializable;

/**
 * <b>定义了JSON返回结果的统一封装类</b><br />
 * <em style="color:red;">请大家统一按照这个实体类中的格式给前端返回json结果</em><br />
 * <em>工具类提供了快速封装方法,请参考本类的success,incomplete,error,notVerified,unauthorized工具方法</em><br />
 * @author Ray
 */
public class FrontResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5742369986697877598L;

	private int code = SUCCESS;

	private Object data;

	private String msg = "操作成功";

	private String directUrl = null;

	/** 成功,200 **/
	public static final int SUCCESS = 200;
	
	/** 参数不全,201 **/
	public static final int INCOMPLETE = 201;
	
	/** 失败,202 **/
	public static final int FAILURE = 202;
	
	/**
	 * 未登录的,203
	 */
	public static final int NOTVERIFIED=203;
	
	/**
	 * 未授权的操作,204
	 */
	public static final int  UNAUTHORIZED=204;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDirectUrl() {
		return directUrl;
	}

	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public FrontResponse() {
		super();
	}

	public FrontResponse(int code, Object data, String msg, String directUrl) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
		this.directUrl = directUrl;
	}
	
	@Override
	public String toString() {
		return "FrontResponse [code=" + code + ", data=" + data + ", msg=" + msg + ", directUrl=" + directUrl + "]";
	}

	/**
	 * <b>返回"操作成功"的结果对象,code全部都是200</b><br />
	 * 
	 * <em style="color:red;">参数可以任意,但请注意取用规则</em><br />
	 * <b style="color:blue;">参数位标说明:[msg,data,directUrl]</b><br />
	 * <em>
	 * 传入0个参数时: 默认初始化为msg="操作成功",data和directUrl都为null <br />
	 	1个参数,用于初始化  msg <br />
	 	2个参数,按排序初始化  msg和data <br />
	 	3个参数, 按次序初始化 msg,data,directUrl<br />
	 	<b>如果你吃了没事干传更多参数进来, 最多只取前面三个,剩下的无作用</b><br />
	 * @param args
	 * @return
	 */
	public static FrontResponse success(Object...args ) {
		int length = args.length;
		
		if(length<=0) {
			return new FrontResponse(SUCCESS,null,"操作成功",null);
		}
		if(length<=1) {
			return new FrontResponse(SUCCESS,null,(String)args[0],null);
		}
		if(length<=2) {
			return new FrontResponse(SUCCESS,args[1],(String)args[0],null);
		}
		if(length>=3) {
			return new FrontResponse(SUCCESS,args[1],(String)args[0],(String)args[2]);
		}
		
		return new FrontResponse(SUCCESS,null,"操作成功",null);
	}
	
	
	
	/**
	 * <b>返回"缺少参数"的结果对象,code全部都是201</b><br />
	 * 
	 * <em style="color:red;">参数可以任意,但请注意取用规则</em><br />
	 * <b style="color:blue;">参数位标说明:[msg,data,directUrl]</b><br />
	 * <em>
	 * 传入0个参数时: 默认初始化为msg="操作成功",data和directUrl都为null <br />
	 	1个参数,用于初始化  msg <br />
	 	2个参数,按排序初始化  msg和data <br />
	 	3个参数, 按次序初始化 msg,data,directUrl<br />
	 	<b>如果你吃了没事干传更多参数进来, 最多只取前面三个,剩下的无作用</b><br />
	 * @param args
	 * @return
	 */
	public static FrontResponse incomplete(Object...args ) {
		int length = args.length;
		
		if(length<=0) {
			return new FrontResponse(INCOMPLETE,null,"缺少参数",null);
		}
		if(length<=1) {
			return new FrontResponse(INCOMPLETE,null,(String)args[0],null);
		}
		if(length<=2) {
			return new FrontResponse(INCOMPLETE,args[1],(String)args[0],null);
		}
		if(length>=3) {
			return new FrontResponse(INCOMPLETE,args[1],(String)args[0],(String)args[2]);
		}
		
		return new FrontResponse(INCOMPLETE,null,"缺少参数",null);
	}
	
	
	
	/**
	 * <b>返回"执行失败"的结果对象,code全部都是202</b><br />
	 * 
	 * <em style="color:red;">参数可以任意,但请注意取用规则</em><br />
	 * <b style="color:blue;">参数位标说明:[msg,data,directUrl]</b><br />
	 * <em>
	 * 传入0个参数时: 默认初始化为msg="操作成功",data和directUrl都为null <br />
	 	1个参数,用于初始化  msg <br />
	 	2个参数,按排序初始化  msg和data <br />
	 	3个参数, 按次序初始化 msg,data,directUrl<br />
	 	<b>如果你吃了没事干传更多参数进来, 最多只取前面三个,剩下的无作用</b><br />
	 * @param args
	 * @return
	 */
	public static FrontResponse error(Object...args ) {
		int length = args.length;
		
		if(length<=0) {
			return new FrontResponse(FAILURE,null,"执行失败",null);
		}
		if(length<=1) {
			return new FrontResponse(FAILURE,null,(String)args[0],null);
		}
		if(length<=2) {
			return new FrontResponse(FAILURE,args[1],(String)args[0],null);
		}
		if(length>=3) {
			return new FrontResponse(FAILURE,args[1],(String)args[0],(String)args[2]);
		}
		return new FrontResponse(FAILURE,null,"执行失败",null);
	}
	
	/**
	 * <b>返回"未登录"的结果对象,code全部都是203</b><br />
	 * 
	 * <em style="color:red;">参数可以任意,但请注意取用规则</em><br />
	 * <b style="color:blue;">参数位标说明:[msg,data,directUrl]</b><br />
	 * <em>
	 * 传入0个参数时: 默认初始化为msg="操作成功",data和directUrl都为null <br />
	 	1个参数,用于初始化  msg <br />
	 	2个参数,按排序初始化  msg和data <br />
	 	3个参数, 按次序初始化 msg,data,directUrl<br />
	 	<b>如果你吃了没事干传更多参数进来, 最多只取前面三个,剩下的无作用</b><br />
	 * @param args
	 * @return
	 */
	public static FrontResponse notVerified(Object...args ) {
		int length = args.length;
		
		if(length<=0) {
			return new FrontResponse(NOTVERIFIED,null,"未登录",null);
		}
		if(length<=1) {
			return new FrontResponse(NOTVERIFIED,null,(String)args[0],null);
		}
		if(length<=2) {
			return new FrontResponse(NOTVERIFIED,args[1],(String)args[0],null);
		}
		if(length>=3) {
			return new FrontResponse(NOTVERIFIED,args[1],(String)args[0],(String)args[2]);
		}
		return new FrontResponse(NOTVERIFIED,null,"未登录",null);
	}
	
	
	/**
	 * <b>返回"无权限"的结果对象,code全部都是204</b><br />
	 * 
	 * <em style="color:red;">参数可以任意,但请注意取用规则</em><br />
	 * <b style="color:blue;">参数位标说明:[msg,data,directUrl]</b><br />
	 * <em>
	 * 传入0个参数时: 默认初始化为msg="操作成功",data和directUrl都为null <br />
	 	1个参数,用于初始化  msg <br />
	 	2个参数,按排序初始化  msg和data <br />
	 	3个参数, 按次序初始化 msg,data,directUrl<br />
	 	<b>如果你吃了没事干传更多参数进来, 最多只取前面三个,剩下的无作用</b><br />
	 * @param args
	 * @return
	 */
	public static FrontResponse unauthorized(Object...args ) {
		int length = args.length;
		
		if(length<=0) {
			return new FrontResponse(UNAUTHORIZED,null,"无权限",null);
		}
		if(length<=1) {
			return new FrontResponse(UNAUTHORIZED,null,(String)args[0],null);
		}
		if(length<=2) {
			return new FrontResponse(UNAUTHORIZED,args[1],(String)args[0],null);
		}
		if(length>=3) {
			return new FrontResponse(UNAUTHORIZED,args[1],(String)args[0],(String)args[2]);
		}
		return new FrontResponse(UNAUTHORIZED,null,"无权限",null);
	}
	
	public static void main(String[] args) {
		FrontResponse.success();//默认的执行成功方法, code=200,msg="执行成功"
		FrontResponse.success("只有一个参数时,作为消息使用");
		FrontResponse.success("两个参数时,第一个参数被作为msg使用",new String("第二个参数被作为data使用"));
		FrontResponse.success("三个参数时,第一个参数呗作为msg使用",new String("第二个参数被作为data使用"),"/account/info/第三个参数被用作directUrl");
		FrontResponse.success("大于三个参数时,第一个参数呗作为msg使用",new String("第二个参数被作为data使用"),"/account/info/第三个参数被用作directUrl","传再多参数也只取前面三个,后面的无效");
	}
}
