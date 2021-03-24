
public class IncreasingNumber {

	public static void main(String[] args) 
	{
		int n = 12345;
		boolean flag = false;
		
		int currentdigit = n%10;
		n=n/10;
		
		while(currentdigit <= n%10)
		{
			flag = true;
			break;
		}
		
		n=n/10;
		currentdigit = n%10;
		
	if(flag) {
		System.out.println("A number: "+n+" is said to be not an increasing number");
	}else {
		System.out.println("A number: "+n+" is said to be an increasing number");
	}

	}

}
