package prs;


public class Vehicle {
    private String plateNumber;
    private String colour;

    public Vehicle(String plateNumber, String colour){
        this.plateNumber = plateNumber;
        this.colour = colour;

    }


    public String getPlateNumber() {
        return plateNumber;
    }


    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }


    public String getColour() {
        return colour;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }


}