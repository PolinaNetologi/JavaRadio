package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int actual = radio.getCurrentVolume();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


}

