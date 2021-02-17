package it.javatostruts.form;

import java.io.Serializable;

public class TestForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String nome; 
	int anni;
	int nascita;
	double altezza;
	boolean basso;
	int latoY;
	int latoX;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
	}
	public int getNascita() {
		return nascita;
	}
	public void setNascita(int nascita) {
		this.nascita = nascita;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public boolean isBasso() {
		return basso;
	}
	public void setBasso(boolean basso) {
		this.basso = basso;
	}
	public int getLatoY() {
		return latoY;
	}
	public void setLatoY(int latoY) {
		this.latoY = latoY;
	}
	public int getLatoX() {
		return latoX;
	}
	public void setLatoX(int latoX) {
		this.latoX = latoX;
	}
}
