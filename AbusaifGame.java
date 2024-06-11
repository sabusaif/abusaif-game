/*
 * Milestone 3
 * Description: I will be working on putting the combat loop and exploration
 *              map together and making the alpha of my game using classes
 *              and objects and work on object-oriented thinking.
 * Name: Sarah Abusaif
 * ID: 921103999
 * Class: CSC 211-02
 * Semester: Fall 2020
 */

import java.util.Scanner;

// This will be the driver class
public class AbusaifGame {
    /*
        These are static because they're going to be used in other methods
        so that the values change and don't go back to it's original values
     */
    // This is going to have the player/user's stats
    static Character player = new Character(100, 100, 1,
            2, 0, "Omar");
    // This will declare the object reference variable for the map of the game
    static SwordTempleMap map = new SwordTempleMap(5, 2);
    // This will declare the object reference variable for the reward the user receives
    static HasReward reward = new HasReward();
    // This will declare the object reference variable for the room descriptions
    static RoomDescription location = new RoomDescription(map.getPlayerDungeon(), 5, 2);

    // These are so that I can use the object reference variables in other classes
    public static Character getPlayer() {
        return player;
    }

    public static HasReward getReward() {
        return reward;
    }

    public static RoomDescription getLocation() {
        return location;
    }

    // This is my main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask player for their name
        do {
            System.out.print("Please enter your name (it must be less than " +
                    "21 characters): ");
            // Their input will be assigned to the String variable
            player.setName(input.nextLine());
            // If the name is longer than 20 then it the hologram shown later on will be messy
            if (player.getName().length() > 20) {
                System.out.println("\nYour name must be equal to or less than " +
                        "20 characters.\n");
            } else if (player.getName().length() == 0) {
                player.setName("Omar");
                System.out.println("\t--Since you didn't input anything, your name " +
                        "will be the default name, " + player.getName() + "--\n");
            }
        } while (player.getName().length() > 20);

        // Give them an introduction to the game
        System.out.println("You, " + player.getName() + ", walk into a room that" +
                " barely fits yourself and the 13 other knights-in-training.");
        System.out.println("As you are the last to walk in, the doors close behind you, " +
                "leaving only a dim light from the North to illuminate the area.");
        System.out.println();
        // Will give a description of the starting room
        location.descriptions();

        // This will declare the object reference variable for the direction the user can move in
        Direction move = new Direction(map.getPlayerDungeon(), 5, 2);
        // This will go to an instance method in the Direction class
        move.implementChoice();
    }
}
