import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String noun1, verbing1, noun2, occupation, number, location, verb2, adj1, plunoun3, noun4, name;

        System.out.println("Gimme a noun.");
        noun1 = read.nextLine();
        System.out.println("How about a verb ending with -ing?");
        verbing1 = read.nextLine();
        System.out.println("Another noun please.");
        noun2 = read.nextLine();
        System.out.println("Can I get a job/occupation?");
        occupation = read.nextLine();
        System.out.println("What's your favorite number?");
        number = read.nextLine();
        System.out.println("Name a place, city, or country.");
        location = read.nextLine();
        System.out.println("One more verb.");
        verb2 = read.nextLine();
        System.out.println("Your one and only adjective for the round, please.");
        adj1 = read.nextLine();
        System.out.println("A plural noun...");
        plunoun3 = read.nextLine();
        System.out.println("And finally, a noun.");
        noun4 = read.nextLine();
        System.out.println("Alright! Before we finish, what's your name?");
        name = read.nextLine();


        System.out.println("And now, a masterpiece. Baseball, by " + name + ".");
        System.out.println(noun1 + "ball is a very exciting sport.");
        System.out.println("Whether you are " + verbing1 + " the ball with a " + noun2 + ", or you are the " + occupation);
        System.out.println("and striking out " + number + " batters in a row, you'll be having fun.");
        System.out.println("You can also be the catcher, standing at " + location + " plate, ready to " + verb2);
        System.out.println("the next person as he tries to make it back to " + location + " plate.");
        System.out.println("But the best part of it is when someone hits a " + adj1 + " slam when all the ");
        System.out.println(plunoun3 + "are loaded during the last " + noun4 + " to win the game.");
    }
}