package ejemplosExcepciones;

public class Main {//Ejemplo de un throw y un try

	public static void main(String[] args) {
		try {
			Genio.getCoeficienteIntelectual(80);
		} catch (Exception e) {
			System.out.println("Su coeficiente intelectual no es muy alto para que sea un genio");//Seg�n la escala de Wechsler de Inteligencia para Adultos las personas que son muy inteligentes tienen un IQ de 130 o m�s
		}
		System.out.println("An�lisis finalizado");
	}
}
