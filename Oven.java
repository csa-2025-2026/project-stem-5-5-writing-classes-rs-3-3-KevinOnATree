public class Oven
{
private int maxTemp;
private int currentTemp;
public Oven(int MaxTemp , int CurrentTemp) {
    if (MaxTemp > 500 || MaxTemp < 0) {
        maxTemp = 500; 
    } else {
        maxTemp = MaxTemp;
    }
    currentTemp = CurrentTemp;
    if (CurrentTemp > MaxTemp) {
        currentTemp = maxTemp;
    } else if (CurrentTemp < 0) {
        currentTemp = 0;
    }
}
public int getMaxTemp() {
    return maxTemp;
}
public int getCurrentTemp() {
    return currentTemp;
}
public void turnOff() {
    if (currentTemp > 0) {
        currentTemp = 0;
    }
}
public boolean isOn() {
    return currentTemp > 0;
}
public void preheat(int temp) {
    
    if (temp > maxTemp) {
        currentTemp = maxTemp;
    } else if (!(temp <= 0)) {
     currentTemp = temp;
    }
}
public String toString() {
    return  "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp;
}
}
