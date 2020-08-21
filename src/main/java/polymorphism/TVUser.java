package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//스프링 컨테이너 구동을 위한 테스트코드 작성
		//Spring 컨테이너를 구동한다.						 --1
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//Spring컨테이너로부터 필요한 객체를 요청(Lookup)한다. --2
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		//Spring컨테이너를 종료한다.						 --3
		factory.close();
		
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
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean("samsung");
//		tv.powerOn();
//		tv.volumeDown();
//		tv.powerOff();

	}
}
