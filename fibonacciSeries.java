package week1.day1;

public class fibonacciSeries {

	
	public static void main(String[] args) {
	
		int n=8;
		int t1=0;
		int t2=1;
		int i,sum;
		
		for(i=1;i<=n;i++) {
		
		System.out.println(t1);
		
		sum=t1+t2;	
		t1=t2;
		t2=sum;
		

		}	
		
	}
	
		
	
}
