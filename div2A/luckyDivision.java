import java.util.*;

public class luckyDivision {
  public static void main(String[] args) {

    int [] arr = {4,7,44,47,74,77,444,447,474,477,744,747,774,777}; //14
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    boolean ban=false;
    for (int i=0;i<14 ;i++) {
      if (num%arr[i] == 0) {
        ban=true;
        break;
      }
    }
    if (ban == true) {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
