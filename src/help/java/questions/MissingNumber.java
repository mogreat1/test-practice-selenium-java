package questions;

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5};

		int sum =0;
		int sum2=0;

		for (int i =0; i<a.length; i++){
			sum=sum+a[i];
		}

		int length= a.length;
		for (int j=a[0]; j<=a[length-1]; j++){
			sum2=sum2+j;
		}

		System.out.println(sum2-sum);

	}

}
