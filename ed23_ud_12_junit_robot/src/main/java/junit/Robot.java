package junit;

public class Robot {
	private String name;
	private double autonomy;
	public Robot(String name, double age) {
		super();
		this.name = name;
		this.autonomy = autonomy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAutonomy() {
		if (this.autonomy <= 0) {
			autonomy = 42;
		}
		return autonomy;
	}
	public void setAutonomy(double autonomy) {
		this.autonomy = autonomy;
	}
	@Override
	public String toString() {
		return "Robot [name=" + name + ", age=" + autonomy + "]";
	}
	
	
}
