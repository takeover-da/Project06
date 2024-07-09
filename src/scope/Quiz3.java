package scope;

public class Quiz3 {

	// 블록에 따라 변수의 유효범위를 작성하세요
	public static void main(String[] args) {

		// main 함수 끝나기 전까지
		Person person = new Person();
		
		// main 함수 끝나기 전까지
		int i = 10;
		
		if(i > 1) {
			// if문이 끝나기 전까지
			String str = "안녕하세요";
		}
		
		// for문이 끝나기 전까지
		for(int k = 0; k < 10; k++) {
			System.out.println(k);
		}
		
	}
	
}
