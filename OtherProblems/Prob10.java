// What I have so far:

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String chars = sc.nextLine();
    ArrayList <String> para = new ArrayList<>();
    for(int i=0;i<chars.length()-1;i++){
      para.add(chars.substring(i,i+1));
    }
    System.out.println(para);
    int left = 0;
    int right = 0;
    int pairs = 0;
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
    System.out.print(left);
    System.out.print(right);
    System.out.print(pairs);
  }
  
}
