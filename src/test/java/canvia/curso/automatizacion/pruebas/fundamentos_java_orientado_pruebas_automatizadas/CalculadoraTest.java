package canvia.curso.automatizacion.pruebas.fundamentos_java_orientado_pruebas_automatizadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora calculadora;

	@BeforeEach
	public void setUp() {
		calculadora = new Calculadora();
		System.out.println("Clase Calculadora instanciada.");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Prueba finalizada.");
	}

	@Test
	public void testSuma() {
		assertEquals(5, calculadora.suma(2, 3));
		assertEquals(0, calculadora.suma(-1, 1));
		assertEquals(-5, calculadora.suma(-2, -3));
		System.out.println("Prueba unitaria testSuma finalizado");
	}

	@Test
	public void testResta() {
		assertEquals(1, calculadora.resta(3, 2));
		assertEquals(-2, calculadora.resta(-1, 1));
		assertEquals(1, calculadora.resta(-2, -3));
		System.out.println("Prueba unitaria testResta finalizado");
	}

	@Test
	public void testDividir() {
		assertEquals(2, calculadora.dividir(6, 3));
		assertEquals(0, calculadora.dividir(0, 5));
		assertEquals(-2, calculadora.dividir(-6, 3));
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			calculadora.dividir(1, 0);
		});
		assertEquals("Divisor no puede ser cero", exception.getMessage());
		System.out.println("Prueba unitaria testDividir finalizado");
	}

}
