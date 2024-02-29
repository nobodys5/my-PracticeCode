package 마트키오스크;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Event extends Homeplus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> event = new HashMap<String, String>();
		Map<String, String> event2 = new HashMap<String, String>();
		String select = null;
		
		event.put("10만원", "5%DC");
		event.put("20만원", "10DC");
		event.put("30만원", "15%DC");
		event.put("프리미엄세트", "10%DC");
		event.put("홈세트", "20%DC");
		
		event2.put("나이키", "이월상품");
		event2.put("퓨마", "이월상품");
		event2.put("유니클로", "이월상품");
		
		String dc = null;
		while(true) {
			System.out.println("할인이벤트 입니다.");
			System.out.println("1.할인적용품목입니다.");
			System.out.println("2.할인상품이아닙니다.");
			select = scanner.nextLine();
			String nosale = null;
			
			if(select.equals("1")) {
				while(true) {
					System.out.println("이벤트 상품 확인");
					select = scanner.nextLine();
					if(select.equals("q"))break;
					System.out.println(event.get(dc));
					System.out.println(event);
					
				}
				
				
			}else if(select.equals("2")) {
				while(true) {
					System.out.println("이벤트기간이 지난 상품입니다.");
					nosale = scanner.nextLine();
					if(nosale.equals("q"))break;
					System.out.println(event2.get(nosale));
				}
				
			
			}else if(select.equals("exit"))break;
				
			
		}
		System.out.println("계산이 완료되었습니다.");
		
		
		
	}
	
	
}
