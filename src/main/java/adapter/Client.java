package adapter;

public class Client {

    public static void main(String[] args) {

        DuckInterface duck = new Duck();

        // Wrap a bird in a birdAdapter so that it
        // behaves like duck
        DuckInterface fakeDuck = new BirdAdapter(new Bird());


        System.out.println("Duck...");
        duck.squeak();

        // duck behaving like a bird
        System.out.println("Duck behaving like a bird...");
        fakeDuck.squeak();
    }
}
