package selectDropDownBox;

public class Debugging_1 {

	public static void main(String[] args) {
			
		int number=12345678;
		int count=0;
		
// the condition is fault
		while(number>=0) {
			number=number/10;
			count++;
			}
		System.out.println(count);
	}
	
	
	public void name() {
		int number=12345678;
		int count=0;
		
// the condition is correct
		
		while(number>0) {
			number=number/10;
			count++;
			}
		System.out.println(count);
	}

}
