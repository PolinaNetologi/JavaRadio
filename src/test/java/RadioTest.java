import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public  void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }
}
