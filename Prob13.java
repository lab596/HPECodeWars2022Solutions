/*
You work for a graphic design company and
they want you to prototype new designs they
can print on t-shirts, mugs, etc.
Your prototypes need to use negative space.
That means the design will be printed from
the space that isn't there -- essentially you
are creating a print-negative to be used like a
stamp.
Input
You will receive a datafile with the following elements:
On line one you will receive two positive, non-zero, integers separated by spaces which will give you the
width and height of the design grid.
On the following lines you will receive coordinate pairs in the format of Y: X X Xn where X and Y are all
integers (they may be zero). If the X-adjacent number of X coordinates will be greater than 10, the range
will be given as X1-Xn [see discussion note 1]. Rows which are all solid, will be omitted from your input.
Input is terminated when you read a line with END on it
Example:
50 11
2: 13 14 32 33
3: 13 14 32 33
5: 6 7 8 40 41 42
6: 7 41
7: 8 39
8: 9 37
9: 12-35
END
•
•
•
C o d e W a r s X X V Page 1 of 2
problem
13 Negative Space 7
points
Output
Assemble an output grid using the solid # character in the width and height given in your input on line one. Output
the negative space character at coordinates given in the file. You will have to assemble each (X,Y) coordinate
from the given input. For example 2: 13 14 32 33 maps to coordinates: (13,2) (14,2) (32,2) (33,2). Coordinates for
your output grid should start with (0,0) in the upper left corner [see discussion note 2]. Print the resulting grid
as your output.
##################################################
##################################################
############# ################# ################
############# ################# ################
##################################################
###### ############################### #######
####### ################################# ########
######## ############################## ##########
######### ########################### ############
############ ##############
##################################################
Discussion
[1] If there are many blank spaces in a row, we will signify that with a dash. For instance, 12-35 means that spots
12, 13, 14,...34, and 35 are all supposed to be blank.
[2] The origin (0,0) of the drawing will be the left upper corner. The X axis will go from zero on the far left and
become more and more positive heading to the right. The Y axis will go from zero on the top and become more
and more positive heading down
Reminder: have you run your solution against all of the student data sets?
Additional Examples
Input 1 Output 1
16 7
1: 1 2 5 6 9 10 11 12 13 14
2: 1 2 5 6 11 12
3: 1 2 3 4 5 6 11 12
4: 1 2 5 6 11 12
5: 1 2 5 6 9 10 11 12 13 14
END
################
# ## ## #
# ## #### ###
# #### ###
# ## #### ###
# ## ## #
################
Input 2 Output 2
43 11
0: 21
1: 19 23
2: 17 25
3: 15 27
4: 13 29
5: 11-31
6: 9 13-29 33
7: 7 15-27 35
8: 5 17 18 19 20 21 22 23 24 25 37
9: 3 19 20 21 22 23 39
10: 1 21 41
END
##################### #####################
################### ### ###################
################# ####### #################
############### ########### ###############
############# ############### #############
########### ###########
######### ### ### #########
####### ####### ####### #######
##### ########### ########### #####
### ############### ############### ###
# ################### ################### #
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Main {
  public static String[] format(ArrayList<String> nums){
    String[] nums2  = new String[nums.size()];
    for(int i=0;i<nums.size();i++){
      if(nums.get(i)==" "){
        nums2[i]=" ";
      }
      else{
        nums2[i] = "#";
      }
    }
    return nums2;
  }
  public static String[] dash(String nums){
    String[] split = nums.split("-");
    int length = Integer.parseInt(split[1])-Integer.parseInt(split[0]);
    int start = Integer.parseInt(split[0]);
    int end = Integer.parseInt(split[1]);
    String[] nums2  = new String[length];
    for(int i=0;i<length;i++){
      if(start<end){
        nums2[i]=Integer.toString(start);
        start++;
      }
    }
    return nums2; 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line= sc.nextLine();
    String array0[]=line.split(" ");
    int x = Integer.parseInt(array0[0]);
    int y = Integer.parseInt(array0[1]);
    ArrayList<ArrayList<String> > outter = new ArrayList<ArrayList<String> >();
    for(int i = 0; i<y; i++){
      ArrayList<String> inner = new ArrayList<String>(x);
      for(int j=0; j<x;j++){
        inner.add("#");
      }
      outter.add(inner);
    }
    String test;    
    while(!(test = sc.nextLine()).equals("END")){
      String array1[]= test.split(":");
      int ycoord = Integer.parseInt(array1[0]);
      ArrayList<String> array22 = new ArrayList<String>(); 
      String array2[]= array1[1].strip().split(" ");
      for(int j=0; j<array2.length; j++){
        array22.add(array2[j]);
      }
      for(int h=0;h<array22.size();h++){
        for(int g=0;g<array22.get(h).length()-1;g++){
          if(array22.get(h).substring(g,g+1).equals("-")){
            String array3[] = dash(array22.get(h));
            array22.remove(h);
            for(int l=0;l<array3.length;l++){
              array22.add(array3[l]);
            }
          }
        }
      }
      ArrayList<String> inside = new ArrayList<String>(Arrays.asList(format(outter.get(ycoord))));
      for(int i=0;i<array22.size();i++){
        inside.set(Integer.parseInt(array22.get(i))," ");
      }
      outter.set(ycoord,inside);
    } 
    for(ArrayList<String> a : outter){
      int count = x;
      for(String b : a){
        if(count==1){
          System.out.println(b);
        }
        else{
        System.out.print(b);
          count--;
        }
      }
    }
  }
}
/*
30 10
1: 2 3 8 9 10 13 14 15 20 21 26 27
2: 2 3 6-18 20 21 26 27
3: 2 3 6-18 20 21 26 27
4: 2 3 6-18 20 21 26 27
5: 2 3 7-17 20 21 26 27
6: 2 3 8-16 20 21 22 25 26 27
7: 2 3 9-15 21-27
8: 2 3 10-14 22 23 24 25   
END
*/
