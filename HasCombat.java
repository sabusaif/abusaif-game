import java.util.Scanner;

// This class is the combat loop for any fight in the game
public class HasCombat {

    static Scanner input = new Scanner(System.in);

    // This will be the room that the user is in
    private char room;

    private int roundCount;
    private  int totalMonsterHp;

    // This will be to count how many times the user visited the room
    private int room1 = 0;
    private int room2 = 0;
    private int room3 = 0;
    private int room4 = 0;
    private int room6 = 0;
    private int room8 = 0;
    private int room9 = 0;

    // This will update what room the user is in
    public void setRoom(char room) {
        this.room = room;
    }

    /*
        These values will change from the RoomDescription class
        since they have visited these rooms
     */
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

    public void setRoom6(int room6) {
        this.room6 = room6;
    }

    public void setRoom8(int room8) {
        this.room8 = room8;
    }

    public void setRoom9(int room9) {
        this.room9 = room9;
    }

    // This will get the Character and HasReward reference variables from the AbusaifGame class
    private Character player = AbusaifGame.getPlayer();
    private HasReward reward = AbusaifGame.getReward();

    // There will be multiple Character reference variables for the monsters and support
    private Character support = new Character(50, 50, 5,
            6, 0, "Adrian");
    private Character skeleton = new Character(10, 10, 3,
            4, 0, "Skeleton");
    private Character ghost = new Character(20, 20, 5,
            7, 0, "Ghost");
    private Character demon = new Character(60, 60, 11,
            13, 0, "Demon");

    private Character[] monsters;

    public HasCombat() {

    }

    public Character getSupport() {
        return support;
    }

    // This will check which monsters are in which room and then go to the turn-based fighting
    public void checkCombat() {
        switch (room) {
            // Room 1 has one skeleton
            case '1':
                /*
                    This is so that once the user has attacked the
                    monsters they don't need to attack them again
                 */
                if (room1 == 0) {
                    /*
                        I did this so it makes a copy of the skeleton's stats
                        so that if the stats of this skeleton changes it won't
                        affect all of the other skeletons in the game
                     */
                    Character skeleton1 = new Character();
                    skeleton1.setMaxHp(skeleton.getMaxHp());
                    skeleton1.setCurrHp(skeleton.getCurrHp());
                    skeleton1.setMinDmg(skeleton.getMinDmg());
                    skeleton1.setMaxDmg(skeleton.getMaxDmg());
                    skeleton1.setDefense(skeleton.getDefense());
                    skeleton1.setName(skeleton.getName());

                    // This array will be used since the number of monsters varies
                    monsters = new Character[]{skeleton1};

                    // It will show the beginning stats of the user and the skeleton
                    startingStats();
                    /*
                        This is when the use rand the skeleton fight and stop once
                        the user or the skeleton has 0 HP
                     */
                    gameplay();
                    // If the user won they will be told good job and give them a reward
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
                break;
            // Room 2 has two skeletons
            case '2':
                if (room2 == 0) {
                    Character skeleton1 = new Character();
                    skeleton1.setMaxHp(skeleton.getMaxHp());
                    skeleton1.setCurrHp(skeleton.getCurrHp());
                    skeleton1.setMinDmg(skeleton.getMinDmg());
                    skeleton1.setMaxDmg(skeleton.getMaxDmg());
                    skeleton1.setDefense(skeleton.getDefense());
                    skeleton1.setName(skeleton.getName());

                    Character skeleton2 = new Character();
                    skeleton2.setMaxHp(skeleton.getMaxHp());
                    skeleton2.setCurrHp(skeleton.getCurrHp());
                    skeleton2.setMinDmg(skeleton.getMinDmg());
                    skeleton2.setMaxDmg(skeleton.getMaxDmg());
                    skeleton2.setDefense(skeleton.getDefense());
                    skeleton2.setName(skeleton.getName());

                    monsters = new Character[]{skeleton1, skeleton2};

                    startingStats();
                    gameplay();
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
                break;
            // Room 3 has three ghosts
            case '3':
                if (room3 == 0) {
                    Character ghost1 = new Character();
                    ghost1.setMaxHp(ghost.getMaxHp());
                    ghost1.setCurrHp(ghost.getCurrHp());
                    ghost1.setMinDmg(ghost.getMinDmg());
                    ghost1.setMaxDmg(ghost.getMaxDmg());
                    ghost1.setDefense(ghost.getDefense());
                    ghost1.setName(ghost.getName());

                    Character ghost2 = new Character();
                    ghost2.setMaxHp(ghost.getMaxHp());
                    ghost2.setCurrHp(ghost.getCurrHp());
                    ghost2.setMinDmg(ghost.getMinDmg());
                    ghost2.setMaxDmg(ghost.getMaxDmg());
                    ghost2.setDefense(ghost.getDefense());
                    ghost2.setName(ghost.getName());

                    Character ghost3 = new Character();
                    ghost3.setMaxHp(ghost.getMaxHp());
                    ghost3.setCurrHp(ghost.getCurrHp());
                    ghost3.setMinDmg(ghost.getMinDmg());
                    ghost3.setMaxDmg(ghost.getMaxDmg());
                    ghost3.setDefense(ghost.getDefense());
                    ghost3.setName(ghost.getName());

                    monsters = new Character[]{ghost1, ghost2, ghost3};
                    startingStats();
                    gameplay();
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
                break;
            // Room 4 has one skeleton and two ghosts
            case '4':
                if (room4 == 0) {
                    Character skeleton1 = new Character();
                    skeleton1.setMaxHp(skeleton.getMaxHp());
                    skeleton1.setCurrHp(skeleton.getCurrHp());
                    skeleton1.setMinDmg(skeleton.getMinDmg());
                    skeleton1.setMaxDmg(skeleton.getMaxDmg());
                    skeleton1.setDefense(skeleton.getDefense());
                    skeleton1.setName(skeleton.getName());

                    Character ghost1 = new Character();
                    ghost1.setMaxHp(ghost.getMaxHp());
                    ghost1.setCurrHp(ghost.getCurrHp());
                    ghost1.setMinDmg(ghost.getMinDmg());
                    ghost1.setMaxDmg(ghost.getMaxDmg());
                    ghost1.setDefense(ghost.getDefense());
                    ghost1.setName(ghost.getName());

                    Character ghost2 = new Character();
                    ghost2.setMaxHp(ghost.getMaxHp());
                    ghost2.setCurrHp(ghost.getCurrHp());
                    ghost2.setMinDmg(ghost.getMinDmg());
                    ghost2.setMaxDmg(ghost.getMaxDmg());
                    ghost2.setDefense(ghost.getDefense());
                    ghost2.setName(ghost.getName());

                    monsters = new Character[]{skeleton1, ghost1, ghost2};
                    startingStats();
                    gameplay();
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
                break;
            // Room 5 has no monsters
            // Room 6 has three skeletons and two ghosts
            case '6':
                if (room6 == 0) {
                    Character skeleton1 = new Character();
                    skeleton1.setMaxHp(skeleton.getMaxHp());
                    skeleton1.setCurrHp(skeleton.getCurrHp());
                    skeleton1.setMinDmg(skeleton.getMinDmg());
                    skeleton1.setMaxDmg(skeleton.getMaxDmg());
                    skeleton1.setDefense(skeleton.getDefense());
                    skeleton1.setName(skeleton.getName());

                    Character skeleton2 = new Character();
                    skeleton2.setMaxHp(skeleton.getMaxHp());
                    skeleton2.setCurrHp(skeleton.getCurrHp());
                    skeleton2.setMinDmg(skeleton.getMinDmg());
                    skeleton2.setMaxDmg(skeleton.getMaxDmg());
                    skeleton2.setDefense(skeleton.getDefense());
                    skeleton2.setName(skeleton.getName());

                    Character skeleton3 = new Character();
                    skeleton3.setMaxHp(skeleton.getMaxHp());
                    skeleton3.setCurrHp(skeleton.getCurrHp());
                    skeleton3.setMinDmg(skeleton.getMinDmg());
                    skeleton3.setMaxDmg(skeleton.getMaxDmg());
                    skeleton3.setDefense(skeleton.getDefense());
                    skeleton3.setName(skeleton.getName());

                    Character ghost1 = new Character();
                    ghost1.setMaxHp(ghost.getMaxHp());
                    ghost1.setCurrHp(ghost.getCurrHp());
                    ghost1.setMinDmg(ghost.getMinDmg());
                    ghost1.setMaxDmg(ghost.getMaxDmg());
                    ghost1.setDefense(ghost.getDefense());
                    ghost1.setName(ghost.getName());

                    Character ghost2 = new Character();
                    ghost2.setMaxHp(ghost.getMaxHp());
                    ghost2.setCurrHp(ghost.getCurrHp());
                    ghost2.setMinDmg(ghost.getMinDmg());
                    ghost2.setMaxDmg(ghost.getMaxDmg());
                    ghost2.setDefense(ghost.getDefense());
                    ghost2.setName(ghost.getName());

                    monsters = new Character[]{skeleton1, skeleton2,
                            skeleton3, ghost1, ghost2};

                    startingStats();
                    gameplay();
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
                break;
            // Room 7 has no monsters
            // Room 8 has two skeletons, two ghosts, and one demon
            case '8':
                if (room8 == 0) {
                    Character skeleton1 = new Character();
                    skeleton1.setMaxHp(skeleton.getMaxHp());
                    skeleton1.setCurrHp(skeleton.getCurrHp());
                    skeleton1.setMinDmg(skeleton.getMinDmg());
                    skeleton1.setMaxDmg(skeleton.getMaxDmg());
                    skeleton1.setDefense(skeleton.getDefense());
                    skeleton1.setName(skeleton.getName());

                    Character skeleton2 = new Character();
                    skeleton2.setMaxHp(skeleton.getMaxHp());
                    skeleton2.setCurrHp(skeleton.getCurrHp());
                    skeleton2.setMinDmg(skeleton.getMinDmg());
                    skeleton2.setMaxDmg(skeleton.getMaxDmg());
                    skeleton2.setDefense(skeleton.getDefense());
                    skeleton2.setName(skeleton.getName());

                    Character ghost1 = new Character();
                    ghost1.setMaxHp(ghost.getMaxHp());
                    ghost1.setCurrHp(ghost.getCurrHp());
                    ghost1.setMinDmg(ghost.getMinDmg());
                    ghost1.setMaxDmg(ghost.getMaxDmg());
                    ghost1.setDefense(ghost.getDefense());
                    ghost1.setName(ghost.getName());

                    Character ghost2 = new Character();
                    ghost2.setMaxHp(ghost.getMaxHp());
                    ghost2.setCurrHp(ghost.getCurrHp());
                    ghost2.setMinDmg(ghost.getMinDmg());
                    ghost2.setMaxDmg(ghost.getMaxDmg());
                    ghost2.setDefense(ghost.getDefense());
                    ghost2.setName(ghost.getName());

                    Character demon1 = new Character();
                    demon1.setMaxHp(demon.getMaxHp());
                    demon1.setCurrHp(demon.getCurrHp());
                    demon1.setMinDmg(demon.getMinDmg());
                    demon1.setMaxDmg(demon.getMaxDmg());
                    demon1.setDefense(demon.getDefense());
                    demon1.setName(demon.getName());

                    monsters = new Character[]{skeleton1, skeleton2,
                            ghost1, ghost2, demon1};

                    startingStats();
                    gameplay();
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
                break;
            // Room 9 has one demon
            case '9':
                if (room9 == 0) {
                    Character demon1 = new Character();
                    demon1.setMaxHp(demon.getMaxHp());
                    demon1.setCurrHp(demon.getCurrHp());
                    demon1.setMinDmg(demon.getMinDmg());
                    demon1.setMaxDmg(demon.getMaxDmg());
                    demon1.setDefense(demon.getDefense());
                    demon1.setName(demon.getName());

                    monsters = new Character[]{demon1};

                    startingStats();
                    gameplay();
                    if (player.getCurrHp() != 0) {
                        System.out.println();
                        System.out.println("Good job, all of the monsters have been defeated");
                        reward.afterFight(room);
                    }
                }
        }
    }
    // This is where the fighting loop begins with the user and the monsters
    public void gameplay() {
        /*
            This will count the rounds to see when ghosts will
            fight and resets after every fight encounter
         */
        roundCount = 1;
        // The method will add up all of the monster's health
        totalMonsterHp = totalMonsterHealth();
        while (player.getCurrHp() > 0 && totalMonsterHp > 0) {
            // The player will fight first
            playerChoice();
            String choice = input.nextLine().toUpperCase();
            System.out.println();
            // They can only input one character
            if (choice.length() == 1) {
                // This is if the user fights one monsters
                if (monsters.length == 1) {
                    switch (choice) {
                        // This will fight the first and only monsters
                        case "N":
                            if (monsters[0].getCurrHp() > 0) {
                                attackAndDamage(0);
                                break;
                            } else {
                                System.out.println(monsters[0].getName() +
                                        " has already been defeated");
                                /*
                                    This is so that the user can attack again
                                    before the monsters attack
                                 */
                                continue;
                            }
                        // This will check the user's inventory
                        case "C":
                            checkInventory();
                            continue;
                        // This will check the user and the monster's stats
                        case "T":
                            checkStats();
                            continue;
                        // This is if they input anything else, and their turn gets skipped
                        default:
                            mistake();
                    }
                // This is if there are two monsters
                } else if (monsters.length == 2) {
                    switch (choice) {
                        // Attack the first monsters
                        case "T":
                            if (monsters[0].getCurrHp() > 0) {
                                attackAndDamage(0);
                                break;
                            } else {
                                System.out.println(monsters[0].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the second monster
                        case "E":
                            if (monsters[1].getCurrHp() > 0) {
                                attackAndDamage(1);
                                break;
                            } else {
                                System.out.println(monsters[1].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        case "A":
                            checkInventory();
                            continue;
                        case "M":
                            checkStats();
                            continue;
                        default:
                            mistake();
                    }
                // This is if there are three monsters
                } else if (monsters.length == 3) {
                    switch (choice) {
                        // Attack the first monster
                        case "S":
                            if (monsters[0].getCurrHp() > 0) {
                                attackAndDamage(0);
                                break;
                            } else {
                                System.out.println(monsters[0].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the second monster
                        case "Y":
                            if (monsters[1].getCurrHp() > 0) {
                                attackAndDamage(1);
                                break;
                            } else {
                                System.out.println(monsters[1].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the third monster
                        case "O":
                            if (monsters[2].getCurrHp() > 0) {
                                attackAndDamage(2);
                                break;
                            } else {
                                System.out.println(monsters[2].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        case "U":
                            checkInventory();
                            continue;
                        case "F":
                            checkStats();
                            continue;
                        default:
                            mistake();
                    }
                // This is if there are five monsters
                } else {
                    switch (choice) {
                        // Attack the first monster
                        case "K":
                            if (monsters[0].getCurrHp() > 0) {
                                attackAndDamage(0);
                                break;
                            } else {
                                System.out.println(monsters[0].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the second monster
                        case "I":
                            if (monsters[1].getCurrHp() > 0) {
                                attackAndDamage(1);
                                break;
                            } else {
                                System.out.println(monsters[1].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the third monster
                        case "N":
                            if (monsters[2].getCurrHp() > 0) {
                                attackAndDamage(2);
                                break;
                            } else {
                                System.out.println(monsters[2].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the fourth monster
                        case "G":
                            if (monsters[3].getCurrHp() > 0) {
                                attackAndDamage(3);
                                break;
                            } else {
                                System.out.println(monsters[3].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        // Attack the fifth monster
                        case "D":
                            if (monsters[4].getCurrHp() > 0) {
                                attackAndDamage(4);
                                break;
                            } else {
                                System.out.println(monsters[4].getName() +
                                        " has already been defeated");
                                continue;
                            }
                        case "O":
                            checkInventory();
                            continue;
                        case "M":
                            checkStats();
                            continue;
                        default:
                            mistake();
                    }
                }
            // This is if they enter more than one character
            } else {
                mistake();
            }
            // If the support is there they will attack next
            if (reward.isSupport()) {
                supportAttack();
            }
            // Afterward it is the monster's turn to attack
            monstersAttack();
            // Round increases by one
            roundCount++;
        }
    }

    // This is the starting stats, it will show the user's, (support's), and mosnters' stats
    public void startingStats() {
        System.out.println("                 ----");
        System.out.println("These are your and the monsters' stats");
        System.out.println("                 ----");
        /*
            There are three methods, one for the health bar (will be used not just for stats),
            another for the rest of the stats, and one just for the user)
         */
        computeStats(player.getName(), player.getCurrHp(), player.getMaxHp());
        computeStrAndDef(player.getMinDmg(), player.getMaxDmg(), player.getDefense());
        extraPlayerStats();
        System.out.println();
        // This will show the support's stats if they are there
        if (reward.isSupport() && support.getCurrHp() != 0) {
            computeStats(support.getName(), support.getCurrHp(), support.getMaxHp());
            computeStrAndDef(support.getMinDmg(), support.getMaxDmg(), support.getDefense());
            extraSupportStats();
            System.out.println();
        }
        // This will show the stats for each monster in the array
        for (int i = 0; i < monsters.length; i++) {
            computeStats(monsters[i].getName(), monsters[i].getCurrHp(), monsters[i].getMaxHp());
            computeStrAndDef(monsters[i].getMinDmg(), monsters[i].getMaxDmg(), monsters[i].getDefense());
            monsterStats(i);
            System.out.println();
        }
        System.out.println("If you want to check the stats again, you can" +
                " do so when it's your turn to make a choice");
        for (int i = 1; i <= 40; i++) {
            System.out.print(" ");
        }
        System.out.println("----------");
        System.out.println("If you are asked to make a choice, input the " +
                "letter on the left side (can be lowercase or uppercase)");
        for (int i = 1; i <= 40; i++) {
            System.out.print(" ");
        }
        System.out.println("----------");
    }

    // This will display the health bar of the character
    public void computeStats (String name, int currHp, int maxHp) {
        System.out.println(name.toUpperCase() + ":");
        System.out.println("HP: " + currHp + "/" + maxHp);
        System.out.print("[");
        for (int i = 0; i < currHp; i++) {
            System.out.print("|");
        }
        if (currHp < maxHp) {
            for (int j = 0; j < maxHp - currHp; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }

    // This will display the stats, such as what the user has
    public void extraPlayerStats () {
        /*
            By looking into their stats, the player can see that
            a bronze sword is useless against ghosts and demons
        */
        if (reward.isBronzeSword()) {
            System.out.println("Bronze sword: +1 strength, will give 0 damage on ghosts & demons");
        }
        /*
            By looking into their stats, the player can see that
            a silver sword is useless against demons
        */
        if (reward.isSilverSword()) {
            System.out.println("Silver sword: +3 strength, needed to attack ghosts," +
                    " does 0 damage on demons");
        }
        if (reward.isGoldenSword()) {
            System.out.println("Golden sword: +4 strength, needed to attack demons");
        }
        if (reward.isHelmet()) {
            System.out.println("Helmet: +1 defense");
        }
        if (reward.isChestPlate()) {
            System.out.println("Chest plate: +2 defense");
        }
        // I made a switch statement only because if they have one, the word is potion
        // If they have more than one, it will say potions
        if (reward.getAmountOfPotions() > 1) {
            System.out.println(reward.getAmountOfPotions() + " Potions (+25 HP)");
        } else if (reward.getAmountOfPotions() == 1) {
            System.out.println(reward.getAmountOfPotions() + " Potion (+25 HP)");
        }
    }

    // This will show the supports extra stats, which shows how many potions they have
    public void extraSupportStats() {
        if (reward.getAmountOfSupportPotions() > 1) {
            System.out.println(reward.getAmountOfSupportPotions() + " Potions (+25 HP)");
        } else if (reward.getAmountOfPotions() == 1) {
            System.out.println(reward.getAmountOfSupportPotions() + " Potion (+25 HP)");
        }
    }

    // This will display the strength and defense of each character
    public void computeStrAndDef (int strengthMin, int strengthMax, int defense) {
        System.out.println("STRENGTH: " + strengthMin + "-" + strengthMax);
        System.out.println("DEFENSE: " + defense);
    }

    // This will display extra monster stats, which will tell the user when they will attack
    public void monsterStats(int index) {
        System.out.print("ATTACK: ");
        // I determined this by the max health of the monster since that value cannot change
        if (monsters[index].getMaxHp() == 10 || monsters[index].getMaxHp() == 60) {
            System.out.println("Every round");
        } else if (monsters[index].getMaxHp() == 20) {
            System.out.println("Every 2 rounds");
        }
    }

    // This method get the total HP of the monsters to check if it's greater than 0
    public int totalMonsterHealth () {
        int totalHp = 0;
        for (int i = 0; i < monsters.length; i++) {
            totalHp += monsters[i].getCurrHp();
        }
        return totalHp;
    }

    // This is when it is the player's turn to make a move
    public void playerChoice() {
        System.out.println();
        System.out.println("It is your turn, what will you do?");

        // This will change since there are a different number of monsters
        switch (monsters.length) {
            // If there is one monster
            case 1:
                System.out.println("\tN: Attack the " + monsters[0].getName());
                System.out.println("\tC: Check inventory");
                System.out.println("\tT: Check stats");
                break;
            // If there are two monster
            case 2:
                System.out.print("\tT: Attack the ");
                /*
                    I numbered the monsters if there is more than one of the same monster,
                    so that it doesn't confuse the user
                 */
                if (monsters[0].getName().equals(monsters[1].getName())) {
                    monsters[0].setName(monsters[0].getName() + " #1");
                }
                System.out.println(monsters[0].getName());

                System.out.print("\tE: Attack the ");
                if ((monsters[1].getName() + " #1").equals(monsters[0].getName())) {
                    monsters[1].setName(monsters[1].getName() + " #2");
                }
                System.out.println(monsters[1].getName());

                System.out.println("\tA: Check inventory");
                System.out.println("\tM: Check stats");
                break;
            // If there are three monsters
            case 3:
                System.out.print("\tS: Attack the ");
                if (monsters[0].getName().equals(monsters[1].getName())) {
                    monsters[0].setName(monsters[0].getName() + " #1");
                }
                System.out.println(monsters[0].getName());

                System.out.print("\tY: Attack the ");
                if ((monsters[1].getName() + " #1").equals(monsters[0].getName())) {
                    monsters[1].setName(monsters[1].getName() + " #2");
                } else if (monsters[1].getName().equals(monsters[2].getName())) {
                    monsters[1].setName(monsters[1].getName() + " #1");
                }
                System.out.println(monsters[1].getName());

                System.out.print("\tO: Attack the ");
                if ((monsters[2].getName() + " #2").equals(monsters[1].getName())) {
                    monsters[2].setName(monsters[2].getName() + " #3");
                } else if ((monsters[2].getName() + " #1").equals(monsters[1].getName())) {
                    monsters[2].setName(monsters[2].getName() + " #2");
                }
                System.out.println(monsters[2].getName());

                System.out.println("\tU: Check inventory");
                System.out.println("\tF: Check stats");
                break;
            // If there are five monsters
            case 5:
                System.out.print("\tK: Attack the ");
                if (monsters[0].getName().equals(monsters[1].getName())) {
                    monsters[0].setName(monsters[0].getName() + " #1");
                }
                System.out.println(monsters[0].getName());

                System.out.print("\tI: Attack the ");
                if ((monsters[1].getName() + " #1").equals(monsters[0].getName())) {
                    monsters[1].setName(monsters[1].getName() + " #2");
                } else if (monsters[1].getName().equals(monsters[2].getName())) {
                    monsters[1].setName(monsters[1].getName() + " #1");
                }
                System.out.println(monsters[1].getName());

                System.out.print("\tN: Attack the ");
                if ((monsters[2].getName() + " #2").equals(monsters[1].getName())) {
                    monsters[2].setName(monsters[2].getName() + " #3");
                } else if ((monsters[2].getName() + " #1").equals(monsters[1].getName())) {
                    monsters[2].setName(monsters[2].getName() + " #2");
                } else if (monsters[2].getName().equals(monsters[3].getName())) {
                    monsters[2].setName(monsters[2].getName() + " #1");
                }
                System.out.println(monsters[2].getName());

                System.out.print("\tG: Attack the ");
                if ((monsters[3].getName() + " #3").equals(monsters[2].getName())) {
                    monsters[3].setName(monsters[3].getName() + " #4");
                } else if ((monsters[3].getName() + " #2").equals(monsters[2].getName())) {
                    monsters[3].setName(monsters[3].getName() + " #3");
                } else if ((monsters[3].getName() + " #1").equals(monsters[2].getName())) {
                    monsters[3].setName(monsters[3].getName() + " #2");
                } else if (monsters[3].getName().equals(monsters[4].getName())) {
                    monsters[3].setName(monsters[3].getName() + " #1");
                }
                System.out.println(monsters[3].getName());

                System.out.print("\tD: Attack the ");
                if ((monsters[4].getName() + " #4").equals(monsters[3].getName())) {
                    monsters[4].setName(monsters[4].getName() + " #5");
                } else if ((monsters[4].getName() + " #3").equals(monsters[3].getName())) {
                    monsters[4].setName(monsters[4].getName() + " #4");
                } else if ((monsters[4].getName() + " #2").equals(monsters[3].getName())) {
                    monsters[4].setName(monsters[4].getName() + " #3");
                } else if ((monsters[4].getName() + " #1").equals(monsters[3].getName())) {
                    monsters[4].setName(monsters[4].getName() + " #2");
                }
                System.out.println(monsters[4].getName());

                System.out.println("\tO: Check inventory");
                System.out.println("\tM: Check stats");
        }
        System.out.print(player.getName() + "'s choice: ");
    }

    // This instance method will calculate the damage the user does on the monster
    public void attackAndDamage(int index) {
        // This calculates the damage from the Character class
        int damage = player.calculateDmg();
        /*
            If the player is fighting a ghost and doesn't have a silver or
            golden sword or a demon and doesn't have a golden sword, then
            the damage will be zero
         */
        if (monsters[index].getMaxHp() == 20 &&
                player.getMinDmg() == 1 + reward.getSilverSword()) {
            damage = player.calculateDmg();
        } else if (monsters[index].getMaxHp() == 20 &&
                player.getMinDmg() == 1 + reward.getGoldenSword()) {
            damage = player.calculateDmg();
        } else if (monsters[index].getMaxHp() == 60 &&
                player.getMinDmg() == 1 + reward.getGoldenSword()) {
            damage = player.calculateDmg();
        } else if (monsters[index].getMaxHp() == 20 || monsters[index].getMaxHp() == 60) {
            damage = 0;
        }
        // This will calculate the monster's current HP
        monsters[index].setCurrHp(monsters[index].getCurrHp() - damage);
        // This is so HP doesn't become a negative value
        if (monsters[index].getCurrHp() < 0) {
            monsters[index].setCurrHp(0);
        }
        System.out.printf("You attack the " + monsters[index].getName() + " for %d damage\n", damage);
        computeStats(monsters[index].getName(), monsters[index].getCurrHp(),
                monsters[index].getMaxHp());
    }

    // This instance method will show the user what they are holding and what's in their bag
    public void checkInventory() {
        System.out.println("Username: " + player.getName());
        System.out.println("You are currently holding: ");
        /*
            This will determine what the player is holding because, for example,
            if the player's minimum damage is 2, it must mean that they are
            currently holding the bronze sword
        */
        if (player.getMinDmg() == 1 + reward.getBronzeSword()) {
            System.out.println("  - Bronze sword");
        } else if (player.getMinDmg() == 1 + reward.getSilverSword()) {
            System.out.println("  - Silver sword");
        } else if (player.getMinDmg() == 1 + reward.getGoldenSword()) {
            System.out.println("  - Golden sword");
        }
        // This is if the defense is equal to the sum of the helmet and chest plate
        if (player.getDefense() == reward.getHelmet() + reward.getChestPlate()) {
            System.out.println("  - Helmet");
            System.out.println("  - Chest plate");
        // This is if they are only wearing a helmet
        } else if (player.getDefense() == reward.getHelmet()) {
            System.out.println("  - Helmet");
        // This is if they are only wearing a chest plate
        } else if (player.getDefense() == reward.getChestPlate()) {
            System.out.println("  - Chest plate");
        }
        // Now it will display what's in their bag
        System.out.println("You have in your bag: ");
        /*
            There are three if statements for the swords because
            it's possible they have no weapon on them (fighting
            with their fists)
        */
        if (reward.isBronzeSword() && !(player.getMinDmg() == 1 + reward.getBronzeSword())) {
            System.out.println("  - Bronze sword");
        }
        if (reward.isSilverSword() && !(player.getMinDmg() == 1 + reward.getSilverSword())) {
            System.out.println("  - Silver sword");
        }
        if (reward.isGoldenSword() && !(player.getMinDmg() == 1 + reward.getGoldenSword())) {
            System.out.println("  - Golden sword");
        }
        // This is if the player received a helmet but didn't put it on
        if (reward.isHelmet() && !(player.getDefense() == reward.getHelmet()) &&
                !(player.getDefense() == reward.getHelmet() + reward.getChestPlate())) {
            System.out.println("  - Helmet");
        }
        // This is if the player received a chest plate but didn't put it on
        if (reward.isChestPlate() && !(player.getDefense() == reward.getChestPlate()) &&
                !(player.getDefense() == reward.getHelmet() + reward.getChestPlate())) {
            System.out.println("  - Chest plate");
        }
        // If they have no potions it won't show up
        if (reward.getAmountOfPotions() > 0) {
            System.out.println("  - Potion (" + reward.getAmountOfPotions() + ")");
        }

        // This will ask the player if they want to change anything in their inventory
        String choice2;
        do {
            System.out.println();
            System.out.println("Would you like to make any changes? Y/N");
            System.out.print(player.getName() + "'s choice: ");
            choice2 = input.nextLine().toUpperCase();
            // If they do it will go the the changeInventory method
            if (choice2.equals("Y")) {
                changeInventory();
            /*
                If not then it will go back to the playerChoice method and
                the player will make another choice
             */
            } else if (choice2.equals("N")) {
                System.out.println("Inventory completed being checked");
            // This is if they enter anything other letter
            } else {
                mistakeRetry();
                System.out.println("\t(Enter \"Y\" or \"y\"" +
                        " for yes, \"N\" or \"n\" for no)");
            }
        } while (!(choice2.equals("Y")) && !(choice2.equals("N")));
    }

    // This is if the player inputs something invlaid and their turn gets skipped
    public void mistake() {
        System.out.println("You did not follow directions, " +
                "therefore your turn is skipped");
        mistakeExtra();
    }

    // This is if the player inputs something invalid and they try again
    public void mistakeRetry() {
        System.out.println("You entered an invalid value, try again");
        mistakeExtra();
    }

    // This reminds them how to enter
    public void mistakeExtra() {
        System.out.println("\tREMINDER: If you are asked to make a " +
                "choice, input the letter on the left side (can be " +
                "lowercase or uppercase)");
    }

    // This is if the player wants to change something in their inventory
    public void changeInventory() {
        String choice3;
        do {
            System.out.println();
            System.out.println("What will you like to do?");
            System.out.println("\tK: Change swords");
            System.out.println("\tE: Adjust defense");
            System.out.println("\tY: Use a potion");
            System.out.println("\tS: Change username");
            System.out.print(player.getName() + "'s choice: ");
            choice3 = input.nextLine().toUpperCase();
            System.out.println();
            switch (choice3) {
                // This is to change swords
                case "K":
                    changeStrength();
                    break;
                // This is to change defense
                case "E":
                    changeDefense();
                    break;
                // This is to use a potion
                case "Y":
                    usePotion();
                    break;
                // This is if they want to change their name
                case "S":
                    System.out.println("You're current username is: " + player.getName());
                    do {
                        System.out.print("What would you like to change your name to? ");
                        player.setName(input.nextLine());
                        if (player.getName().length() > 20) {
                            System.out.println("\nYour name must be equal to or less than " +
                                    "20 characters.\n");
                        }
                    } while (player.getName().length() > 20);
                    System.out.println("You're username is now: " + player.getName());
                    break;
                // If they make a mistake they will be able to retry
                default:
                    mistakeRetry();
            }
        } while (!(choice3.equals("K")) && !(choice3.equals("E")) &&
                !(choice3.equals("Y")) && !(choice3.equals("S")));
    }

    // This is if the user wants a different sword
    public void changeStrength() {
        String sword;
        do {
            System.out.println("What will you equip to fight with?");
            System.out.println("\tO: No sword (Your fists)");
            // If they have the bronze sword
            if (reward.isBronzeSword()) {
                System.out.println("\tM: Bronze sword");
            }
            // If they have the silver sword
            if (reward.isSilverSword()) {
                System.out.println("\tA: Silver sword");
            }
            // If they have the golden sword
            if (reward.isGoldenSword()) {
                System.out.println("\tR: Golden sword");
            }
            System.out.print(player.getName() + "'s choice: ");
            sword = input.nextLine().toUpperCase();
            switch (sword) {
                // This is if the user wants to fight with their fists
                case "O":
                    player.setMinDmg(1);
                    player.setMaxDmg(2);
                    System.out.println("You didn't equip anything, good luck");
                    break;
                // This is if the user wants to fight with a bronze sword
                case "M":
                    player.setMinDmg(1 + reward.getBronzeSword());
                    player.setMaxDmg(2 + reward.getBronzeSword());
                    System.out.println("You equipped the bronze sword");
                    break;
                // This is if the user wants to fight with a silver sword
                case "A":
                    player.setMinDmg(1 + reward.getSilverSword());
                    player.setMaxDmg(2 + reward.getSilverSword());
                    System.out.println("You equipped the silver sword");
                    break;
                // This is if the user wants to fight with a golden sword
                case "R":
                    player.setMinDmg(1 + reward.getGoldenSword());
                    player.setMaxDmg(2 + reward.getGoldenSword());
                    System.out.println("You equipped the golden sword");
                    break;
                // If they input any other letter they will be told to try again
                default:
                    mistakeRetry();
            }
        } while (!(sword.equals("M")) && !(sword.equals("O")) &&
                !(sword.equals("A")) && !(sword.equals("R")));
        System.out.println("Your strength is now: " + player.getMinDmg() + "-"
                + player.getMaxDmg());
    }

    // This is if the player wants to change their defense
    public void changeDefense() {
        String changeHelmet = null;
        String changeChestPlate = null;
        // This is if the user has a helmet
        if (reward.isHelmet()) {
            // This is if the helmet is in their bag
            if (player.getDefense() == 0 || player.getDefense() == reward.getChestPlate()) {
                do {
                    System.out.println("Do you want a helmet for +" +
                            reward.getHelmet() + " defense? Y/N");
                    System.out.print(player.getName() + "'s choice: ");
                    changeHelmet = input.nextLine().toUpperCase();
                    if (changeHelmet.equals("Y")) {
                        player.setDefense(player.getDefense() + reward.getHelmet());
                        // By wearing the helmet, the monster's strength will decrease by 1
                        for (int i = 0; i < monsters.length; i++) {
                            monsters[i].setMinDmg(monsters[i].getMinDmg() - reward.getHelmet());
                            monsters[i].setMaxDmg(monsters[i].getMaxDmg() - reward.getHelmet());
                        }
                        System.out.println("You put on the helmet");
                    } else if (changeHelmet.equals("N")) {
                        System.out.print("The helmet remains in you bag");
                    } else {
                        mistakeRetry();
                    }
                } while (!(changeHelmet.equals("Y")) && !(changeHelmet.equals("N")));
            // This is if the user is wearing the helmet
            } else if (player.getDefense() == reward.getHelmet() ||
                    player.getDefense() == reward.getHelmet() + reward.getChestPlate()) {
                do {
                    System.out.println("Do you want to take out your helmet? Y/N");
                    System.out.print(player.getName() + "'s choice: ");
                    changeHelmet = input.nextLine().toUpperCase();
                    if (changeHelmet.equals("Y")) {
                        player.setDefense(player.getDefense() - reward.getHelmet());
                        // By taking off the helmet, the monster's strength will increase by 1
                        for (int i = 0; i < monsters.length; i++) {
                            monsters[i].setMinDmg(monsters[i].getMinDmg() + reward.getHelmet());
                            monsters[i].setMaxDmg(monsters[i].getMaxDmg() + reward.getHelmet());
                        }
                        System.out.println("You took off your helmet");
                    } else if (changeHelmet.equals("N")) {
                        System.out.println("You kept on your helmet");
                    } else {
                        mistakeRetry();
                    }
                } while (!(changeHelmet.equals("Y")) && !(changeHelmet.equals("N")));
            }
        }
        // This is if the user has a chest plate
        if (reward.isChestPlate()) {
            // This is if the chest plate is in their bag
            if (player.getDefense() == 0 || player.getDefense() == reward.getHelmet()) {
                do {
                    System.out.println("Do you want a chest plate for +" +
                            reward.getChestPlate() + " defense? Y/N");
                    System.out.print(player.getName() + "'s choice: ");
                    changeChestPlate = input.nextLine().toUpperCase();
                    if (changeChestPlate.equals("Y")) {
                        player.setDefense(player.getDefense() + reward.getChestPlate());
                        // By wearing the chest plate, the monster's strength will decrease by 2
                        for (int i = 0; i < monsters.length; i++) {
                            monsters[i].setMinDmg(monsters[i].getMinDmg() - reward.getChestPlate());
                            monsters[i].setMaxDmg(monsters[i].getMaxDmg() - reward.getChestPlate());
                        }
                        System.out.println("You put on the chest plate");
                    } else if (changeChestPlate.equals("N")) {
                        System.out.print("The chest plate remains in you bag");
                    } else {
                        mistakeRetry();
                    }
                } while (!(changeChestPlate.equals("Y")) && !(changeChestPlate.equals("N")));
            // This is if the user is wearing the chest plate
            } else if (player.getDefense() == reward.getChestPlate() ||
                    player.getDefense() == reward.getHelmet() + reward.getChestPlate()) {
                do {
                    System.out.println("Do you want to take out your chest plate? Y/N");
                    System.out.print(player.getName() + "'s choice: ");
                    changeHelmet = input.nextLine().toUpperCase();
                    if (changeHelmet.equals("Y")) {
                        player.setDefense(player.getDefense() - reward.getChestPlate());
                        // By taking off the chest plate, the monster's strength will decrease by 2
                        for (int i = 0; i < monsters.length; i++) {
                            monsters[i].setMinDmg(monsters[i].getMinDmg() + reward.getChestPlate());
                            monsters[i].setMaxDmg(monsters[i].getMaxDmg() + reward.getChestPlate());
                        }
                        System.out.println("You took off your chest plate");
                    } else if (changeHelmet.equals("N")) {
                        System.out.println("You kept on your chest plate");
                    } else {
                        mistakeRetry();
                    }
                } while (!(changeHelmet.equals("Y")) && !(changeHelmet.equals("N")));
            }
        }
        // This means that the user has both a helmet and a chest plate
        if (changeHelmet != null && changeChestPlate != null) {
            System.out.println();
            if (changeHelmet.equals("N") && changeChestPlate.equals("N")) {
                System.out.println("Your defense remains: " + player.getDefense());
            } else {
                System.out.println("Your defense is now: " + player.getDefense());
            }
        // This is if the user has a helmet but not a chest plate
        } else if (changeHelmet != null) {
            System.out.println();
            if (changeHelmet.equals("Y")) {
                System.out.println("Your defense is now: " + player.getDefense());
            } else {
                System.out.println("Your defense remains: " + player.getDefense());
            }
        // This is if the user has a chest plate but not a helmet
        } else if (changeChestPlate != null) {
            System.out.println();
            if (changeChestPlate.equals("Y")) {
                System.out.println("Your defense is now: " + player.getDefense());
            } else {
                System.out.println("Your defense remains: " + player.getDefense());
            }
        // This is if the user has neither a helmet nor a chest plate
        } else {
            System.out.println("You currently have no armor in your bag, " +
                    "so you cannot change your defense at the moment. " +
                    "Keep exploring, " + player.getName() + "!");
        }
    }

    // This is if the player wants to use a potion
    public void usePotion() {
        // There is a limited amount of potions the player can use
        if (reward.getAmountOfPotions() > 0) {
            System.out.println("Your current HP is: ");
            computeStats(player.getName(), player.getCurrHp(), player.getMaxHp());
            System.out.println("Are you sure you want to use a potion? Y/N");
            System.out.print(player.getName() + "'s choice: ");
            String usePotion = input.nextLine().toUpperCase();
            if (usePotion.equals("Y")) {
                // If the player uses a potion, the amount will decrease by one
                reward.setAmountOfPotions(reward.getAmountOfPotions() - 1);
                player.setCurrHp(player.getCurrHp() + reward.getPotion());
                // This is so that the player's HP doesn't go over 100
                if (player.getCurrHp() > 100) {
                    player.setCurrHp(100);
                }
                System.out.println("You used one potion");
                System.out.println("Your health is now: ");
            } else if (usePotion.equals("N")) {
                System.out.println("You didn't use a potion");
                System.out.println("Your health remains: ");
            }
            // This will show the user's health bar whether or not they used a potion
            computeStats(player.getName(), player.getCurrHp(), player.getMaxHp());
            // This is if the user used a potion and there is one more left
            if (usePotion.equals("Y") && reward.getAmountOfPotions() == 1) {
                System.out.println("You now have " + reward.getAmountOfPotions() +
                        " more potion left");
            // This is if the user used a potion and there is more than 1 left
            } else if (usePotion.equals("Y") && reward.getAmountOfPotions() > 1) {
                System.out.println("You now have " + reward.getAmountOfPotions() +
                        " potions left");
            // This is if the user used a potion and have none left
            } else if (usePotion.equals("Y") && reward.getAmountOfPotions() == 0) {
                System.out.println("You now have " + reward.getAmountOfPotions() +
                        " potions");
            // This is if the user said no
            } else {
                System.out.println("You still have " + reward.getAmountOfPotions() +
                        " potions left");
            }
        // This is if the user has no potions to use
        } else {
            System.out.println("You have no more potions");
        }
    }

    // This is when it's the monsters' turn to attack
    public void monstersAttack() {
        totalMonsterHp = totalMonsterHealth();
        System.out.println();
        System.out.println("Now it's the monsters' turn");
        // This for loop will go through each monster in the array
        // This will update the strength if the user is wearing armor
        for (int i = 0; i < monsters.length; i++) {
            if (roundCount == 1 && (monsters[i].getMaxHp() == 10 && monsters[i].getMinDmg() == 3)
                    || (monsters[i].getMaxHp() == 20 && monsters[i].getMinDmg() == 5)
                    || (monsters[i].getMaxHp() == 60 && monsters[i].getMinDmg() == 11)) {
                monsters[i].setMinDmg(monsters[i].getMinDmg() - player.getDefense());
                monsters[i].setMaxDmg(monsters[i].getMaxDmg() - player.getDefense());
            }
            // They monster cannot fight if they have 0 health
            if (monsters[i].getCurrHp() > 0) {
                // This is determining the type of monster by name
                if (monsters[i].getName().equals(skeleton.getName()) ||
                        monsters[i].getName().contains(skeleton.getName()) ||
                        (monsters[i].getName().contains(ghost.getName())
                            // Ghosts will attack every two rounds
                            && roundCount % 2 == 0) ||
                        (monsters[i].getName().contains(demon.getName()))) {
                    int damage = monsters[i].calculateDmg();
                    // This is if the support is int the combat loop
                    if (reward.isSupport() && support.getCurrHp() > 0) {
                        // It will randomly attack the support or player
                        int whoAttack = 1 + (int)(Math.random() * 2);
                        // This will attack the player
                        if (whoAttack == 1) {
                            System.out.printf(monsters[i].getName() +
                                    " attacks you for %d damage!\n", damage);
                            player.setCurrHp(player.getCurrHp() - damage);
                            if (!(player.getCurrHp() > 0)) {
                                player.setCurrHp(0);
                            }
                            computeStats(player.getName(), player.getCurrHp(), player.getMaxHp());
                        // This will attack the support
                        } else if (whoAttack == 2) {
                            System.out.printf(monsters[i].getName() +
                                    " attacks " + support.getName() +
                                    " for %d damage!\n", damage);
                            support.setCurrHp(support.getCurrHp() - damage);
                            if (!(support.getCurrHp() > 0)) {
                                support.setCurrHp(0);
                            }
                            computeStats(support.getName(), support.getCurrHp(), support.getMaxHp());
                        }
                        /*
                            This is if the support gets attacked and
                            has less than 10 health but is still alive
                         */
                        if (support.getCurrHp() < 10 && support.getCurrHp() !=0) {
                            System.out.println();
                            System.out.println("\t" + support.getName() + " has low health");
                            // If support has a potion they'll use it on themselves
                            if (reward.getAmountOfSupportPotions() > 0) {
                                System.out.println("\tHe uses a potion on himself");
                                support.setCurrHp(support.getCurrHp() + reward.getPotion());
                                reward.setAmountOfSupportPotions(reward.getAmountOfSupportPotions()-1);
                                System.out.println();
                            // If they don't have any more potions they will ask the user for one
                            } else if (reward.getAmountOfPotions() != 0) {
                                System.out.println("\tAdrian: \"Hey " + player.getName() + "! I have "
                                        + "no more potions! Can you lend me one?");
                                System.out.print("Your choice (Y/N): ");
                                String choice = input.nextLine().toUpperCase();
                                switch (choice) {
                                    case "Y":
                                        support.setCurrHp(support.getCurrHp() + reward.getPotion());
                                        reward.setAmountOfPotions(reward.getAmountOfSupportPotions()-1);
                                        System.out.println("\tAdrian: \"Sweet! Thanks " +
                                                player.getName() + ", I owe you one!\"");
                                        break;
                                    case "N":
                                        System.out.println("\tAdrian: \"Aw darn I'll just try " +
                                                "to hang in there then\"");
                                        break;
                                    default:
                                        System.out.println("\tAdrian: \"If you don't want to you " +
                                                "could've just said so\"");
                                }
                            }
                        }
                    // If support isn't there then the monster will only attack the user
                    } else {
                        System.out.printf(monsters[i].getName() +
                                " attacks you for %d damage!\n", damage);
                        player.setCurrHp(player.getCurrHp() - damage);
                        if (!(player.getCurrHp() > 0)) {
                            player.setCurrHp(0);
                        }
                        computeStats(player.getName(), player.getCurrHp(), player.getMaxHp());
                    }
                // This is if the round isn't the round the monster attacks in
                } else if (monsters[i].getMaxHp() == 20 && !(roundCount % 2 == 0)) {
                    System.out.println(monsters[i].getName() + " did not attack");
                }
            // This is if the monster has 0 health
            } else {
                System.out.println(monsters[i].getName() + " is defeated");
            }
        }
    }

    // This is when the support attacks
    public void supportAttack() {
        boolean fight = true;
        totalMonsterHp = totalMonsterHealth();
        int whoAttack;
        // If there are monsters to fight then the support will attack
        if (totalMonsterHp != 0) {
            // The support can only attack if they have health
            if (support.getCurrHp() > 0) {
                System.out.println();
                System.out.println("Your turn is over " + player.getName() + ", now it is "
                        + support.getName() + "'s turn");
                int damage = support.calculateDmg();
                do {
                    // This will attack a random monster
                    whoAttack = (int) (Math.random() * monsters.length);
                    /*
                        If the monster is already out, then the loop
                        will repeat and attack another monster, and it will
                        continue to repeat once ot hits a monster with health
                        (which is why I had to check that there is some value
                        for the monsters' total health, or else it will repeat
                        forever)
                     */
                    if (monsters[whoAttack].getCurrHp() > 0) {
                        System.out.printf(support.getName() + " attacks " + monsters[whoAttack].getName()
                                + " for %d damage!\n", damage);
                        monsters[whoAttack].setCurrHp(monsters[whoAttack].getCurrHp() - damage);
                        if (monsters[whoAttack].getCurrHp() < 0) {
                            monsters[whoAttack].setCurrHp(0);
                        }
                        computeStats(monsters[whoAttack].getName(),
                                monsters[whoAttack].getCurrHp(), monsters[whoAttack].getMaxHp());
                        fight = false;
                    }
                } while (fight);
            } else {
                System.out.println();
                System.out.println(support.getName() + " is currently unconscious and cannot fight");
            }
        }

    }

    // This is if the user wants to check someone's stats
    public void checkStats() {
        String choice4;
        do {
            System.out.println("Who's stats will you like to check?");
            System.out.println("\tR: Your stats");
            // This is if there is support
            if (reward.isSupport()) {
                System.out.println("\tE: " + support.getName() + "'s stats");
            }
            // There will always be at least on monster to fight
            System.out.println("\tB: " + monsters[0].getName() + " stats");
            // This is if there is at least two monsters to fight
            if (monsters.length == 2 || monsters.length == 3 || monsters.length == 5) {
                System.out.println("\tU: " + monsters[1].getName() + " stats");
                // This is if there is at least three monsters to fight
                if (monsters.length == 3 || monsters.length == 5) {
                    System.out.println("\tI: " + monsters[2].getName() + " stats");
                    // This is if there are five monsters to fight
                    if (monsters.length == 5) {
                        System.out.println("\tL: " + monsters[3].getName() + " stats");
                        System.out.println("\tD: " + monsters[3].getName() + " stats");
                    }
                }
            }
            System.out.print(player.getName() + "'s choice: ");
            choice4 = input.nextLine().toUpperCase();
            System.out.println();
            switch (choice4) {
                // This is to check the user's stats
                case "R":
                    /*
                        I made two methods because somewhere else in the code
                        I want to only show the health bar and not the strength
                     */
                    computeStats(player.getName(), player.getCurrHp(), player.getMaxHp());
                    computeStrAndDef(player.getMinDmg(), player.getMaxDmg(), player.getDefense());
                    // I made this method since that monsters don't have this
                    extraPlayerStats();
                    break;
                // This is to check the support's stats
                case "E":
                    computeStats(support.getName(), support.getCurrHp(), support.getMaxHp());
                    computeStrAndDef(support.getMinDmg(), support.getMaxDmg(), support.getDefense());
                    extraSupportStats();
                    break;
                // This is to check the first monster's stats
                case "B":
                    computeStats(monsters[0].getName(), monsters[0].getCurrHp(),
                            monsters[0].getMaxHp());
                    computeStrAndDef(monsters[0].getMinDmg(), monsters[0].getMaxDmg(),
                            monsters[0].getDefense());
                    monsterStats(0);
                    break;
                // This is to check the second monster's stats
                case "U":
                    // This is to check if the user typed "u" or "U" but there is only one monster
                    if (monsters.length != 1) {
                        computeStats(monsters[1].getName(), monsters[1].getCurrHp(),
                                monsters[1].getMaxHp());
                        computeStrAndDef(monsters[1].getMinDmg(), monsters[1].getMaxDmg(),
                                monsters[1].getDefense());
                        monsterStats(1);
                    } else {
                        mistakeRetry();
                        continue;
                    }
                    break;
                // This is to check the third monster's stats
                case "I":
                    if (monsters.length != 1 && monsters.length != 2) {
                        computeStats(monsters[2].getName(), monsters[2].getCurrHp(),
                                monsters[2].getMaxHp());
                        computeStrAndDef(monsters[2].getMinDmg(), monsters[2].getMaxDmg(),
                                monsters[2].getDefense());
                        monsterStats(2);
                    } else {
                        mistakeRetry();
                        continue;
                    }
                    break;
                // This is to check the fourth monster's stats
                case "L":
                    if (monsters.length == 5) {
                        computeStats(monsters[3].getName(), monsters[3].getCurrHp(),
                                monsters[3].getMaxHp());
                        computeStrAndDef(monsters[3].getMinDmg(), monsters[3].getMaxDmg(),
                                monsters[3].getDefense());
                        monsterStats(3);
                    } else {
                        mistakeRetry();
                        continue;
                    }
                    break;
                // This is to check the fifth monster's stats
                case "D":
                    if (monsters.length == 5) {
                        computeStats(monsters[4].getName(), monsters[4].getCurrHp(),
                                monsters[4].getMaxHp());
                        computeStrAndDef(monsters[4].getMinDmg(), monsters[4].getMaxDmg(),
                                monsters[4].getDefense());
                        monsterStats(4);
                    } else {
                        mistakeRetry();
                        continue;
                    }
                    break;
                // This is if the user inputted something invalid
                default:
                    mistakeRetry();
            }
        } while (!(choice4.equals("R")) && !(choice4.equals("E")) && !(choice4.equals("B"))
                && !(choice4.equals("U")) && !(choice4.equals("I")) && !(choice4.equals("L"))
                && !(choice4.equals("D")));
    }
}