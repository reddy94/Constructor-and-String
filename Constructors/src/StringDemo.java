public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1="java language";
		int length=s1.length();
		int indexOfA=s1.indexOf('v');
		int lastOccuranceOfA=s1.lastIndexOf('g');
		String toUpperCase=s1.toUpperCase();
		System.out.println("Lenght of the string>>>"+length);
        System.out.println("Index of the string>>"+indexOfA);
        System.out.println("Index of the string>>"+lastOccuranceOfA);
        System.out.println("String to uppercase>>"+toUpperCase);
	}

}
