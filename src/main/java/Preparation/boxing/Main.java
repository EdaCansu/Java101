package Preparation.boxing;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alex", 10, 80, 89, 60);
        Fighter f2 = new Fighter("Souza", 15, 75, 91, 70);

        Match match = new Match(f1, f2, 85, 100);
        match.run();

    }
}
