package ch09._201201;

public class Ex05_PropertyOfSystem {
	public static void main(String[] args) {
		System.out.println("System의 프로퍼티 값 조회");
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println("==============================");
		
		for (String env : System.getenv().keySet()) {
			System.out.println(env + " = " + System.getenv(env));
		}
		
	}
}
