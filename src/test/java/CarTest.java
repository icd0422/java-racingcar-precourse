import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {
    @Test
    void CAR_클래스_생성_초기위치값_테스트() {
        Car car = new Car();
        assertThat(car.getPosition().getCurrentPos()).isZero();
    }

    @Test
    void Position_클래스_음수값_생성_예외처리_테스트() {
        assertThat(new Position(0).getCurrentPos()).isZero();
        assertThat(new Position(1).getCurrentPos()).isEqualTo(1);

        assertThatThrownBy(() -> new Position(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith(Position.NOT_POSITIVE_VALUE_ERR_MSG);
    }
}
