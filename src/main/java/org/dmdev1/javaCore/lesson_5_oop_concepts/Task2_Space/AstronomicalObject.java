package org.dmdev1.javaCore.lesson_5_oop_concepts.Task2_Space;

public abstract class AstronomicalObject implements Printable {

    private String name;
    private long diameterInKm;
    private double massInSolarM;

    public AstronomicalObject(String name, long diameterInKm, double massInSolarM) {
        this.name = name;
        this.diameterInKm = diameterInKm;
        this.massInSolarM = massInSolarM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDiameterInKm() {
        return diameterInKm;
    }

    public void setDiameterInKm(long diameterInKm) {
        this.diameterInKm = diameterInKm;
    }

    public double getMassInSolarM() {
        return massInSolarM;
    }

    public void setMassInSolarM(double massInSolarM) {
        this.massInSolarM = massInSolarM;
    }

    @Override
    public String toString() {
        return "AstronomicalObject{" +
                "name='" + name + '\'' +
                ", diameterInKm=" + diameterInKm +
                ", massInSolarM=" + massInSolarM +
                '}';
    }

}