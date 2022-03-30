// What I have so far:

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static int highestIndex(int a, ArrayList<Integer> list){
    for(int i=0;i<list.size();i++){
      if(list.get(i)>a){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String chars = sc.nextLine();
    ArrayList <String> para = new ArrayList<>();
    for(int i=0;i<chars.length();i++){
      para.add(chars.substring(i,i+1));
    }
    System.out.println(para);
    int left = 0;
    int right = 0;
    int pairs = 0;
    for(int i=0;i<para.size();i++){
      if(para.get(i).equals("(")){
        left++;
      }
      else{
        right++;
      }
    }
    ArrayList<Integer> index = new ArrayList<>();
    for(int j=0;j<para.size();j++){
      if(para.get(j).equals(")")){
        index.add(j);
      }
    }
    for(int i=0;i<para.size();i++){
      if(para.get(i).equals("(") && highestIndex(i,index)>i){
        int a = highestIndex(i,index);
        para.remove(a);
        para.remove(i);
        System.out.print(para);
        pairs++;
      }
    }



    /*
    boolean temp = false;
    for(int i=0;i<para.size();i++){
      if (temp == true){
        i--;
        temp = false;
      }
      if(para.get(i).equals("(")){
        left++;
        for(int l=i+1;l<para.size();l++){
          if(para.get(l).equals(")")){
            System.out.println(l);
            right++;
            para.remove(i);
            System.out.println(i);
            para.remove(l);
            pairs++;
            System.out.println(para);
            //System.out.println(i);
            if(i==0){
              temp =true;
            }
            else{
              i--;
            }
            l=0;
          }
        }
      }
    }
    */
    
    System.out.println(left);
    System.out.println(right);
    System.out.println(pairs);
  }
  
}
