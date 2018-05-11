package com.school.oa.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class TimeTable implements Serializable{

	private Integer id;
	private Integer college_id;
	private String college_name;
	private Integer class_id;
	private String class_name;
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
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((class_id == null) ? 0 : class_id.hashCode());
		result = prime * result + ((class_name == null) ? 0 : class_name.hashCode());
		result = prime * result + ((college_id == null) ? 0 : college_id.hashCode());
		result = prime * result + ((college_name == null) ? 0 : college_name.hashCode());
		result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((fir == null) ? 0 : fir.hashCode());
		result = prime * result + ((fir_class_name == null) ? 0 : fir_class_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((is_active == null) ? 0 : is_active.hashCode());
		result = prime * result + ((mon == null) ? 0 : mon.hashCode());
		result = prime * result + ((mon_class_name == null) ? 0 : mon_class_name.hashCode());
		result = prime * result + ((part == null) ? 0 : part.hashCode());
		result = prime * result + ((sat == null) ? 0 : sat.hashCode());
		result = prime * result + ((sat_class_name == null) ? 0 : sat_class_name.hashCode());
		result = prime * result + ((sun == null) ? 0 : sun.hashCode());
		result = prime * result + ((sun_class_name == null) ? 0 : sun_class_name.hashCode());
		result = prime * result + ((thurs == null) ? 0 : thurs.hashCode());
		result = prime * result + ((thurs_class_name == null) ? 0 : thurs_class_name.hashCode());
		result = prime * result + ((tues == null) ? 0 : tues.hashCode());
		result = prime * result + ((tues_class_name == null) ? 0 : tues_class_name.hashCode());
		result = prime * result + ((update_time == null) ? 0 : update_time.hashCode());
		result = prime * result + ((wed == null) ? 0 : wed.hashCode());
		result = prime * result + ((wed_class_name == null) ? 0 : wed_class_name.hashCode());
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
		TimeTable other = (TimeTable) obj;
		if (class_id == null) {
			if (other.class_id != null)
				return false;
		} else if (!class_id.equals(other.class_id))
			return false;
		if (class_name == null) {
			if (other.class_name != null)
				return false;
		} else if (!class_name.equals(other.class_name))
			return false;
		if (college_id == null) {
			if (other.college_id != null)
				return false;
		} else if (!college_id.equals(other.college_id))
			return false;
		if (college_name == null) {
			if (other.college_name != null)
				return false;
		} else if (!college_name.equals(other.college_name))
			return false;
		if (create_time == null) {
			if (other.create_time != null)
				return false;
		} else if (!create_time.equals(other.create_time))
			return false;
		if (fir == null) {
			if (other.fir != null)
				return false;
		} else if (!fir.equals(other.fir))
			return false;
		if (fir_class_name == null) {
			if (other.fir_class_name != null)
				return false;
		} else if (!fir_class_name.equals(other.fir_class_name))
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
		if (mon == null) {
			if (other.mon != null)
				return false;
		} else if (!mon.equals(other.mon))
			return false;
		if (mon_class_name == null) {
			if (other.mon_class_name != null)
				return false;
		} else if (!mon_class_name.equals(other.mon_class_name))
			return false;
		if (part == null) {
			if (other.part != null)
				return false;
		} else if (!part.equals(other.part))
			return false;
		if (sat == null) {
			if (other.sat != null)
				return false;
		} else if (!sat.equals(other.sat))
			return false;
		if (sat_class_name == null) {
			if (other.sat_class_name != null)
				return false;
		} else if (!sat_class_name.equals(other.sat_class_name))
			return false;
		if (sun == null) {
			if (other.sun != null)
				return false;
		} else if (!sun.equals(other.sun))
			return false;
		if (sun_class_name == null) {
			if (other.sun_class_name != null)
				return false;
		} else if (!sun_class_name.equals(other.sun_class_name))
			return false;
		if (thurs == null) {
			if (other.thurs != null)
				return false;
		} else if (!thurs.equals(other.thurs))
			return false;
		if (thurs_class_name == null) {
			if (other.thurs_class_name != null)
				return false;
		} else if (!thurs_class_name.equals(other.thurs_class_name))
			return false;
		if (tues == null) {
			if (other.tues != null)
				return false;
		} else if (!tues.equals(other.tues))
			return false;
		if (tues_class_name == null) {
			if (other.tues_class_name != null)
				return false;
		} else if (!tues_class_name.equals(other.tues_class_name))
			return false;
		if (update_time == null) {
			if (other.update_time != null)
				return false;
		} else if (!update_time.equals(other.update_time))
			return false;
		if (wed == null) {
			if (other.wed != null)
				return false;
		} else if (!wed.equals(other.wed))
			return false;
		if (wed_class_name == null) {
			if (other.wed_class_name != null)
				return false;
		} else if (!wed_class_name.equals(other.wed_class_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TimeTable [id=" + id + ", college_id=" + college_id + ", college_name=" + college_name + ", class_id="
				+ class_id + ", class_name=" + class_name + ", mon=" + mon + ", tues=" + tues + ", wed=" + wed
				+ ", thurs=" + thurs + ", fir=" + fir + ", sat=" + sat + ", sun=" + sun + ", mon_class_name="
				+ mon_class_name + ", tues_class_name=" + tues_class_name + ", wed_class_name=" + wed_class_name
				+ ", thurs_class_name=" + thurs_class_name + ", fir_class_name=" + fir_class_name + ", sat_class_name="
				+ sat_class_name + ", sun_class_name=" + sun_class_name + ", part=" + part + ", create_time="
				+ create_time + ", update_time=" + update_time + ", is_active=" + is_active + "]";
	}
	
	
	
	
}
