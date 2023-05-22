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
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNewSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
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
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);
        int actual = radio.getCurrentVolume();
        int expected = 45;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNewSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
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

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void increaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(54);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 55;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseGetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 98;
        Assertions.assertEquals(expected, actual);
    }
}

