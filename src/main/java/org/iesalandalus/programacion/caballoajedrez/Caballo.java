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
