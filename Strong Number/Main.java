import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=n/100;
      int second=(n/10)%10;
      int last=n%10;
      int fact1=1;
      int fact2=1;
      int fact3=1;
      for(int i=1;i<=first;i++)
      {
        fact1=fact1*i;
      }
      for(int j=1;j<=second;j++)
      {
        fact2=fact2*j;
      }
      for(int k=1;k<=last;k++)
      {
        fact3=fact3*k;
      }
      if((fact1+fact2+fact3)==n)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
      
	}
}