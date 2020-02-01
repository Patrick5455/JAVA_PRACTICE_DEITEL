package Algorithm_Solutions.exercises_7;
public class SurveyAnalysis{

	public static void main (String... args){
	
		int [] ratings = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
	
		int [] frequency = new int [6];
		
		for (int counter =0; counter<ratings.length; counter++){
			
			//1st Method
			try
			{
			++frequency[ratings[counter]];
			}
			
			catch (ArrayIndexOutOfBoundsException e)
			{
				//System.out.println(e);
				System.out.printf("%n         Error: Ratings No %d = %d%n%n", counter, ratings[counter]);
			}
			
			//2nd Method
			/*switch (ratings[counter]){
			
			case 1:
			++frequency[1];
			break;
			
			case 2:
			++frequency[2];
			break;
			
			case 3:
			++frequency[3];
			break;
			
			case 4:
			++frequency[4];
			break;
			
			case 5:
			++frequency[5];
			break;
			
			//default:
			//System.out.print("Error Value\n");
			//break;
			}*/
		}
		
		System.out.println("Rating\tFrequency");
		for (int rating =1; rating<frequency.length; rating++)
			System.out.printf("%4d%9d%n", rating, frequency[rating]);
	}

}