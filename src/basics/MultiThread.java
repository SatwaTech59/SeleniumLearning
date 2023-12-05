package basics;

public class MultiThread {

	public static void main(String[] args) {
		
		for (int i = 1; i<= 4; i++) {
			ActiveElement act = new ActiveElement();
			act.start();
		}
		

	}

}
