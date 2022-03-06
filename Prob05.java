//Prob 05:

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();
    double end = (num * 100)%10;
    if(end == 7){
      num+=0.02;
    }
    else if(end % 2 == 1){
      num-=0.09;
    }
    else if(end>7){
      num-=4.00;
    }
    else if(end<4){
      num+=6.78;
    }
    System.out.print(num);
    }
}
