package ejemploFinally;

public class Main {

	public static void main(String[] args) {
		try {
			CoeficientePromedio.coeficiente(85);
		}catch (Exception e) {
			System.out.println("Su coeficiente intelectual o est� por encima o por debajo del promedio");
		}finally {
			System.out.println("Proceso de an�lisis de coeficiente intelectual finalizado");
		}

	}

}
