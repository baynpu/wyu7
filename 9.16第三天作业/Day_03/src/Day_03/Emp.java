package Day_03;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hireaDate;

	public Emp(String name, int age, String gender, int salary, Date hireaDate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hireaDate = hireaDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHireaDate() {
		return hireaDate;
	}

	public void setHireaDate(Date hireaDate) {
		this.hireaDate = hireaDate;

	}

	public static String Hir(Date Hir) {
		String string = String.format("%tF", Hir);
		return string;
	}

	public static Date getDate(Date Hir, int year, int month, int day) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, year);// 设置年
		gc.set(Calendar.MONTH, month);// 这里0是1月..以此向后推
		gc.set(Calendar.DAY_OF_MONTH, day);// 设置天
		Hir = gc.getTime();
		return Hir;
	}

	@Override
	public String toString() {
		return "Emp [姓名：" + name + ", 年龄：" + age + ", 性别：" + gender + ", 工资：" + salary + ",入职时间:" + Hir(hireaDate)
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hireaDate == null) {
			if (other.hireaDate != null)
				return false;
		} else if (!hireaDate.equals(other.hireaDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Emp emp = new Emp("Jack", 21, "男", 2000, getDate(new Date(), 2015, 4, 12));
		Emp emp1 = new Emp("Jack", 21, "男", 2000, getDate(new Date(), 2010, 9, 20));
		Emp emp2 = new Emp("Mark", 20, "女", 3000, getDate(new Date(), 2013, 2, 24));
		Emp emp3 = new Emp("Marry", 19, "男", 7000, getDate(new Date(), 2011, 11, 26));
		Emp emp4 = new Emp("Lisa", 33, "女", 5200, getDate(new Date(), 2008, 10, 30));
		Emp emp5 = new Emp("Smith", 22, "女", 2000, getDate(new Date(), 2016, 9, 17));
		Emp emp6 = new Emp("李大嘴", 29, "男", 19000, getDate(new Date(), 2002, 10, 19));

		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println(emp6);
		System.out.println(emp.equals(emp1));

	}

}
