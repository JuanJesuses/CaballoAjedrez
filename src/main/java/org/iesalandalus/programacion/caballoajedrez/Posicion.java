package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
	Posicion (int fila, char columna){
		
		try {
			if (fila < 1 || fila > 8) {
				throw new IllegalArgumentException();
			}else {
				setFila(fila);
			}
		}catch (IllegalArgumentException e) {
			System.out.println("Valores fuera de rango.");
		}
		
		try {
			if (columna < 'a' || columna > 'h') {
				throw new IllegalArgumentException();
			}else {
				setColumna(columna);
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Valores fuera de rango");
		}
		
	}
	
	Posicion (Posicion p){
		try {
			if(p==null) {
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			System.out.println("ERROR. No puede existir una posición  nula.");
		}
				
		p.fila=this.getFila();
		p.columna=this.getColumna();
		
	}
	
	public boolean equals(Posicion fc_A, Posicion fc_B) {
		
		if (fc_A.fila == fc_B.fila && fc_A.columna == fc_B.columna) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void setFila(int fila) {
		
		try {
			if (fila < 1 || fila > 8) {
				throw new IllegalArgumentException();
			}else {
				this.fila=fila;
			}
		}catch (IllegalArgumentException e) {
			System.out.println("Los números de fila deben estar comprendidos entre"
					+ "1 y 8, ambos inclusive.");
		}
	}
	
	public int getFila() {
		return this.fila;
	}
	
	public void setColumna(char columna) {
		
		try {
			if (columna < 'a' || columna > 'h') {
				throw new IllegalArgumentException();
			}else {
				this.columna=columna;
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Las columnas deben estar comprendidas entre las letras a y h.");
		}
		
	}
	
	public char getColumna() {
		return columna;
	}
	
	public String toString() {
		
		String mensaje="El caballo se encuentra en la posición fila: " + fila + " "
				+ "columna: " + columna;
		
		return mensaje;
		
	}
	
}
