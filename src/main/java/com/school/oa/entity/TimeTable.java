package com.school.oa.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class TimeTable implements Serializable{

	private Integer id;
	private Integer college_id;
	private Integer class_id;
	private Integer mon;
	private Integer tues;
	private Integer wed;
	private Integer thurs;
	private Integer fir;
	private Integer sat;
	private Integer sun;
	private String mon_class_name;
	private String tues_class_name;
	private String wed_class_name;
	private String thurs_class_name;
	private String fir_class_name;
	private String sat_class_name;
	private String sun_class_name;
	private Integer part;
	private Timestamp create_time;
	private Timestamp update_time;
	private String is_active;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCollege_id() {
		return college_id;
	}
	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public Integer getMon() {
		return mon;
	}
	public void setMon(Integer mon) {
		this.mon = mon;
	}
	public Integer getTues() {
		return tues;
	}
	public void setTues(Integer tues) {
		this.tues = tues;
	}
	public Integer getWed() {
		return wed;
	}
	public void setWed(Integer wed) {
		this.wed = wed;
	}
	public Integer getThurs() {
		return thurs;
	}
	public void setThurs(Integer thurs) {
		this.thurs = thurs;
	}
	public Integer getFir() {
		return fir;
	}
	public void setFir(Integer fir) {
		this.fir = fir;
	}
	public Integer getSat() {
		return sat;
	}
	public void setSat(Integer sat) {
		this.sat = sat;
	}
	public Integer getSun() {
		return sun;
	}
	public void setSun(Integer sun) {
		this.sun = sun;
	}
	public String getMon_class_name() {
		return mon_class_name;
	}
	public void setMon_class_name(String mon_class_name) {
		this.mon_class_name = mon_class_name;
	}
	public String getTues_class_name() {
		return tues_class_name;
	}
	public void setTues_class_name(String tues_class_name) {
		this.tues_class_name = tues_class_name;
	}
	public String getWed_class_name() {
		return wed_class_name;
	}
	public void setWed_class_name(String wed_class_name) {
		this.wed_class_name = wed_class_name;
	}
	public String getThurs_class_name() {
		return thurs_class_name;
	}
	public void setThurs_class_name(String thurs_class_name) {
		this.thurs_class_name = thurs_class_name;
	}
	public String getFir_class_name() {
		return fir_class_name;
	}
	public void setFir_class_name(String fir_class_name) {
		this.fir_class_name = fir_class_name;
	}
	public String getSat_class_name() {
		return sat_class_name;
	}
	public void setSat_class_name(String sat_class_name) {
		this.sat_class_name = sat_class_name;
	}
	public String getSun_class_name() {
		return sun_class_name;
	}
	public void setSun_class_name(String sun_class_name) {
		this.sun_class_name = sun_class_name;
	}
	public Integer getPart() {
		return part;
	}
	public void setPart(Integer part) {
		this.part = part;
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
	public String toString() {
		return "TimeTable [id=" + id + ", college_id=" + college_id + ", class_id=" + class_id + ", mon=" + mon
				+ ", tues=" + tues + ", wed=" + wed + ", thurs=" + thurs + ", fir=" + fir + ", sat=" + sat + ", sun="
				+ sun + ", mon_class_name=" + mon_class_name + ", tues_class_name=" + tues_class_name
				+ ", wed_class_name=" + wed_class_name + ", thurs_class_name=" + thurs_class_name + ", fir_class_name="
				+ fir_class_name + ", sat_class_name=" + sat_class_name + ", sun_class_name=" + sun_class_name
				+ ", part=" + part + ", create_time=" + create_time + ", update_time=" + update_time + ", is_active="
				+ is_active + "]";
	}
	
	
}
