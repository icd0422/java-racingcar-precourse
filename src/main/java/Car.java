public class Car {

    private final Position position;
    private static final int GO_SIZE = 1;

    public Car() {
        this.position = new Position(0);
    }

    public Position getPosition() {
        return this.position;
    }

    public void goIfRandomValueIs(int i) {
        if (i >= 4) this.position.plusPosition(GO_SIZE);
    }
}
