package com.school.oa.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Notice implements Serializable{
	
	private Integer id;
	private String theme;
	private String content;
	private Timestamp create_time;
	private Timestamp update_time;
	private String is_active;
	private Integer user_id;
	private String user_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", theme=" + theme + ", content=" + content + ", create_time=" + create_time
				+ ", update_time=" + update_time + ", is_active=" + is_active + ", user_id=" + user_id + ", user_name="
				+ user_name + "]";
	}
	
	
}
