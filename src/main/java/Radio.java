public class Radio {
    private int currentStation;
    private int getCurrentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }
    public int getGetCurrentVolume () {
        return currentStation;
    }

    public void setGetCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.getCurrentVolume = currentVolume;
    }
}
