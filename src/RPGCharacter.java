import javax.swing.JOptionPane;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

    public static void main(String[] args) {
        String playerName, p1CharName;
        int strength, damage, dexterity, intelligence, wisdom, charisma, manaCap, healing, stealth;
        double statRelFactor;

        playerName = JOptionPane.showInputDialog("Hello! What is your actual name?");
        p1CharName = JOptionPane.showInputDialog("What will your character's name be?");

        strength = Integer.parseInt(JOptionPane.showInputDialog("Alright! From here on out, rank 0-99." + "\n" + "What's your strength level?"));
        dexterity = Integer.parseInt(JOptionPane.showInputDialog("What's your dexterity?"));
        intelligence = Integer.parseInt(JOptionPane.showInputDialog("What's your intelligence?"));
    }
}
