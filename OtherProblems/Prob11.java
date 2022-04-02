// What I hav so far:

import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String test;
    ArrayList <ArrayList<String>> wordsp = new ArrayList<ArrayList<String>>();
    while(!(test = sc.nextLine()).equals("END")){
      ArrayList <String> words = new ArrayList<>();
      String[] words1 = test.split(" ");
      for(String w : words1){
        words.add(w);
      }
      for(int i=0; i< words.size();i++){
        String a = words.get(i);
        if(!(a.substring(0,1).equals("a"))){
          a = a.substring(1,a.length()) + a.charAt(0) + "-squeak";
        }
      }
      wordsp.add(words);
      //System.out.println(words);
    }
    System.out.println(wordsp);
  }
  
}
