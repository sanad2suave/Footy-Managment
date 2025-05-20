/**
 * The Person class represents a normal individual with a name and an age.
 * It provides constructors to initialize these attributes and accessor/mutator methods
 * to retrieve and update them, respectively.
 */
public class Person { 
    private String name; // Private variables
    private int age;

    public Person(){ 
        this.name = "None";
        this.age = 0;
    }

    public Person(String name, int age) { // Constructor Overloading
        this.name = name;
        this.age = age;
        }

    
    // Accessors and Mutators
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override   // Override toString method
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}
