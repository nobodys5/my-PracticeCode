package 마트키오스크;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Homeplus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> order = new HashMap<String, String>();
		List<HashMap<String, String>> a = new ArrayList<HashMap<String, String>>();
		String select = null;
		
		order.put("불고기", "120g");
		order.put("콩나물", "120g");
		order.put("돼지고기", "120g");
		order.put("소고기", "120g");
		
		String order1 = null;
		while(true) {
			
			System.out.println("계산해드리겠습니다.");
			System.out.println("1.상품검색");
			System.out.println("2.주문추가");
			System.out.println("3.주문상품삭제");
			System.out.println("4.주문목록조회");
			System.out.println("입력");
			select = scanner.nextLine();
			String text = null;	
			String text2 = null;
			String text3 = null;
			
			
			if(select.equals("1")) {
				while(true) {
					System.out.println("검색");
					order1 = scanner.nextLine();
					if(order1.equals("q"))break;
					System.out.println(order.get(order1));
				} 
			}else if(select.equals("2")) {
				while(true) {
					System.out.println("한글");
					text = scanner.nextLine();
					if(text.equals("q")) break;
					System.out.println("영어");
					text2 = scanner.nextLine();
					
					System.out.println(order.put(text, text2));
						
					
				}
				System.out.println(order);
			}else if(select.equals("3")) {
				while(true) {
					
					System.out.println("삭제할 품목을 선택하세요");
					text3 = scanner.nextLine();
					if(text3.equals("q")) break;
					order.remove(text3);
					System.out.println(order);
				}
			
			}else if(select.equals("4") ) {
				for(String key : order.keySet()) {
					System.out.println(key + order.get(key));
				}
			}else if(select.equals("exit"))break;
		}
		System.out.println("계산이 완료되었습니다.");
	}
		
		
		
		
	
}
