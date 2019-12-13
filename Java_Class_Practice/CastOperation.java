public class CastOperation{
	
	public static void main (String... args){
		
		/*You can indicate a character value in a program simply by enclosing that character in single quotes, as in ‘A’.
		
		You can determine a character’s integer equivalent by preceding that character with (int), as in (int) ‘A’
		An operator of this form is called a cast operator. (
		
		
		When the preceding statement executes, it displays the character A and the value 65 (from the Unicode® character set) as part of the string. The format specifier %c is a placeholder for a character (in this case, the character ‘A’).*/
		
		System.out.printf("The character %C has the value of %d%n", 
		'A', (int) 'A');
		
		System.out.printf("The character %C has the value of %d%n", 
		'B', (int) 'B');
		
		System.out.printf("The character %C has the value of %d%n", 
		'C', (int) 'C');
		
		System.out.printf("The character %C has the value of %d%n", 
		'a', (int) 'a');
		
		System.out.printf("The character %C has the value of %d%n", 
		'b', (int) 'b');
		
		System.out.printf("The character %C has the value of %d%n", 
		'c', (int) 'c');
		
		System.out.printf("The character %C has the value of %d%n", 
		'0', (int) '0');
		
		System.out.printf("The character %C has the value of %d%n", 
		'1', (int) '1');
		
		System.out.printf("The character %C has the value of %d%n", 
		'2', (int) '2');
		
		System.out.printf("The character %C has the value of %d%n", 
		'$', (int) '$');
		
		System.out.printf("The character %C has the value of %d%n", 
		'*', (int) '*');
		
		System.out.printf("The character %C has the value of %d%n", 
		'+', (int) '+');
		
		System.out.printf("The character %C has the value of %d%n", 
		'/', (int) '/');
		
		System.out.printf("The character %C has the value of %d%n", 
		' ', (int) ' ');
		
	}
}