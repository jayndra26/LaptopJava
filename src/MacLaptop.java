
public class MacLaptop extends Laptop {
	private String LaptopOperatingSystem;

	public MacLaptop(float laptopPrice, int laptopHdd, int laptopScreenSize, int laptopRam, float laptopWeight,
			String laptopProcessor, String laptopOperatingSystem) {
		super(laptopPrice, laptopHdd, laptopScreenSize, laptopRam, laptopWeight, laptopProcessor);
		LaptopOperatingSystem = laptopOperatingSystem;

	}

	public String getLaptopOperatingSystem() {
		return LaptopOperatingSystem;
	}

	public void setLaptopOperatingSystem(String laptopOperatingSystem) {
		LaptopOperatingSystem = laptopOperatingSystem;
	}

	@Override
	public String toString() {
		return " LaptopOperatingSystem=  " + LaptopOperatingSystem + "\n" + super.toString();
	}
	void laptopType(String laptopOperatingSystem) {
		System.out.println("This Laptop Runs On "+laptopOperatingSystem);
	}

	@Override
	void switchOnTheLaptop() {
		// TODO Auto-generated method stub
		super.switchOnTheLaptop();
	}

	@Override
	void switchOffTheLaptop() {
		// TODO Auto-generated method stub
		super.switchOffTheLaptop();
	}

	@Override
	void playMusic(String songName, String Album) {
		// TODO Auto-generated method stub
		super.playMusic(songName, Album);
	}

	@Override
	String purchaseTheLaptop(float accBal) {
		// TODO Auto-generated method stub
		return super.purchaseTheLaptop(accBal);
	}

	@Override
	float payOnEMI() {
		// TODO Auto-generated method stub
		return super.payOnEMI();
	}

}
