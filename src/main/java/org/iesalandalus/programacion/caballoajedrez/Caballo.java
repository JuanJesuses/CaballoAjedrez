package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

public class Caballo {
	
	private Color color;
	private Posicion posicion;
	
	Caballo(){
		color = color.NEGRO;
		posicion = new Posicion(8, 'b');
	}
	
	Caballo(Color color){
		
		this.color=color;
		
		if(this.color==Color.BLANCO) {
			
			posicion = new Posicion(1, 'b');
			
		}else if (this.color==Color.NEGRO) {
			
			posicion = new Posicion(8,'b');
			
		}
		
	}
	
	
	Caballo(Color color, char columna){
		
		this.color=color;
				
		if(columna != 'b' && columna != 'g') {
			throw new IllegalArgumentException("La columna inicial por defecto debe ser b o g.");
		}
		
		if(this.color==Color.BLANCO) {
			posicion = new Posicion(1, columna);
		}else if(this.color==Color.NEGRO) {
			posicion = new Posicion(8, columna);
		}
		
	}
	
	public void mover(Direccion movimiento) throws OperationNotSupportedException {
		
		switch(movimiento)
		{
			
			case ARRIBA_IZQUIERDA:
				
				if(posicion.getFila() < 3) {
					throw new OperationNotSupportedException ("Error en la operación");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() - 1));
				}
				
			    break;
			
			case ARRIBA_DERECHA:
				
				if(posicion.getFila() < 3) {
					throw new OperationNotSupportedException ("Error en la operación");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
				break;
				
			case DERECHA_ARRIBA:
				
				if(posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException ("Error en la operación");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
				break;
			
				
			case DERECHA_ABAJO:
				
				if(posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() + 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
				break;
				
			case ABAJO_DERECHA:
				
				if(posicion.getColumna() > 'g') {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() + 2);
					posicion.setColumna((char) (posicion.getColumna() + 1));
				}
				
			break;
			
			case ABAJO_IZQUIERDA:
				
				try {
					if(posicion.getFila() > 6 ) {
						throw new OperationNotSupportedException();
					}else {
						posicion.setFila(posicion.getFila() + 2);
						posicion.setColumna((char)(posicion.getColumna()-1));
					}
				}catch(OperationNotSupportedException e) {
					System.out.println("Error en la operación. Valores fuera de rango.");
				}
				
				break;
				
			case IZQUIERDA_ARRIBA:
				
				if(posicion.getFila() > 3) {
					throw new OperationNotSupportedException("Error en la operción");
				}else {
					posicion.setFila(posicion.getFila() - 2);
					posicion.setColumna((char) (posicion.getColumna() - 1));
				}
				
				break;
				
			case IZQUIERDA_ABAJO:
				
				if(posicion.getFila() > 6) {
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
