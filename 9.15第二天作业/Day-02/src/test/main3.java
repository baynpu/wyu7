package test;
import ibm_java.Phone;
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Phone phone=new Phone();
        phone.setScreenSzie(10);
        phone.setBrand(20);
        phone.setCpu("i9");
        phone.setMemory(16);
        System.out.println("��Ļ�ߴ�:"+phone.getScreenSzie());
        System.out.println("����:"+phone.getBrand());
        System.out.println("������:"+phone.getCpu());
        System.out.println("�ڴ�:"+phone.getMemory());
        
	}

}
