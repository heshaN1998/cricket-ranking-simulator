import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    boolean ruuning=true;
    while(ruuning){
        System.out.println("\n****International Cricket Council Rankings****");
        System.out.println("1. Add Player");
        System.out.println("2. Show Batting Rankings");
        System.out.println("3. Show Balling Rankings");
        System.out.println("4. Update Player Points");
        System.out.println("5. Exit");
        System.out.println("   ENTER YOUR CHOICE: ");

        int choice=input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter Player Name: ");
                String name=input.nextLine();
                System.out.println("Enter Player Team: ");
                String team=input.nextLine();
                System.out.println("Enter Player Type: ");
                String type=input.nextLine();
                System.out.println("Enter Player Marks: ");
                int marks=input.nextInt();
                input.nextLine();

                System.addPlayer(name,team,type,points);
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
            }
        }
    }
}


