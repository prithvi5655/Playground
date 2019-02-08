import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      System.out.print(greatest(a,b,c));
    }
  public static int greatest(int a,int b,int c)
  {
    int greatest=0;
    if(a>b && a>c)
    {
      greatest=a;
	}
    else if(b>a && b>c)
    {
      greatest=b;
    }
    else
    {
      greatest=c;
    }
    return greatest;
  }
  
}