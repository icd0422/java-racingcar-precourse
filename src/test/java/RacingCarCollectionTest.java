import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarCollectionTest {
    @Test
    void RacingCarCollection_생성자_테스트() {
        RacingCarCollection racingCarCollection = new RacingCarCollection(Arrays.asList(new Car(), new Car(), new Car()));
        assertThat(racingCarCollection.getRacingCars().size()).isEqualTo(3);
    }
}
