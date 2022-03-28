import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String emojis = sc.nextLine();
    String array1[]= emojis.split(" ");
    ArrayList<String> emojies = new ArrayList<>();
    for(String things : array1){
      emojies.add(things);
    }
    if(emojies.get(0).equals(emojies.get(1))){
      for(int i=0;i<emojies.size();i++){
        if(!(emojies.get(0).equals(emojies.get(i)))){
          i++;
          System.out.println("#"+i+" "+emojies.get(i)+" you are out of control!");
        }
      }
    }
    else{
      for(int i=0;i<emojies.size();i++){
        if(!(emojies.get(2).equals(emojies.get(i)))){
          i++;
          System.out.println("#"+i+" "+emojies.get(i)+" you are out of control!");
        }
      }
    }
  }
  
}
