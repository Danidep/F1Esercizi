package it.struts_tris.action;

import com.opensymphony.xwork2.ActionSupport;

import it.struts_tris.form.TrisForm;

public class GestioneStatoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private static TrisForm trisform;
	private String lastBlockValue;

	@Override
	public String execute() throws Exception {
		int contaTurni = 0;

		if (trisform == null)
			trisform = new TrisForm();
		else if (trisform.getX() != null || trisform.getO() != null) {
			contaTurni = trisform.getContaTurni();
			lastBlockValue = trisform.getX() != null ? trisform.getX() : trisform.getO();
			trisform.setContaTurni(++contaTurni);
		}

		if (contaTurni % 2 == 0) {
			trisform.setX("X");
			trisform.setO(null);
		} else {
			trisform.setO("O");
			trisform.setX(null);
		}

		return SUCCESS;
	}

	public String getLastBlockValue() {
		return lastBlockValue;
	}

	public void setLastBlockValue(String lastBlockValue) {
		this.lastBlockValue = lastBlockValue;
	}

	public TrisForm getTrisform() {
		return trisform;
	}

	public void setTrisform(TrisForm trisform) {
		this.trisform = trisform;
	}
}
