
public class FibonacciSeries {
		public static int fib(int n)
		{
			if(n<=1)
				return n;
			else
				return fib(n-1) + fib(n-2);
		}
		public static void main(String[] args) {
			int n=9;
			if(n<0)
				System.out.println("fibonacci number is not defined");
			else
				System.out.println(fib(n));
		}
}
