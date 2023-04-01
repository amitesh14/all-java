package com.company;

public class room {
    private int doors;
    private int windows;
    private Objects furnitures;
    private int beds;


    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public Objects getFurnitures() {
        return furnitures;
    }

    public int getBeds() {
        return beds;
    }

    public room(int doors, int windows, Objects furnitures, int beds) {
        this.doors = doors;
        this.windows = windows;
        this.furnitures = furnitures;
        this.beds = beds;
    }

}
