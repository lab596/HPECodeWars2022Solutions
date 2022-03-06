//Prob07:
/*
Every contestant is allowed one punt, pass, and
kick in this thrilling competition. Scoring is based on
both distance and accuracy. The score is also
determined from where a contestant's ball first
makes contact with the ground, therefore bounces
or rolls are not part of the distance. If a contestant
passes their ball 121 feet, but it went wide of the
measuring tape by 30 feet, their final score for
passing is 91 feet; the score is the difference
between the two measures.
The distances of the balls are measured and
rounded to the nearest foot. A person can not score
less than 0. There are 5 contestants and no ball can
go farther than 300 feet or be off the mark by more
than 300 feet. A participant's final score is the total
of the three events (Punt, Pass, and Kick). For
example, a participant scores 30 feet for punting, 50
feet for passing and 22 feet for kicking, the
participant's final score is 102 feet
Write a program that displays the results of the competition given the distance and accuracy of each category and also
the contestant's name.
All input and output will be in whole feet. The range of numbers for distance and accuracy is 0 to 300.
Input
The input consists of 3 pairs of numbers and a name. For the pairs of numbers, one pair is for punting, another for
passing, and last for kicking. The first number in each pair is the distance and the second number is how far off the
mark the ball was.
Use the contestants' names and scores to compute a list of results.
40 20 61 17 52 13 Justin
30 40 60 50 100 10 Aaron
70 10 53 13 42 19 Lamar
60 20 53 10 70 20 Patrick
40 5 60 0 9 13 Tom
Output
Print an ordered list of results with the name in the first column and total distance in the second column.
Patrick 133
Lamar 123
Justin 103
Aaron 100
Tom 95
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> finall = new ArrayList<>();
    ArrayList<Integer> sums = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
    for(int j = 0; j<5; j++){
      ArrayList<Integer> list = new ArrayList<>();
      int i = 6;
      while(i>0){
        int num = sc.nextInt();
        list.add(num);
        i--;
      }
      String name = sc.nextLine();
      int punt = list.get(0) - list.get(1);
      int kik = list.get(2) - list.get(3);
      int pass = list.get(4) - list.get(5);
      if(punt<0){
        punt = 0;
      }
      if(kik<0){
        kik = 0;
      }
      if(pass<0){
        pass = 0;
      }
      int sum = punt + kik + pass;
      for(int l = 0; l<5; l++){
        if(sums.get(l)<sum){
          sums.add(l,sum);
          break;
        }
      }
      for(int f=0; f<5; f++){
        if(sums.get(f)==sum){
          finall.add(f,name + " " + sum);
          break;
        }
      }
    }
    for(int g = 0; g<finall.size(); g++){
      String a = finall.get(g);
      System.out.println(a);
    }
  }
}
