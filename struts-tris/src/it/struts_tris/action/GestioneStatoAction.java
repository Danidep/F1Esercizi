package it.struts_tris.action;

import com.opensymphony.xwork2.ActionSupport;

import it.struts_tris.form.TrisForm;

public class GestioneStatoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private TrisForm trisform;
	
	@Override
	public String execute() throws Exception {
		if (trisform == null)
			trisform = new TrisForm();
		else {
			//TODO: (2) gestisci valore da scrivere nel quadratino cliccato
		}

		int contaTurni = trisform.getContaTurni();
		
		if(contaTurni/2 == 0) {
			trisform.setX("X");
			trisform.setO(null);
		}else {
			trisform.setO("O");
			trisform.setX(null);
		}
		
		//TODO: (1) Incrementa contaTurni
		
		return SUCCESS;
	}

	public TrisForm getTrisform() {
		return trisform;
	}

	public void setTrisform(TrisForm trisform) {
		this.trisform = trisform;
	}
}
