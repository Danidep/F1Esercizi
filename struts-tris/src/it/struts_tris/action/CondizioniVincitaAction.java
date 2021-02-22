package it.struts_tris.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import it.struts_tris.form.TrisGrigliaForm;

public class CondizioniVincitaAction{
	
	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception{
		TrisGrigliaForm trisGrigliaForm = null;
		Map session = (Map)ActionContext.getContext().get("session");
		if(trisGrigliaForm == null)
		trisGrigliaForm = (TrisGrigliaForm)session.get("SalvaGriglia");

	        for (int a = 0; a < 8; a++) { 
	            String line = ""; 
	  
	            switch (a) { 
	            case 0: 
	                line = trisGrigliaForm.getGriglia().get(0)+trisGrigliaForm.getGriglia().get(1)+trisGrigliaForm.getGriglia().get( 2);
	                break; 
	            case 1: 
	                line = trisGrigliaForm.getGriglia().get(3)+trisGrigliaForm.getGriglia().get(4)+trisGrigliaForm.getGriglia().get(5);
	                break; 
	            case 2: 
	                line = trisGrigliaForm.getGriglia().get(6)+trisGrigliaForm.getGriglia().get(7)+trisGrigliaForm.getGriglia().get(8);
	                break; 
	            case 3: 
	                line = trisGrigliaForm.getGriglia().get(0)+trisGrigliaForm.getGriglia().get(3)+trisGrigliaForm.getGriglia().get(6); 
	                break; 
	            case 4: 
	                line = trisGrigliaForm.getGriglia().get(1)+trisGrigliaForm.getGriglia().get(4)+trisGrigliaForm.getGriglia().get(7);
	                break; 
	            case 5: 
	                line = trisGrigliaForm.getGriglia().get(2)+trisGrigliaForm.getGriglia().get(5)+trisGrigliaForm.getGriglia().get(8);
	                break; 
	            case 6: 
	                line = trisGrigliaForm.getGriglia().get(0)+trisGrigliaForm.getGriglia().get(4)+trisGrigliaForm.getGriglia().get(8);
	                break; 
	            case 7: 
	                line = trisGrigliaForm.getGriglia().get(2)+trisGrigliaForm.getGriglia().get(4)+trisGrigliaForm.getGriglia().get(6);
	                break; 
	            } 
	            if (line.equals("XXX")) { 
	                return "X"; 
	            }  else if (line.equals("OOO")) { 
	                return "O"; 
	            }
	        }
	        return ActionSupport.SUCCESS;
	}
}
