/**
 * The Team class represents a soccer team comprised of multiple Player objects.
 * It manages the team roster using an ArrayList and provides methods to add,
 * remove, display players, and calculate the team's overall rating.
 */
import java.util.ArrayList; // Imported ArrayList from java library
public class Team {
    private ArrayList<Player> players; // Created an arraylist of player objects

    public Team(){ // Constructor
        players = new ArrayList<>();
    }

    // Methods for adding and removing players from team
    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public ArrayList<Player> getPlayers(){ // Returns the ArrayList of Players in team
        return players;
    }
    
    public void displayTeam(){ // Method that displays roster in an organized manner
        System.out.println("Displaying team roster:");
        for (Player player: players){
            System.out.println(player);
        }
    }

    public double teamRating(){ // Method that calculates overall team rating
        int count = 0;
        double tmp;
        double result = 0;
        for (Player player: players){
            count += 1;
            tmp = player.getRating();
            result += tmp;
        }
        result = result / count;
        return result;
    }
}
