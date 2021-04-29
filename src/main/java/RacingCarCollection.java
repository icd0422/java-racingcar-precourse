import java.util.List;
import java.util.Random;

public class RacingCarCollection {

    private final List<Car> racingCars;
    private final Random random = new Random();

    public <T> RacingCarCollection(List<Car> racingCars) {
        this.racingCars = racingCars;
    }

    public List<Car> getRacingCars() {
        return racingCars;
    }

    public void goAll() {
        for (Car car : racingCars) {
            int randomValue = random.nextInt(9);
            car.goIfRandomValueIs(randomValue);
        }
    }
}
