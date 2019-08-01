package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez");
		
	}
	
	private void mostrarMenu() {
		
		System.out.println("Escoje una de las siguientes opciones: ");
		System.out.println("1. Crear un caballo por defecto.");
		System.out.println("2. Crear un caballo y darle color.");
		System.out.println("3. Crear un caballo de un color en una posición válida.");
		System.out.println("4. Mover el caballo.");
		System.out.println("5. Salir de la aplicación");
		
				
	}
	
	private int elegirOpcion() {
		
		int opcion;
		
		do {
			
			mostrarMenu();
			
			do {
				System.out.println("Escoge una opción: ");
				opcion=Entrada.entero();
				System.out.println("Entrada no válida, escoge un número correcto: ");
				
			}while(opcion < 1 || opcion > 6);
			
			System.out.println("Escoge una opción: ");
			opcion=Entrada.entero();
			
			
			ejecutarOpcion(opcion);
				
		}while(opcion != 5);
		
		return opcion;
	}
	
	private void ejecutarOpcion(int opcion) {
		
		switch(opcion) {
		
			case 1:
				crearCaballoDefecto();
			break;
			
			case 2:
				crearCaballoDefectoColor();
			break;
			
			case 3:
				elegirColor();
			break;
			
			case 4:
				crearCaballoColorPosicion();
			break;
			
			case 5:
				elegirColumnaInicial();
			break;
			
			case 6:
				mover();
			break;
			
			case 7:
				mostrarMenuDirecciones();
			break;
			
			default:
				elegirDireccion();
		
		}
	}
	
	private void crearCaballoDefecto() {
		Caballo c = new Caballo();
		c.toString();
	}
	
	private void crearCaballoDefectoColor() {
		
		Caballo c = new Caballo(elegirColor());
		c.toString();
	}
	
	private Color elegirColor() {
		
		System.out.println("Escoge un color por defecto para el caballo: ");
		System.out.println("1. Color Blanco.");
		System.out.println("2. Color Negro. ");
		
		int menu=Entrada.entero();
		
		Color color = null;
		
		if(menu==1) {
			color = color.BLANCO;
		}else if(menu==2) {
			color = color.NEGRO;
		}
		
		return color;
	}
	
	private void crearCaballoColorPosicion() {
		
		Caballo c = new Caballo(elegirColor(), elegirColumnaInicial());
		c.toString();
		
	}
	
	private char elegirColumnaInicial() {
		
		System.out.println("Escoge la columna inicial de tu caballo sobre el tablero: ");
		System.out.println("Las columnas admitidas están entre la a y la g");
		
		char columna = Entrada.caracter();
		
		return columna;
		
	}
	
	private void mover() {
		mostrarMenuDirecciones();
		elegirDireccion();
	}
	
	private void mostrarMenuDirecciones() {
		
		System.out.println("Los moviemientos del caballo puede ser los siguientes: ");
		System.out.println("1. ARRIBA_IZQUIERDA"
				+ "\2. ARRIBA_DERECHA"
				+ "\n3. DERECHA_ARRIBA"
				+ "\n4. DERECHA_ABAJO"
				+ "\n5. ABAJO_DERECHA"
				+ "\n6. ABAJO_IZQUIERDA"
				+ "\n7. IZQUIERDA_ARRIBA"
				+ "8. IZQUIERDA_ABAJO");
		
	}
	
	private Direccion elegirDireccion() {
		
		
		System.out.println("Escoge el movimiento de tu caballo: ");
		
		int mover = Entrada.entero();
		
		Direccion movimiento = null;
			
		if(mover==1) {
			movimiento = movimiento.ARRIBA_IZQUIERDA;
		}else if(mover==2) {
			movimiento = movimiento.ARRIBA_DERECHA;
		}else if(mover==3) {
			movimiento = movimiento.DERECHA_ARRIBA;
		}else if(mover==4) {
			movimiento = movimiento.DERECHA_ABAJO;
		}else if(mover==5) {
			movimiento = movimiento.ABAJO_DERECHA;
		}else if(mover==6) {
			movimiento = movimiento.ABAJO_IZQUIERDA;
		}else if(mover==7) {
			movimiento = movimiento.IZQUIERDA_ARRIBA;
		}else {
			movimiento = movimiento.IZQUIERDA_ABAJO;
		}
			
		return movimiento;		
	}	
	
	
}