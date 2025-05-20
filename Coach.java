/**
 * The Coach class extends Person and represents a soccer coach with specific experience and tactical approaches.
 * It includes methods to determine match tactics based on game scores and to motivate the team based on conditions.
 */
public class Coach extends Person {
    private int experience; // Coach experience in years
    private String tactics; // Coach tactics 

    public Coach(String name, int age, int experience, String tactics) { // Constructor
        super(name, age);
        this.experience = experience;
        this.tactics = tactics;
    }

    // Accessors and Mutators
    public int getExperience(){
        return experience;
    }

    public String getTactics(){
        return tactics;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    public void setTactics(String tactics){
        this.tactics = tactics;
    }

    public String matchTactics(int home, int away){ // Method that sets the tactics based on the score of the game
        if (home == 0 && away == 0){
            return "Normal";
        }
        else if (away > home && away - home == 1){
            return "Attacking formation";
        }

        else if (away > home && away - home == 2){
            return "Ultra Attacking formation";
        }

        else if (home > away && home - away == 1){
            return "Defensive formation";
        }

        else if (home > away && home - away == 2){
            return "Ultra Defensive formation";
        }

        else{
            return "Normal";
        }
    }

    public String motivateTeam(String condition){ // A method for a coach that takes a string as an arguement to motivate team based on circumstances
        switch (condition) { // used switch case for cleaner code
            case "Tired":
                return "Game is almost over push through!";
            case "Losing game at Halftime":
                return "Don't worry we will catch up if we stay strong with our possessions.";
            case "Losing Streak":
                return "We have to work harder in training and remember to stay consistent and work as a team!";
            case "Weak Attacking":
                return "Come on guys we need to work together and finish at the net strong";
            case "Weak Defending":
                return "Keep your pace with the attacker and clear the ball at any given oppurtunity";
            default:
                break;
        }
        return "";
    }


}
