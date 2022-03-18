//What I have so far

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Main {
  public static String format(ArrayList<String> nums){
    String result=" ";
    for(int i=0;i<nums.size();i++){
      if(i==nums.size()-1){
        result = result + "#";
      }
      result= result + "#,";
      
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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
    String test;
    while(!(test = sc.nextLine()).equals("END")){
      //String str = sc.nextLine();
      String array1[]= test.split(":");
      int ycoord = Integer.parseInt(array1[0]);
      String array2[]= array1[1].split(" ");
      //System.out.println(outter.get(ycoord));
      for(int i=0;i<array2.length;i++){
        ArrayList<String> inside = new ArrayList<String>(Arrays.asList(format(outter.get(ycoord))));
        String val = inside.get(Integer.parseInt(array2[i]));
        val = " ";
      }
      test = sc.nextLine();
    }
   System.out.println(outter); 
  }
}
