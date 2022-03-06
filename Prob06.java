//Prob06:

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    double R = sc.nextDouble();
    int T = sc.nextInt();
    double amount = P * R * T;
    amount = Math.floor(amount*100);
    System.out.print(amount/100);
  }
}
