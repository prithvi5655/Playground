import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first=n/10;
      int second=n%10;
      System.out.println(first+second);
	}
}