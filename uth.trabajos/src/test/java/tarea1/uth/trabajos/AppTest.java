package tarea1.uth.trabajos;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
	
	//Test del area de circulo
    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.274333882308138, App.calcularAreaCirculo(3), 0.0001);
        assertEquals(0, App.calcularAreaCirculo(0), 0.0001);
        assertEquals(3.141592653589793, App.calcularAreaCirculo(1), 0.0001);
    }

    //Test del area del cuadrado
    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(16, App.calcularAreaCuadrado(4), 0.0001);
        assertEquals(0, App.calcularAreaCuadrado(0), 0.0001);
        assertEquals(1, App.calcularAreaCuadrado(1), 0.0001);
    }

    //Test del area del rectangulo
    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(20, App.calcularAreaRectangulo(4, 5), 0.0001);
        assertEquals(0, App.calcularAreaRectangulo(0, 5), 0.0001);
        assertEquals(6, App.calcularAreaRectangulo(2, 3), 0.0001);
    }
    //Test del area del triangulo
    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(10, App.calcularAreaTriangulo(4, 5), 0.0001);
        assertEquals(0, App.calcularAreaTriangulo(0, 5), 0.0001);
        assertEquals(3, App.calcularAreaTriangulo(2, 3), 0.0001);
    }
}

