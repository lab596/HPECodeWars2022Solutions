//Prob 03:
/*
Basketball is full of advanced shooting metrics and one of
these metrics is true shooting percentage.
Though it is not a perfect statistical measurement, the main
idea of TS% is that it is a measure of scoring efficiency
based on the number of points scored over the number of
possessions in which a player attempted to score. In simple
terms, true shooting percentage can be thought of as points
per shot.
True shooting percentage is calculated by using the formula:
TS% = 100 * PTS/(2(FGA + (0.44 * FTA)))
Where:
PTS = points scored
FGA = field goal attempts (shots taken)
FTA = free throw attempts
Write a program to calculate the true shooting percentage of a player given the PTS scored, FGA and FTA.
Input
The input consists of three whole numbers in one line separated by spaces: the total PTS, total FGA, and total
FTA.
98 71 43
Output
Use the PTS, FGA, and FTA to calculate the TS%. Print the true shooting percentage, including two decimal
places rounded, and append a '%' sign. [1]
54.49%
Discussion
Round to nearest hundredth. The denominator may contain a 0 but will not result in 0. The result may be more
than 100%.
[1] Rounding should follow the rule of: round up if the last number is 5-9, leave the hundreths place (the 2nd digit)
unchanged if the last number is 0-4.
E.G.
0.465 -> 0.47
0.464 -> 0.46
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
    int PTS = sc.nextInt();
    int FGA = sc.nextInt();
    int FTA = sc.nextInt();
    double percent = 100 * PTS/(2*(FGA+(0.44*FTA)));
    percent = Math.round(percent*100);
    System.out.print(addZero(percent/100,1) + "%");
  }
}
