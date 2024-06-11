// This class includes the map of the game
public class SwordTempleMap {
    private int rowPlayer, colPlayer;
    private char[][] dungeon = {
            {'8', ' ', '9', ' ', 'h'},
            {'e', 'h', 'h', '6', '7'},
            {' ', '4', 'h', '5', '7'},
            {'h', '3', 'h', ' ', ' '},
            {' ', '1', 'h', '2', ' '},
            {' ', ' ', 'E', ' ', ' '}
    };

    // This instance method will determine where the player is in the beginning
    public SwordTempleMap(int rowPlayer, int colPlayer) {
        this.rowPlayer = rowPlayer;
        this.colPlayer = colPlayer;
    }

    // This is when the player moved North or South
    public void setRowPlayer(int rowPlayer) {
        this.rowPlayer = rowPlayer;
    }

    // This is when the player moved West or East
    public void setColPlayer(int colPlayer) {
        this.colPlayer = colPlayer;
    }

    // This will display the map of the dungeon/temple
    public void displayDungeon(int rowPlayer, int colPlayer) {
        System.out.println("This is the map of the dungeon:");
        // User's location
        String user = "X";
        for (int row = 0; row < dungeon.length; row++) {
            // This for-loop will look at each column in one row
            for (int col = 0; col < dungeon[row].length; col++) {
                if (row == rowPlayer && col == colPlayer &&
                        dungeon[row][col] == '7') {
                    System.out.print("|" + user + "|");
                } else if (row == rowPlayer && col == colPlayer && ((row == 1
                        && col == 1) || (row == 0 && col == 4))) {
                    System.out.print("-" + user + "|");
                } else if (row == rowPlayer && col == colPlayer && row == 3
                        && col == 2) {
                    System.out.print("+" + user + "|");
                } else if (row == rowPlayer && col == colPlayer && row == 1
                        && col == 2) {
                    System.out.print("|" + user + "+");
                } else if (row == rowPlayer && col == colPlayer && ((row == 3
                        && col == 0) || dungeon[row][col] == '4')) {
                    System.out.print("|" + user + "-");
                } else if (row == rowPlayer && col == colPlayer &&
                        dungeon[row][col] == 'E') {
                    System.out.print("|" + user + " ");
                } else if (row == rowPlayer && col == colPlayer &&
                        dungeon[row][col] == '9') {
                    System.out.print(" " + user + "|");
                } else if (row == rowPlayer && col == colPlayer &&
                        dungeon[row][col] == 'h') {
                    System.out.print("+" + user + "+");
                } else if (row == rowPlayer && col == colPlayer &&
                        dungeon[row][col] == '3') {
                    System.out.print("-" + user + "-");
                } else if (row == rowPlayer && col == colPlayer &&
                        (dungeon[row][col] == '1' || dungeon[row][col] == '8')) {
                    System.out.print(" " + user + "-");
                } else if (row == rowPlayer && col == colPlayer &&
                        (dungeon[row][col] == '5' || dungeon[row][col] == '6'
                                || dungeon[row][col] == '2')) {
                    System.out.print("-" + user + " ");
                } else if (dungeon[row][col] == '9') {
                    System.out.print("/" + dungeon[row][col] + "\\");
                } else if (dungeon[row][col] != ' ') {
                    System.out.print("[" + dungeon[row][col] + "]");
                } else {
                    System.out.print(" " + dungeon[row][col] + " ");
                }
            }
            System.out.println();
        }

        // This tells the user how to read the map
        System.out.println("To find your location, find -> X");
        System.out.println("\tIf there is '|' on the left of your location," +
                " then you have the option to go North (ei. |X ).");
        System.out.println("\tIf there is '|' on the right of your location," +
                " then you have the option to go South (ei. X| ).");
        System.out.println("\tIf there is '-' on the left of your location," +
                " then you have the option to go West (ei. -X ).");
        System.out.println("\tIf there is '-' on the right of your location," +
                " then you have the option to go East (ei. X- ).");
        System.out.println("\tIf there is '+' on the left of your location," +
                " then you have the option to go North or West (ei. +X ).");
        System.out.println("\tIf there is '+' on the right of your location," +
                " then you have the option to go South or East (ei. X+ ).");
    }

    /*
     These instance methods will return the char value
     the user is in (room number, hallway etc.)
     */
    public char[][] getDungeon() {
        return dungeon;
    }

    public char getPlayerDungeon() {
        return dungeon[rowPlayer][colPlayer];
    }
}
