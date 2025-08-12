import java.util.Random;
import static java.lang.Thread.sleep;

public class ZebraRace {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        String[] zebName = {"Jeff", "Dave", "Cabs"};
        int FinishLine = 20;

        int RandMove = 0;
        int round = 1;

        Zebra Zebra1 = new Zebra(zebName[0], 0);
        Zebra Zebra2 = new Zebra(zebName[1], 0);
        Zebra Zebra3 = new Zebra(zebName[2], 0);

        while((Zebra1.getZebPosTrack() < 20) &&  (Zebra2.getZebPosTrack() < 20) && Zebra3.getZebPosTrack() < 20) {
            RandMove = rand.nextInt(3);

            if(RandMove == 0){
                Zebra1.moveForward();
            } else if(RandMove == 1){
                Zebra2.moveForward();
            } else {
                Zebra3.moveForward();
            }

            System.out.println("Round: " + round++);
            System.out.println("Zebra " + Zebra1.getZebraName() + " position: " + Zebra1.getZebPosTrack());
            space(Zebra1.getZebPosTrack());
            System.out.println("\uD83D\uDC0E");
            System.out.println("Zebra " + Zebra2.getZebraName() + " position: " + Zebra2.getZebPosTrack());
            space(Zebra2.getZebPosTrack());
            System.out.println("\uD83D\uDC0E");
            System.out.println("Zebra " + Zebra3.getZebraName() + " position: " + Zebra3.getZebPosTrack());
            space(Zebra3.getZebPosTrack());
            System.out.println("\uD83D\uDC0E");

            sleep(2000);
        }

        if(Zebra1.getZebPosTrack() == 20){
            System.out.println("The winner is Zebra " + Zebra1.getZebraName() +"!");
        } else if(Zebra2.getZebPosTrack() == 20){
            System.out.println("The winner is Zebra " + Zebra2.getZebraName() +"!");
        }  else if(Zebra3.getZebPosTrack() == 20){
            System.out.println("The winner is Zebra " + Zebra2.getZebraName() +"!");
        }
    }

    public static void space(int posTrack){
        for(int i = 0; i < posTrack; i++){
            System.out.print("-");
        }
    }
}
