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
