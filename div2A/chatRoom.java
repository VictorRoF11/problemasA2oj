import java.util.*;

public class chatRoom {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String saludar = "hello";

    int i,aux=0;
    for (i=0; i < s.length() ; i++ ) {

      if (aux == 5) {
        break;
      }

      if (s.charAt(i) == saludar.charAt(aux)) {
        aux++;
      }
    }
    if (aux >= 5) {
      System.out.println("YES");
    }
    if (aux < 5) {
      System.out.println("NO");
    }
  }
}
