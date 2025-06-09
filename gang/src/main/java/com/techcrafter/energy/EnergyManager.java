package com.techcrafter.energy;

public class EnergyManager {
    private int energy;

    public EnergyManager() {
        energy = 0;
    }

    public void storeEnergy(int amount) {
        energy += amount;
    }

    public int getEnergy() {
        return energy;
    }

    public void consumeEnergy(int amount) {
        energy = Math.max(0, energy - amount);
    }
}
