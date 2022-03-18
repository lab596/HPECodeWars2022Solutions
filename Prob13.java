//What I have so far

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Main {
  public static String[] format(ArrayList<String> nums){
    String[] nums2  = new String[nums.size()];
    for(int i=0;i<nums.size();i++){
      nums2[i] = "#";
    }
    return nums2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.nextLine());
    int y = Integer.parseInt(sc.nextLine());
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
      System.out.println("test: " + test);
      //String str = sc.nextLine();
      String array1[]= test.split(":");
      System.out.println(Arrays.toString(array1));
      int ycoord = Integer.parseInt(array1[0].strip());
      String array2[]= array1[1].strip().split(" ");
      //System.out.println(outter.get(ycoord));
      for(int i=0;i<array2.length;i++){
        ArrayList<String> inside = new ArrayList<String>(Arrays.asList(format(outter.get(ycoord))));
      //System.out.println(inside + " - " + i + " = " + Arrays.toString(array2) + Integer.parseInt(array2[i]));
        inside.set(Integer.parseInt(array2[i])," ");
        //System.out.println(inside + " - " + Arrays.toString(array2) + " - " + i);
      }
      test = sc.nextLine();
    }
   //System.out.println(outter); 
  }
}
