/*
Bob the Builder is trying very hard to manage his resources.
He wants to make sure that he has absolutely no extra materials lying around
(like Bob-Nails, Bob-Boards and Bob-Posts, ...) unused when he finishes building
his next set of Bob-Bridges. He also has a budget to keep track of, so he must
use the least possible resources.
Bob is headed to the hardware store, so could you find out the exact amount of
material he needs? You will need to make sure that he has zero leftover
materials. He may need to build several Bob-Bridges to exhaust all of his
resources.
Input
You will receive three lines of input.
The first line contains the number (from 1 to 10) of different types of materials
(like Bob-Hammers, Bob-Windows, Bob-Tiles, etc.) needed for one Bob-Bridge.
The second line contains the amount of each of those material needed to create
one Bob-Bridge. The third line lists the count of those same materials Bob
already has (in the same order as the second line).
All material counts will be more than 0 and less than 100000.
3
5 2 1
11 10 1
Output
Your output should display on a single line the amount of each resource Bob needs to purchase. The materials
must be in the same order as they were in the input.
14 0 4
Discussion
Input explanation:
3 <- There will be 3 different materials needed for this type of Bob-Bridge.
5 2 1 <- To create one Bob-Bridge, you need 5 of the first material, 2 of the second,
and 1 of the third.
11 10 1 <- Bob already has 11 of the first material, 10 of the second, and 1 of the third.
A good place to start in solving this problem, is to find the fewest Bob-Bridges to make, just to use up all the
materials Bob already has.
In this example, that would be 5 Bob-Bridges, because Bob already has 10 of the second material and he needs
2 of the second material to finish 1 Bob-Bridge.
To build 5 complete Bob-Bridges, Bob will still need 14 of the first material, and 4 of the third.
Things to remember
You will need to tell Bob to buy enough of all materials so that there is 0 left of all the materials after building the
fewest number of Bob-Bridges.
*/

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nummat = sc.nextInt();
    ArrayList<Integer> matForBridge = new ArrayList<>();
    ArrayList<Integer> matsHave = new ArrayList<>();
    for(int i=0; i<nummat; i++){
      int matnum = sc.nextInt();
      matForBridge.add(matnum);
    }
    for(int i=0; i<nummat; i++){
      int matsHaved = sc.nextInt();
      matsHave.add(matsHaved);
    }
    int highest = 0;
    int highestIndex = 0;
    for(int j =0; j<matsHave.size(); j++){
      int div = matsHave.get(j)/matForBridge.get(j);
      if(div>highest){
        highest = div;
        highestIndex = j;
      }
    }
    ArrayList<Integer> needed = new ArrayList<>();
    if(matsHave.get(highestIndex)%matForBridge.get(highestIndex)==0){
      for(int h=0;h<matsHave.size();h++){
        int max = matForBridge.get(h)*highest;
        needed.add(max-matsHave.get(h));
      }
    }
    else{
      highest++;
      for(int h=0;h<matsHave.size();h++){
        int max = matForBridge.get(h)*highest;
        needed.add(max-matsHave.get(h));
      }
    }
    for (int y=0;y<needed.size(); y++){
      if(y == needed.size()-1){
        System.out.print(needed.get(y));
      }
      else{
        System.out.print(needed.get(y) + " ");
      }
    }
  }
}
