package test;

public class Main {

	public static void main(String[] args) {
		ITelephone timsTelephone = new DeskPhone(1234567);
		timsTelephone.powerOn();
		timsTelephone.callPhone(1234567);
		timsTelephone.answer();
		timsTelephone.dial(67437643);
		timsTelephone = new MobilePhone(564564);
		timsTelephone.powerOn();
		timsTelephone.dial(5434535);
	}
}