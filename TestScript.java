public class TestScript{
	public static void main(String [] args){
		TestScript script = new TestScript();
		script.launch();
	}
	public void launch(){
		Phone firstPhone = new MobilePhone();
		OldPhone secondPhone = new MobilePhone();
		MobilePhone mobPhone = new MobilePhone();
		
		mobPhone.ringAlarm("Wake Up!! Wake Up!!");
		secondPhone.call("07548 212 356");
		mobPhone.playGame("frogz");
		mobPhone.call("0207 868 2210");
		mobPhone.call("00 207 868 2211");
		mobPhone.call("00 207 868 2212");
		mobPhone.call("0207 868 2213");
		mobPhone.call("0207 868 2214");
		mobPhone.call("0207 868 2215");
		mobPhone.call("0207 868 2216");
		mobPhone.call("0207 868 2217");
		mobPhone.call("0207 868 2218");
		mobPhone.call("0207 868 2219");
		mobPhone.call("0207 868 2220");
		
		mobPhone.printLastNumbers();
	}
	
}