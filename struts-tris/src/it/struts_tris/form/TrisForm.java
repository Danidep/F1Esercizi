package it.struts_tris.form;

import java.io.Serializable;

public class TrisForm implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String x;
	String o;
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getO() {
		return o;
	}
	public void setO(String o) {
		this.o = o;
	}
	
	
	

}
