import static java.lang.IO.println;
class PrintArray
{
	public static void main(String []args)
	{
		printElements();
	}
	static void printElements()
	{
        int []a = {10, 20, 30, 40}; 
        for (int x : a) 
		{ 
            println(x); 
        } 
	}
}
