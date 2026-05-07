import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Noun: ");
        String noun = scanner.nextLine();
        System.out.println("Plural Noun: ");
        String noun2 = scanner.nextLine();

        System.out.println("Verb: ");
        String verb = scanner.nextLine();

        System.out.println("Verb(Past tense): ");
        String verb2 = scanner.nextLine();
        System.out.println("Verb ending in ing: ");
        String verb3 = scanner.nextLine();


        System.out.println("Adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.println("Type of bird: ");
        String typeofbird = scanner.nextLine();

        System.out.println("Room: ");
        String room = scanner.nextLine();

        System.out.println("Name of relative: ");
        String relative = scanner.nextLine();

        System.out.println("Name of Liquid: ");
        String liquid = scanner.nextLine();

        System.out.println("Body Part: ");
        String bodyPart = scanner.nextLine();

        scanner.close();


        System.out.println("It was a " + adjective + " ,cold November day. I woke up to the " + adjective2 + " smell of " +
                typeofbird + " roasting in the " + room + " downstairs. I " + verb2 + " down the stairs to see if I could help "
                + verb + " the dinner. My mom said, See if " + relative + "needs a fresh " + noun + ". So I carried a tray of glasses full of " +
                liquid + " into the " + verb3 + " room. When I got there,  couldn't believe my " + bodyPart + "! There were " + noun2 + " " +
                verb3 + " on the " + noun + ".");


    }
}