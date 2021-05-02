import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingCarCollection {

    private final List<Car> racingCars;
    private final Random random = new Random();
    static final String CAR_COUNT_ERR_MSG = "경주할 차량의 대수는 2이상이어야 합니다.";

    public RacingCarCollection(List<Car> racingCars) {
        validateInitPosition(racingCars);
        validateCarCount(racingCars);
        this.racingCars = racingCars;
    }

    private void validateInitPosition(List<Car> racingCars) {
        for (Car car : racingCars) {
            car.checkCarPositionIs(0);
        }
    }

    private void validateCarCount(List<Car> racingCars) {
        if (racingCars == null || racingCars.size() < 2)
            throw new IllegalArgumentException(CAR_COUNT_ERR_MSG);
    }

    public List<Car> getRacingCars() {
        return racingCars;
    }

    public void goAll() {
        for (Car car : racingCars) {
            int randomValue = random.nextInt(9);
            car.goIfRandomValueIs(randomValue);
        }
        printCurrentStatus();
        System.out.println();
    }

    private void printCurrentStatus() {
        for (Car racingCar : racingCars) {
            racingCar.print();
        }
    }

    public List<Car> getHeadCars() {
        int maxPositionValue = -1;
        for (Car racingCar : racingCars) {
            maxPositionValue = racingCar.getPosition().getMaxValueCompareTo(maxPositionValue);
        }

        List<Car> headCars = new ArrayList<>();
        for (Car racingCar : racingCars) {
            if (racingCar.getPosition().getCurrentPos() == maxPositionValue) headCars.add(racingCar);
        }

        return headCars;
    }
}
