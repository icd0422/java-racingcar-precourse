import java.util.List;

public class RacingCarCollection {

    private final List<Car> racingCars;

    public <T> RacingCarCollection(List<Car> racingCars) {
        this.racingCars = racingCars;
    }

    public List<Car> getRacingCars() {
        return racingCars;
    }
}
