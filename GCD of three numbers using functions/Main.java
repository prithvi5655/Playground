import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int res=gcd(a,b);
      System.out.print(gcd(res,c));
	}
  public static int gcd(int a,int b)
  {
    int gcd=0,min=0;
    if(a<b)
    {
      min=a;
    }
    else
    {
      min=b;
    }
    while(min>=1)
    {
      if(a%min==0 && b%min==0)
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
  
      
}