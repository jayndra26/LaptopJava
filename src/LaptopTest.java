
public class LaptopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MacbookVarriant ml = new MacbookVarriant(150000f, 1024, 16, 64, 1.8f, "M1 PRO", "MacOS", "Macbook PRO MAX");
		System.out.println(ml);

		ml.purchaseTheLaptop(120000f);
		ml.switchOnTheLaptop();
		ml.playMusic("Roja", " A.R.Rahman");
		ml.switchOffTheLaptop();
		ml.laptopType("MacOS", "Macbook PRO-MAX");

	}

}
