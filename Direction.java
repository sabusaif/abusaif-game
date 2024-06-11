import java.util.Scanner;

// This class is where the player chooses a direction to move to
public class Direction {
    private char room;
    private int row, col;

    // This will get the Character and RoomDescription reference variables from the AbusaifGame class
    // There will also be a SwordTempleMap reference variable declared
    private Character player = AbusaifGame.getPlayer();
    private RoomDescription location = AbusaifGame.getLocation();
    private SwordTempleMap map = new SwordTempleMap(row, col);

    // This will get the location of where the user is
    public Direction(char room, int row, int col) {
        this.room = room;
        this.row = row;
        this.col = col;
    }

    public void implementChoice() {
        // This do-while loop
        do {
            String choice = playerDirection();
            System.out.println();
            switch (choice) {
                // This is if the player wants to go North
                case "N":
                    // This is if the player moved through a trap door or tunnel
                    if (row == 3 && col == 0) {
                        row = 2;
                        col = 4;
                        validDirection();
                    // This is if the user tries to go North in room 9
                    } else if (this.room == '9') {
                        System.out.println("To the North is the corner of " +
                                "the room.");
                    // This will check if the user will go out of bounds if they go North
                    } else if (row > 0) {
                        if (map.getDungeon()[row - 1][col] != ' ' &&
                                map.getDungeon()[row - 1][col] != '3' &&
                                map.getDungeon()[row - 1][col] != '4' &&
                                map.getDungeon()[row - 1][col] != '6' &&
                                map.getDungeon()[row - 1][col] != '8') {
                            // By decreasing the row by one, the user will go up by one
                            row--;
                            // This is if there is a gate in the way
                            if (row == 3 && col == 2 && location.isLockMainHall1() ||
                                row == 2 && col == 2 && location.isLockMainHall2() ||
                                row == 1 && col == 2 && location.isLockMainHall3() ||
                                row == 1 && col == 1 && location.isLockNarrowHall2() ||
                                room == '9' && location.isLockRoom9()) {
                                row++;
                                System.out.println("The gate is currently locked, " +
                                        "try to find the key to pass.");
                            } else {
                                validDirection();
                            }
                        /*
                            If the condition above weren't met, then they
                            will be told that they hit a wall
                         */
                        } else {
                            System.out.println("To your North is a wall, you " +
                                    "cannot move through it.");
                        }
                    } else {
                        System.out.println("To your North is a wall, you " +
                                "cannot move through it.");
                    }
                    break;
                // If the player wants to go South
                case "S":
                    // this will check if they want to move through a trap door first
                    if (row == 2 && col == 4) {
                        row = 3;
                        col = 0;
                        validDirection();
                    // This is if the user tries to go South in room 4
                    } else if (this.room == '4') {
                        System.out.println("To the South is broken burnt bones from" +
                                " the skeleton that played with the torch.");
                    // This will check if the user will go out of bounds if they go South
                    } else if (row < map.getDungeon().length - 1) {
                        if (map.getDungeon()[row + 1][col] != ' ' &&
                                map.getDungeon()[row + 1][col] != '1' &&
                                map.getDungeon()[row + 1][col] != '3' &&
                                map.getDungeon()[row + 1][col] != '5' &&
                                map.getDungeon()[row + 1][col] != 'e') {
                            // By increasing the row by one, the user will go down by one
                            row++;
                            validDirection();
                        /*
                            If the condition above weren't met, then they
                            will be told that they hit a wall
                         */
                        } else {
                            System.out.println("To your South is a wall, you " +
                                    "cannot move through it.");
                        }
                    } else {
                        System.out.println("To your South is a wall, you " +
                                "cannot move through it.");
                    }
                    break;
                case "W":
                    // This is if the player moved through a trap door or tunnel
                    if (row == 0 && col == 4) {
                        col = 0;
                        validDirection();
                    /*
                        This is to stop the user to go from one specific
                        hallway to another, since they are not connected in my map
                     */
                    } else if (row == 1 && col == 2) {
                        System.out.println("To your West is a wall, you " +
                                "cannot move through it.");
                        // This will check if the user will go out of bounds if they go West
                    } else if (col > 0) {
                        if (map.getDungeon()[row][col - 1] != ' ' &&
                                map.getDungeon()[row][col - 1] != '5' &&
                                map.getDungeon()[row][col - 1] != '6') {
                            // By decreasing the column by one, the user will go to the left by one
                            col--;
                            // This is if the gate is locked
                            if (row == 3 && col == 0 && location.isLockNarrowHall1()) {
                                col++;
                                System.out.println("The gate is currently locked, " +
                                        "try to find the key to pass");
                            } else {
                                validDirection();
                            }
                        /*
                            If the condition above weren't met, then they
                            will be told that they hit a wall
                         */
                        } else {
                            System.out.println("To your West is a wall, you " +
                                    "cannot move through it.");
                        }
                    } else {
                        System.out.println("To your West is a wall, you " +
                                "cannot move through it.");
                    }
                    break;
                case "E":
                    // This is if the player moved through a trap door or tunnel
                    if (row == 0 && col == 0) {
                        col = 4;
                        validDirection();
                    /*
                        This is if the player tries to go East in room 9
                        the first time they go in the room
                     */
                    } else if (this.room == '9' && location.getRoom9() == 1) {
                        System.out.println("To the East is the injured boy.");
                    /*
                        This is if the player tries to go East in room 9 if it's
                        at least they second time they visited the room
                     */
                    } else if (this.room == '9') {
                        System.out.println("To the East is a bloodstain wall," +
                                " you cannot move through it.");
                    /*
                        This is to stop the user to go from one specific
                        hallway to another, since they are not connected in my map
                     */
                    } else if (row == 1 && col == 1) {
                        System.out.println("To your East is a wall, you " +
                                "cannot move through it.");
                        // This will check if the user will go out of bounds if they go East
                    } else if (col < map.getDungeon()[row].length - 1) {
                        if (map.getDungeon()[row][col + 1] != ' ' &&
                                map.getDungeon()[row][col] != '8' &&
                                map.getDungeon()[row][col + 1] != '7') {
                            // By increasing the column by one, the user will go to the right by one
                            col++;
                            validDirection();
                        /*
                            If the condition above weren't met, then they
                            will be told that they hit a wall
                         */
                        } else {
                            System.out.println("To your East is a wall, you " +
                                    "cannot move through it.");
                        }
                    } else {
                        System.out.println("To your East is a wall, you " +
                                "cannot move through it.");
                    }
                    break;
                // This is if the user need assistance on how to move in the game
                case "H":
                    System.out.println("\tIf you want to go North, type 'N' or 'n'");
                    System.out.println("\tIf you want to go South, type 'S' or 's'");
                    System.out.println("\tIf you want to go West, type 'W' or 'w'");
                    System.out.println("\tIf you want to go East, type 'E' or 'e'");
                    System.out.println("\tIf you want to look at the map, type 'M' or 'm'");
                    System.out.println("\t\tBy looking under map, you can see what " +
                            "choices you can make based off where you are.");
                    System.out.println("\t\tFor example, if you see +X|, then that " +
                            "means you can go West, North, or South.");
                    System.out.println("\t\tTo exit the map and end your exploration," +
                            " you must find the room labeled 'e', which stands for Exit.");
                    break;
                // This is if the user wants to see the map
                case "M":
                    // It will go to the printMap method and show the map in the display console
                    map.displayDungeon(row, col);
                    break;
                default:
                    // This is if the player didn't input anything and just hit enter
                    if (choice.length() == 0) {
                        System.out.println("No response? Are you too scared, "
                                + player.getName() + "?");
                    // This is if the user entered a word instead of one letter
                    } else if (choice.length() != 1) {
                        System.out.println("Please only enter one character, "
                                + player.getName() + ".");
                    // This is if they inputted any other character
                    } else {
                        System.out.println("Please enter a valid option, "
                                + player.getName() + ".");
                    }
            }
        // This do-while loop will continue until the user has entered the Exit room
        } while (this.room != 'e' && player.getCurrHp() != 0);
        // This is if the user lost
        if (player.getCurrHp() == 0) {
            System.out.println();
            System.out.println("You have been defeated, " + player.getName() + ", " +
                    "everything around you becomes blurry as you go unconscious");
            // This is if support is there and didn't lose either
            if (location.isSupport() && location.supportHealth() != 0) {
                System.out.println("Before passing out, you hear Adrian's voice," +
                        " but can't fully understand what he's trying to say.");
                System.out.println("\tAdrian: \"Hey " + player.getName() + "!" +
                        "...don't close yo...on't worry I'll ke...ou saf...");
            }
            System.out.println();
            System.out.println(" --= -- GA/\\/\\E ()\\/ER =- -=- -");
        }
    }

    public String playerDirection() {
        /*
            This will ask the player where they want to move,
            with the option to also look at map or ask for help
         */
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Which way would you like to go? (to give a direction," +
                " type the first letter of a cardinal point)\n\t--If you would like" +
                " to see the map, type 'M' or 'm'\n\t--If you need any help, " +
                "type 'H' or 'h'");
        System.out.print("\n" + player.getName() + "'s choice: ");
        return input.nextLine().toUpperCase();
    }

    /*
        This method is if the user moved in the correct
        direction, change the location in the map and
        will go to that new room
     */
    public void validDirection() {
        map.setRowPlayer(row);
        map.setColPlayer(col);
        location.setRow(row);
        location.setCol(col);
        this.room = map.getPlayerDungeon();
        location.setRoom(room);
        location.descriptions();
    }
}
