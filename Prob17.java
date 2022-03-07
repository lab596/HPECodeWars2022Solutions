//Prob17:
/*
In order to be more sustainable and self sufficient,
you have decided to invest in a raised garden bed.
However, before you can start, you need to figure
out how much this is going to cost. In particular, you
need to calculate how expensive the soil is going to
be.
Your task is to calculate the amount of regular and
premium soil you need, and the total soil cost for the
garden bed size. The input will consist of the width,
height, and depth of your garden bed in feet and
inches.
You will use 80% regular soil and 20% premium soil
(by volume). The price of regular and premium soil
(per cubic yard) is also provided in the input.
There are 12 inches in 1 foot, and there are 27 cubic
feet in 1 cubic yard.
Input
The input has five lines, each prefixed by a letter. The first three lines are the width (W), length (L), and depth (D)
of the bed in feet and inches. The next two lines are the price of the regular (R) and premium (P) soil per cubic
yard. All numbers are integers.
W 8 0
L 4 6
D 0 10
R 12
P 32
Output
The output must include the amount of soil needed for each layer and the total cost for the soil. The first line of
output contains "R " and the amount of regular soil in cubic yards (" cu yd"), and the second line contains "P " and
the amount of premium soil in cubic yards (" cu yd"), both rounded up to 3 decimal places. Finally, the third line
contains "T " and the total price of the soil (" dollars"), rounded up to 2 decimal places [1].
R 0.889 cu yd
P 0.223 cu yd
T 17.81 dollars
Discussion
[1] Pay close attention to rounding up! Rounding must be exact, and will be strictly enforced by the judges. With
the data above, if you don't round up, your answer may be low by one cent.
Additional Examples
Input Output Input Output
W 15 1 R 101.115 cu yd W 15 0 R 100.000 cu yd
L 15 1 P 25.279 cu yd L 15 0 P 25.000 cu yd
D 15 0 T 126.40 dollars D 15 0 T 125.00 dollars
R 1 R 1
P 1 P 1
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //ArrayList<String> finall = new ArrayList<>();
    ArrayList<Integer> inches = new ArrayList<Integer>();
    ArrayList<Integer> prices = new ArrayList<Integer>();
    for(int j = 0; j<3; j++){
      String str = sc.nextLine();
      String array1[]= str.split(" ");
      int feet = Integer.parseInt(array1[1]);
      int inch = Integer.parseInt(array1[2]);
      inch+= feet*12;
      inches.add(inch);
    }
    for(int l = 0; l<2; l++){
      String str1 = sc.nextLine();
      String array2[]= str1.split(" ");
      int price = Integer.parseInt(array2[1]);
      prices.add(price);
    }


    double cu2 = ((inches.get(0) * inches.get(1) * inches.get(2))/(12.0*12.0*12.0))/27.0;
    double R = Math.ceil((cu2 * 0.8)*1000);
    double P = Math.ceil((cu2 * 0.2)*1000);
    System.out.println("R " + R/1000 + " cu yd");
    System.out.println("P " + P/1000 + " cu yd");
    double cost = ((R/1000)*prices.get(0)) + ((P/1000)*prices.get(1));
    cost = Math.ceil(cost*100);
    System.out.println("T " + cost/100 + " dollars");
  }
}
