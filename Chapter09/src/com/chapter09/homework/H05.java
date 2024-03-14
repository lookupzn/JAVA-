package com.chapter09.homework;

public class H05 {
    public static void main(String[] args) {
        Car car = new Car(37.3);
        car.flow();
    }
}

class Car
{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        //function heat
        public void heat()
        {

        }
        //function cold
        public void freeze()
        {

        }
        public void turnOff()
        {

        }

    }

    //function flow
    public void flow()
    {
        Air air = new Air();
        if (temperature >= 40.0)
        {
            air.freeze();
        }
        else if (temperature <= 0.0)
        {
            air.heat();
        }
        else
        {
            air.turnOff();
        }
    }

}