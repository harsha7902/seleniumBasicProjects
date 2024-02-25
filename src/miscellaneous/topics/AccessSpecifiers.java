package miscellaneous.topics;

public class AccessSpecifiers {
	public void getHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		AccessSpecifiers obj = new AccessSpecifiers();
		obj.getHello();

	}

}
