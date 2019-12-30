public class sumEven{


	public static void main(String... args){
		
		int total = 0;
	
	for (int x =2; x<=20; x+=2){
			total +=x;
			System.out.println(total);
		 
	}
		
//Or
	total =0;

	for (int y = 2; y<=20; total+=y, y+=2){
		
	}
	System.out.println(total);
	
	}
}