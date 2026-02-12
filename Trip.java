public class Trip{
private static int processFee = 7000;
private String seats;
private int numGames;
private boolean tour;
private double totalCost;



public Trip(){
    this.seats = "Luxury Suite"; 
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
public int getProcessFee(){
    return processFee;
}
public String getSeats(){
    return seats;
}
public int getNumGames(){
    return numGames;
}
public boolean getTour(){
    return tour;
}
public double getTotalCost(){
    return totalCost;
}
 public String toString(){
        return "Seat type:" + seats + " Number of games : " + numGames + " tour of stadium: " + tour + " Total Cost: " + totalCost;
    }    
} 
