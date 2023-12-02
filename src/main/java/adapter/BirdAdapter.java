package adapter;

public class BirdAdapter implements DuckInterface {

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.sing();
    }
}
