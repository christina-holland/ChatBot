import java.util.Scanner;

public class ChatBot {
    //Creating the main method to run the program
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Calling the greetUser method
        greetUser();

        //Calling the askAndRepeatName method and storing the name as userName
        String userName = askAndRepeatName(scanner);

        //Calling the guessUserAge method and storing the age as userAge
        int userAge = guessUserAge(scanner);

        //Calling the countToNumber method
        countToNumber(scanner);

        //Calling the testProgrammingKnowledge method
        testProgrammingKnowledge(scanner);

        //Calling the tellStory method
        tellStory(userName, userAge);

        //Calling the outputDayPhrase method
        outputDayPhrase(scanner);

        //Printing a Goodbye message at the end of the program
        System.out.println("Thank you for chatting with me! Goodbye, " + userName + "!");
    }

    //Creating the method to greet the user
    public static void greetUser() {
        //Printing the greeting
        System.out.println("Wassup! I'm ChatBot!");
    }

    //Creating a method to ask for the user's name and then repeat it
    public static String askAndRepeatName(Scanner scanner) {
        //Asking the user for their name
        System.out.println("What's your name?");
        //Reading the user's input and storing it as name
        String name = scanner.nextLine();
        //Printing a response to the user after learning their name
        System.out.println("Nice to meet you, " + name + "!");
        //Returning name so it is passed to the call in the main method and assigned to userName
        return name;
    }

    //Creating a method to guess the user's age based on the year they were born
    //And whether they had their birthday this year
    public static int guessUserAge(Scanner scanner) {
        //Printing a message to the user about wanting to "guess" the user's age
        System.out.println("Let me guess your age.");

        //Declaring an integer with the value of the current year
        int currentYear = 2024;
        //Declaring an integer called age that defaults to 0 until reassigned
        int age = 0;

        //Asking for the user's birth year
        System.out.println("In what year were you were born?");
        //Reading the user's input and storing it as an integer
        int birthYear = Integer.valueOf(scanner.nextLine());

        //Creating a while loop to handle the next question and user input
        while (true) {
            //Asking whether they have had their birthday this year
            System.out.println("Have you had your birthday this year? (yes/no)");
            //Reading the user's input and storing it as a case-insensitive string
            String birthdayStatus = scanner.nextLine().toLowerCase();

            if (birthdayStatus.equals("yes")) {
                age = currentYear - birthYear;
                break; //Exits the loop if valid input is provided
            } else if (birthdayStatus.equals("no")) {
                age = currentYear - birthYear - 1;
                break; //Exits the loop if valid input is provided
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                //Continues the loop until valid input is provided
            }
        }

        //Printing the user's age
        System.out.println("You are " + age + " years old!");
        //Returning age so it is passed to the call in the main method and assigned to userAge
        return age;
    }

    //Creating a method to count to a number of the user's choice
    public static void countToNumber(Scanner scanner) {
        //Asking the user to enter a number
        System.out.println("Enter a number and I will count to it:");
        //Reading the user's input and storing it as an integer
        int number = Integer.valueOf(scanner.nextLine());
        //Creating a for loop to iterate through every integer from 1 to the user's input
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        //Moving to the next line once the counting is finished
        System.out.println();
    }

    //Creating a method to test the user's programming knowledge
    public static void testProgrammingKnowledge(Scanner scanner) {
        //Printing the multiple choice question
        System.out.println("Let's test your programming knowledge:");
        System.out.println("Which of the following data types would be best for storing a person's favorite color?");
        System.out.println("1. Boolean");
        System.out.println("2. Integer");
        System.out.println("3. String");
        System.out.println("4. Float");

        //Declaring an integer and assigning it with the value of the correct answer
        int correctAnswer = 3;
        //Declaring an integer for the user's answer that defaults to 0 until reassigned
        int userAnswer = 0;

        //Creating a do while loop to handle the user's guesses until the correct answer is inputted
        do {
            //Instructing the user to enter their answer to the previous question
            System.out.print("Enter your answer (1-4): ");
            //Reading the user's answer and storing it as an integer
            userAnswer = Integer.valueOf(scanner.nextLine());

            if (userAnswer < 1 || userAnswer > 4) {
                System.out.println("Invalid input"); //Prints this message if the input is not 1-4
            } else if (userAnswer != correctAnswer) {
                System.out.println("Incorrect answer. Try again."); //Prints this message if the input is 1, 2, or 4
            }
        } while (userAnswer != correctAnswer); //Continues the loop while the users answer is incorrect

        //Prints this message once the correct answer is inputted and the loop ends
        System.out.println("Correct!");
    }

    //Creating a method to tell a story based on what ChatBot knows about the user
    public static void tellStory(String userName, int userAge) {
        //Printing the story and using the user's name and age
        System.out.println("Let me tell you a story about yourself, " + userName + ".");
        System.out.println("Once upon a time, there was a " + userAge + " year old person named " + userName + ".");
        System.out.println("The people in the land loved " + userName + "'s wisdom and style.");
        System.out.println("They all chipped in and bought " + userName + " a new car!");
    }

    //Creating a method to output a phrase for each day of the week
    public static void outputDayPhrase(Scanner scanner) {
        //Asking the user to choose a number from 1 to 7 that will correspond with the day of the week
        System.out.println("Choose a number from 1 to 7 for a daily phrase:");
        System.out.println("(1 = Mon, 2 = Tues, 3 = Wed, 4 = Thurs, 5 = Fri, 6 = Sat, 7 = Sun)");
        //Reading the user's input and storing it as an integer
        int dayNumber = Integer.valueOf(scanner.nextLine());

        //Declaring a string variable for the daily phrase that will pass to the printed message for the user
        String dayPhrase;
        //Creating a switch statement to handle the cases of the user input's
        switch (dayNumber) {
            case 1:
                dayPhrase = "Garfield the cat says: 'I hate Mondays!'";
                break;
            case 2:
                dayPhrase = "Taco Tuesday!";
                break;
            case 3:
                dayPhrase = "Hump Day!";
                break;
            case 4:
                dayPhrase = "Throwback Thursday!";
                break;
            case 5:
                dayPhrase = "Thank God It's Friday!";
                break;
            case 6:
                dayPhrase = "Elton John says: 'Saturday Night's Alright for Fighting!'";
                break;
            case 7:
                dayPhrase = "Sunday Funday!";
                break;
            default:
                dayPhrase = "Invalid input";
                break;
        }

        //Printing the daily phrase for the user
        System.out.println(dayPhrase);
    }
}
