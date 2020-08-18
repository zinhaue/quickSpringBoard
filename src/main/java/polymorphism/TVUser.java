package polymorphism;

public class TVUser {

	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		//2 .다형성이용
//		TV samsungTv = new SamsungTV();	//묵시적 형변환
//		samsungTv.powerOn();
//		samsungTv.volumeUp();
//		samsungTv.volumeDown();
//		samsungTv.powerOff();
//		
//		TV lgTv = new LgTV();	//묵시적 형변환
//		lgTv.powerOn();
//		lgTv.volumeUp();
//		lgTv.volumeDown();
//		lgTv.powerOff();
	
		//3. 디자인패턴이용(팩토리메서드패턴)
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean("samsung");
		tv.powerOn();
		tv.volumeDown();
		tv.powerOff();

	}
}
