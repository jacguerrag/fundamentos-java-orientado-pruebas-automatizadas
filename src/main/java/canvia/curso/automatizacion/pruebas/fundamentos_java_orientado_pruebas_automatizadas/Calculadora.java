package canvia.curso.automatizacion.pruebas.fundamentos_java_orientado_pruebas_automatizadas;

public class Calculadora {
	public int suma(int a , int b) {
		return a + b;
	}
	public int resta(int a, int b) {
		return a-b;
	}
	public int mutiplicacion(int a, int b) {
		return a*b;
	}
	public int dividir(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException("Divisor no puede ser 0");
		}
		return a/b;
	}

}
