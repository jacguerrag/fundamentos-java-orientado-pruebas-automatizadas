package canvia.curso.automatizacion.pruebas.fundamentos_java_orientado_pruebas_automatizadas;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EjemploAnotacionesTest {
    @BeforeAll
    public static void setupAll() {
        System.out.println("Ejecutar antes de todas las pruebas");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Ejecutar antes de cada prueba");
    }

    @Test
    public void test1() {
        System.out.println("Ejecutar prueba 1");
    }

    @Test
    public void test2() {
        System.out.println("Ejecutar prueba 2");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Ejecutar después de cada prueba");
    }

    @AfterAll
    public static void teardownAll() {
        System.out.println("Ejecutar después de todas las pruebas");
    }
}
