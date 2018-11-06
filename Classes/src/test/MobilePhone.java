package test;

public class MobilePhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}
	
	@Override
	public void powerOn() {
		System.out.println("Phone is powering on");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("is dialing " + phoneNumber);
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	 
}
