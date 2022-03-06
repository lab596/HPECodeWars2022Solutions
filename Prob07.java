//Prob07:

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
