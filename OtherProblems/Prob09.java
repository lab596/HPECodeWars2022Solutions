/*
Oh no, the mustache emojis are out of control! Quick, help the
internet find the rogues before their shenanigans shut down
social media as we know it!
Input
You will receive, on a single line, a series of 3-10 mustache
emojis separated by spaces. Mustache emojis will always
follow the same pattern of EumuE where E are the eyes, and
m is the mouth, always a single character for each.
The eyes may use the following characters: ^, o, 0, O (caret,
lowercase-O, zero, uppercase-O). The mouth will always be a
single underscore ( _ ) character. u == the mustache.It may not
be symmetrical and may have from 1 to 5 characters on either
side of the mouth character. The mustache may use the
following characters: ~, =, - (tilde, equals, hyphen). Mustache
characters will not be mixed in the same emoji.
^~_~^ ^~_~^ ^~_~~^ ^~_~^
Output
Find the emoji who has gone renegade with their mustache grooming, and call them out by number! A rogue
mustache emoji will either have too many, or too few mustache parts, or may be symmetrical when the rest are
asymmetrical (or vice versa). The first emoji on the line is #1.
Output as follows: #NUM EMOJI you are out of control!
Where NUM is the number of the emoji in the list, starting at 1 from the left, and EMOJI is the emoji you found
which doesn't match the others.
#3 ^~_~~^ you are out of control!
Discussion
Reminder: have you run your solution against all of the student data sets?
Additional Examples
Input 1 Output 1
0=_=0 0==_==0 0=_=0 #2 0==_==0 you are out of control!
Input 2 Output 2
o--_--O o--_--O o--_--O o-_-O #4 o-_-O you are out of control!
Input 3
0~_~~0 0~_~~0 0~_~~0 0~_~~0 0~_~~0 0~_~~0 0~~_~~0 0~_~~0 0~_~~0 0~_~~0
Output 3
#7 0~~_~~0 you are out of control!
*/

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String emojis = sc.nextLine();
    String array1[]= emojis.split(" ");
    ArrayList<String> emojies = new ArrayList<>();
    for(String things : array1){
      emojies.add(things);
    }
    if(emojies.get(0).equals(emojies.get(1))){
      for(int i=0;i<emojies.size();i++){
        if(!(emojies.get(0).equals(emojies.get(i)))){
          i++;
          System.out.println("#"+i+" "+emojies.get(i)+" you are out of control!");
        }
      }
    }
    else{
      for(int i=0;i<emojies.size();i++){
        if(!(emojies.get(2).equals(emojies.get(i)))){
          i++;
          System.out.println("#"+i+" "+emojies.get(i)+" you are out of control!");
        }
      }
    }
  }
  
}
