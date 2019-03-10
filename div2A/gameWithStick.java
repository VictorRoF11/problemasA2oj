import java.util.*;

public class gameWithStick {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n=0,m=0;
    n = in.nextInt();
    m = in.nextInt();
    if (Math.min(n,m) % 2 == 0) {
      System.out.println("Malvika");
    }else{
      System.out.println("Akshat");
    }
  }
}
