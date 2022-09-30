package exe4;

public class Ques5 {

	interface Clickable {
		default void click() {
			System.out.println("click");
		}
	}

	interface Accessible {
		default void access() {
			System.out.println("access");
		}
	}

	public class Ques5 implements Clickable, Accessible {

		public static void main(String[] args) {
			Ques5 button = new Ques5();
			button.click();
			button.access();
		}
	}
}