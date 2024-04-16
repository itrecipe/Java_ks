package ch11;

public class Exception03 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		try {
			for(int i = 0; i <= 3; i++) {
				System.out.println("arr[" + i +"] : " + arr[i]);
			}
		}
		catch(Exception ex) {
			System.out.println("예외 처리!");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("예외 발생 여부와 상관없이 실행됨!");
		}
	}
}