public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Nokuthaba"); // Print to a new line
        boolean isAlien = false;
        if (isAlien) { // If isAlien == true
            System.out.print("It is not an alien!");
        }
        else {
            System.out.println("I am terrified of Aliens!");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score");
        }
        // Logical AND operator. Both sides must be true "&&"
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical OR operator either expression can be true. "||"
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

    }
}
