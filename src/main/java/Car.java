import java.util.List;

public class Car {

    private final Position position;
    private final String name;
    private static final int GO_SIZE = 1;
    private static final int GO_BOUNDARY_VALUE = 4;

    public Car(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void insertHeadCarsIfMaxValue(List<Car> headCars, int maxPositionValue){
        if (this.position.getCurrentPos() == maxPositionValue) headCars.add(this);
    }

    public void print() {
        System.out.print(this.name + ":");
        for (int i = 0; i < position.getCurrentPos(); i++) System.out.print("-");
        System.out.println();
    }
}
