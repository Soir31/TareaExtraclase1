package ejemploPercolacion;

public class CasiGenio {
	public static int coeficienteIntelectual(int coeficienteIntelectual) throws Exception {
		if (coeficienteIntelectual < 120 || coeficienteIntelectual> 129) {
			throw new Exception("su iq o es muy bajo o muy alto para considerarse casi un genio");
		}
		return coeficienteIntelectual;
	}
}
