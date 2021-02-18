package it.struts_tris.action;

import com.opensymphony.xwork2.ActionSupport;
import it.struts_tris.form.TrisForm;

public class TrisAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private TrisForm trisform;
	
	 public String execute() throws Exception {
		 String x = trisform.getX();
		 String o = trisform.getO();
		 
		 return SUCCESS ;
	 }
	
	public TrisForm getTrisform() {
		return trisform;
	}

	public void setTrisform(TrisForm trisform) {
		this.trisform = trisform;
	}

}
