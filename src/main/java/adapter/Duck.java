package adapter;

public class Duck implements DuckInterface {

    @Override
    public void squeak() {
        System.out.println("quack");
    }
}
