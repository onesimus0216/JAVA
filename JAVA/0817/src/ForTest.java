
public class ForTest {

	public static void main(String[] args) {
		
//		for는 {} 블록을 조건이 만족하는 동안 반복해서 실행한다.
//		반복 횟수가 알려져 있는 경우 주로 사용한다.
//		for(자료형 변수이름 = 초기치; 조건식; 증감치) {
//			조건이 참인 동안 반복할 문장;
//			...;
//		}
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10의 합계 = " + sum);
		
		
	}
	
}
