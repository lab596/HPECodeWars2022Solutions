//What I have so far

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Damn. Thic.");
    int x = sc.nextInt();
    int y = sc.nextInt();
    ArrayList<ArrayList<String> > outter = new ArrayList<ArrayList<String> >();
    for(int i = 0; i<y; i++){
      ArrayList<String> inner = new ArrayList<String>(x);
      for(int j=0; j<x;j++){
        inner.add("#");
      }
      outter.add(inner);
    }
   System.out.println(outter); 
  }
}
