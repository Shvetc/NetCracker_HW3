package com.netcracker.horstmannbigjava.ch8.p8_1;

public class ComboLock {
    private int[] secrets;
    private int[] numbers;
    private int dial;
    private int countNumbers;

    public ComboLock(int secret1, int secret2, int secret3) {
        secrets = new int[3];
        numbers = new int[3];
        secrets[0] = secret1;
        secrets[1] = secret2;
        secrets[2] = secret3;
    }

    public void reset() {
        dial = 0;
        if (numbers.length != 0) {
            numbers[0] = 0;
            numbers[1] = 0;
            numbers[2] = 0;
        }
    }

    public void turnLeft(int ticks) {
        if (countNumbers == 1) {
            int currentDial = dial - ticks;
            dial = (currentDial < 0) ? 40 + currentDial : currentDial;
            numbers[countNumbers] = dial;
        }
        countNumbers++;
    }

    public void turnRight(int ticks) {
        if ((countNumbers == 0) || (countNumbers == 2)) {
            int currentDial = dial + ticks;
            dial = getCorrectDirectionOfDial(currentDial);
            numbers[countNumbers] = dial;
        }
        countNumbers++;
    }

    private int getCorrectDirectionOfDial(int currentDial) {
        return (currentDial >= 0) ? updateDirectionIfNewRound(currentDial) : 40 + currentDial;
    }

    private int updateDirectionIfNewRound(int currentDial) {
        return currentDial > 40 ? currentDial - 40 : currentDial;
    }

    public boolean open() {
        return ((numbers[0] == secrets[0]) && (numbers[1] == secrets[1]) && (numbers[2] == secrets[2]));
    }

}
