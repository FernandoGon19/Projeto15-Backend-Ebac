package factory;

public class Car {

	private int horsePower;
	private String fuelSource;
	private String color;
	
	public Car(int horsePower, String fuelSource, String color) {
		super();
		this.horsePower = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}
	
	public void startMotor() {
		System.out.println("Carro: " +getClass().getSimpleName());
		System.out.println("Iniciando  o Motor, Frun frun");
	}
	public void clean() {
		System.out.println("Limpando Carro está limpo e a cor dele é " + color);
	}
	public void mechanicCheck() {
		System.out.println("Conferindo o Carro, O carro está bom!!!");
	}
	public void fuelCar() {
		System.out.println("O tanque do carro está " + fuelSource);
	}
	
	
	
}
