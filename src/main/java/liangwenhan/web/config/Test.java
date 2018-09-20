package liangwenhan.web.config;

public class Test implements Cloneable {

	String a = "ccc";
	String b = "ddd";
	int c = 123;
	
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) throws Throwable {
		Test c = new Test();
		Test cd = (Test) c.clone();
		System.out.println(cd);
		cd.finalize();
	}

}
