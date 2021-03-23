package ejemploFinal;

public class Main {

	public static void main(String[] args) throws Exception, RangeException {
		try {
			if (BajoPromedio.coeficiente > 200 || BajoPromedio.coeficiente < 0) {
				throw new RangeException("No se pueden ingresar valores mayores a 200 ni menores a 0");
			}else if(BajoPromedio.coeficiente < 80 || BajoPromedio.coeficiente > 89) {
				throw new Exception("El valor ingresado no corresponde al rango que está debajo del promedio");
			}
		}catch(RangeException e) {
			System.out.println("No se pudo terminar el análisis porque el valor ingresado no corresponde a la escala utilizada");
		}catch(Exception e) {
			System.out.println("El valor ingresado no corresponde al rango que está debajo del promedio");
		}
		System.out.println("Fin del análisis");

	}

}
