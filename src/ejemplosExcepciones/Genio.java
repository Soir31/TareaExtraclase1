package ejemplosExcepciones;

public class Genio {

	public static int getCoeficienteIntelectual(int coeficienteIntelectual) throws Exception{
		if (coeficienteIntelectual < 130) {
			throw new Exception("para ser genio el iq tiene que ser mayor a 130");
		}
		return coeficienteIntelectual;
	}
}
