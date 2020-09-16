package ibm_java;

public class Person {
    private String name;
    private int age;
    public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	String gender;
    @Override
	public String toString() {
		return "Personname=" + name + ", age=" + age   ;
	}
	public Person(String name,int age)
    {
     this.name=name;
     this.age=age;
     
    }
    public Person(String name,int age,String gender)
    {
     this.name=name;
     this.age=age;
     this.gender=gender;
    	
    }
	

}
