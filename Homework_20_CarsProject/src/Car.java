
public class Car {
	private String model;
	private String color;
	private int year; // 1945-2022
	private double motorValue; // 0.5-9.0

	// Constructor
	public Car(String modelCar, String colorCar, int yearCar, double motorValueCar) {
		if (modelCar != null)
			model = modelCar;

		if (colorCar != null)
			color = colorCar;
		else
			color = "No color!";

		if (yearCar >= 1945 && yearCar <= 2022)
			year = yearCar;

		if (motorValueCar >= 0.5 && motorValueCar <= 9.0)
			motorValue = motorValueCar;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String modelCar) {
		if (model != null)
			model = modelCar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String colorCar) {
		if (color != null)
			color = colorCar;
	}

	public int getYear() {
		return year;
	}

	public double getMotorValue() {
		return motorValue;
	}

	public void setMotorValue(double motorValueCar) {
		if (motorValueCar >= 0.5 && motorValueCar <= 9.0)
			motorValue = motorValueCar;
	}

	// Print information about the object
	public void display() {
		System.out.println(model + ", Color: " + color + ", Year: " + year + ", Motor value: " + motorValue);
	}
}
