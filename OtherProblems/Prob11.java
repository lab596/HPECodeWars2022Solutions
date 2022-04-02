// What I hav so far:

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Main {
  static ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
  static ArrayList<Character> punctuation = new ArrayList<>(Arrays.asList(',','!','.','?'));
  public static boolean isVowel(char input){
    return vowels.contains(input);
  }
    public static boolean isPunctuation(char input){
    return punctuation.contains(input);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
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
        boolean punctuationb = false;
        boolean punctuationa = false;
        if(Main.isPunctuation(a.charAt(0))){
          punctuationb = true;
        }
        if(Main.isPunctuation(a.charAt(a.length()-1))){
          punctuationa = true;
        }
        if(Main.isVowel(a.charAt(0))){
          if(punctuationa==true){
            a = a.substring(0,a.length()-1) + "-m" + a.substring(a.length()-1);
          }
          else{
            a = a +"-m";
            words.set(i,a);
          }
        }
        else{
          if(punctuationa==true && punctuationb==true){
            a = a.substring(0,1) + a.substring(1,a.length()-1) + a.charAt(1) + "-squeak" + a.substring(a.length()-1);
          }
          else if(punctuationa==true){
            a = a.substring(0,1) + a.substring(1,a.length()) + a.charAt(1) + "-squeak";
          }
          else if(punctuationb==true){
            a = a.substring(1,a.length()-1) + a.charAt(0) + "-squeak" + a.substring(a.length()-1);
          }
          else{
            a = a.substring(1,a.length()) + a.charAt(0) + "-squeak";
            words.set(i,a);
          }
        }
      }
      wordsp.add(words);
      //System.out.println(words);
    }
    System.out.println(wordsp);
  }
  
}
