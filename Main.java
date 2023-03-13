
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task t1 = new Task("Купить цветы к 8 марта", "Александр", 3, "07.03");
        Task t2 = new Task();
        Task t3 = new Task("Пригласить друзей", "Александр", 3, "07.03");
        Task t4 = new Task("Купить подарки", "Александр", 1, "07.03");
        Task t5 = new Task("Купить продукты", "Александр", 2, "07.03");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        Add add = new Add(scanner);
        UserInterface userInterface = new UserInterface(scanner, menu, myP, add);
        userInterface.start();
        Controller.run();
    }
}
