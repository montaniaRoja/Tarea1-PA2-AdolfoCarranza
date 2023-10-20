package uno.acape106.tarea1_prog_avan_2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
Calcular el área de un círculo
● Calcular el área de un cuadrado
● Calcular el área de un rectángulo
● Calcular el área de un triángulo

*/
public class AppTest {
	
	
	
	@Before
	public void metodoTipoSetup() {
		
		
	}
	
	@BeforeClass
	public static void metodoTipoSetupClass() {
		
	}
	//circulo 3 pruebas
	@Test
	public void pruebaCirculo() {
		assertEquals(App.areaCirculo(3.14,10),314,0.001);
		assertTrue(App.areaCirculo(3.14,10)==314);
	}
	
	@Test
	public void pruebaCirculoConRadioDecimal() {
	    assertEquals(App.areaCirculo(3.14, 1.5), 7.065, 0.001);
	}

	@Test
	public void pruebaCirculoConRadioCero() {
	    assertEquals(App.areaCirculo(3.14, 0), 0,0.001);
	}
	
	
	// cuadrado 3 pruebas
	@Test
	public void pruebaCuadradoConLadoNegativo() {
	    assertEquals(App.areaCuadrado(-10,-10),100.0,0.001);
	}

	@Test
	public void pruebaCuadrado() {
		assertEquals(App.areaCuadrado(10,10),100,0.001);
		assertTrue(App.areaCuadrado(10,10)==100);
	}
	
	@Test
	public void pruebaCuadradoConLadoNulo() {
	    assertEquals(App.areaCuadrado(0,0), 0,0.001);
	}

	//3 pruebas rectangulo
	
	@Test
	public void pruebaRectanguloConLadosNegativos() {
	    assertEquals(App.areaRectangulo(-5, 10), -50,0.001);
	}

	@Test
	public void pruebaRectangulo() {
		assertEquals(App.areaRectangulo(10,10),100,0.001);
		assertTrue(App.areaRectangulo(10,10)==100);
			
	}
	
	@Test
	public void pruebaRectanguloConDecimales() {
		assertEquals(App.areaRectangulo(10.8,8.5),91.8,0.001);
		//assertTrue(App.areaRectangulo(10.8,8.5)==91.8);
	}
	
	
	//triangulo 3 pruebas
	
	@Test
	public void pruebaTriangulo() {
		assertEquals(App.areaTriangulo(10,10),50,0.001);
		assertTrue(App.areaTriangulo(10,10)==50);
	}
	
	@Test
	public void pruebaTrianguloDecimales() {
		assertEquals(App.areaTriangulo(10.5,8.4),44.1,0.001);
		assertTrue(App.areaTriangulo(10,10)==50);
	}
	
	@Test
	public void pruebaTrianguloConUnLadoNulo() {
	    assertEquals(App.areaTriangulo(0, 10), 0, 0.001);
	}
	
	
	@After
	public void metodoTearDown() {
		
	}
	
	@AfterClass
	public static void metodoTearDownClass() {
		
	}
	
	
    
}