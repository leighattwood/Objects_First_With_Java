
/**
 * Write a description of class Heater here.
 * 
 * @author Leigh Attwood 
 * @version 7/14/2014
 */
public class Heater
{
    private int temperature;
    private int min;
    private int max;
    private int increment;
    
    public Heater(int tempMin, int tempMax)
    {
        temperature = 15;
        min = tempMin;
        max = tempMax;
        increment = 5;
    }
    
    public void warmer()
    {
        if(temperature + increment <= max)
        {
            temperature += increment;
        }
    }
    
    public void cooler()
    {
        if(temperature + increment >= min)
        {
            temperature -= increment;
        }
    }
    
    public int getTemperature()
    {
        return temperature;
    }
    
    public void setIncrement(int incr)
    {
        if(incr > 0)
        {
            increment = incr;
        }
        else
        {
            System.out.println("Please try again with a positive number.");
        }
    }
}
