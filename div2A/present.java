import java.util.*;

public class present{
  public static void main(String[] args) {
    int arr[];
    arr = new int [102];

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int aux=0;
    for (int i=1;i<=n ;i++ ) {
      aux = scanner.nextInt();
      arr[aux]=i;
    }

    for (int i=0;i<=100 ;i++ ) {
      if (arr[i] != 0) {
        System.out.print(arr[i]+" ");
      }
    }
  }
}
