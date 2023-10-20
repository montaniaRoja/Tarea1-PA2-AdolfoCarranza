package uno.acape106.tarea1_prog_avan_2;


/**
 * Hello world!
 *
 */
public class App 
{
    
	public App() {
		
	}
	
	public static double areaCirculo(double pi, double radio) {
		double areaCirculo=pi * Math.pow(radio,2);
		return areaCirculo;
	}

	public static double areaCuadrado(double alto, double ancho) {
		// TODO Auto-generated method stub
		double areaCuadrado=(alto)*(ancho);
		return areaCuadrado;
	}

	public static double areaRectangulo(double alto, double ancho) {
		// TODO Auto-generated method stub
		double areaRectangulo=alto*ancho;
		return areaRectangulo;
	}

	public static double areaTriangulo(double base, double altura) {
		// TODO Auto-generated method stub
		double areaTriangulo=(base*altura)/2;
		return areaTriangulo;
	}
}