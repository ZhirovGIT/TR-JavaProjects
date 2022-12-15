
public class MilkFood extends Food{
	private String milkType;
	
	public MilkFood() {}

	public MilkFood(String name, double price, String unit, int code, String expDate, String milkType) {
		super(name, price, unit, code, expDate);
		this.milkType = milkType;
	}

	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	@Override
	public String toString() {
		return "MilkFood [milkType=" + milkType + ", getExpDate()=" + getExpDate() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getUnit()=" + getUnit() + ", getCode()=" + getCode() + "]";
	}
	
	
}
