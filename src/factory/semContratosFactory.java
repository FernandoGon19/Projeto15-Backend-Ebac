package factory;

public class semContratosFactory extends Factory {

	@Override
	Car retrieverCar(String requestedGrade) {
		if("A".equals(requestedGrade)) {
			return new Brasilia(100, "cheio", "Azul");
		} else {
			return null;
		}
	}

}
