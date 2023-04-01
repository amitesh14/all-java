package com.company;

public class motherboard {
    private String manufacturer;
    private int ramSLot;
    private String processor;
    private int memory;
    private int cores;
    private int gpu;

    public motherboard(String manufacturer, int ramSLot, String processor, int memory, int cores, int gpu) {
        this.manufacturer = manufacturer;
        this.ramSLot = ramSLot;
        this.processor = processor;
        this.memory = memory;
        this.cores = cores;
        this.gpu = gpu;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSLot() {
        return ramSLot;
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getCores() {
        return cores;
    }

    public int getGpu() {
        return gpu;
    }
    public void on(){
        System.out.println("laptop is working");

    }
}

