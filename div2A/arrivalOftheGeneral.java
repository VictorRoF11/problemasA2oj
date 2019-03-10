import java.util.*;

public class arrivalOftheGeneral {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=0;
    n=scanner.nextInt();
    int a = scanner.nextInt();
    int max=a,min=a;
    int maxi=0,mini=0;

    for (int i=1;i<n ;i++) {
      a = scanner.nextInt();
      if (a > max) {
        max = a;
        maxi = i;
      }
      if (a <= min) {
        min = a;
        mini = i;
      }
    }
    if (maxi <= mini) {
      System.out.println(maxi+(n-1-mini));
    }else{
      System.out.println(maxi+(n-1-mini)-1);
    }
  }
}
