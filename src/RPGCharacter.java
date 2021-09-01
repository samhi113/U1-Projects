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
        int strength, defense, health, dexterity, speed, intelligence, wisdom, charisma, manaCap, healing, stealth, overall;
        double statRelFactor;

        playerName = JOptionPane.showInputDialog("Hello! What is your actual name?");
        p1CharName = JOptionPane.showInputDialog("What will your character's name be?");

        strength = Integer.parseInt(JOptionPane.showInputDialog("Alright! From here on out, rank 0-99." + "\n" + "What's your strength level?"));
        dexterity = Integer.parseInt(JOptionPane.showInputDialog("What's your dexterity?"));
        intelligence = Integer.parseInt(JOptionPane.showInputDialog("What's your intelligence?"));
        wisdom = Integer.parseInt(JOptionPane.showInputDialog("How about your wisdom?"));
        charisma = Integer.parseInt(JOptionPane.showInputDialog("Lastly, your charisma."));

        statRelFactor = Double.parseDouble(JOptionPane.showInputDialog("Alright, we're almost done! Now, how much do you want your stats correlated?" + "\n" + "For reference, 50 is not balanced at all and 100 is directly correlated."));
        statRelFactor = statRelFactor / 100;

        defense = 100-(int)(strength * statRelFactor);
        health = 100-(int)((defense + intelligence) * statRelFactor * 0.5);
        speed = (int)((dexterity + health) * statRelFactor * 0.5);
        manaCap = 100-(int)((intelligence + charisma) * statRelFactor * 0.5);
        healing = (int)((wisdom + charisma) * statRelFactor * 0.5);
        stealth = (int)((wisdom + dexterity) * statRelFactor*0.5);

        overall = (int)((strength+dexterity+intelligence+wisdom+charisma+defense+health+manaCap+healing+stealth+speed)*(0.8+(statRelFactor/(1.5+statRelFactor)))/11);

        JOptionPane.showMessageDialog(null, "Presenting " + p1CharName + ", a character designed by " + playerName + ". \n" + "Overall: " + overall + "\n" + "Strength: " + strength + "\n" + "Defense: " + defense + "\n" + "Max Health: " + health + "\n" + "Speed: " + speed + "\n" + "Dexterity: " + dexterity + "\n" + "Intelligence: " + intelligence + "\n" + "Wisdom: " + wisdom + "\n" + "Charisma: " + charisma + "\n" + "Mana cap: " + manaCap + "\n" + "Healing: " + healing + "\n" + "Stealth: " + stealth);

        System.exit(0);
    }
}
