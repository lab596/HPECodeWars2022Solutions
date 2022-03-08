//Prob01:
/*
Please welcome the players, by name,
as they take the court for the last game
of the NBA finals.
Input
You will receive one name on a single line. It will not contain spaces or punctuation (even if the proper spelling of
the name would include them).
TroyBrown
Output
Print to the screen the following sentence, as a prompt for the announcer to read as the player takes the court.
The only part of the sentence which should change is the name!
Clap your hands together and give it up for TroyBrown!
Discussion
Reminder: have you run your solution against all of the student data sets?
Additional Examples
Input 1 Output 1
JavonteGreen Clap your hands together and give it up for JavonteGreen!
Input 2 Output 2
GarrettTemple Clap your hands together and give it up for GarrettTemple!
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Clap your hands together and give it up for "+ name +"!");
  }
}
