package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

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
	
	public void mover(Direccion movimiento) throws OperationNotSupportedException {
		
		switch(movimiento)
		{
			
			case ARRIBA_IZQUIERDA:
				
				if(posicion.getFila() < 3 && posicion.getColumna() < 'b') {
					throw new OperationNotSupportedException ("Error en la operación");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() - 1));
				}
				
			    break;
			
			case ARRIBA_DERECHA:
				
				if(posicion.getFila() < 3 && posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException ("Error en la operación");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
				break;
				
			case DERECHA_ARRIBA:
				
				if(posicion.getFila() < 3 && posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException ("Error en la operación");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
				break;
			
				
			case DERECHA_ABAJO:
				
				if(posicion.getFila() > 6 && posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() + 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
				break;
				
			case ABAJO_DERECHA:
				
				if(posicion.getFila() > 6 && posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() + 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
			break;
			
			case ABAJO_IZQUIERDA:
				
				if(posicion.getFila() > 6 && posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() + 2);
					posicion.setColumna((char) (posicion.getColumna() - 1));
				}
				
				break;
				
			case IZQUIERDA_ARRIBA:
				
				if(posicion.getFila() > 3 && posicion.getColumna() < 'b') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() - 1));
				}
				
				break;
				
			case IZQUIERDA_ABAJO:
				
				if(posicion.getFila() > 6 && posicion.getColumna() < 'b') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() + 2);
					posicion.setColumna((char) (posicion.getColumna() - 1));
				}
				
				break;
				
			default:
		
		}
		
	}
	
	public boolean equals(Color colorA, Color colorB, Posicion fcA, Posicion fcB) {
		if (colorA==colorB && fcA.getFila()==fcB.getFila() && fcA.getColumna()==fcB.getColumna()) {
			return true;
		}else {
			return false;
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
	
	public String toString() {
		String mensaje="El caballo es de color " + color + " y se encuentra en la posición fila: "
				+ posicion.getFila() + " columna: " + posicion.getColumna();
		
		return mensaje;
	}
	
}
