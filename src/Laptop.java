
public class Laptop {
	private float laptopPrice;
	private int laptopHdd;
	private int laptopScreenSize;
	private int laptopRam;
	private float laptopWeight;
	private String laptopProcessor;

	public Laptop(float laptopPrice, int laptopHdd, int laptopScreenSize, int laptopRam, float laptopWeight,
			String laptopProcessor) {
		super();
		this.laptopPrice = laptopPrice;
		this.laptopHdd = laptopHdd;
		this.laptopScreenSize = laptopScreenSize;
		this.laptopRam = laptopRam;
		this.laptopWeight = laptopWeight;
		this.laptopProcessor = laptopProcessor;
	}

	public float getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(float f) {
		this.laptopPrice = f;
	}

	public int getLaptopHdd() {
		return laptopHdd;
	}

	public void setLaptopHdd(int laptopHdd) {
		this.laptopHdd = laptopHdd;
	}

	public int getLaptopSize() {
		return laptopScreenSize;
	}

	public void setLaptopSize(int laptopSize) {
		this.laptopScreenSize = laptopSize;
	}

	public int getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(int laptopRam) {
		this.laptopRam = laptopRam;
	}

	public float getLaptopWeight() {
		return laptopWeight;
	}

	public void setLaptopWeight(float laptopWeight) {
		this.laptopWeight = laptopWeight;
	}

	public String getLaptopProcessor() {
		return laptopProcessor;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}

//    void setLaptopDetails() {
//    	System.out.println("Laptop Price is           : "+laptopPrice+"/-");
//    	System.out.println("Laptop HDD is             : "+laptopHdd+" GB");
//    	System.out.println("Laptop Size is            : "+laptopScreenSize+" inches");
//    	System.out.println("Laptop RAM is             : "+laptopRam+" GB");
//    	System.out.println("Laptop Weight is          : "+laptopWeight+" KG");
//    }

	void switchOnTheLaptop() {
		System.out.println("Laptop is Turning ON!!!");
	}

	@Override
	public String toString() {
		return " laptopPrice      = " + laptopPrice + "/-" + "\n" + " laptopHdd        = " + laptopHdd + " GB" + "\n"
				+ " laptopScreenSize = " + laptopScreenSize + " inches" + "\n" + " laptopRam        = " + laptopRam
				+ " GB" + "\n" + " laptopWeight     = " + laptopWeight + " KG" + "\n" + " laptopProcessor  = "
				+ laptopProcessor + "\n";
	}

	void switchOffTheLaptop() {
		System.out.println("Laptop is Turning OFF....");
	}

	void playMusic(String songName, String Album) {
		System.out.println("We are playing " + songName + " from" + Album);
	}

	String purchaseTheLaptop(float accBal) {
		if (accBal >= laptopPrice) {
			return " Go Ahead and Grab The Deal!!!";
		}
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("Please Avail Our EMI Scheme to Buy This Premium Product");
		System.out.println("*******************************************************");
		System.out.println();
		float f = payOnEMI();
		System.out.println("Interest to Pay on EMI    :" + f + "/-");
		return " ";
	}

	float payOnEMI() {
		float interestPrice = 1 * 14 * laptopPrice / 100;
		return interestPrice;

	}

}
