package com.galvanize;

public class Motorcycle {
    private int numOfWheels = 2;

    private int numOfCyl;
    private int engineCC;

    private String color;
    private String make;
    private String model;
    private int year;

    private enum IgnitionSwitchStates {LOCKED, OFF, ACC, ON};
    private IgnitionSwitchStates ignitionState = IgnitionSwitchStates.LOCKED;

    private enum KillSwitchStates {ON, RUN};
    private KillSwitchStates killSwitchState = KillSwitchStates.RUN;

    private enum KickstandStates {UP, DOWN};
    private KickstandStates kickstandState = KickstandStates.DOWN;

    private enum FuelSelectorStates {ON, OFF, RESERVE};
    private FuelSelectorStates fuelSelectorState = FuelSelectorStates.OFF;

    boolean engineRunningState = false;



    public Motorcycle(int year, int numOfCyl,int engineCC, String color, String make, String model) {
        this.numOfCyl = numOfCyl;
        this.engineCC = engineCC;
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;

    }


    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfCyl() {
        return numOfCyl;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public String getBikeInfo() {
        String output = String.format(
                """
                   This motorcycle is:     
                        Year:   %d
                        Make:   %s 
                        Model:  %s
                        Engine: %dcc
                        Color:  %s
                """,
                this.getYear(),
                this.getMake(),
                this.getModel(),
                this.getEngineCC(),
                this.getColor());
        return output;
    }

    public String getBikeState(){
        String output = String.format(
                """
                 Motorcycle Status:     
                   Ignition Switch: %s
                       Kill Switch: %s 
                         Kickstand: %s
                            Engine: %s
                     Fuel Selector: %s
                """,
                this.getIgnitionState().toString(),
                this.getKillSwitchState().toString(),
                this.getKickstandState().toString(),
                this.getEngineState(),
                this.getFuelSelectorState());
        return output;
    }

    public KillSwitchStates getKillSwitchState() {
        return killSwitchState;
    }

    public void setKillSwitchState(KillSwitchStates state) {
        this.killSwitchState = state;
    }

    public IgnitionSwitchStates getIgnitionState() {
        return ignitionState;
    }

    public void setIgnitionState(String state) {
        switch (state){
            case "Locked": this.ignitionState = IgnitionSwitchStates.LOCKED; break;
            case "Off": this.ignitionState = IgnitionSwitchStates.OFF; break;
            case "ACC": this.ignitionState = IgnitionSwitchStates.ACC; break;
            case "On": this.ignitionState = IgnitionSwitchStates.ON; break;
            default: this.ignitionState = IgnitionSwitchStates.LOCKED; break;
        }
    }

    public KickstandStates getKickstandState() {
        return kickstandState;
    }

    public void setKickstandState(KickstandStates kickstandState) {
        this.kickstandState = kickstandState;
    }

    public boolean isEngineRunning() {
        return engineRunningState;
    }

    public String getEngineState(){
        if (isEngineRunning()) {
            return "Running";
        }
        return "OFF";
    }

    public FuelSelectorStates getFuelSelectorState() {
        return fuelSelectorState;
    }

    public void setFuelSelectorState(String state) {
        switch (state){
            case "On": this.fuelSelectorState = FuelSelectorStates.ON; break;
            case "Off": this.fuelSelectorState = FuelSelectorStates.OFF; break;
            case "Reserve": this.fuelSelectorState = FuelSelectorStates.RESERVE; break;
            default: this.fuelSelectorState = FuelSelectorStates.OFF;
        }
    }

    public void setEngineRunningState(boolean state) {
        this.engineRunningState = state;
    }

    public void printBikeInfo(){
        System.out.println(this.getBikeInfo());
        System.out.println(this.getBikeState());
    }

    public boolean canBikeStart(){

        if (getIgnitionState() == IgnitionSwitchStates.ON &&
                getKillSwitchState() == KillSwitchStates.RUN &&
                getKickstandState() == KickstandStates.DOWN &&
                (getFuelSelectorState() == FuelSelectorStates.ON || getFuelSelectorState() == FuelSelectorStates.RESERVE) &&
                isEngineRunning() == false){
            return true;
        }
        return false;

    }

    public void startBike() {
        if (this.canBikeStart()){
            setEngineRunningState(true);
            System.out.println("Engine is running...");
        }
    }

}
