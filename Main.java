// Roger Wu
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> bankA = new ArrayList<>(); // Original Banks & Answers
        ArrayList<Character> ansA = new ArrayList<>();
        bankA.add("To get your vehicle out of a skid, you should first:\na. Steer straight ahead.\nb. Steer in the opposite direction of the skid.\nc. Steer in the direction you want to go.\nd. Apply brakes hard.");
        ansA.add('c');
        bankA.add("When may you lend your driver’s licence?\na. In emergencies.\nb. To a person learning to drive\nc. It is not permitted.\nd. For identification purposes.");
        ansA.add('c');
        bankA.add("What must a driver do before entering a highway from a private road or driveway?\na. Enter or cross the highway as quickly as possible.\nb. Yield right-of-way to all vehicles approaching on the highway.\nc. Sound horn and proceed with caution.\nd. Give hand signal then take right-of-way.");
        ansA.add('b');
        bankA.add("Never change lanes in traffic without:\na. Looking in the rear view mirror only.\nb. Giving proper signal and looking to make sure the move can be made safely.\nc. Blowing your horn and looking to the rear.\nd. Decreasing speed and giving correct signal.");
        ansA.add('b');
        bankA.add("When the driver of another vehicle is about to overtake and pass your vehicle, you must:\na. Speed up so that passing is not necessary.\nb. Move to the left to prevent passing.\nc. Signal to the other driver not to pass.\nd. Move to the right and allow such vehicle to pass.");
        ansA.add('d');
        bankA.add("When you are deciding whether or not to make a U-turn, your first consideration should be to check:\na. Traffic regulations.\nb. Presence of trees, fire hydrants or poles near the curb.\nc. Turning radius of your car.\nd. Height of curb.");
        ansA.add('a');
        bankA.add("It is more dangerous to drive at the maximum speed limit at night than during daytime as:\na. Your reaction time is slower at night.\nb. You cannot see as far ahead at night.\nc. Some drivers unlawfully drive with parking lights only.\nd. The roadways are more apt to be slippery at night.");
        ansA.add('b');
        bankA.add("You should under all conditions drive at a speed which will allow you to:\na. Stop within 150 metres.\nb. Stop within 90 metres.\nc. Stop within 60 metres.\nd. Stop within a safe distance.");
        ansA.add('d');
        bankA.add("The two-second rule is used to determine:\na. how fast you can react to obstacles.\nb. whether you are following at a safe distance.\nc. how fast you are travelling.\nd. how much gas you will save.");
        ansA.add('b');
        bankA.add("A novice driver who is convicted of distracted driving will face which of the following penalties for a third offence?\na. A fine, licence suspension and 6 demerit points\nb. Licence cancellation and removal from the Graduated Licensing System, but no fine\nc. A fine, licence suspension and 3 demerit points\nd. A fine, licence cancellation and removal from the Graduated Licensing System");
        ansA.add('d');
        ArrayList<String> bankB = new ArrayList<>();
        ArrayList<Character> ansB = new ArrayList<>();
        bankB.add("If you are convicted of driving at 50 km/h or more over the speed limit, you will face which of the following penalties?\na. Jail sentence of up to 6 months\nb. $2,000 to $10,000 fine\nc. Licence suspension for up to 2 years or 6 demerit points\nd. All of the above");
        ansB.add('d');
        bankB.add("If you become very tired while driving, you should\na. drink coffee.\nb. open your windows to allow fresh air in the car.\nc. stop and rest.\nd. drive faster to your destination.");
        ansB.add('c');
        bankB.add("When the driver of another vehicle is about to pass your vehicle on your left, what should you do?\na. Move to the right and allow the vehicle to pass.\nb. Speed up so that passing is not necessary.\nc. Move to the left and allow the vehicle to pass.\nd. Signal the other driver not to pass.");
        ansB.add('a');
        bankB.add("On a roadway where traffic is moving in both directions, in what position must you be before making a left turn?\na. Close to the left-hand side of the roadway\nb. In any position as long as you signal\nc. To the right of and as close to the centre line of the roadway as possible\nd. Close to the right-hand side of the roadway");
        ansB.add('c');
        bankB.add("What documents may a police officer require a motor vehicle owner to produce?\na. The motor vehicle ownership document\nb. If the motor vehicle is insured, a liability insurance card\nc. If he or she is operating a motor vehicle, a valid driver's licence\nd. All of the above");
        ansB.add('d');
        bankB.add("Which of the following items are you prohibited from using while you're driving?\na. Laptop computer\nb. DVD player\nc. Hand-held cell phone\nd. All of the above");
        ansB.add('d');
        bankB.add("What do broken white lines indicate?\na. They mark the right edge of the roadway.\nb. They indicate that passing is prohibited.\nc. They separate lanes of traffic travelling in the same direction.\nd. They separate lanes of traffic travelling in opposite directions.");
        ansB.add('c');
        bankB.add("Never change lanes in traffic without\na. blowing your horn and looking to make sure that the lane change can be performed safely.\nb. looking into the rear-view mirror only.\nc. giving the proper signal and looking to make sure that the lane change can be performed safely.\nd. giving the proper signal and slowing down.");
        ansB.add('c');
        bankB.add("Are drivers responsible for requiring their passengers to buckle up?\na. Only those passengers over 18 years of age\nb. Only those passengers under 16 years of age\nc. Only those passengers in the front seat\nd. Only those passengers who are 16 years of age or older");
        ansB.add('b');
        bankB.add("If you are convicted of failing to stop when a police officer gave pursuit, you may face which of the following penalties?\na. A fine of up to $25,000\nb. Licence suspension for 5 years\nc. Up to 6 months in jail\nd. All of the above");
        ansB.add('d');
        boolean repeat = true;
        String adminPassword = "password";
        while (repeat) {
            ArrayList<String> temp_bankA = new ArrayList<>(bankA); //Temporary arraylists for redo tests. No need for restarting program.
            ArrayList<String> temp_bankB = new ArrayList<>(bankB);
            ArrayList<Character> temp_ansA = new ArrayList<>(ansA);
            ArrayList<Character> temp_ansB = new ArrayList<>(ansB);

            int option = 0;
            boolean menu = true;
            while (menu) { // Menu & options
                System.out.println("Welcome to the G1 road rules test.");
                System.out.println("1. Write G1 test");
                System.out.println("2. Log in as admin");
                option = sc.nextInt();
                if (option == 1 || option == 2) {
                    menu = false;
                } else {
                    System.out.println("Please enter a valid option.");
                }
            }
            boolean fail = false;
            if (option == 1) { //G1 Test
                int questions_askedA = 0; // To keep track of score, and to terminate test when failed
                int scoreA = 0;
                int questions_askedB = 0;
                int scoreB = 0;
                char answer;
                System.out.println("===== PART A ====="); // Part A questions, randomized from a bank of 10, repeated 6 times
                System.out.println("To answer questions, you must enter a lowercase letter corresponding to the answer you would like to select."); //Prompt of how to answer questions
                for (int i = 1; i < 7 && !fail; i++) {
                    int askd_question = (int) (Math.random() * temp_bankA.size()); //Random question from bank's current size, changes size to avoid repetitive questions
                    System.out.println(i + ". " + temp_bankA.get(askd_question));
                    answer = Character.toLowerCase(sc.next().charAt(0));
                    questions_askedA++; // User has successfully been asked a question.
                    if (answer == temp_ansA.get(askd_question)) {// Correct answer has been chosen.
                        scoreA++;
                        System.out.println("CORRECT ANSWER");
                    } else { // Incorrect answer has been chosen.
                        System.out.println("INCORRECT ANSWER");
                    }
                    if (questions_askedA == scoreA + 3) {
                        System.out.println("NOT ENOUGH SCORE TO PASS, TEST FAILED. PLEASE TRY AGAIN.");
                        fail = true; // To terminate test, 3 + 3 = 6, means not enough correct answers to pass.
                    }
                    temp_bankA.remove(askd_question); // Avoids repetitive questions
                    temp_ansA.remove(askd_question);
                    System.out.println("Score (Part A): " + scoreA + "/" + questions_askedA); // Score & Total score
                    System.out.println("Total score: " + (scoreA + scoreB) + "/" + (questions_askedA + questions_askedB));
                }
                if (!fail) {
                    System.out.println("===== PART B ====="); // Part B questions, randomized from a bank of 10, repeated 6 times
                }
                for (int i = 1; i < 7 && !fail; i++) {
                    int askd_question = (int) (Math.random() * temp_bankB.size()); //Random question from bank's current size, changes size to avoid repetitive questions
                    System.out.println(i + ". " + temp_bankB.get(askd_question));
                    answer = Character.toLowerCase(sc.next().charAt(0));
                    questions_askedB++; // User has successfully been asked a question.
                    if (answer == temp_ansB.get(askd_question)) {// Correct answer has been chosen.
                        scoreB++;
                        System.out.println("CORRECT ANSWER");
                    } else { // Incorrect answer has been chosen.
                        System.out.println("INCORRECT ANSWER");
                    }
                    if (questions_askedB == scoreB + 3) {
                        System.out.println("NOT ENOUGH SCORE TO PASS, TEST FAILED. PLEASE TRY AGAIN.");
                        fail = true; // To terminate test, 3 + 3 = 6, means not enough correct answers to pass.
                    }
                    temp_bankB.remove(askd_question); // Avoids repetitive questions
                    temp_ansB.remove(askd_question);
                    System.out.println("Score (Part B): " + scoreB + "/" + questions_askedB); // Score & Total score
                    System.out.println("Total score: " + (scoreA + scoreB) + "/" + (questions_askedA + questions_askedB));
                }
                if (!fail) {
                    System.out.println("Congratulations! You have successfully passed the test.");
                    float finalScore = scoreA + scoreB;
                    System.out.println("Final score: " + (finalScore / (questions_askedA + questions_askedB)) * 100 + "%");
                    repeat = false;
                }
            } else if (option == 2) { //Logged in as admin
                System.out.println("To log in, enter Admin Password.");
                sc.nextLine();
                String password_attempt = sc.nextLine();
                if (password_attempt.equals(adminPassword)) {
                    System.out.println("a. Add question\nb. Remove question\nc. Return to main menu"); // Option as an admin, add or remove questions & return to main menu
                    char answer = Character.toLowerCase(sc.next().charAt(0));
                    if (answer == 'a') {
                        System.out.println("Choose quiz part (a/b)");
                        char bank_option = Character.toLowerCase(sc.next().charAt(0));
                        System.out.println("Enter full question, with multiple choice answers");
                        String new_question = sc.nextLine();
                        System.out.println("Add correct answer (a/b/c/d)");
                        char new_answer = Character.toLowerCase(sc.next().charAt(0));

                        if (bank_option == 'a') { //Chooses the question bank/answer bank
                            bankA.add(new_question);
                            ansA.add(new_answer);
                        } else if (bank_option == 'b') {
                            bankB.add(new_question);
                            ansB.add(new_answer);
                        } else {
                            System.out.println("Please enter a valid option.");
                        }
                        System.out.println("Question has been added to bank " + bank_option + ".");
                    } else if (answer == 'b') {
                        System.out.println("Choose quiz part (a/b)");
                        char bank_option = Character.toLowerCase(sc.next().charAt(0));
                        if (bank_option == 'a') {
                            for (int i = 0; i < bankA.size(); i++) {
                                System.out.println(i + ": " + bankA.get(i));//Shows questions, user logged in as admin can choose which to remove.
                            }
                            System.out.println("Choose a question to remove, enter index of array list to remove question.");
                            int remove = sc.nextInt();
                            if (remove >= 0 && remove < bankA.size()) {
                                bankA.remove(remove); //Removes "remove"'s index of array list
                                ansA.remove(remove);
                                System.out.println("Question removed.");
                            } else { //Requires an accurate/accessible index
                                System.out.println("Invalid index.");
                            }
                        } else if (bank_option == 'b') {
                            for (int i = 0; i < bankB.size(); i++) {
                                System.out.println(i + ": " + bankB.get(i));//Shows questions, user logged in as admin can choose which to remove.
                            }
                            System.out.println("Choose a question to remove, enter index of array list to remove question.");
                            int remove = sc.nextInt();
                            if (remove >= 0 && remove < bankB.size()) {
                                bankB.remove(remove); //Removes "remove" index of array list
                                ansB.remove(remove);
                                System.out.println("Question removed.");
                            } else { //Requires an accurate/accessible index
                                System.out.println("Invalid index.");
                            }
                        }
                    } else if (answer == 'c') { // Third option, allows while loop (repeat) to continue looping, back to the main menu.
                        System.out.println("Returning to main menu...");
                    }
                } else {
                    System.out.println("Invalid password."); // Invalid admin password
                }
            }
        }
        sc.close();
    }
}