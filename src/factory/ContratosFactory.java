package factory;

public class ContratosFactory extends Factory {

	@Override
	Car retrieverCar(String requestedGrade) {
		if("A".equals(requestedGrade)) {
			return new corolaCar(100, "cheio", "Azul");
		} else {
			return null;
		}
	}

}
