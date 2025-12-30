import static java.lang.IO.println;
class SumArray
{
	public static void main(String []args)
	{
		printSum();
	}
	static void printSum()
	{
		int []a = {1, 2, 3, 4};
		int sum = 0;
		for (int x : a) 
		{     
	       sum += x;
           println(sum);		   
        } 
	}
}
