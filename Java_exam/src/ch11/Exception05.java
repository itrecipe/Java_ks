package ch11;

//사용자 정의 예외 클래스
class InvaildException extends Exception {
	public InvaildException(String s) {
		super(s);
	}
}

public class Exception05 {
	void check(int weight) throws InvaildException {
		if(weight < 100) {
			throw new InvaildException("InvalidException 클래스 호출!"); //사용자 정의 예외 클래스를 호출
		}
	}
	public static void main(String[] args) {
		Exception05 obj = new Exception05();
		
		try {
			obj.check(60);
		}
		catch(InvaildException ex) {
			System.out.println("예외 처리!");
			System.out.println(ex.getMessage());
		}
	}

}
