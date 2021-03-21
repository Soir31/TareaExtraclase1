package ejemploFinally;

public class CoeficientePromedio {
	public static int coeficiente(int coeficienteIntelectual) {
		if (coeficienteIntelectual < 90 || coeficienteIntelectual > 109) {
			throw new IllegalArgumentException("Su coeficiente intelectual ha sido analizado...");
		}
		return coeficienteIntelectual;
	}

}
