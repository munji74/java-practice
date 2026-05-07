import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        System.out.println("Welcome to madlibs-----------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Noun: ");
        String noun = scanner.nextLine();
        System.out.print("Plural Noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Verb: ");
        String verb = scanner.nextLine();

        System.out.print("Verb(Past tense): ");
        String verb2 = scanner.nextLine();
        System.out.print("Verb ending in ing: ");
        String verb3 = scanner.nextLine();


        System.out.print("Adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.print("Type of bird: ");
        String typeofbird = scanner.nextLine();

        System.out.print("Room: ");
        String room = scanner.nextLine();

        System.out.print("Name of relative: ");
        String relative = scanner.nextLine();

        System.out.print("Name of Liquid: ");
        String liquid = scanner.nextLine();

        System.out.print("Body Part: ");
        String bodyPart = scanner.nextLine();

        scanner.close();


        System.out.println("It was a " + adjective + " ,cold November day. I woke up to the " + adjective2 + " smell of " +
                typeofbird + " roasting in the " + room + " downstairs. I " + verb2 + " down the stairs to see if I could help "
                + verb + " the dinner. My mom said, See if " + relative + "needs a fresh " + noun + ". So I carried a tray of glasses full of " +
                liquid + " into the " + verb3 + " room. When I got there,  couldn't believe my " + bodyPart + "! There were " + noun2 + " " +
                verb3 + " on the " + noun + ".");

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Thank you for playing");
    }
}