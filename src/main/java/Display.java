public class Display {
private double sizeInches;
private String resolution;
private boolean isOn;

    public Display(double sizeInches, String resolution){
        this.sizeInches = sizeInches;
        this.resolution = resolution;
        this.isOn = false;
    }

    public String turnOn(){
        isOn = true;
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
        
    }

    public String turnOff(){
        isOn = false;
        return "Display turned off.";
        }

    public double getSizeInches() {
        return this.sizeInches;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public String getResolution() {
        return this.resolution;
    }

    @Override
    public String toString(){
        return "Display: " + this.sizeInches + "inches, "+ this.resolution;
    }    
}
