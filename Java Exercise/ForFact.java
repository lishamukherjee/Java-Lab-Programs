import static java.lang.IO.println;
class ForFact
{
	public static void main(String []args)
	{
		printFact();
	}
	static void printFact()
	{
	    int fact = 1; 
	    for (int i = 1; i <= 5; i++) 
	    {    
           fact *= i; 
        } 
        println(fact); 
	}
}
