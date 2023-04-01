package com.company;

public class camera {
    private String camera;
    private int mP;
    private boolean flashlight;

    public camera(String camera, int mP, boolean flashlight) {
        this.camera = camera;
        this.mP = mP;
        this.flashlight = flashlight;
    }

    public String getCamera() {
        return camera;
    }

    public int getmP() {
        return mP;
    }

    public boolean isFlashlight() {
        return flashlight;
    }
}
class speaker{
    private String manufacturer;
    private  int number;

    public speaker(String manufacturer, int number) {
        this.manufacturer = manufacturer;
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumber() {
        return number;
    }
}
class battery{
    private int manufacturer;
    private int capacity;
    private int battery_level;
    private boolean isCharging;

    public battery(int manufacturer, int capacity, int battery_level, boolean isCharging) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.battery_level = battery_level;
        this.isCharging = isCharging;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBattery_level() {
        return battery_level;
    }

    public boolean isCharging() {
        return isCharging;
    }
}