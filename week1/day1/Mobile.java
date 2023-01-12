package week1.day1;

public class Mobile {

	public void makecall() {
		System.out.println("Hello This is Vignesh");
		String mobileModel = "Moto Edge 30";
		float  mobileWeight= 198.5f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	
	public void sendMsg() {
		System.out.println("Hi , How are you!!");
		boolean fullCharged = true;
		int mobileCost = 55000;
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.makecall();
        mb.sendMsg();
	}
}
