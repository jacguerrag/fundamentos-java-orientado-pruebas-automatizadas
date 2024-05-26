package canvia.curso.automatizacion.pruebas.fundamentos_java_orientado_pruebas_automatizadas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
	@Test
	public void testSum() {
        // Arrange: Preparar el entorno y los datos necesarios
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int expectedSum = 8;

        // Act: Ejecutar la unidad de código que se desea probar
        int actualSum = calculator.sum(a, b);

        // Assert: Verificar que el resultado obtenido sea el esperado
        assertEquals(expectedSum, actualSum);
	}

}
