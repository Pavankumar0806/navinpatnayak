public class PrimeBelow {
	
	public static void main(String[] args) {
		
		for(int p=1; p<=50;p++) {
			
			int count=0;
			
		for(int q=p; q>=1; q--) {
		
			if(p % q   == 0) {
				count=count+1;
				
			}
		}
			if(count == 2) {
			
			System.out.println( "numbers are"  +p);	
			
			}
		}}}
