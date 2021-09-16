import java.util.Scanner;
/**
 * Class for adventurer (maybe selectable)
 **/
public class Adventurer {

    // Declaring Attributes for the Adventurer...
    private String name;
    private double life;
    private double attackdmg;
    private int experience = 0;
    private int level = 1;
    private Backpack backpack;



    //Constructor

    public Adventurer(String name, double life, double attackdmg) {
        this.name = name;
        this.life = life;
        this.attackdmg = attackdmg;
        this.experience = experience;
        this.level = level;
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public double getLife() {
        return life;
    }

    public double getAttackdmg() {
        return attackdmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public void setAttackdmg(double attackdmg) {
        this.attackdmg = attackdmg;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    // Methods

    public void exp(){
        if (experience == 100){
            level++;
            experience = 0;
        }
    }

}