package it.javatostruts.action;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.opensymphony.xwork2.ActionSupport;
import it.javatostruts.form.TestForm;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private TestForm testform;
	
	public String execute() throws Exception{
		
		if (testform == null)
			testform=new TestForm();
		
		String nome = testform.getNome();
		int anni = testform.getAnni();
		int nascita = testform.getNascita();
		double altezza = testform.getAltezza();
		int latoX = testform.getLatoX();
		int latoY = testform.getLatoY();
		boolean basso = testform.isBasso();
		
		double m= 1.70;
		
		if(altezza<=m){
		testform.setBasso(true);
		}else{
			testform.setBasso(false);
			
		}
		return SUCCESS;
	}
	
    public TestForm getTestform() {
        return testform;
    }
    public void setTestform(TestForm testform) {
       this.testform=testform;
    }
}
