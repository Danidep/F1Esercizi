package it.struts_tris.form;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TrisGrigliaForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Map <Integer,String> griglia = new HashMap<Integer, String>();
	int contaTurni;
	
	public int getContaTurni() {
		return contaTurni;
	}
	public void setContaTurni(int contaTurni) {
		this.contaTurni = contaTurni;
	}
	

	public boolean containsKey(Integer key) {
		return griglia.containsKey(key);
	}

	public String get(Integer key) {
		return griglia.get(key);
	}

	public String put(Integer key, String value) {
		return griglia.put(key, value);
	}

	public void clear() {
		griglia.clear();
	}

	public Map<Integer, String> getGriglia() {
		return griglia;
	}

	public void setGriglia(Map<Integer, String> griglia) {
		this.griglia = griglia;
	}
	
}
