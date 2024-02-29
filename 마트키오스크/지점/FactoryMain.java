package 마트키오스크.지점;

public class FactoryMain {

	public static void main(String[] args) {
		Factorysubcontract ulsan = new Ulsansubcontract(); 
		
		Factory[] factories = new Factory[6];
		factories[0] = new Seoul(1);
		factories[1] = new Busan(1);
		factories[2] = new Seoul(2);
		factories[3] = new Seoul(3);
		factories[4] = new Busan(2);
		factories[5] = new Busan(3);
		
		ulsan.subcontract();
		ulsan.subcontract3();
		ulsan.subcontract2();
		System.out.println();
		System.out.println("가맹지점 오픈");
		for(int i = 0; i < factories.length; i++) {
			factories[i].poweron();
		}
		System.out.println("가맹지점 폐점");
		for(int i = 0; i < factories.length; i++) {
			factories[i].poweroff();
		}
	}

}
