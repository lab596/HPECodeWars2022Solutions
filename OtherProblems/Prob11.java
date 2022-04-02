/*
You've heard of Pig Latin, but did you know chipmunks have
their own version of that? They call it Squeak Latin!
Input
You will receive between 3-9 lines of text. Each line will be no
longer than 200 characters. Input stops when you encounter
the word END on a line by itself.
How did you guys?
We're talking chipmunks, Dave.
We can get out of a cat carrier.
Not even hard to do.
END
Output
Change all words beginning with a consonant by moving the
first letter to the end of the word, then add "-squeak" after that.
If a word begins with a consonant and is only two letters long, leave it unchanged. Else if a word begins with a
vowel (aA,eE,iI,oO,uU), simply add "-m" to the word. Do not worry about correcting the CaSe of moved letters
(we're talking about chipunks here, they aren't picky). Preserve all punctuation (punctuation can include: commas
(,) exclamation marks (!) periods (.) and question marks (?)).
owH-squeak idd-squeak ouy-squeak uysg-squeak?
e'reW-squeak alkingt-squeak hipmunksc-squeak, aveD-squeak.
We anc-squeak etg-squeak out-m of-m a-m atc-squeak arrierc-squeak.
otN-squeak even-m ardh-squeak to do.
Additional Examples
Input 1 Output 1
That armors too strong for
blasters.
Rogue Group, use your harpoons
and tow cables.
Go for the legs.
It might be our only chance of
stopping them.
END
hatT-squeak armors-m oot-squeak trongs-squeak orf-squeak
lastersb-squeak.
ogueR-squeak roupG-squeak, use-m oury-squeak arpoonshsqueak and-m owt-squeak ablesc-squeak.
Go orf-squeak het-squeak egsl-squeak.
It-m ightm-squeak be our-m only-m hancec-squeak of-m
toppings-squeak hemt-squeak.
Input 2 Output 2
Before the network, there was
the fleet.
Before diplomacy, there were
soldiers.
Our influence stopped the
rachni, but before that, we
held the line.
Our influence stopped the
krogan, but before that, we
held the line!
Our influence will stop Saren!
in the battle today, we will
hold the line!
END
eforeB-squeak het-squeak etworkn-squeak, heret-squeak
asw-squeak het-squeak leetf-squeak.
eforeB-squeak iplomacyd-squeak, heret-squeak erew-squeak
oldierss-squeak.
Our-m influence-m toppeds-squeak het-squeak achnirsqueak, utb-squeak eforeb-squeak hatt-squeak, we eldhsqueak het-squeak inel-squeak.
Our-m influence-m toppeds-squeak het-squeak roganksqueak, utb-squeak eforeb-squeak hatt-squeak, we eldhsqueak het-squeak inel-squeak!
Our-m influence-m illw-squeak tops-squeak arenS-squeak!
in-m het-squeak attleb-squeak odayt-squeak, we illwsqueak oldh-squeak het-squeak inel-squeak!
*/

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
        boolean punctuationa = false;
        if(Main.isPunctuation(a.charAt(a.length()-1))){
          punctuationa = true;
        }
        if(Main.isVowel(a.charAt(0))){
          if(punctuationa==true){
            a = a.substring(0,a.length()-1) + "-m" + a.substring(a.length()-1);
            words.set(i,a);
          }
          else{
            a = a +"-m";
            words.set(i,a);
          }
        }
        else{
          if(punctuationa==true){
            a = a.substring(1,a.length()-1) + a.charAt(0) + "-squeak" + a.substring(a.length()-1);
            words.set(i,a);
          }
          else{
            a = a.substring(1,a.length()) + a.charAt(0) + "-squeak";
            words.set(i,a);
          }
        }
      }
      wordsp.add(words);

    }
    for(ArrayList<String> a : wordsp){
      for(int i=0;i<a.size()-1;i++){
        System.out.print(a.get(i) + " ");
      }
      System.out.println(a.get(a.size()-1));
    }
  }
}
