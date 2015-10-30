public class MobilePhone extends OldPhone{
	private String[] lastTenNumbers = new String[10];
	public void ringAlarm(String alarmToRing){
		System.out.println(alarmToRing);
	}
	public void playGame(String gameToPlay){
		System.out.println("Welcome to " + gameToPlay);
		System.out.println("Press Enter To Start ");
	}
	
	public void call(String number){
		if (number.substring(0,1).equals(00)) //not recognising these!!
			System.out.println ("Calling <" + number + "> over the internet...");
		else 
			super.call(number);
		
		storeNumber(number);
	}
	
	public void printLastNumbers(){
		System.out.println("Here are your last ten calls, with the most recent first:");
		for (int i = 0; i < 10; i++){
			System.out.println(lastTenNumbers[i]);
		}
	}
	
	private void storeNumber(String number){
		for (int i = 8; i >= 0 ; i--){
			lastTenNumbers[i+1] = lastTenNumbers[i];
		}
		lastTenNumbers[0] = number;
	}
}
