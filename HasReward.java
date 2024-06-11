import java.util.Scanner;

// This class will check the reward depending in the room the user is in
public class HasReward {

    private char room;
    private int bronzeSword, silverSword, goldenSword, helmet, chestPlate, potion;

    // This will get the Character reference variables from the AbusaifGame class
    private Character player = AbusaifGame.getPlayer();
    Scanner input = new Scanner(System.in);

    // These will determine if the gates have been unlocked for the player to pass
    private boolean lockMainHall1 = true;
    private boolean lockMainHall2 = true;
    private boolean lockMainHall3 = true;
    private boolean lockRoom9 = true;
    private boolean lockNarrowHall1 = true;
    private boolean lockNarrowHall2 = true;

    // This is the amount of potions the player has
    private int amountOfPotions = 0;
    // This is the amount of potions the support has
    private int amountOfSupportPotions = 2;

    // These will determine if the the user has the equipment
    private boolean isBronzeSword = false;
    private boolean isSilverSword = false;
    private boolean isGoldenSword = false;
    private boolean isHelmet = false;
    private boolean isChestPlate = false;

    // This will determine if the support has joined the party
    private boolean isSupport = false;

    // These are the values of strength and defense
    public HasReward() {
        this.bronzeSword = 1;
        this.silverSword = 3;
        this.goldenSword = 4;
        this.helmet = 1;
        this.chestPlate = 2;
        this.potion = 25;
    }

    // This keeps count of how many times the user was in that room
    private int roomE = 0;
    private int room1 = 0;
    private int room2 = 0;
    private int room3 = 0;
    private int room4 = 0;
    private int room5 = 0;
    private int room6 = 0;
    private int room7 = 0;
    private int room8 = 0;
    private int room9 = 0;

    // This changes the number of times the user has been in the room
    public void setRoom(char room) {
        this.room = room;
    }

    public void setRoomE(int roomE) {
        this.roomE = roomE;
    }

    public void setRoom1(int room1) {
        this.room1 = room1;
    }

    public void setRoom2(int room2) {
        this.room2 = room2;
    }

    public void setRoom3(int room3) {
        this.room3 = room3;
    }

    public void setRoom4(int room4) {
        this.room4 = room4;
    }

    public void setRoom5(int room5) {
        this.room5 = room5;
    }
    public void setRoom6(int room6) {
        this.room6 = room6;
    }

    public void setRoom7(int room7) {
        this.room7 = room7;
    }
    public void setRoom8(int room8) {
        this.room8 = room8;
    }

    public void setRoom9(int room9) {
        this.room9 = room9;
    }

    // These return the strength or defense value of the equipment
    public int getBronzeSword() {
        return bronzeSword;
    }

    public int getSilverSword() {
        return silverSword;
    }

    public int getGoldenSword() {
        return goldenSword;
    }

    public int getHelmet() {
        return helmet;
    }

    public int getChestPlate() {
        return chestPlate;
    }

    public int getPotion() {
        return potion;
    }

    // These return if the user has the equipment or not
    public boolean isBronzeSword() {
        return isBronzeSword;
    }

    public boolean isSilverSword() {
        return isSilverSword;
    }

    public boolean isGoldenSword() {
        return isGoldenSword;
    }

    public boolean isHelmet() {
        return isHelmet;
    }

    public boolean isChestPlate() {
        return isChestPlate;
    }

    // This returns if the gate is still locked or unlocked
    public boolean isLockMainHall1() {
        return lockMainHall1;
    }

    public boolean isLockMainHall2() {
        return lockMainHall2;
    }

    public boolean isLockMainHall3() {
        return lockMainHall3;
    }

    public boolean isLockRoom9() {
        return lockRoom9;
    }

    public boolean isLockNarrowHall1() {
        return lockNarrowHall1;
    }

    public boolean isLockNarrowHall2() {
        return lockNarrowHall2;
    }

    // This returns if support is part of the party
    public boolean isSupport() {
        return isSupport;
    }

    // This sets a new value to the amount of potions the player has
    public void setAmountOfPotions(int amountOfPotions) {
        this.amountOfPotions = amountOfPotions;
    }

    // This gets the value of the amount of potions the player has
    public int getAmountOfPotions() {
        return amountOfPotions;
    }

    // This sets a new value to the amount of potions the support has
    public void setAmountOfSupportPotions(int amountOfSupportPotions) {
        this.amountOfSupportPotions = amountOfSupportPotions;
    }

    // This gets the value of the amount of potions the support has
    public int getAmountOfSupportPotions() {
        return amountOfSupportPotions;
    }

    // This checks the reward before a fight or if there is no fight
    public void checkReward() {
        switch (room) {
            case 'E':
                // This is if the user doesn't already have a bronze sword
                if (!isBronzeSword) {
                    System.out.println();
                    String choice;
                    do {
                        System.out.println("Will you take a bronze sword? (Y/N)");
                        System.out.print(player.getName() + "'s choice: ");
                        choice = input.nextLine().toUpperCase();
                        switch (choice) {
                            case "Y":
                                // The user now has a bronze sword
                                this.isBronzeSword = true;
                                System.out.println("\tThe bronze sword is now in your inventory.");
                                break;
                            case "N":
                                System.out.println("\tYou did not take the bronze sword.");
                                break;
                            default:
                                System.out.println("Please rather enter \"Y\", \"y\"," +
                                        " \"N\", or \"n\"");
                                System.out.println();
                        }
                    } while (!(choice.equals("Y")) && !(choice.equals("N")));
                }
                break;
            case '3':
                // This is if the user doesn't already have a silver sword
                if (!isSilverSword) {
                    System.out.println();
                    String choice;
                    do {
                        System.out.println("Will you take the silver sword? (Y/N)");
                        System.out.print(player.getName() + "'s choice: ");
                        choice = input.nextLine().toUpperCase();
                        switch (choice) {
                            case "Y":
                                // The user now has a silver sword
                                this.isSilverSword = true;
                                System.out.println("\tThe silver sword is now in your inventory.");
                                break;
                            case "N":
                                System.out.println("\tYou did not take the silver sword.");
                                break;
                            default:
                                System.out.println("Please rather enter \"Y\", \"y\"," +
                                        " \"N\", or \"n\"");
                                System.out.println();
                        }
                    } while (!(choice.equals("Y")) && !(choice.equals("N")));
                }
                // This is if the user doesn't ge the helmet the first time but comes back to the room
                if (room3 > 0 && !isHelmet) {
                    System.out.println();
                    String choice;
                    System.out.println("The helmet is still on the ground untouched");
                    do {
                        System.out.println("Will you take the helmet? (Y/N)");
                        System.out.print(player.getName() + "'s choice: ");
                        choice = input.nextLine().toUpperCase();
                        switch (choice) {
                            case "Y":
                                // The user now has the helmet
                                this.isHelmet = true;
                                System.out.println("\tThe helmet is now in your inventory.");
                                break;
                            case "N":
                                System.out.println("\tYou did not take the helmet");
                                break;
                            default:
                                System.out.println("Please rather enter \"Y\", \"y\"," +
                                        " \"N\", or \"n\"");
                                System.out.println();
                        }
                    } while (!(choice.equals("Y")) && !(choice.equals("N")));
                }
                break;
            // This room is the treasure room
            case '5':
                if (room5 == 0) {
                    System.out.println();
                    // This is the key to go to room 9
                    lockRoom9 = false;
                    System.out.println("You earned a key to Room 9.");
                    amountOfPotions = amountOfPotions + 3;
                    System.out.println("\tYou now have 3 more potions in your bag.");
                }
                // This is if the user doesn't already have a chest plate
                if (!isChestPlate) {
                    System.out.println();
                    String choice;
                    do {
                        System.out.println("Will you take the chest plate? (Y/N)");
                        System.out.print(player.getName() + "'s choice: ");
                        choice = input.nextLine().toUpperCase();
                        switch (choice) {
                            case "Y":
                                // The user now has a chest plate
                                this.isChestPlate = true;
                                System.out.println("\tThe chest plate is now in your inventory.");
                                break;
                            case "N":
                                System.out.println("\tYou did not take the chest plate.");
                                break;
                            default:
                                System.out.println("Please rather enter \"Y\", \"y\"," +
                                        " \"N\", or \"n\"");
                                System.out.println();
                        }
                    } while (!(choice.equals("Y")) && !(choice.equals("N")));
                }
                break;
            case '6':
                // This is if the user doesn't already have a golden sword
                if (!isGoldenSword) {
                    String choice;
                    System.out.println();
                    do {
                        System.out.println("Will you take the golden sword? (Y/N)");
                        System.out.print(player.getName() + "'s choice: ");
                        choice = input.nextLine().toUpperCase();
                        switch (choice) {
                            case "Y":
                                // The user now has a golden sword
                                this.isGoldenSword = true;
                                System.out.println("\tThe golden sword is now in your inventory.");
                                break;
                            case "N":
                                System.out.println("\tYou did not take the golden sword.");
                                break;
                            default:
                                System.out.println("Please rather enter \"Y\", \"y\"," +
                                        " \"N\", or \"n\"");
                                System.out.println();
                        }
                    } while (!(choice.equals("Y")) && !(choice.equals("N")));
                }
                break;
            // This room is also a treasure room
            case '7':
                if (room7 == 0) {
                    System.out.println();
                    // The user gets the key to go to the hallway from room 4
                    lockNarrowHall2 = false;
                    System.out.println("You earned a key to the narrow hallway form room 4.");
                    amountOfPotions = amountOfPotions + 3;
                    System.out.println("\tYou now have 3 more potions in your bag.");
                }
                break;
            case '9':
                // The user gets support
                isSupport = true;
                System.out.println("You now have support helping you fight.");
        }
    }
    // This is specifically the reward the user get after winning a fight
    public void afterFight(char room) {
        switch (room) {
            case '2':
                System.out.println();
                // The get a key
                lockMainHall1 = false;
                System.out.println("You earned a key to the lower-upper main hallway.");
                // They get a potion
                onePotion();
                break;
            case '3':
                System.out.println();
                // The get a key
                lockMainHall2 = false;
                System.out.println("You earned a key to the upper-lower main hallway.");
                System.out.println("As the armored ghost disappears, the helmet falls to the ground.");
                String choice;
                // This is if the user doesn't have a helmet
                if (!isHelmet) {
                    do {
                        System.out.println("Will you take the helmet? (Y/N)");
                        System.out.print(player.getName() + "'s choice: ");
                        choice = input.nextLine().toUpperCase();
                        switch (choice) {
                            case "Y":
                                // The user now has a helmet
                                this.isHelmet = true;
                                System.out.println("\tThe helmet is now in your inventory.");
                                break;
                            case "N":
                                System.out.println("\tYou did not take the helmet");
                                break;
                            default:
                                System.out.println("Please rather enter \"Y\", \"y\"," +
                                        " \"N\", or \"n\"");
                                System.out.println();
                        }
                    } while (!(choice.equals("Y")) && !(choice.equals("N")));
                    System.out.println("You earned a key to the upper-lower main hallway.");
                    // They get a potion
                    onePotion();
                }
                break;
            case '4':
                System.out.println();
                // The get a key
                lockMainHall3 = false;
                System.out.println("You earned a key to the upper main hallway.");
                // They get a potion
                onePotion();
                break;
            case '1':
            case '6':
            case '8':
                System.out.println();
                // They only get a potion
                onePotion();
                break;
            case '9':
                System.out.println();
                // The get a key
                lockNarrowHall1 = false;
                System.out.println("You earned a key to the narrow hallway from Room 3.");
                System.out.println("You earned 2 potions.");
                // They get two potions
                amountOfPotions = amountOfPotions + 2;
        }
    }

    // This is if the user gets one potion after fighting
    public void onePotion() {
        System.out.println("You earned 1 potion.");
        amountOfPotions++;
    }
}