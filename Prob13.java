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
  public static String[] dash(String nums){
    String[] split = nums.split("-");
    int length = Integer.parseInt(split[1])-Integer.parseInt(split[0]);
    int start = Integer.parseInt(split[0]);
    int end = Integer.parseInt(split[1]);
    String[] nums2  = new String[length];
    for(int i=0;i<length;i++){
      if(start<end){
        nums2[i]=Integer.toString(start);
        start++;
      }
    }
    return nums2; 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line= sc.nextLine();
    String array0[]=line.split(" ");
    int x = Integer.parseInt(array0[0]);
    int y = Integer.parseInt(array0[1]);
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
      ArrayList<String> array22 = new ArrayList<String>(); 
      String array2[]= array1[1].strip().split(" ");
      for(int j=0; j<array2.length; j++){
        array22.add(array2[j]);
      }
      //System.out.print(array22);
      for(int h=0;h<array22.size();h++){
        for(int g=0;g<array22.get(h).length()-1;g++){
          if(array22.get(h).substring(g,g+1).equals("-")){
            String array3[] = dash(array22.get(h));
            array22.remove(h);
            for(int l=0;l<array3.length;l++){
              array22.add(array3[l]);
            }
          }
        }
      }
      ArrayList<String> inside = new ArrayList<String>(Arrays.asList(format(outter.get(ycoord))));
      //System.out.println(inside);
      //System.out.println(array22);
      for(int i=0;i<array22.size();i++){
        inside.set(Integer.parseInt(array22.get(i))," ");
      }
      outter.set(ycoord,inside);
    } 
    for(int g=0; g< outter.size();g++){
      System.out.println(outter.get(g));
    }
  }
}
