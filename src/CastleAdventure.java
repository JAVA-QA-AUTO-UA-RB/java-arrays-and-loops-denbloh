import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        System.out.println("Hello brave hero!");
        System.out.println("Welcome into the 'Castle Adventure' journey!");
        System.out.println("Your first task is to enter the castle. To open the door you need to enter correct password!");
        System.out.println("Do you need a hint for password answer? Type 1 for 'yes' or 2 for 'no'");
        Scanner denscanner = new Scanner(System.in);


        int choice1 = denscanner.nextInt();
        if (choice1 == 1) {
            System.out.println("1: How many oceans do we have?");
            System.out.println("2: Favorite t-shirt number of Cristiano Ronaldo");
            System.out.println("3: Devil's number");
            System.out.println("4: 7*8-7");
            System.out.println("5: 5\u00B3");
        }
        else if (choice1 == 2) {
            System.out.println("It's your choice. Try to enter correct password");
        } else {
            System.out.println("Hmm.. Looks like you are not very attentive. Ok, never mind, try to enter correct password to enter the castle");
        }

        int[] secretCode = {5, 7, 13, 49, 125};
        boolean isCodeCorrect = false;

        while (!isCodeCorrect) {
            System.out.println("Type 5 numbers to open the castle's door:");
            isCodeCorrect = true;

            for (int i = 0; i < secretCode.length; i++) {
                int userInput = denscanner.nextInt();
                if (userInput != secretCode[i]) {
                    isCodeCorrect = false;
                }
            }

            if (isCodeCorrect) {
                System.out.println("Hooray! Door is open! Let's enter!");
            } else {
                System.out.println("Incorrect password");

                System.out.println("\nWhat next?");
                System.out.println("1 - Try again!");
                System.out.println("2 - Get hint");
                System.out.println("3 - Finish the game");

                int choice2 = denscanner.nextInt();

                if (choice2 == 2) {
                    System.out.println("Hint:");
                    System.out.println("1: How many oceans do we have?");
                    System.out.println("2: Favorite t-hirt number of Cristiano Ronaldo");
                    System.out.println("3: Devil's number");
                    System.out.println("4: 7*8-7");
                    System.out.println("5: 5\u00B3");
                    System.out.println("Try again!");
                } else if (choice2 == 3) {
                    System.out.println("Sorry to hear that:( Game over. See you soon!");
                    System.exit(0);
                } else {
                    System.out.println("Ok, let's try again\n");
                }
            }
        }
        System.out.println("After entering the castle you see the room with magic board with numbers:");
        System.out.println("3, 6, 9, 12, 15, 18, 21, 24, 27, 30");
        int[] numbersBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        int numbersSum = 0;
        for (int i = 0; i < numbersBoard.length; i++) {
            numbersSum += numbersBoard[i];
        }

        int playerSum;
        do {
            System.out.println("Type the sum of all numbers:");
            playerSum = denscanner.nextInt();

            if (playerSum != numbersSum) {
                System.out.println("Incorrect. Try again!");
            }

        } while (playerSum != numbersSum);

        System.out.println("Correct! Numbers sum is: " + numbersSum);
        System.out.println("Doors to the next room is open!");


        System.out.println("\nIn next room you see the dragon! And he starts to attack you!");

        int[] dragonAttacks = {8, 16, 24, 32, 40};

        System.out.print("Dragon attacks you with such power: ");
        for (int attack : dragonAttacks) {
            System.out.print(attack + " ");
        }
        System.out.println("\n");

        boolean dragonAnswer = false;
    do {
        System.out.println("What we can say about these attacks?");
        System.out.println("1 - Attacks increase by 10");
        System.out.println("2 - All attacks are multiples of three");
        System.out.println("3 - All attacks are even");
        System.out.println("4 - There are both even and odd attacks");
        System.out.println("5 - All attacks are the same");

        System.out.print("Select correct option (1-5): \n");
        int choice3 = denscanner.nextInt();

        if (choice3 == 3) {
            System.out.println("Correct! All attacks are even! Shield activated!");
            System.out.println("Doors to the net room are opened");
            dragonAnswer = true;
        } else {
            System.out.println("Incorrect! Dragon attacks you again!");
            System.out.println("Get your strength back and try again...");
        }
    } while (!dragonAnswer);


        System.out.println("\nFinal room: Find the magic key!");

/* our prev arrays:
        int[] secretCode = {5, 7, 13, 49, 125};
        int[] numbersBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] dragonAttacks = {8, 16, 24, 32, 40};
*/
        boolean isKeyFound = false;

        do {
            System.out.print("Type your favorite number: ");
            int favoriteNumber = denscanner.nextInt();

            for (int userFavNum : secretCode) {
                if (userFavNum == favoriteNumber) {
                    isKeyFound = true;
                    break;
                }
            }
            if (!isKeyFound) {
                for (int userFavNum : numbersBoard) {
                    if (userFavNum == favoriteNumber) {
                        isKeyFound = true;
                        break;
                    }
                }
            }
            if (!isKeyFound) {
                for (int userFavNum : dragonAttacks) {
                    if (userFavNum == favoriteNumber) {
                        isKeyFound = true;
                        break;
                    }
                }
            }

            if (!isKeyFound) {
                System.out.println("Need more magic... Try again!\n");
            }

        } while (!isKeyFound);

        System.out.println("You found the magic key! You are true mag! See you soon in next adventures!");
        denscanner.close();
        System.exit(0);
    }
}