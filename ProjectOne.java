
/**
 * Soccer Management System - Problem Description
 *
 * You need to create and develop a soccer management system using an object-oriented design in Java. 
 * Begin by making a parent class called Person that encapsulates the shared attributes such as name and age. 
 * The class must contain appropriate accessor (getter) and mutator (setter) methods for encapsulation and 
 * an overridden toString() method that accurately represents each Person object.
 *
 * Secondly, create a subclass named Player that inherits from the class Person. 
 * Apart from attributes derived from the Person class, the Player class must specifically include attributes 
 * to represent the position of the player, jersey number, and rating. 
 * The class must include a method named train() that simulates training sessions to gradually increase 
 * the rating of the player. A different method, gamePerformance(), has to accept two integer arguments 
 * (goals and assists) and give back a numerical value representing the player's performance from them.
 *
 * Also, define another subclass named Coach, which also inherits from the Person class. 
 * The Coach class must have some attributes for experience (typically in years) and preferred tactics. 
 * Define a method named matchTactics() that selects appropriate match tactics based on the current scoreline of the game. 
 * Another method, motivateTeam(), must accept an argument for the current state of the team—such as fatigue, losing streak, 
 * or bad attacking or defensive form—and return an appropriate motivational message based on it.
 *
 * Finally, design a separate class called Team that manages a list of Player objects using an ArrayList. 
 * The Team class should be able to add and remove players, print the current team roster, and calculate the overall 
 * rating of the team as a function of the average ratings of all its members.
 */

public class ProjectOne {
    public static void main(String[] args) {
        // Creating Person and Player objects
        Person first = new Person("Steve", 21);
        Person tmp = new Person(); // Object with constructor overload
        System.out.println(first);
        System.out.println(tmp); // Printing person object that used constructor overload
        Player p1 = new Player("Neymar Jr", 30,"Winger", 11, 8.5);
        System.out.println(p1);
        Player p2 = new Player("Ronaldo", 40,"Striker", 7, 8.5);
        Player p3 = new Player("Messi", 38,"Winger", 10, 8.5);
        Player p4 = new Player("Darwin Nunez", 26,"Striker", 9, 6);
        Player p5 = new Player("Saliba", 22,"Defender", 4, 7.5);

        Coach c1 = new Coach("Alex Ferguson", 65, 30, "4-4-2"); // Made coach object

        Team club = new Team(); // Created a team

        // Adding players to the team
        club.addPlayer(p1);
        club.addPlayer(p2);
        club.addPlayer(p3);
        club.addPlayer(p4);
        club.addPlayer(p5);

        System.out.println(club.getPlayers());

        club.displayTeam(); // Displaying team

        System.out.println(club.teamRating()); // Displaying team rating

        p1.train(); // Training players
        p2.train();
        p4.train();

        System.out.println(club.teamRating()); // Displaying team rating after training

        club.displayTeam(); // Team after altering ratings

        System.out.println(p3.gamePerformance(4,2));

        // Some coach methods and getters
        System.out.println(c1.matchTactics(1,2));
        System.out.println(c1.motivateTeam("Tired"));
        System.out.println(c1.getTactics());

        System.out.println(p2.compareTo(p4)); // Comparing two player ratings

        System.out.println(p4.equals(p5)); // Checking if two players are equal



    }
}
