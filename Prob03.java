//Prob 03:

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int PTS = sc.nextInt();
    int FGA = sc.nextInt();
    int FTA = sc.nextInt();
    double percent = 100 * PTS/(2*(FGA+(0.44*FTA)));
    percent = Math.round(percent*100);
    System.out.print(percent/100 + "%");
  }
}
