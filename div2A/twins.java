import java.util.*;

public class twins{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int coins[];
    coins = new int[n];
    int total=0;
    for (int i=0;i<n;i++ ) {
      coins[i]=scanner.nextInt();
      total += coins[i];
    }
    Arrays.sort(coins);

    int aux=0,i;
    for (i = n-1; i>=0 ;i-- ) {
      aux+=coins[i];
      if (aux > (total-aux)) {
        break;
      }
    }

    if(i<0){
      System.out.println(n);
    }else{
      System.out.println(n-i);
    }
  }
}
