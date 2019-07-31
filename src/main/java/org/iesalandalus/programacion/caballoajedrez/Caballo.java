package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	
	private Color color;
	private Posicion posicion;
	
	Caballo(){
		posicion.setFila(8);
		posicion.setColumna('b');
	}
	
	Caballo(Color color){
		
		this.color=color;
		
		if(this.color==Color.BLANCO) {
			
			this.posicion.setFila(1);
			this.posicion.setColumna('b');
			
		}else if (this.color==Color.NEGRO) {
			
			this.posicion.setFila(8);
			this.posicion.setColumna('b');
			
		}
		
	}
	
	
	Caballo(Color color, char columna){
		
		this.color=color;
		this.posicion.setColumna(columna);
		
		if(this.posicion.getColumna() != 'b' || this.posicion.getColumna() != 'g') {
			throw new IllegalArgumentException("La columna inicial por defecto debe ser b o g.");
		}
		
		if(this.color==Color.BLANCO) {
			posicion.setFila(1);
		}else if(this.color==Color.NEGRO) {
			posicion.setFila(8);
		}
		
	}
	
	private void setPosicion(Posicion posicion) {
		this.posicion=posicion;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	private void setColor(Color color) {
		this.color=color;
	}
	
	public Color getColor() {
		return color;
	}
	
}
