public class Trip{
private static int processFee = 7000;
private String seats;
private int numGames;
private boolean tour;
private double totalCost;

}

public Trip(){
    this.seats = "Luxury Suite"
    this.numGames = 7;
    this.tour = true;
    this.totalCost = processFee * numGames;    
}
public Trip( String s, int ng, boolean t){
    this.seats = s;
    this.numGames = ng;
    this.tour = t;
    this.totalCost = processFee * numGames;
}

