import java.util.*;

public class beautifulMatrix {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i,j,num,a=0,b=0;

    for (i=0;i<5 ; i++) {
      for (j=0;j<5 ; j++) {
        num = in.nextInt();
        if (num == 1) {
          a=i;
          b=j;
        }
      }
    }

    System.out.println(Math.abs(2-a)+Math.abs(2-b));

  }
}
