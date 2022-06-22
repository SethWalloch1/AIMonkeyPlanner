import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //Main is being used to get the user's choices of where each item's starting location will be
        AIPlanner aiPlanner = new AIPlanner();
        System.out.println("=========================================");        
        Scanner scan = new Scanner(System.in);
        String monkeyStart = "H";
        String boxStart = "H";
        String bananasStart = "H";
        boolean monkeyChecker = true;
        boolean boxChecker = true; 
        boolean bananasChecker = true;

        //Responsible for choosing which room the monkey will start in
        System.out.println();
        System.out.println("Select which room the monkey starts in:");
        System.out.println("[1] Room A");
        System.out.println("[2] Room B");
        System.out.println("[3] Room C");
        while(monkeyChecker){
            System.out.print("==> ");
            monkeyStart = scan.nextLine();
            if(monkeyStart.equals("A") || monkeyStart.equals("B") || monkeyStart.equals("C")){
                monkeyChecker = false;
            }
        }
        System.out.println();

        //Responsible for choosing which room the box will start in
        System.out.println("Select which room the box starts in:");
        System.out.println("[1] Room A");
        System.out.println("[2] Room B");
        System.out.println("[3] Room C");
        while(boxChecker){
            System.out.print("==> ");
            boxStart = scan.nextLine();
            if(boxStart.equals("A") || boxStart.equals("B") || boxStart.equals("C")){
                boxChecker = false;
            }
        }
        System.out.println();

        //Responsible for choosing which room the bananas will start in
        System.out.println("Select which room the bananas starts in:");
        System.out.println("[1] Room A");
        System.out.println("[2] Room B");
        System.out.println("[3] Room C");
        while(bananasChecker){
            System.out.print("==> ");
            bananasStart = scan.nextLine();
            if(bananasStart.equals("A") || bananasStart.equals("B") || bananasStart.equals("C")){
                bananasChecker = false;
            }
        }
        
        System.out.println();
        System.out.println("Plan:");
        aiPlanner.getPlan(monkeyStart, boxStart, bananasStart, "LOW", false);
    }
}