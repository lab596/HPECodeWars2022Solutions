//Prob 04:
/*
You are part of a first-contact team with the Systems Alliance working
with the newly encountered Quarian species, aliens from another planet.
Your team is trying to help develop translations for the Quarian language
but every time calculation made with the numbers they give your team
don't match the expected results.
Your chief scientist suggests that because the Quarians only have 3
fingers on each hand, the numbers they are giving the team may be in
ternary instead of decimal -- after running some back-of-the-envelope
calculations you confirm that when the numbers given by the Quarians
are converted into base-10 (decimal) assuming base-3 (ternary) as the
source -- the numbers match expectations!
Now your team needs an automated process to convert ternary numbers
into decimal numbers so that work can continue on the translation
device.
Input
You will receive a list of ternary numbers, one number per line. The last
line will be signaled with a zero on a line alone. You will not be given zero
(as a ternary number) to be translated into decimal. The largest ternary
number you will be expected to handle will be 1212210202001. Example:
10
112
1000
1110
1212210202001
0
Output
Output the value of the ternary numbers, one per line (ignoring the 0 line).
3
14
27
39
1000000
Discussion
Reminder: have you run your solution against all of the student data sets? Hint: some of the values you may get as
input may be larger than what an int-32 variable can hold.
*/

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stop;
    ArrayList<String> list = new ArrayList<>();
    while((stop = sc.nextInt())!=0){
      int num = stop;
      String fin = base_convert (""+num, 3, 10);
      list.add(fin);
    }
    for(int i = 0; i<list.size(); i++){
      String a = list.get(i);
      System.out.println(a);
    }
  }
  public static String base_convert(String num, int source, int destination){
      return Integer.toString(Integer.parseInt(num, source), destination);
   }
}
