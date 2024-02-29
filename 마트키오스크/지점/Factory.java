package 마트키오스크.지점;

public class Factory {

	private int factory;
	
	public Factory (int factory) {
		this.factory = factory;
	}
	
	public void poweron() {
		System.out.println("매장오픈");
	}
	public void poweroff() {
		System.out.println("매장폐점");
	}
	
}
