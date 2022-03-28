/*
The criminal mastermind, The Duck, is at it again. In his
ongoing efforts to stop what he (and Daffy) consider
insufficient respect to him and his fine-feathered friends,
he has sabotaged the machines at the world's largest
rubber duckie factory to corrupt the factory computer's
counts. (Ernie will be sad.)
Input
You will receive a list of integers (no integer will be larger
than what an int-32 can hold), one per line. The minimum
count of integers you might receive is four ( 4 ). When you
see zero ( 0 ) on a line by itself, input has terminated. (Do
not include the zero in the data set).
1
3
5
23
8
7
15
0
Output
Figure out if there is an odd number in an otherwise list of all even numbers, or vice versa. If a problem is found,
print the number found along with what the problem is (odd in an even list, or even in an odd list.) If the list
contains only odd or event numbers, output: NO LIST PROBLEMS FOUND.
8 is not odd
Discussion
You will not receive a list with more than one odd number in an otherwise even list, or vice versa. E.G.
you do not have to code handlers for situations where you find 3 odd numbers in an otherwise even list, or 2
evens in an otherwise odd list, etc.
Reminder: have you run your solution against all of the student data sets?
Additional Examples
Input 1 Output 1 Input 2 Output 2
2
4
6
22
18
90
102
85
0
85 is not even 3
9
17
101
33
1005
0
NO LIST PROBLEMS FOUND
*/

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> test = new ArrayList<>();
    String check;    
    while(!(check = sc.nextLine()).equals("0")){
      test.add(check);
    }
    int even =0;
    int odd = 0;
    for(int i=0; i<test.size();i++){
      if(Integer.parseInt(test.get(i)) % 2 == 0){
        odd++;
      }
      if(Integer.parseInt(test.get(i)) % 2 == 1){
        even++;
      }
    }
    if(odd == 0 || even==0){
      System.out.println("NO LIST PROBLEMS FOUND");
    }
    else if(odd>1){
      for(int h=0;h<test.size();h++){
        if(Integer.parseInt(test.get(h))%2==1){
          System.out.println(test.get(h) +" is not even");
        }
      }
    }
    else if(even>1){
      for(int h=0;h<test.size();h++){
        if(Integer.parseInt(test.get(h))%2==0){
          System.out.println(test.get(h) +" is not odd");
        }
      }
    }
  }
  
}
