package ejemploPropio;

public class Main {

	public static void main(String[] args) throws AnalisisRangeException, Exception {
		try {
			if (MuyBajo.coeficienteIntelectual(-1) < 0) {
				throw new AnalisisRangeException("El valor que escribi� no est� en el rango de la escala Wechsler");
			}
		} catch (AnalisisRangeException e) {
			System.out.println("El valor que escribi� no est� en el rango de la escala Wechsler");
		} catch (Exception e) {
			System.out.println("Su coeficiente intelectual no pertenece al rango de muy bajo");
		}

	}

}
