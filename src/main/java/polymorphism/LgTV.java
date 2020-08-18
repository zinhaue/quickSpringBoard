package polymorphism;

public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTv---전원 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv---전원 끈다.");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTv---소리 올린다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTv---소리 내린다.");
		
	}
//	public void turnOn() {
//		System.out.println("LgTv---전원 켠다.");
//	}
//	public void turnOff() {
//		System.out.println("LgTv---전원 끈다.");
//	}
//	public void soundUp() {
//		System.out.println("LgTv---소리 올린다.");
//	}
//	public void soundDown() {
//		System.out.println("LgTv---소리 내린다.");
//	}
	
}
