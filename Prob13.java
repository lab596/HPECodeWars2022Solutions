import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Main {
  public static String[] format(ArrayList<String> nums){
    String[] nums2  = new String[nums.size()];
    for(int i=0;i<nums.size();i++){
      if(nums.get(i)==" "){
        nums2[i]=" ";
      }
      else{
        nums2[i] = "#";
      }
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
      String array1[]= test.split(":");
      int ycoord = Integer.parseInt(array1[0]);
      String array2[]= array1[1].strip().split(" ");
      ArrayList<String> inside = new ArrayList<String>(Arrays.asList(format(outter.get(ycoord))));
      for(int i=0;i<array2.length;i++){
        inside.set(Integer.parseInt(array2[i])," ");
      }
      outter.set(ycoord,inside);
    } 
    for(int g=0; g< outter.size();g++){
      System.out.println(outter.get(g));
    }
  }
}
