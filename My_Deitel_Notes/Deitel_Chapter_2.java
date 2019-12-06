//Declaring a Method
public class Deitel_Chapter_2 {
	//main method begins execution of Java app		
	//For a Java application, one of the methods must be called			
	//main & must be defined as in line 6; otherwise,d program won't execute
	public static void main(String[] args) {

		System.out.print("Welcome to "); 
		System.out.println("Java Programming!");
		

	 // Unlike println,after displaying its argument, print does not
	//position the output cursor @ d beginning of the next line—the next
	//character d program displays will appear immediately after the last
	//character that print displays.
	
	/*A single statement can display multiple lines by using newline characters (\n), which indicate to System.out’s print and println methods when to position the output cursor at the beginning of the next line in the command window.*/
	
	System.out.println("Welcome\nto\njava\nprogrammimg!");
	
// Displaying Text with printf
// Method System.out.printf (f means "formatted") displays formatted //data.

		System.out.printf("%s%n%s%n", "Welcome to", "Java Programming");
		
		System.out.printf("%s%n%s%n%s%n", "Patrick", "Welcome to", "Java Programming");
		
		System.out.printf("%s%n%s%n%s%n", "The method call specifies three arguments.", "When a method requires multiple arguments, they\'re placed in a comma-separated list.", "Calling a method is also referred to as invoking a method.");
		
		/*Method printf’s first argument is a format string that may consist of fixed text and format specifiers. Each format specifier is a placeholder for a value and specifies the type of data to output. Format specifiers also may include optional formatting information.  
		
		Format specifiers begin with a percent sign (%) followed by a character that represents the data type.
		
		Notice that instead of using the escape sequence \n, we used the %n format specifier, which is a line separator that’s portable across operating systems. You cannot use %n in the argument to System.out.print or System.out.println; however, the line separator output by System.out.println after it displays its argument is portable across operating systems.*/
		
//Another Application: Adding Integers

		
		}




} // end class WelcomeDeitel2