package ibm_java;

public class Cars extends Vehicles{
	int seats;
   public Cars() {
	super();
	seats=10;
	   
	   
   }
  public void ShowCar()
  {
	  System.out.println("商标："+brand+"颜色："+color+"座位数："+seats); 
	  
	  
  }
}
