
public class PrimeNumber {
	public static void main(String[] args) {
		int count;
		for(int i=2;i<=20;i++)
		{
			count=0;
			for(int j=2;j<=20;j++)
			{
				if(i%j==0)
					count=count+1;
			}
			if(count==0)
				System.out.println(i);
		}
	}
}
