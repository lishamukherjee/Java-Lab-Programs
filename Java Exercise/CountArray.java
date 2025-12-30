import static java.lang.IO.println;
class CountArray
{
	public static void main(String []args)
	{
		countElements();
	}
	static void countElements()
	{
		int []a = {1, 2, 3, 4, 5}; 
		int count = 0;
		for (int x : a) 
		{     
	        count++; 
        } 
        println(count); 
    }
}
