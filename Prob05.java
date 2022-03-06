//Prob 05:
/*
You've probably heard the number
propaganda that when rounding a
number one should round up if the
number is 5-9, and round down if the
number is 1-4. That's just what they
want you to believe. In here, we round
using the Queen's rounding rules!
Watch the corners.
Input
You will receive, on one line, a single decimal number containing exactly 2 decimal values. Round the number
using the rules given below.
1234.17
Output
Check the rules' conditions, in order from condition 1 to 4, stop after you have applied one rule.
Condition
1 Rule Condition 2 Rule Condition
3 Rule Condition
4 Rule Else
last digit is 7 add
0.02
last digit is
odd
subtract
0.09 last digit > 7 subtract
4.00 last digit < 4 add
6.78
do
nothing
1234.19
Discussion
Your output must include 2 (and only 2) decimal places, if your code produced 1234.5 as the answer, you need to
supply the trailing zero to make it 1234.50.
Reminder: have you run your solution against all of the student data sets?
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();
    double end = (num * 100)%10;
    if(end == 7){
      num+=0.02;
    }
    else if(end % 2 == 1){
      num-=0.09;
    }
    else if(end>7){
      num-=4.00;
    }
    else if(end<4){
      num+=6.78;
    }
    System.out.print(num);
    }
}
