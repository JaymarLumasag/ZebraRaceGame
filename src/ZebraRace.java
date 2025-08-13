/*
*   @psudo
*       1. Input number of participants
*       2. Input participants name
*       3. Start race
*       4. Declare winner
* */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import static java.lang.Thread.sleep;

public class ZebraRace {
    public static void main(String[] args) throws InterruptedException {
        // Create new objects from java utils
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int finishLine = 20;        // Initialize finish line value
        int initialPos = 0;         // Initial position of zebras
        int RandMove = 0;           // Store random integer
        int round = 1;              // Variable round indicator
        int nParticipant = 0;       // Number of participants
        boolean isValid = false;    // Flag to check valid participants
        boolean gameOver = false;   // Flag to check if game is over

        System.out.println("----------------------------------------------");
        System.out.println(" Welcome to your number 1 zebra race game!! ");
        System.out.println("----------------------------------------------");

        // Check whether the number of participants is valid
        while(!isValid) {
            System.out.print("Enter the number of participants: ");
            if (scanner.hasNextInt()) {
                nParticipant = scanner.nextInt();
                if (nParticipant > 1 && nParticipant < 6) {
                    isValid = true;
                } else {
                    System.out.println("Sorry you have input an invalid number of participants!");
                    System.out.println("Please enter a number between 1 and 6");
                    System.out.println("----------------------------------------------------------");
                }
            }
            else{
                System.out.println("Sorry you have input an invalid number of participants!");
                System.out.println("Please enter a valid intger!!");
                System.out.println("----------------------------------------------------------");
                scanner.next();
            }
        }
        // Array to hold Zebra objects for each participant
        Zebra[] zebra = new Zebra[nParticipant];
        // Input the names of the participants
        for (int i = 0; i < nParticipant; i++) {
            System.out.print("Enter the name of zebra " + (i + 1) + ": ");
            String zebraName = scanner.next();
            // Instantiate new objects
            zebra[i] = new Zebra(zebraName, initialPos);
        }
        // Display the list of participants to check if new instance were created
        System.out.println("List of participants");
        for (Zebra z : zebra) {
            String zebraName1 = z.getZebraName();
            System.out.println("Zebra " + zebraName1);
        }

        int winner = 0;         // Variable to store winner
        //Actual game process
        while (!gameOver) {
            // Display the status of the zebra participants
            System.out.println("Round: " + (round++));
            for (int j = 0; j < nParticipant; j++) {
                System.out.println("Zebra " + zebra[j].getZebraName() + " position: " + zebra[j].getZebPosTrack());
                space(zebra[j].getZebPosTrack());
                // Display horse emoji - No zebra emoji available
                System.out.println("\uD83D\uDC0E");
            }
            RandMove = rand.nextInt(nParticipant);
            // To increment zebra positions randomly until the finish line
            if(zebra[RandMove].getZebPosTrack() < finishLine) {
                zebra[RandMove].moveForward();
            } else {
                gameOver = true;
                winner = RandMove;
            }
            System.out.println("-----------------------------------------------");
            // Delay 1 second before new positions
            sleep(1000);
        }
        // Display winner
        System.out.println("Winner : " + zebra[winner].getZebraName());
        scanner.close();
    }
    // Method to create dashes to indicate zebra position
    public static void space(int posTrack){
        for(int i = 0; i < posTrack; i++){
            System.out.print("-");
        }
    }
}
