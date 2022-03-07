//Prob17:

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //ArrayList<String> finall = new ArrayList<>();
    ArrayList<Integer> inches = new ArrayList<Integer>();
    ArrayList<Integer> prices = new ArrayList<Integer>();
    for(int j = 0; j<3; j++){
      String str = sc.nextLine();
      String array1[]= str.split(" ");
      int feet = Integer.parseInt(array1[1]);
      int inch = Integer.parseInt(array1[2]);
      inch+= feet*12;
      inches.add(inch);
    }
    for(int l = 0; l<2; l++){
      String str1 = sc.nextLine();
      String array2[]= str1.split(" ");
      int price = Integer.parseInt(array2[1]);
      prices.add(price);
    }


    double cu2 = ((inches.get(0) * inches.get(1) * inches.get(2))/(12.0*12.0*12.0))/27.0;
    double R = Math.ceil((cu2 * 0.8)*1000);
    double P = Math.ceil((cu2 * 0.2)*1000);
    System.out.println("R " + R/1000 + " cu yd");
    System.out.println("P " + P/1000 + " cu yd");
    double cost = ((R/1000)*prices.get(0)) + ((P/1000)*prices.get(1));
    cost = Math.ceil(cost*100);
    System.out.println("T " + cost/100 + " dollars");
  }
}
