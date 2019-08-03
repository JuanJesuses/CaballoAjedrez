package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Caballo caballo = null;
	
	public static void main(String[] args) {
		System.out.println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez");
		
		mostrarMenu();
		
	}
	
	private static void mostrarMenu() {
		
		System.out.println("\nEscoje una de las siguientes opciones: ");
		System.out.println("1. Crear un caballo por defecto.");
		System.out.println("2. Crear un caballo y darle color.");
		System.out.println("3. Crear un caballo de un color en una posición válida.");
		System.out.println("4. Mover el caballo.");
		System.out.println("5. Salir de la aplicación");
		ejecutarOpcion(elegirOpcion());
		
				
	}
	
	private static int elegirOpcion() {
		
		int opcion;
		
		System.out.println("Escoge una opción: ");
		opcion=Entrada.entero();
		
		while(opcion < 1 || opcion > 5) {
			System.out.println("Opción incorrecta. Escoge otra opción: ");
			opcion=Entrada.entero();
		}		
		
		
		return opcion;
	}
	
	private static void ejecutarOpcion(int opcion) {
		
		switch(opcion) {
		
			case 1:
				crearCaballoDefecto();
				mostrarMenu();
			break;
			
			case 2:
				crearCaballoDefectoColor();
				mostrarMenu();
			break;
			
			case 3:
				crearCaballoColorPosicion();
				mostrarMenu();
			break;
			
			case 4:
				mostrarMenuDirecciones();
			break;
			
			case 5:
				System.out.println("Ha escogido salir del programa.");
				System.exit(0);
			break;
	
		}
	}
	
	private static void crearCaballoDefecto() {
		caballo = new Caballo();
		System.out.println("\nSe ha creado un nuevo caballo por defecto\n " + caballo);
	}
	
	private static void crearCaballoDefectoColor() {
		
		caballo = new Caballo(elegirColor());
		System.out.println("\nSe ha creado un nuevo caballo con el color elegido por tí\n " + caballo);
	}
	
	private static Color elegirColor() {
		
		System.out.println("\nEscoge un color por defecto para el caballo: ");
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
	
	private static void crearCaballoColorPosicion() {
		
		caballo = new Caballo(elegirColor(), elegirColumnaInicial());
		System.out.println("\nSe ha creado un nuevo caballo con color y posición elegida por tí\n " + caballo);
		
	}
	
	private static char elegirColumnaInicial() {
		
		System.out.println("\nEscoge la columna inicial de tu caballo sobre el tablero: ");
		System.out.println("Las columnas deben ser B o G");
		
		char columna = Entrada.caracter();
		
		return columna;
		
	}
	
	private static void mover() {
		
		try {
			caballo.mover(elegirDireccion());
			System.out.println("El caballo se ha movido " + caballo);
			mostrarMenu();
		}catch(OperationNotSupportedException e){
			System.out.println("ERROR: Movimiento no válido");
		}
		mover();
	}
	
	private static void mostrarMenuDirecciones() {
		
		System.out.println("Los moviemientos del caballo puede ser los siguientes: ");
		System.out.println("1. ARRIBA_IZQUIERDA"
				+ "\n2. ARRIBA_DERECHA"
				+ "\n3. DERECHA_ARRIBA"
				+ "\n4. DERECHA_ABAJO"
				+ "\n5. ABAJO_DERECHA"
				+ "\n6. ABAJO_IZQUIERDA"
				+ "\n7. IZQUIERDA_ARRIBA"
				+ "\n8. IZQUIERDA_ABAJO");
		
		mover();
		
	}
	
	private static Direccion elegirDireccion() {
				
		Direccion movimiento = null;
		int mover;
		
		do {
			System.out.println("Escoge el movimiento de tu caballo: ");
			mover = Entrada.entero();
		}while(mover < 1 || mover > 8);
		
		if(mover==1) {
			movimiento = Direccion.ARRIBA_IZQUIERDA;
		}else if(mover==2) {
			movimiento = Direccion.ARRIBA_DERECHA;
		}else if(mover==3) {
			movimiento = Direccion.DERECHA_ARRIBA;
		}else if(mover==4) {
			movimiento = Direccion.DERECHA_ABAJO;
		}else if(mover==5) {
			movimiento = Direccion.ABAJO_DERECHA;
		}else if(mover==6) {
			movimiento = Direccion.ABAJO_IZQUIERDA;
		}else if(mover==7) {
			movimiento = Direccion.IZQUIERDA_ARRIBA;
		}else {
			movimiento = Direccion.IZQUIERDA_ABAJO;
		}
			
		return movimiento;		
	}	
	
	
}