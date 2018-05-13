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
	private String state;
	private Timestamp create_time;
	private Timestamp update_time;
	private String is_active;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
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
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book_code == null) ? 0 : book_code.hashCode());
		result = prime * result + ((book_name == null) ? 0 : book_name.hashCode());
		result = prime * result + ((borrow_id == null) ? 0 : borrow_id.hashCode());
		result = prime * result + ((borrow_name == null) ? 0 : borrow_name.hashCode());
		result = prime * result + ((borrow_num == null) ? 0 : borrow_num.hashCode());
		result = prime * result + ((borrow_time == null) ? 0 : borrow_time.hashCode());
		result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((give_id == null) ? 0 : give_id.hashCode());
		result = prime * result + ((give_name == null) ? 0 : give_name.hashCode());
		result = prime * result + ((give_time == null) ? 0 : give_time.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((is_active == null) ? 0 : is_active.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((update_time == null) ? 0 : update_time.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (book_code == null) {
			if (other.book_code != null)
				return false;
		} else if (!book_code.equals(other.book_code))
			return false;
		if (book_name == null) {
			if (other.book_name != null)
				return false;
		} else if (!book_name.equals(other.book_name))
			return false;
		if (borrow_id == null) {
			if (other.borrow_id != null)
				return false;
		} else if (!borrow_id.equals(other.borrow_id))
			return false;
		if (borrow_name == null) {
			if (other.borrow_name != null)
				return false;
		} else if (!borrow_name.equals(other.borrow_name))
			return false;
		if (borrow_num == null) {
			if (other.borrow_num != null)
				return false;
		} else if (!borrow_num.equals(other.borrow_num))
			return false;
		if (borrow_time == null) {
			if (other.borrow_time != null)
				return false;
		} else if (!borrow_time.equals(other.borrow_time))
			return false;
		if (create_time == null) {
			if (other.create_time != null)
				return false;
		} else if (!create_time.equals(other.create_time))
			return false;
		if (give_id == null) {
			if (other.give_id != null)
				return false;
		} else if (!give_id.equals(other.give_id))
			return false;
		if (give_name == null) {
			if (other.give_name != null)
				return false;
		} else if (!give_name.equals(other.give_name))
			return false;
		if (give_time == null) {
			if (other.give_time != null)
				return false;
		} else if (!give_time.equals(other.give_time))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (is_active == null) {
			if (other.is_active != null)
				return false;
		} else if (!is_active.equals(other.is_active))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (update_time == null) {
			if (other.update_time != null)
				return false;
		} else if (!update_time.equals(other.update_time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", book_code=" + book_code + ", borrow_id=" + borrow_id
				+ ", borrow_name=" + borrow_name + ", borrow_time=" + borrow_time + ", borrow_num=" + borrow_num
				+ ", give_id=" + give_id + ", give_name=" + give_name + ", give_time=" + give_time + ", state=" + state
				+ ", create_time=" + create_time + ", update_time=" + update_time + ", is_active=" + is_active + "]";
	}
	
	
	
	
    
}