import static java.lang.IO.println;
class Palindrome
{
	public static void main(String []args)
	{
		printNum();
	}
	static void printNum()
	{
		int num = 121, temp = num, rev = 0;
		while (num > 0) 
		{     
	        rev = rev * 10 + num % 10;     
	        num /= 10; 
        } 
        println(temp == rev ? "Palindrome" : "Not Palindrome"); 
    }
}
