import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int second_last=((n/10)%10);
      System.out.println(second_last);
	}
}