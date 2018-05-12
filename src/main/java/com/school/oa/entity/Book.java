package com.school.oa.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Book implements Serializable{
	
	private Integer id;
	private String book_name;
	private String book_code;
	private Integer borrow_id;
	private String borrow_name;
	private Timestamp borrow_time;
	private Integer borrow_num;
	private Integer give_id;
	private String give_name;
	private Timestamp give_time;
	private Integer state;
	private Timestamp create_time;
	private Timestamp update_time;
	private Integer is_active;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public Integer getBorrow_id() {
		return borrow_id;
	}
	public void setBorrow_id(Integer borrow_id) {
		this.borrow_id = borrow_id;
	}
	public String getBorrow_name() {
		return borrow_name;
	}
	public void setBorrow_name(String borrow_name) {
		this.borrow_name = borrow_name;
	}
	public Timestamp getBorrow_time() {
		return borrow_time;
	}
	public void setBorrow_time(Timestamp borrow_time) {
		this.borrow_time = borrow_time;
	}
	public Integer getBorrow_num() {
		return borrow_num;
	}
	public void setBorrow_num(Integer borrow_num) {
		this.borrow_num = borrow_num;
	}
	public Integer getGive_id() {
		return give_id;
	}
	public void setGive_id(Integer give_id) {
		this.give_id = give_id;
	}
	public String getGive_name() {
		return give_name;
	}
	public void setGive_name(String give_name) {
		this.give_name = give_name;
	}
	public Timestamp getGive_time() {
		return give_time;
	}
	public void setGive_time(Timestamp give_time) {
		this.give_time = give_time;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
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
	public Integer getIs_active() {
		return is_active;
	}
	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", book_code=" + book_code + ", borrow_id=" + borrow_id
				+ ", borrow_name=" + borrow_name + ", borrow_time=" + borrow_time + ", borrow_num=" + borrow_num
				+ ", give_id=" + give_id + ", give_name=" + give_name + ", give_time=" + give_time + ", state=" + state
				+ ", create_time=" + create_time + ", update_time=" + update_time + ", is_active=" + is_active + "]";
	}
	

    
}