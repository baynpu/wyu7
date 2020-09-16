package ibm_java;
//ÆÁÄ»³ß´ç£¨screenSzie£©£¬ÅäÅÆ£¨brand£©£¬´¦ÀíÆ÷(cpu)£¬ÄÚ´æ£¨memory£©
public class Phone {
    private int screenSzie;
    private int brand;
    private String cpu;
    private int memory;
	public int getScreenSzie() {
		return screenSzie;
	}
	public void setScreenSzie(int screenSzie) {
		this.screenSzie = screenSzie;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
    
}
