package 마트키오스크.지점;

public class Seoul extends Factory {
	
	
	public Seoul(int factory) {
		super(factory);
	}
	@Override
	public void poweron() {
		System.out.print("서울");
		super.poweron();
	}@Override
	public void poweroff() {
		System.out.print("서울");
		super.poweroff();
	}
}
