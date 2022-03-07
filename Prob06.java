//Prob06:
/*
Maria just received some money and has decided she would like some more.
She's going to save it in the bank and get interest back. Using the Simple Interest
Formula, figure out how much interest she'll get paid.
The Simple Interest Formula is:
I = Prt
...where P = the Principal (the initial amount of money),
r = the rate of return per year,
t = the number of years.
For example, if P = $10000, r = .04 (or 4% per year), and t = 5 years, the interest I
= ($10000)(.04)(5) = $2000, so she gets $2000 in interest in 5 years!
Given P, r, and t, find I.
Input
The input has 3 lines. The first is an integer showing the starting Principal amount. The second is the rate of
return per year, as a decimal fraction beginning with "0.". The third is an integer, showing the number of years.
10000
0.04
5
Output
Print the Interest as a decimal fraction with 2 decimal places. Do not round up! Instead truncate any digits past 2
decimal places.
2000.00
Discussion
For Output 1, Prt = 4305.31875. We truncate to 4305.31. For Output 2, Prt = 13362.966. We truncate to
13362.96.
*/

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static String addZero(double num,int zeros){
      String num1 = "" +  num ;
      if (num-(int)num == 0 ){
        for(int i = 0; i<zeros; i++){
          num1+= "0";
        }
        return num1;
      }
      else{
        return num1;
      }
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    double R = sc.nextDouble();
    int T = sc.nextInt();
    double amount = P * R * T;
    amount = Math.floor(amount*100);
    System.out.print(addZero(amount/100,1));
  }
}
