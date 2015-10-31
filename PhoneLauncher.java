public class PhoneLauncher{
	public static void main(String [] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
		SmartPhone smartPhone = new SmartPhone("nokia");
		smartPhone.call("01722 338 124");
		smartPhone.call("01722 338 125");
		smartPhone.call("01722 338 126");
		smartPhone.call("001722 338 127");
		smartPhone.findPosition();
		smartPhone.browseWeb("www.bbc.co.uk");
		smartPhone.printLastNumbers();
		System.out.println(smartPhone.getBrand());
		smartPhone.playGame("Fifa");
	}
}