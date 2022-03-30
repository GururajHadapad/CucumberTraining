package dependencyInjection;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int[] a= {1,2,0,4,0,6,7,8,0,10};
		
		int[] b=new int[10];
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a==b) {
					a[i]=b[j];
					
				}				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
