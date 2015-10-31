public class MobilePhone extends OldPhone{
	private String[] lastTenNumbers = new String[10];
	
	//constructor calls the constructor of the super class
	public MobilePhone(String brand){
		super(brand);
	}
	public void call(String number){
		super.call(number);
		storeNumber(number);
	}
	
	public void ringAlarm(String alarmToRing){
		System.out.println(alarmToRing);
	}
	
	//protected visibility will allow this to be accessed from SmartPhone
	protected void playGame(String gameToPlay){
		System.out.println("Welcome to " + gameToPlay);
		System.out.println("Press Enter To Start ");
	}
	
	public void printLastNumbers(){
		System.out.println("Here are your last ten calls, with the most recent first:");
		for (int i = 0; i < 10; i++){
			System.out.println(lastTenNumbers[i]);
		}
	}
	
	public void storeNumber(String number){
		for (int i = 8; i >= 0 ; i--){
			lastTenNumbers[i+1] = lastTenNumbers[i];
		}
		lastTenNumbers[0] = number;
	}
}
