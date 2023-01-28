package logics;

public class SummationOfNumbers {


	public static void main(String[] args) {

		String str = "138 3";
		String nums[] = str.split(" ");
		//str = nums[0];  //138
		
		int a=Integer.parseInt(nums[0]);
		for (int i = 1; i < Integer.parseInt(nums[1]);i++ ) {
			//str = str+ nums[0];
			a=a+Integer.parseInt(nums[0]);
		}

		System.out.println(a);

		//System.out.println(sumOfDigits(Integer.parseInt(str)));
	}

	
	
	public static int sumOfDigits(int num) {
		int sum = 0;

		for (int i = num; i> 0; i/=10) {
			int rem = i % 10;
			sum = sum + rem;			
		}

		if (sum > 9) {
			return sumOfDigits(sum);
		}

		return sum;


	}

}
