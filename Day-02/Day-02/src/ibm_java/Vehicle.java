package ibm_java;

public class Vehicle {
    private int speed;
    private int size;
    public Vehicle(int speed,int size)
    {
    	this.speed=speed;
    	this.size=size;
    	
    	
    }
    public int speedUp() {
    	
         speed=speed+10;
    	 return speed;
    	
    }
    public int speedDown() {
    	speed=speed-10;
    	return speed;
    	
    }
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	

}
