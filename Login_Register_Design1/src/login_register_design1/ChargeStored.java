package login_register_design1;
public class ChargeStored {
    private double watts;
    private double voltage;
    private double amperes;
    private int hours;

    public ChargeStored(){
        watts = 0;
        voltage = 0;
        amperes = 0;
        hours = 0;
    }

    public ChargeStored(double wa, double volt, double amp, int hrs){
        this.watts = wa;
        this.voltage = volt;
        this.amperes = amp;
        this.hours = hrs;
    }

    public double getAmperes() {
        return amperes;
    }

    public void setAmperes(double amperes){
        this.amperes = amperes;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage){
        this.voltage = voltage;
    }

    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWattHours(double watts, int hours){
        double WattHours = watts * hours;
        return WattHours;
    }
}
