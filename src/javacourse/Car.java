package javacourse;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}

	
}


class Car{
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	private boolean engineOn;
	private int speed;
	
	public Car( int cylinders, String name) {
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engineOn=false;
		this.speed = 0;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean getEngineOn() {
		return engineOn;
	}

	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void startEngine(){
		System.out.println("Engine Now Running");
		setEngineOn(true);
	}
	
	public void accelerate(int addSpeed){
		if(addSpeed > 0){
			setSpeed(getSpeed()+addSpeed);
		System.out.println(name+ " is speeding up by" +addSpeed+ " to " +getSpeed() +"mph.");
		} else{
			return -1;
		}
		
	}
	
	public void brake(){
		System.out.println("Applying brake");
	}
	
	
	
}

class Outback extends Car{
	
}