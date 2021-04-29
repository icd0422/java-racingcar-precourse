public class Car {

    private final Position position;
    private static final int GO_SIZE = 1;
    private static final int GO_BOUNDARY_VALUE = 4;

    public Car() {
        this.position = new Position(0);
    }

    public Position getPosition() {
        return this.position;
    }

    public void goIfRandomValueIs(int i) {
        if (i >= GO_BOUNDARY_VALUE) this.position.plusPosition(GO_SIZE);
    }

    public void checkCarPositionIs(int pos) {
        if (position.getCurrentPos() != pos) throw new IllegalArgumentException("차의 위치가 " + pos + "가(이) 아닙니다.");
    }
}
