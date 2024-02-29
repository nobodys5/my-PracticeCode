package 마트키오스크.지점;

public class Busan extends Factory {

	public Busan(int factory) {
		super(factory);
	}
	@Override
	public void poweron() {
		System.out.print("부산");
		super.poweron();
	}
	@Override
	public void poweroff() {
		System.out.print("부산");
		super.poweroff();
	}
}
