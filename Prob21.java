import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.*;
class Main {

  public static String addZero(double num,int zeros){
      String num1 = "" +  num ;
      if (num-(int)num == 0 ){
        for(int i = 0; i<zeros; i++){
          num1+= "0";
        }
        return num1;
      }
      else{
        return num1;
      }
    }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String team1 = sc.nextLine();
    String team2 = sc.nextLine();
    String team3 = sc.nextLine();
    String team4 = sc.nextLine();
    ArrayList<Integer> team1p = new ArrayList<>();
    ArrayList<Integer> team2p = new ArrayList<>();
    ArrayList<Integer> team3p = new ArrayList<>();
    ArrayList<Integer> team4p = new ArrayList<>();
    for(int j = 0; j<6; j++){
      String str = sc.nextLine();
      String array1[]= str.split(" ");
      String array2[] = array1[1].split(":");
      String first = array1[0];
      String second = array1[2];
      int firstscore = Integer.parseInt(array2[0]);
      int secondscore = Integer.parseInt(array2[1]);
      if(firstscore > secondscore){
       if(first.equals(team1)){
         team1p.add(3);
       }
        if(first.equals(team2)){
         team2p.add(3);
       }
        if(first.equals(team3)){
         team3p.add(3);
       }
        if(first.equals(team4)){
         team4p.add(3);
       }
      }
      if(secondscore > firstscore){
       if(second.equals(team1)){
         team1p.add(3);
       }
        if(second.equals(team2)){
         team2p.add(3);
       }
        if(second.equals(team3)){
         team3p.add(3);
       }
        if(second.equals(team4)){
         team4p.add(3);
       }
      }
      if(secondscore == firstscore){
       if(first.equals(team1) || second.equals(team1)){
         team1p.add(1);
       }
       if(first.equals(team2) || second.equals(team2)){
         team2p.add(1);
       }
       if(first.equals(team3) || second.equals(team3)){
         team3p.add(1);
       }
       if(first.equals(team4) || second.equals(team4)){
         team4p.add(1);
       }
      }
    }
    System.out.println(team1p);
    System.out.println(team2p);
    System.out.println(team3p);
    System.out.println(team4p);
  }
}
      

