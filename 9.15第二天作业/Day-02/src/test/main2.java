package test;
import ibm_java.Person;
public class main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person person1=new Person("����С",18);
    Person person2=new Person("������",29,"man");
    System.out.println(person1);
    System.out.println(person2+","+person2.getGender());
	}
}
