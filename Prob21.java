/*
You've been tasked with writing the logic that helps calculate which two
soccer teams in a group of four will advance further in a world cup
tournament.
Each of the four teams in a group will play every other team in the group
once, resulting in a total of six games. For every game a team plays, the
results of the game are recorded -- win, lose, or tie. In addition, for every
game, the number of goals that team scored against their opponent
("goals for") are recorded along with the number of goals that the
opponent scored against the team ("goals conceded" or "goals against").
This data is used to calculate points for each team and the two teams
with the most points will advance to the next round.
POINTS are awarded to teams as follows,
3 points for a win
1 point for a tie
0 points for a loss
If two teams are tied on POINTS as calculated above, the tie breaker will
be the GOAL DIFFERENCE as calculated for each team. The GOAL
DIFFERENCE is calculated as,
GOAL DIFFERENCE = (All of the team's "goals for" added up) - (All of the team's "goals against" added
up).
Input
The input will consist of 2 sections. The first section will contain the 4 team identifiers, 1 per line, 3 characters
each. The next section will contain the 6 matches and their scores. Each match will consist of the first team
identifier, a space, the score (separated by a colon), another space and then the second team identifier.
GER
GHA
AUS
SER
SER 0:1 GHA
GER 4:0 AUS
GER 0:1 SER
GHA 1:1 AUS
GHA 0:1 GER
AUS 2:1 SER
Let's evaluate the games for team GHA to see how they are counted and what the standing is after each game.
The standing is the POINTS and GOAL DIFFERENCE for the team.
The 1st game is SER vs GHA with a score of 0:1
which counts as: +3 POINTS (a win), +1 GOALS FOR, and +0 GOALS AGAINST
creating a game standing of: 3 1
The 2nd game is GHA vs AUS with a score of 1:1
which counts as: +1 POINTS (a tie), +1 GOALS FOR, and +1 GOALS AGAINST
creating a game standing of: 1 0
The 3rd game is GHA vs GER 0:1
which counts as: +0 POINTS (a loss), +0 GOALS FOR, and +1 GOALS AGAINST
creating a game standing of: 0 -1
The final standing for team GHA is the sum of all their game standings: 4 0
•
•
•
•
•
◦
◦
•
◦
◦
•
◦
◦
•
C o d e W a r s X X V Page 1 of 2
problem
21 Round of 16 12
points
Output
The output will be the final ranking of the four teams in the group, in descending order, starting with the top team
based on POINTS, and using GOAL DIFFERENCE as a tie-breaker.
For each team print the team identifier, the number of POINTS and the GOAL DIFFERENCE (which can be
negative!).
GER 6 4
GHA 4 0
AUS 4 -3
SER 3 -1
Discussion
The datasets will never result in a tie in both POINTS and GOAL DIFFERENCE.
Reminder: have you run your solution against all of the student data sets?
Additional Examples
Input 1 Output 1 Input 2 Output 2
GER
GHA
POR
USA
GER 4:0 POR
GHA 1:2 USA
GER 2:2 GHA
USA 2:2 POR
USA 0:1 GER
POR 2:1 GHA
GER 7 5
USA 4 0
POR 4 -3
GHA 1 -2
USA
SWE
CHI
THI
CHI 0:2 SWE
USA 13:0 THI
SWE 5:1 THI
USA 3:0 CHI
SWE 0:2 USA
THI 0:2 CHI
USA 9 18
SWE 6 4
CHI 3 -3
THI 0 -19
*/

import java.util.Scanner;
import java.util.ArrayList;


class Team{
    public int pointCount;
    public int goalCount;
    public String name;
    public Team(int pointCount, int goalCount, String name){
      this.pointCount = pointCount;
      this.goalCount = goalCount;
      this.name = name;
    }
}

class Main {

  public static Team[] bubbleSort(Team[] teams) {
    boolean sorted = false;
    Team temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < teams.length - 1; i++) {
            if (teams[i].pointCount > teams[i+1].pointCount || (teams[i].pointCount == teams[i+1].pointCount && teams[i].goalCount > teams[i+1].goalCount)) {
                temp = teams[i];
                teams[i] = teams[i+1];
                teams[i+1] = temp;
                sorted = false;
            }
        }
    }
    return teams;
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
    ArrayList<Integer> team1g = new ArrayList<>();
    ArrayList<Integer> team2g = new ArrayList<>();
    ArrayList<Integer> team3g = new ArrayList<>();
    ArrayList<Integer> team4g = new ArrayList<>();
    for(int j = 0; j<6; j++){
      String str = sc.nextLine();
      String array1[]= str.split(" ");
      String array2[] = array1[1].split(":");
      String first = array1[0];
      String second = array1[2];
      int firstscore = Integer.parseInt(array2[0]);
      int secondscore = Integer.parseInt(array2[1]);
      int difference1 = firstscore - secondscore;
      int difference2 = secondscore - firstscore;
      if(first.equals(team1)){
         team1g.add(difference1);
       }
        if(first.equals(team2)){
         team2g.add(difference1);
       }
        if(first.equals(team3)){
         team3g.add(difference1);
       }
        if(first.equals(team4)){
         team4g.add(difference1);
       }
      if(second.equals(team1)){
         team1g.add(difference2);
       }
        if(second.equals(team2)){
         team2g.add(difference2);
       }
        if(second.equals(team3)){
         team3g.add(difference2);
       }
        if(second.equals(team4)){
         team4g.add(difference2);
       }
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
    int team1totp = 0;
    for(int i =0; i<team1p.size();i++){
      team1totp+=team1p.get(i);
    }
    int team2totp = 0;
    for(int i =0; i<team2p.size();i++){
      team2totp+=team2p.get(i);
    }
    int team3totp = 0;
    for(int i =0; i<team3p.size();i++){
      team3totp+=team3p.get(i);
    }
    int team4totp = 0;
    for(int i =0; i<team4p.size();i++){
      team4totp+=team4p.get(i);
    }
    int team1totg = 0;
    for(int i =0; i<team1g.size();i++){
      team1totg+=team1g.get(i);
    }
    int team2totg = 0;
    for(int i =0; i<team2g.size();i++){
      team2totg+=team2g.get(i);
    }
    int team3totg = 0;
    for(int i =0; i<team3g.size();i++){
      team3totg+=team3g.get(i);
    }
    int team4totg = 0;
    for(int i =0; i<team4g.size();i++){
      team4totg+=team4g.get(i);
    }

    Team[] taems = bubbleSort(new Team[]{
      new Team(team1totp, team1totg, team1),
      new Team(team2totp, team2totg, team2),
      new Team(team3totp, team3totg, team3),
      new Team(team4totp, team4totg, team4),
    });

    for (int i = taems.length-1; i>=0;i--){
      System.out.println( taems[i].name + " " + taems[i].pointCount+ " "+ taems[i].goalCount);
    }
    
  }
  

}
