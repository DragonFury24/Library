//package period1;

import java.util.Scanner;

/**
 * Allows a user to create an account and borrow and return books.
 *
 * @author kabaram
 */
public class MyLibrary {

    // Allows user input
    public static Scanner input = new Scanner(System.in);

    /**
     * Show the menu of Library options
     */
    public static void showMenu() {
        System.out.println();
        System.out.println("LIBRARY OPTIONS");
        System.out.println("1) Borrow a book");
        System.out.println("2) Return a book");
        System.out.println("3) See if you have borrowed a book");
        System.out.println("4) See your account");
        System.out.println("5) Exit");
        System.out.println();
        System.out.print("Your Choice? ");
    }

    /**
     * Allows user to create account and view menu
     */
    public static void goToLibrary() {
        // User enters name
        System.out.println("Hello and welcome to your local library");
        System.out.println("What is your first name?");
        String first = input.nextLine();
        System.out.println("Thank you. And what is your last name?");
        String last = input.nextLine();
        String formattedName = last + ", " + first;
        Patron user = new Patron(formattedName);

        boolean visiting = true;
        while (visiting) {

            // user's menu choice
            int choice = 0;

            showMenu();
            choice = Integer.parseInt(input.nextLine()); // consistent use of nextLine method for all input
            System.out.println();

            // perform conditional logic based on menu choice
            String title, author;
            switch (choice) {
                case 1:
                    System.out.println("What is the title of the book you would like to borrow?");
                    title = input.nextLine();
                    System.out.println("What is the name of the book's author?");
                    author = input.nextLine();
                    user.borrowBook(title, author);
                    break;
                case 2:
                    System.out.println("What is the title of the book you would like to return?");
                    title = input.nextLine();
                    user.returnBook(title);
                    break;
                case 3:
                    System.out.println("What is the title of the book  you would like to verify?");
                    title = input.nextLine();
                    if (user.hasBorrowed(title)) {
                        System.out.println("Yes, you have borrowed " + title);
                    } else {
                        System.out.println("Sorry, we did not find " + title + " on your account.");
                    }
                    break;
                case 4:
                    System.out.println(user);
                    break;
                case 5:
                    visiting = false;
                    break;
                default:            //error-check for a valid input
                    System.out.println("Error - please choose an option between 1 and 5");

            }
        }
        System.out.println("Thank you for visiting your local library");
        System.out.println("Good-bye!");

    }

    /**
     * Program begins here
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        goToLibrary();
    }

}
