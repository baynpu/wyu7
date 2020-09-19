package test;
import ibm_java.Vehicle;
public class main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle(200,10);
      System.out.println("速度是："+vehicle.getSpeed()+"体积是："+vehicle.getSize());
      vehicle.speedUp();
      System.out.println("速度是："+vehicle.getSpeed());
      vehicle.speedDown();
      System.out.println("速度是："+vehicle.getSpeed());
	}
}
