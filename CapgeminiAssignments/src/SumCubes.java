
public class SumCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=243;
		int count = 0;
		while(n>0) {
			int t= n%10;
			System.out.println("Cube_of" + t +" is " +(t*t*t));
			count=count+1;
			n=n/10;
		}
	}

}
