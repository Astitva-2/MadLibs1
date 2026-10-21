import java.util.Scanner;

public class madlib {
    public static void main(String[] args) {
        
        // \" Is how you write quotes inside the string
        String originalStory = "I bent down to tie my shoe at the supermarket, but let out a [adjective] \"[sound]\" that shook the entire [food] aisle. Startled, [person], dropped an open jar of [snack] and began [verb-ing] toward the bakery section. Their bright [color] [piece of clothing] immediately ripped down the middle horrifying a family of [number] trying to buy [food]. In confusion a stray [animal] snatched a handleful of [noun] off the shelf, swallowed it whole, and screamed \"[word]\". The store manager slowly closed the blinds in his office and pretended he was blind.";
        
        // \n is new line 
        System.out.println("Original Story:\n" + originalStory + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a sound: ");
        String sound = scanner.nextLine();

        System.out.print("Enter a food: ");
        String food1 = scanner.nextLine();

        System.out.print("Enter a person's name: ");
        String person = scanner.nextLine();

        System.out.print("Enter a snack: ");
        String snack = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verbIng = scanner.nextLine();

        System.out.print("Enter a color: ");
        String color = scanner.nextLine();

        System.out.print("Enter a piece of clothing: ");
        String clothing = scanner.nextLine();

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        System.out.print("Enter another food: ");
        String food2 = scanner.nextLine();

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("\nYour Mad Libs Story:");
        System.out.println("I bent down to tie my shoe at the supermarket, but let out a " + adjective + " \"" + sound + "\" that shook the entire " + food1 + " aisle. Startled, " + person + ", dropped an open jar of " + snack + " and began " + verbIng + " toward the bakery section. Their bright " + color + " " + clothing + " immediately ripped down the middle horrifying a family of " + number + " trying to buy " + food2 + ". In confusion a stray " + animal + " snatched a handleful of " + noun + " off the shelf, swallowed it whole, and screamed \"" + word + "\". The store manager slowly closed the blinds in his office and pretended he was blind.");
        
        scanner.close();
    }
}
