package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
	Posicion (int fila, char columna){
		
		if (fila < 1 || fila > 8 || columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("Valores fuera de rango");
		}else {
			this.fila=fila;
			this.columna=columna;
		}
		
	}
	
	Posicion (Posicion p){
		
		fila=p.fila;
		columna=p.columna;
		
	}
	
	public boolean equals(Posicion fc_A, Posicion fc_B) {
		
		if (fc_A.fila == fc_B.fila && fc_A.columna == fc_B.columna) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void setFila(int fila) {
		
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("Los números de fila"
					+ "deben estar comprendidos entre 1 y 8 ambos inclusive");
		}else {
			this.fila=fila;
		}
		
	}
	
	public int getFila() {
		return this.fila;
	}
	
	public void setColumna(char columna) {
		
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("Las columnas deben estar comprendidas entre las letras"
					+ "a y h");
		}else {
			this.columna=columna;
		}
	}
	
	public char getColumna() {
		return columna;
	}
	
}
