import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void CAR_클래스_생성_초기위치값_테스트() {
        Car car = new Car();
        assertThat(car.getPosition()).isZero();
    }
}
