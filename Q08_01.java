package CH08;

public class Q08_01 {

	static void subroutine(String[] ar) {
		
		String ar1[] = {"AB" , "5" , "99" , "LOVE" , "dance"} ; 
		
		int sum=0;
		
		for(int i = 0; i < ar1.length; i++) {
			try{
				sum += Integer.parseInt(ar1[i]);
			} catch (NumberFormatException e) {
				//continue;
			}
		}
		System.out.println("sum=" + sum);
	}
	public static void main(String args[]) {
		subroutine(args);
	} 
}
