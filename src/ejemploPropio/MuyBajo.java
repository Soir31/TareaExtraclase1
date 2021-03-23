package ejemploPropio;

public class MuyBajo {
	public static int coeficienteIntelectual(int coeficienteIntelectual) throws Exception {
		if (coeficienteIntelectual > 69) {
			throw new Exception("Su coeficiente intelectual no pertenece al rango de muy bajo");
		}
		return coeficienteIntelectual;
	}

}
