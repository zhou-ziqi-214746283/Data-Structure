package ds.stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack theStack = new Stack(3);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		System.out.println(reverseString("hello"));
	}
	public static String reverseString(String str) {
		StackString theStackString = new StackString(str.length());
		for(int i=0;i<str.length();i++) {
			theStackString.push(str.charAt(i));
		}
		char[] strNew = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			strNew[i]=theStackString.pop();
		}
		return new String(strNew);
	}
	
}
