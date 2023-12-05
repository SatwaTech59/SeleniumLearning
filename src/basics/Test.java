package basics;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc" + '\n');
		sb.append("xyz" + '\n');
		sb.append("123" + '\n');
		
		String[] arr = sb.toString().split("\n");
		
		for (String s: arr) {
			System.out.println(s);
		}
		
		
		sb = new StringBuilder();
	
		
		
		
	}

}
