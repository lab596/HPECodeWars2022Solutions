//Prob08:
/*
Suresh creates new playlists as often as he sneezes (he's quite allergic.)
He keeps forgetting how to find the total length of each list.
Can you calculate it?
Input
The first line of input is an integer N, the number of songs in the list.
The next N lines contain the length of each song in MM:SS format (or M:SS if M is less than 10).
The total time will be less than 1 hour.
5
3:05
2:06
9:59
1:01
1:15
Output
Print the total time of the list in MM:SS format. If less than 10 minutes, print M:SS format.
17:26
Additional Examples
Input 1 Output 1 Input 2 Output 2
4 9:06 3 59:59
1:08 4:04
2:59 22:22
3:56 33:33
1:03
*/

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> min = new ArrayList<>();
    ArrayList<String> sec = new ArrayList<>();
    int times = sc.nextInt();
    for(int j=0; j<times+1; j++){
      String str = sc.nextLine();
      String array1[]= str.split(":");
  	  for (int i = 0; i<array1.length; i++){
        if(i%2==0){
          min.add(array1[i]);
        }
        if(i%2==1){
          sec.add(array1[i]);
        }
  	  }
    }
    min.remove(0);
    int minsum=0;
    int secsum=0;
    for(int i=0;i<min.size();i++){
      minsum+=Integer.parseInt(min.get(i));
    }
    for(int i=0;i<sec.size();i++){
      secsum+=Integer.parseInt(sec.get(i));
    }
    while(secsum>60){
      minsum ++;
      secsum-=60;
    }
    if(secsum<10){
      System.out.println(minsum + ":" + "0" +secsum);
    }
    else{
      System.out.println(minsum + ":" + secsum);
    }
  }
}
