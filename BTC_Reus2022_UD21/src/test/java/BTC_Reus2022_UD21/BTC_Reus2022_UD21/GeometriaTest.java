package BTC_Reus2022_UD21.BTC_Reus2022_UD21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GeometriaTest {

	Geometria geometria = new Geometria(1);
	Geometria geometria2 = null;
	
	@Test
	public void testCrearObjeto() {
		Geometria objeto = new Geometria();
		
        assertEquals(objeto.getClass(), Geometria.class);
	}
	
	@Test
	public void testAreacuadrado() {
		int resultado = geometria.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaCirculo() {
		double resultado = geometria.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaTriangulo() {
		int resultado = geometria.areatriangulo(2, 3);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRectangulo() {
		int resultado = geometria.arearectangulo(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaPentagono() {
		int resultado = geometria.areapentagono(2, 3);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRombo() {
		int resultado = geometria.arearombo(2, 3);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRomboide() {
		int resultado = geometria.arearomboide(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaTrapecio() {
		int resultado = geometria.areatrapecio(2, 2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras1() {
		String resultado = geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras2() {
		String resultado = geometria.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras3() {
		String resultado = geometria.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras4() {
		String resultado = geometria.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras5() {
		String resultado = geometria.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras6() {
		String resultado = geometria.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras7() {
		String resultado = geometria.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFiguras8() {
		String resultado = geometria.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testSelectorFigurasDefault() {
		String resultado = geometria.figura(10);
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testGetId() {
		int resultado = geometria.getId();
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetId() {
		geometria.setId(1);
		int esperado = 1;
		assertEquals(esperado, geometria.getId());
	}
	@Test
	public void testGetNom() {
		geometria.setNom("prueba");
		String esperado = "prueba";
		assertEquals(esperado, geometria.getNom());
	}
	@Test
	public void testSetNom() {
		geometria.setNom("prueba");
		String esperado = "prueba";
		assertEquals(esperado, geometria.getNom());
	}
	@Test
	public void testGetArea() {
		geometria.setArea(1.1);
		Double esperado = 1.1;
		assertEquals(esperado, geometria.getArea());
	}
	@Test
	public void testToString() {
		geometria.setArea(1.1);
		geometria.setId(1);
		geometria.setArea(2.2);
		geometria.setNom("dodecaedro");
		String esperado = "Geometria [id=" + 1 + ", nom=" + "dodecaedro" + ", area=" + 2.2 + "]";;
		assertEquals(esperado, geometria.toString());
	}
}
