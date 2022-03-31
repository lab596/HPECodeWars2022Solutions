/*
Check whether or not a given set of parenthesis match up
evenly. E.G. for every Left-open parenthesis "(" there must
be a Right-close ")" parenthesis.
Input
You will receive a single line (which may wrap on your
screen) of sets of parenthesis.
(()))()((())
Output
Determine if the nested parenthesis are balanced or not.
That means for every opening/left parenthesis "(", there
should be an equal and opposite closing/right parenthesis
")".
Print the total number of left and right parenthesis on their
own lines, the total number of paired parenthesis on its
own line, and finally a determination of either Unbalanced
or Balanced.
The sets of parenthesis should only be labeled balanced if
the left and right parenthesis match up evenly (even if the
counts are equal). E.G. if you couldn't put code inside the
parenthesis and get your compiler to run it, then they are
Unbalanced
Total left: 6
Total right: 6
Total pairs: 5
Unbalanced
Discussion
In the example above, the counts match, but both the left and the right side of the parenthesis groups have an
extra parenthesis which doesn't match with a partner. They are at character positions 4 and 7 (zero indexed). You
don't need to find the position of any trouble parenthesis, we are just calling it out so you understand the nature
of the problem. Reminder: have you run your solution against all of the student data sets?
Additional Examples
Input 1 Output 1 Input 2 Output 2
))))()(((( Total left: 5
Total right: 5
Total pairs: 1
Unbalanced
((()(((((((())((((((()))))((()())))))))))))) Total left: 22
Total right: 22
Total pairs: 22
Balanced
*/

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static int highestIndex(int a, ArrayList<String> list){
    for(int i=a;i<list.size();i++){
      if(list.get(i).equals(")")){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String chars = sc.nextLine();
    ArrayList <String> para = new ArrayList<>();
    for(int i=0;i<chars.length();i++){
      para.add(chars.substring(i,i+1));
    }
    int left = 0;
    int right = 0;
    int pairs = 0;
    for(int i=0;i<para.size();i++){
      if(para.get(i).equals("(")){
        left++;
      }
      else{
        right++;
      }
    }
    ArrayList<Integer> index = new ArrayList<>();
    for(int j=0;j<para.size();j++){
      if(para.get(j).equals(")")){
        index.add(j);
      }
    }   
    for(int i=0;i<para.size();i++){
      if(para.get(i).equals("(") && highestIndex(i,para)>i){
        int a = highestIndex(i,para);
        para.remove(a);
        para.remove(i);
        pairs++;
        i--;
      }
    }
    System.out.println("Total left: "+ left);
    System.out.println("Total right: "+ right);
    System.out.println("Total pairs: "+ pairs);
    if(pairs == right && pairs == left){
      System.out.println("Balanced");
    }
    else{
      System.out.println("Unbalanced");
    }
  }  
}
