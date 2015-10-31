public class SmartPhone extends MobilePhone{
	
	//constructor calls the constructor of MobilePhone, which in turn calls the
	// constructor of OldPhone, with the arg String brand
	public SmartPhone(String brand){
		super(brand);
	}
	
	public void browseWeb(String url){
		System.out.println("Searching for: " + url);
	}
	public int findPosition(){
		return 012345;
	}
	
	public void call(String number){
		if (number.substring(0,2).equals("00")) { 
			System.out.println ("Calling <" + number + "> over the internet...");
			storeNumber(number);
		}
		else {
			super.call(number);
		}
	}
	
}