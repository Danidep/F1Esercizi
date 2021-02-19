package it.struts_tris.action;

import com.opensymphony.xwork2.ActionSupport;

import it.struts_tris.form.TrisGrigliaForm;

public class CondizioniVincitaAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private TrisGrigliaForm trisGrigliaForm;
	
	public String execute() throws Exception{
		

	        for (int a = 0; a < 8; a++) { 
	            String line = null; 
	  
	            switch (a) { 
	            case 0: 
	                line = trisGrigliaForm.getGriglia().get(0 + 1+ 2);
	                break; 
	            case 1: 
	                line = trisGrigliaForm.getGriglia().get(3 + 4+ 5);
	                break; 
	            case 2: 
	                line = trisGrigliaForm.getGriglia().get(6 + 7+ 8);
	                break; 
	            case 3: 
	                line = trisGrigliaForm.getGriglia().get(0 + 3 + 6); 
	                break; 
	            case 4: 
	                line = trisGrigliaForm.getGriglia().get(1 + 4 + 7);
	                break; 
	            case 5: 
	                line = trisGrigliaForm.getGriglia().get(2 + 5 + 8);
	                break; 
	            case 6: 
	                line = trisGrigliaForm.getGriglia().get(0 + 4 + 8);
	                break; 
	            case 7: 
	                line = trisGrigliaForm.getGriglia().get(2 + 4 + 6);
	                break; 
	            } 
	            if (line.equals("XXX")) { 
	                return "X"; 
	            }  else if (line.equals("OOO")) { 
	                return "O"; 
	            }
	        }
	        return SUCCESS;
	}
}
