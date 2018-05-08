package com.school.oa.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Score implements Serializable{
	
	private Integer id;
	private Integer subject_id;
	private String subject_name;
	private Double score;
	private Integer user_id;
	private String user_name;
	private Timestamp create_time;
	private Timestamp update_time;
	private String note;
	private String is_active;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", subject_id=" + subject_id + ", subject_name=" + subject_name + ", score=" + score
				+ ", user_id=" + user_id + ", user_name=" + user_name + ", create_time=" + create_time
				+ ", update_time=" + update_time + ", note=" + note + ", is_active=" + is_active + "]";
	}
	
	
}
