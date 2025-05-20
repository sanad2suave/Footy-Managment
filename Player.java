/**
 * The Player class represents a soccer player with a specific position, jersey number, and performance rating.
 * It extends the Person class to inherit basic personal details (name and age) and implements the Comparable interface
 * to allow players to be compared based on their rating.
 */
public class Player extends Person implements Comparable<Player> {
    // Initialize Private instance variables
    private String position;
    private int jerseyNum;
    private double rating;

    // Constructor
    public Player(String name, int age, String position, int jerseyNum, double rating){
        super(name, age);
        this.position = position;
        this.jerseyNum = jerseyNum;
        this.rating = rating;
    }
    // Accessors and Mutators
    public String getPosition(){
        return position;
    }

    public int getJerseyNum(){
        return jerseyNum;
    }

    public double getRating(){
        return rating;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setJerseyNum(int jerseyNum){
        this.jerseyNum = jerseyNum;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void train(){ // Method for training player and improving rating
        if (rating < 10.0){
            rating +=0.1;
        }
    }

    public double gamePerformance(int goals, int assists){ // Method to show game performance based on goals and assists
        double initial = 6.0;
        if (goals > 0){
            initial += goals*0.7;
        }

        if (assists > 0){
            initial += assists*0.5;
        }

        return initial;
    }

    @Override // Overriding the toString() method
    public String toString(){
        return super.toString() + ", Position: " + position + ", Jersey Number: " + jerseyNum + ", Player rating: " + rating; // Used super since Player is a child class of Person
    }

    @Override
    public int compareTo(Player other) {   
        // Using Double.compare for proper comparison of double values.
        return Double.compare(this.rating, other.rating);
    }

    @Override
    public boolean equals(Object obj) { // Overrding .equals method
        if (this == obj)
            return true;
        if (!(obj instanceof Player))
            return false;
        Player other = (Player) obj;
        return this.getName().equals(other.getName()) &&
               this.getAge() == other.getAge() &&
               this.position.equals(other.position) &&
               this.jerseyNum == other.jerseyNum &&
               Double.compare(this.rating, other.rating) == 0;
    }

}
