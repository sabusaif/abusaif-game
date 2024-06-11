// This class will give a description of the room the user is in
public class RoomDescription {
    private char room;
    private int row, col;

    // This will get the Character and HasReward reference variables from the AbusaifGame class
    private Character player = AbusaifGame.getPlayer();
    private HasReward reward = AbusaifGame.getReward();

    // These will determine if the gates have been unlocked for the player to pass
    private boolean lockMainHall1 = true;
    private boolean lockMainHall2 = true;
    private boolean lockMainHall3 = true;
    private boolean lockRoom9 = true;
    private boolean lockNarrowHall1 = true;
    private boolean lockNarrowHall2 = true;

    // This will get the location of where the user is
    public RoomDescription(char room, int row, int col) {
        this.room = room;
        this.row = row;
        this.col = col;
    }

    // There will also be a HasCombat reference variable declared
    private HasCombat combat = new HasCombat();

    // This returns if support is part of the party
    public boolean isSupport() {
        return reward.isSupport();
    }

    // This returns the support's name
    public String supportName() {
        return combat.getSupport().getName();
    }

    // This returns the support's current health
    public int supportHealth() {
        return combat.getSupport().getCurrHp();
    }

    // This returns if the gate is still locked or unlocked
    public boolean isLockMainHall1() {
        return reward.isLockMainHall1();
    }

    public boolean isLockMainHall2() {
        return reward.isLockMainHall2();
    }

    public boolean isLockMainHall3() {
        return reward.isLockMainHall3();
    }

    public boolean isLockRoom9() {
        return reward.isLockRoom9();
    }

    public boolean isLockNarrowHall1() {
        return reward.isLockNarrowHall1();
    }

    public boolean isLockNarrowHall2() {
        return reward.isLockNarrowHall2();
    }

    // These return the current location the user is in
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRoom(char room) {
        this.room = room;
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

    // This is used in the description for room 9 in the Direction class
    public int getRoom9() {
        return room9;
    }

    public void descriptions() {
        switch (room) {
            // this is if the user is in the Entrance room
            case 'E':
                System.out.println("\tIn the entrance room, a hologram pops up " +
                        "in front of you, which states,");
                // I tried to print out a hologram
                System.out.print("\t\t------------------------------------------------");
                for (int i = 0; i < 3 * player.getName().length(); i++) {
                    System.out.print("-");
                }
                System.out.print("\n\t\t|                                              ");
                for (int i = 0; i < 3 * player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("|\n\t\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("   \"Welcome to the Sword Temple, " + player.getName() + ", where\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("\n\t\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("   your sword skills will be tested to see if\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("\n\t\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("   you are worthy to protect the kingdom.\"");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("\n\t\t|                                              ");
                for (int i = 0; i < 3 * player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.println("|");
                System.out.print("\t\t------------------------------------------------");
                for (int i = 0; i < 3 * player.getName().length(); i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.println("\tYou see in the Northwest corner, there " +
                        "is a basket full of bronze swords.");
                // This will set the room the user is in for the HasReward class
                reward.setRoom(room);
                // This goes through the instance method in the HasReward class
                reward.checkReward();
                // This will be said at the beginning of the game
                if (roomE == 0) {
                    System.out.print("\tIf you are ready to begin, ");
                    // This will be said if the player returns to the entrance room
                }
                if (roomE > 0) {
                    System.out.print("\tIf you are ready to continue, ");
                }
                System.out.println("you can move forward.");
                roomE++;
                reward.setRoomE(roomE);
                break;
            // This is if they are in room 1
            case '1':
                if (room1 == 0) {
                    System.out.println("\tIn this large room, you find one skeleton that " +
                            "is ready to attack.\n\tYou can also see a shelf at the " +
                            "other side of the room, which holds a healing " +
                            "potion, but the skeleton is currently in the way.");
                } else {
                    System.out.println("\tIn this large room, you find bones on the " +
                            "ground and an empty shelf on the other side of the room.");
                }
                System.out.println("\tThe room has no other entries, only the way " +
                        "that you came in from the lower part of the main hallway" +
                        "(the East).");
                // This sets the room in the HasCombat class
                combat.setRoom(room);
                // This goes through the instance method in the HasCombat class
                combat.checkCombat();
                // This increases the room 1 count by one
                room1++;
                // This sets the room1 count in the HasCombat class
                combat.setRoom1(room1);
                // This setts the room1 count in the HasReward class
                reward.setRoom1(room1);
                break;
            // This is if they are in room 2
            case '2':
                if (room2 == 0) {
                    System.out.println("\tAs you enter a large room, you catch" +
                            " two skeletons playing with a key as if it's a toy.");
                    System.out.println("\tYou notice that the key has a similar " +
                            "pattern as the lock for the gate in the lower " +
                            "part of the main hallway.");
                } else {
                    System.out.println("\tAs you enter back into the large room, " +
                            "there are bones scattered on the ground and cracks " +
                            "as you take a step further in.");
                }
                System.out.println("\tThe only way to leave Room " + room + " is" +
                        " by going back from where you came from (the West).");
                combat.setRoom(room);
                combat.checkCombat();
                room2++;
                combat.setRoom2(room2);
                reward.setRoom2(room2);
                break;
            // This is if they are in room 3
            case '3':
                if (room3 == 0) {
                    System.out.println("\tWhen walking into Room " + room + ", right " +
                            "away your feel a wave of cold air, and the room is filled with" +
                            " so much fog it makes it difficult to see.\n\tIn front of you," +
                            " you manage to see three ghosts, emitting the fog, hovering " +
                            "around.");
                    System.out.println("\tOne ghost has a key hanging around his neck," +
                            " where the chain is made out of silver and you assume will unlock the " +
                            "gate in the middle of the main hallway.\n\tThere is another" +
                            " ghost who is trying to wear a helmet but fails to do so as " +
                            "the equipment only goes through it");
                } else {
                    System.out.println("\tWhen walking back to Room 3, you notice how you can " +
                            "see so much more clearly now without the fog from the ghosts. " +
                            "The room is also a little warmer now.");
                }
                if (!reward.isSilverSword()) {
                    System.out.println("\tWhen you take a step, your hear an echo " +
                            "of metal ringing, and when you look down you see a " +
                            "silver sword on the floor.");
                }
                System.out.print("\tThere is a narrow hallway West of you " +
                        "and by going East will take you back to " +
                        "the main hallway.");
                combat.setRoom(room);
                reward.setRoom(room);
                reward.checkReward();
                combat.checkCombat();
                room3++;
                combat.setRoom3(room3);
                reward.setRoom3(room3);
                break;
            case '4':
                if (room4 == 0) {
                    System.out.println("\tRoom " + room + " also has a thick, cold fog, " +
                            "but it's not as bad as it was in Room 3.\n\tAs you squint and " +
                            "walker further into the room, you see one skeleton and" +
                            " one ghost, however,\n\tyou can feel a cold gust of wind " +
                            "nearby you. When you turn around you see another " +
                            "ghost coming in twirling a key from\n\tits finger. " +
                            "As the skeleton is looking at a fire torch on" +
                            " the South, the first ghost is on\n\tthe North guarding" +
                            " a narrow hallway. By going East, you will be taken back to " +
                            "the main hallway.");
                } else {
                    System.out.println("\tWalking into Room 4 once more, the fog and " +
                            "cold are gone and there are bones scattered on the floor. " +
                            "The narrow hallway is now no longer guarded,\n\tbut still needs" +
                            " a key in order to get through. By going East, you will be" +
                            " taken back to the main hallway.");
                }
                combat.setRoom(room);
                combat.checkCombat();
                room4++;
                combat.setRoom4(room4);
                reward.setRoom4(room4);
                break;
            // This is if they are in room 5
            case '5':
                if (room5 == 0) {
                    System.out.println("\tThe first thing in Room " + room + " that " +
                            "catches your attention upon walking into the room is" +
                            " a treasure chest, glowing with a golden color.");
                    System.out.println("\tYou eagerly, hurriedly walk towards the" +
                            " chest and opens it right away. Light from inside the " +
                            "chest spreads throughout the room.");
                    System.out.println("\tOpening the chest reveals 3 healing potions " +
                            "and a chest plate that can be used to improve defense.");
                } else if (room5 > 0 && !(reward.isChestPlate())) {
                    System.out.println("\tWhen walking back to room 5, you look at the open" +
                            " treasure test, where you see the chest plate sticking out.");
                } else if (room > 0 && reward.isChestPlate()) {
                    System.out.println("\tWhen walking back to room 5, you look at the" +
                            " empty treasure chest with no more golden color erupting from it.");
                }
                System.out.println("\tThere is no new entry, you can only leave " +
                        "the room by going from where you came, which is to your West.");
                reward.setRoom(room);
                reward.checkReward();
                room5++;
                reward.setRoom5(room5);
                break;
            // This is if they are in room 6
            case '6':
                if (room6 == 0) {
                    System.out.println("\tYou enter a room that is deeper into the temple," +
                            " and realize that the more you venture through the temple," +
                            "\n\tthe more dangerous the challenges become, as you witness two ghosts" +
                            " messing around with a skeleton by hiding its bones. ");
                    System.out.println("\tThat is not all, because there are also two other " +
                            "skeletons on the other side, preoccupied with a pebble.");
                } else {
                    System.out.println("\tWalking about into the room there are no ghosts" +
                            " or skeletons to be found playing around.");
                }
                if (!reward.isGoldenSword()) {
                    System.out.println("\tThe room has a small passage, which leads to a dead" +
                            " end. However, there is a sword that glistens with a " +
                            "golden aura.\n\tEven before picking up the sword, you " +
                            "knew it was much stronger than others you encountered so far.");
                }
                System.out.println("\tThe only way to leave Room " + room + " is to" +
                        " come back from where you came (Your West).");
                combat.setRoom(room);
                reward.setRoom(room);
                reward.checkReward();
                combat.checkCombat();
                room6++;
                combat.setRoom6(room6);
                reward.setRoom6(room6);
                break;
            // This is if they are in room 7
            case '7':
                if (row == 2 && col == 4) {
                    System.out.println("\tYou are in a monster-free large room, " +
                            "so large that you can't see what's ahead of you. " +
                            "\n\tAs you take a look around of what you can" +
                            " currently see, this room seems to be completely empty." +
                            "\n\tYou can go to the other side of the room, which" +
                            " is North of you, or you can go to the tunnel " +
                            "\n\tthat's South from you, which will take you back to Room 3.");
                }
                if (row == 1 && col == 4) {
                    System.out.println("\tWalking further into the room, you see an " +
                            "ambient light from a window shines");
                    if (room7 == 0) {
                        System.out.print("\t upon a silver key " +
                                "in the center of the upper part of Room " + room + "," +
                                " which is\n\tsuppose to unlock the hallway in Room 4. ");
                    } else {
                        System.out.print("\ton the center of the ground of the upper" +
                                "part of Room 7, however there is no object to be seen.\n\t");
                    }
                    System.out.println("Ahead of you is another narrow hallway, similar to that " +
                            "from the previous hallway you came from that's\n\tSouth from" +
                            " you.");
                    reward.setRoom(room);
                    reward.checkReward();
                    room7++;
                    reward.setRoom7(room7);
                }
                break;
            // This is if they are in room 8
            case '8':
                if (room8 == 0) {
                    System.out.println("\tAs you crawled out of the tunnel and wipe" +
                            " the dust off your gear, you stumble upon a " +
                            "monster-filled room.\n\tThere are two skeletons, two " +
                            "ghosts, and one demon.");
                    System.out.println("\tRoom " + room + " is too small for you to " +
                            "hide, and you are filled with fear as they " +
                            "notice your presence.");
                } else {
                    System.out.println("\tThe chaos of the room is now gone with the " +
                            "disappearance of the monsters, leaving behind an ominous silence.");
                }
                System.out.println("\tThere is no other rooms to go to except " +
                        "leaving from the tunnel you came, which is currently " +
                        "East of you.");
                combat.setRoom(room);
                combat.checkCombat();
                room8++;
                combat.setRoom8(room8);
                reward.setRoom8(room8);
                break;
            // This is if they are in room 9
            case '9':
                // This is if the player has not visited the room yet
                if (room9 == 0) {
                System.out.print("\tAs you walk in Room " + room + ", you " +
                        "get goosebumps and feel your hairs stand up on the " +
                        "back of your neck, and when you look at what's" +
                        " ahead, you see that a demon has " +
                        "\n\ttaken most of the space of the triangular room. " +
                        "When you take a step back, ");
                    System.out.println("you hear:\n\t\t???: \"H-hey! You're " +
                            player.getName() + ", right? I'm " + supportName() +
                            ", pl-please help me!\"");
                    System.out.println("\tLooking towards the source of the voice, " +
                            "you see a boy on your right, around your age, with dirty" +
                            " blonde hair and brown eyes, looking at you.\n\tYou " +
                            "can clearly tell that the boy is injured and needs" +
                            " help.");
                // This is if the player has visited the room at least once
                } else {
                    System.out.print("\tAs you walk back into Room 9, the terrible" +
                            " aura you felt from the demon is gone now, ");
                    if (supportHealth() == 0) {
                        System.out.println("but only to be replaced by perhaps a worse one: " +
                                "the death of the comrade.");
                    } else {
                        System.out.println("replaced by a feeling of relief. " + supportName() +
                                " stands next to you and says,\n\t\t" + supportName() +
                                ": \"Let's get out of here, " +
                                "this place still gives me the creeps, I don't know how you" +
                                " can be so calm right now\"");
                    }
                }
                System.out.println("\tThere is no new entry, and the only way to leave" +
                        " is by going back to the upper part of the main hallway, which is" +
                        " your South.");
                combat.setRoom(room);
                reward.setRoom(room);
                reward.checkReward();
                combat.checkCombat();
                room9++;
                combat.setRoom9(room9);
                reward.setRoom9(room9);
                break;
            // This is if they are in Exit room
            case 'e':
                System.out.print("\tYou have reached the exit of the Sword Temple. " +
                        "A hologram pops up stating,\n");
                System.out.print("\t\t------------------------------------------------------------");
                for (int i = 0; i < 4 * player.getName().length(); i++) {
                    System.out.print("-");
                }
                System.out.print("\n\t\t|                                                          ");
                for (int i = 0; i < 4 * player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("|\n\t\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("   \"Well done! You are the ");
                // They will be the second to pass if they met the boy in room 9
                if (room9 > 0) {
                    System.out.print("second");
                    // If they didn't go to room 9, I will say they came in first to avoid confusion
                } else {
                    System.out.print("first");
                }
                System.out.print(" to have passed the exam.");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("\n\t\t");
                for (int i = 0; i < player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.print("   You, " + player.getName() + ", are now a trained knight.\"");
                System.out.print("\n\t\t|                                                          ");
                for (int i = 0; i < 4 * player.getName().length(); i++) {
                    System.out.print(" ");
                }
                System.out.println("|");
                System.out.print("\t\t------------------------------------------------------------");
                for (int i = 0; i < 4 * player.getName().length(); i++) {
                    System.out.print("-");
                }
                if (reward.isSupport() && supportHealth() != 0) {
                    System.out.println("\n\tYou hear " + supportName() + " say,");
                    System.out.println("\t\t" + supportName() + ": \"This is sick! C'mon "
                            + player.getName() + ", let's go!\"");
                }
                System.out.print("\n\nI hope you enjoyed the game, " + player.getName() + "!\n");
                System.out.println("Thank you for playing!!");
                break;
            /*
                Since there are multiple hallways, I will determine which hallway the
                player is in by the which row and column it's in
             */
            // This is if they are in a hallway
            case 'h':
                if (row == 4 && col == 2) {
                    System.out.println("\tYou are in the lower part of the main hallway," +
                            " and you notice how much larger this room is compared to " +
                            "the Entrance room.\n\tOn your West side is one room, and on " +
                            "the East side is an identical room as the one on the left.");
                    if (room1 == 0 && room2 == 0) {
                        System.out.println("\tOn both sides you hear the sound of cracking bones. " +
                                "Up North is a gate that continues onto the main hallway.");
                    } else if (room1 == 0) {
                        System.out.println("\tOn the left side you hear the sound of cracking bones. " +
                                "Up North is a gate that continues onto the main hallway.");
                    } else if (room2 == 0) {
                        System.out.println("\tOn the right side you hear the sound of cracking bones. " +
                                "Up North is a gate that continues onto the main hallway.");
                    }
                }
                if (row == 3 && col == 2) {
                    System.out.print("\tYou are in the lower-middle part of the main hallway," +
                            " which is smaller compared to the first hallway you walked in." +
                            "\n\tThere is only a room on your West, ");
                    if (room3 == 0) {
                        System.out.print("where you see some fog slipping out of the cracks of the door, ");
                    }
                    System.out.println("but up North is another gate,\n\tsimilar to the first main" +
                            " hallway, and it continues onto the main hallway.");
                }
                if (row == 2 && col == 2) {
                    System.out.print("\tYou are in the upper-middle part of the main hallway. " +
                            "There is a room on your West, ");
                    if (room4 == 0) {
                        System.out.print("where you hear both bones\n\tcracking and growls, ");
                    }
                    System.out.println("and an identical one on your East, but no " +
                            "sounds can be heard from that direction,\n\tand Up North is yet " +
                            "another gate similar to the first main hallway, and it " +
                            "continues onto the main hallway.");
                }
                if (row == 1 && col == 2) {
                    System.out.print("\tYou are in the upper and last part of the " +
                            "main hallway, and it is longer than the previous main hallways." +
                            "\n\tThere is a room on your East ");
                    if (room6 == 0) {
                        System.out.print(", where you hear both bones cracking and growls ");
                    }
                    System.out.print("and another room North of you, ");
                    // this is if the player hasn't visited room 9 yet
                    if (room9 == 0) {
                        System.out.println("where you hear a yell for help.");
                        // This is if they player visited room 9 at least once
                    } else {
                        System.out.println("where you can only hear a dead silence.");
                    }
                }
                if (row == 1 && col == 1) {
                    System.out.println("\tAs you walk through the narrow hallway" +
                            " feeling a bit dizzy, you see a dimmed light on your West.");
                    System.out.println("\tYou can follow the light or go back South to Room 4.");
                }
                if (row == 3 && col == 0) {
                    System.out.println("\tAs you walk through the narrow hallway" +
                            " that has a lot of turns, at one end you see a " +
                            "trap door that leads to an " +
                            "underground tunnel on your\n\tNorth" +
                            " that will take you to a different room. You can " +
                            "go inside the tunnel or go back " +
                            "to the other end East (to Room 3).");
                }
                if (row == 0 && col == 4) {
                    System.out.println("\tWalking around in the narrow hallway which also" +
                            " includes many turns, at one end is another trap door that " +
                            "once again leads you to a tunnel that's\n\tunderground, this " +
                            "time it is on the West side. There is another trap door " +
                            "that reveals a tunnel up West, or you can go back to " +
                            "Room 7 that's South\n\tfrom you.");
                }
                break;
        }
    }
}
