package Package1;

public class Test1 {

	public  static void main(String[]args) {
	String str= "I Love Pranali";
	
	int totalString = str.length();
	int AfterRemove= str.replace("a", "").length();
	
	int count= totalString - AfterRemove;
	System.out.println(count);
}
}