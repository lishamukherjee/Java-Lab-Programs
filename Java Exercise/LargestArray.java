import static java.lang.IO.println;
class LargestArray
{
	public static void main(String []args)
	{
		printLargest();
	}
	static void printLargest()
	{
		int[] a = {5, 8, 2, 9};
		int max = a[0];
		for (int x : a)
			{     
		        if (x > max)   
					max = x; 
            } 
        println(max); 
}
}
