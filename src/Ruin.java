import java.util.Scanner;

public class Ruin {

    public static void main(String args[]) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Start Amount");
    double startAmount = in.nextDouble();
    System.out.print("Enter the Win Probability");
    double winChance = in.nextDouble();
    System.out.print("Enter the Win Limit");
    double winLimit = in.nextDouble();
    System.out.print("Enter the Total Simulation Number");
    double totalSimulations = in.nextDouble();;

    //double startAmount = 500;
    //double winChance = 0.6;
    //double winLimit = 1000;
    //double totalSimulations = 50;

    double SA = startAmount;
    String yourDay = ""; 
    int rounds = 0;

    for (int b = 1; b<=totalSimulations; b++){
    while (startAmount > 0 && startAmount < winLimit){
    double max = 100;
    double min = 1;
    double a = (int)(Math.random()*((max-min) + 1 ));

        if (a >= (winChance*100)){
            startAmount = startAmount + 50;
            //System.out.println("win" + startAmount);
            if (startAmount >= winLimit){
                //System.out.println("You win! Enjoy your day!");
                yourDay = "WIN";
                startAmount = SA;
            }
        }
        else{
            startAmount = startAmount - 50;
            //System.out.println("lose" + startAmount);
             if (startAmount <= 0){
                //System.out.println("You are F**ked");
                yourDay = "LOSE";
                startAmount = SA;
            }
        }
        rounds ++ ;
    }
    System.out.println("Simulation " + b + " : " + rounds + " " + yourDay);
    }
}

}
