//Prob 04:

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
