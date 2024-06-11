import java.util.Random;

// This class has the stats each character should have
public class Character {
    // These instance variables are their stats
    private int maxHp, CurrHp, minDmg, maxDmg, defense;
    private String name;

    public Character() {

    }

    public Character(int maxHp, int currHp, int minDmg, int maxDmg, int defense, String name) {
        this.maxHp = maxHp;
        CurrHp = currHp;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.defense = defense;
        this.name = name;
    }

    // These values will be used and change throughout the gameplay
    public void setName(String name) {
        this.name = name;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setCurrHp(int currHp) {
        CurrHp = currHp;
    }

    public void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrHp() {
        return CurrHp;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    /*
        This will calculate the damage a character
        will do depending on their min and max damage
     */
    public int calculateDmg() {
        int range = this.maxDmg-this.minDmg+1;
        return (new Random().nextInt(range)) + this.minDmg;
    }
}