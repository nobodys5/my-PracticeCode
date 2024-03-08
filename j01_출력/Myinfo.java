package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		String fullName;
		fullName = "김영필";
		
		// 선언하고 값을넣는걸 초기화라고함
		String fullName2 = "김영필";
		// 선언은 무조건 한번만 가능!
		System.out.println(fullName);
		fullName = "김동서";
		// 값을 초기화한뒤에 출력문부터 적용되어 출력된다.
		System.out.println(fullName);
		// 대입은 여러번 가능
		System.out.println(fullName2);
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		int age = 18;
		String address = "부산 진구 가야동";
		boolean result = true;
		// String은 기본자료형이 아니다
		System.out.println(name1);
		//문자자료형인 character는 연결시키면 숫자로 나온다.
		System.out.println(name1 + name2 + name3);
		
		/*
		 * 자동완성 단축키 : ctrl + space
		 * 출력문 단축키 : sysout(syso) + ctrl + space
		 */
	}

}





