package uno.acape106.tarea1_prog_avan_2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//variables
		int opcion;
		double radio;
		double ladoCuadrado;
		double anchoRectangulo;
		double altoRectangulo;
		double baseTr;
		double alturaTr;
		boolean salir=false;
		
		//menu principal
		while(!salir) {
		System.out.println("");	
		System.out.println("1. calcular el area de un circulo");
		System.out.println("2. calcular el area de un cuadrado");
		System.out.println("3. calcular el area de un Rectangulo");
		System.out.println("4. calcular el area de un Triangulo");
		System.out.println("Ingrese el numero de su opcion. 5 es salir ");
		opcion=scanner.nextInt();
	
		
		switch(opcion) {
		case 1:
			System.out.println("Ingrese el radio del circulo");
			radio=scanner.nextDouble();
			App circulo=new App();
			System.out.println("El area del circulo es "+circulo.areaCirculo(3.14, radio));
			break;
		case 2:
			System.out.println("Ingrese el lado del cuadrado");
			ladoCuadrado=scanner.nextDouble();
			App cuadrado=new App();
			System.out.println("El area del cuadrado es "+cuadrado.areaCuadrado(ladoCuadrado, ladoCuadrado));
			break;
		case 3:
			System.out.println("Ingrese el ancho del rectangulo");
			anchoRectangulo=scanner.nextDouble();
			System.out.println("Ingrese el alto del rectangulo");
			altoRectangulo=scanner.nextDouble();
			App rectangulo=new App();
			System.out.println("El area del rectangulo es "+rectangulo.areaRectangulo(altoRectangulo, anchoRectangulo));
			break;
		case 4:
			System.out.println("Ingrese la base del triangulo");
			baseTr=scanner.nextDouble();
			System.out.println("Ingrese el alto del triangulo");
			alturaTr=scanner.nextDouble();
			App triangulo=new App();
			System.out.println("El area del triangulo es "+triangulo.areaTriangulo(baseTr, alturaTr));
			break;
		case 5:
			System.out.println("Bye");
			salir=true;
			break;
		default: System.out.println("opcion no disponible"); 
		
		
		}
		}
		
		// TODO Auto-generated method stub

	}

}
