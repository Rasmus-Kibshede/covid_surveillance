import java.util.Scanner;

public class UserInterface {

    private Controller controller = new Controller();
    private Scanner scan = new Scanner(System.in);

    public void start() {
        boolean isRunning = true;
        while (isRunning)
            switch (menu()) {
                case 1 -> showData();
                case 2 -> saveToFile();
                case 3 -> loadToFile();
                case 4 -> sort();
                case 5 -> System.out.println("Not working");
                case 9 -> isRunning = false;
            }
    }

    public int menu() {
        printMenu();
        System.out.print("Enter menu number: ");
        System.out.println();
        return getIntFromUser();
    }

    public void printMenu() {
        System.out.println("""
                1) Show data
                2) Save to file
                3) Load from file
                4) sort
                5) create      
                """);
    }

    private void sort() {

    }

    private void loadToFile() {
        controller.loadDataFromFile();
    }

    private void showData() {
        System.out.println(controller.showData());
    }

    private void saveToFile() {

    }

    public int getIntFromUser() {
        int input = scan.nextInt();
        scan.nextLine();
        return input;
    }
}
