import java.util.Calendar;

public class CalendarTest {

//	메소드의 형식, []로 묶는 내용은 생략이 가능하다.
//	[접근 권한 지정자] [static] 리턴타입 메소드이름() { // 메소드의 머리
//		메소드가 실행할 문장;
//		...;
//		[return 값;]
//	} // {} 블록을 메소드의 몸통이라 한다.
	
//	접근 권한 지정자
//	private: 현재 클래스 외부에서 접근할 수 없다.
//	protected: 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근할 수 있다.
//	package: 접근 권한 지정자 생략시, 같은 패키지에서는 public 처럼 사용되고 다른 패키지에서는
//	         private 처럼 사용된다.
//	public: 현재 클래스 내부, 외부 어디에서나 자유롭게 접근할 수 있다.
	
//	static(정적) 메소드는 메소드를 작성한 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어서
//	실행할 수 있다. => 자주 사용하는 메소드들은 정적 메소드로 만들어 사용하면 편리하다.
	
//	리턴 타입은 메소드가 실행되고 난 후 결과를 되돌려줄 때 결과의 자료형을 적어준다.
//	메소드를 실행한 후 결과를 되돌려줄 필요가 없으면 return을 생략할 수 있고 return을 생략하면
//	리턴 타입에는 "void"라고 적어준다.
	
//	년도를 인수로 넘겨받아 윤년, 평년을 판단해 윤년이면 true, 평년이면 false를 리턴하는 메소드
//	논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행이다.
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isLeapYear(2024));
		
	}
	
}









