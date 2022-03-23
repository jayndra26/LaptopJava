
public class MacbookVarriant extends MacLaptop {
	String macbookmodelVarriant;

	public MacbookVarriant(float laptopPrice, int laptopHdd, int laptopScreenSize, int laptopRam, float laptopWeight,
			String laptopProcessor, String laptopOperatingSystem, String macbookmodelVarriant) {
		super(laptopPrice, laptopHdd, laptopScreenSize, laptopRam, laptopWeight, laptopProcessor,
				laptopOperatingSystem);
		this.macbookmodelVarriant = macbookmodelVarriant;
	}

	public String getMacbookmodelVarriant() {
		return macbookmodelVarriant;
	}

	public void setMacbookmodelVarriant(String macbookmodelVarriant) {
		this.macbookmodelVarriant = macbookmodelVarriant;
	}

	@Override
	public String toString() {
		return " macbookmodelVarriant= " + macbookmodelVarriant + "\n" + super.toString();
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
	

	
	void laptopType(String laptopOperatingSystem, String macbookmodelVarriant) {
		// TODO Auto-generated method stub
		System.out.println("This Machine Runs On "+laptopOperatingSystem +"\n"+"And it is " +macbookmodelVarriant);
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
