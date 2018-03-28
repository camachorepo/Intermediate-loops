
public class Even {
	
	
public static void main (String[] args) {
	
	for (int i=10; i<=20; i+=2) {
		if(i==16) continue;
			
			System.out.println(i);
		
		
	}
	for (int i=10; i<=20; i++) {
		if(i==16) continue;
		if (i%2 ==0){
			
			System.out.println(i);
		}
	}
	for(int i=10;;){
		
		if(i>20) break;

		else if(i==16) {
			i++;
			continue;
		}

		else if (i%2 ==0){
			
			System.out.println(i);
		}
		i++;
	}
		
	}
	
}
