package it.struts_tris.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.struts_tris.form.TrisForm;
import it.struts_tris.form.TrisGrigliaForm;

public class GestioneStatoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private TrisForm trisform;
	private TrisGrigliaForm trisGrigliaForm;
	private CondizioniVincitaAction condizioniVincitaAction;
	
	
	public String executeReset() throws Exception {
		Map session = (Map)ActionContext.getContext().get("session");
		session.remove("SalvaGriglia");
		return execute();
	}

	@Override
	public String execute() throws Exception {
		int contaTurni = 0;
		String lastBlockValue = " ";
		
		Map session = (Map)ActionContext.getContext().get("session");
		trisGrigliaForm = (TrisGrigliaForm)session.get("SalvaGriglia");
		
		if(trisGrigliaForm == null)
			trisGrigliaForm = new TrisGrigliaForm();

		if (trisform == null)
			trisform = new TrisForm();
		else if (trisform.getX() != null || trisform.getO() != null) {
			contaTurni = trisGrigliaForm.getContaTurni();
			lastBlockValue = trisform.getX() != null && !trisform.getX().equals("") ? trisform.getX() : trisform.getO();
			trisGrigliaForm.setContaTurni(++contaTurni);
		}
		if(trisGrigliaForm.containsKey(trisform.getId()) && (trisGrigliaForm.get(trisform.getId()).equals("X") || trisGrigliaForm.get(trisform.getId()).equals("O"))) {
				return SUCCESS;
		} else {
			trisGrigliaForm.put(trisform.getId(), lastBlockValue);
		}

		if (contaTurni % 2 == 0) {
			trisform.setX("X");
			trisform.setO(null);
		} else {
			trisform.setO("O");
			trisform.setX(null);
		}

		session.put("SalvaGriglia", trisGrigliaForm);
		
		condizioniVincitaAction = new CondizioniVincitaAction();
		
		
		return condizioniVincitaAction.execute();
	}
	

	public TrisGrigliaForm getTrisGrigliaForm() {
		return trisGrigliaForm;
	}


	public void setTrisGrigliaForm(TrisGrigliaForm trisGrigliaForm) {
		this.trisGrigliaForm = trisGrigliaForm;
	}

	public TrisForm getTrisform() {
		return trisform;
	}

	public void setTrisform(TrisForm trisform) {
		this.trisform = trisform;
	}
}
