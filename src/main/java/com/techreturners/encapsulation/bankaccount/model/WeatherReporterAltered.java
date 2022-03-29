package com.techreturners.encapsulation.bankaccount.model;
import java.text.MessageFormat;

public class WeatherReporterAltered {
    //properties
    private String location;
    private double temperature;
    private static final double CONVERTTOFAHRENHEIT = (9.0 / 5.0);
    private static final double CONVERSIONTOADD = 32;
    private static final String LONDON = "London";
    private static final String CALIFORNIA = "California";
    private static final String CAPETOWN = "Cape Town";
    private static final double THIRTYCELSIUS = 30;
    private static final double TENCELSIUS = 10;


    //constructor
    public WeatherReporterAltered(String location, double temperature) {
    this.location = location;
    this.temperature = temperature;
    }

    public String formatMessage(){

        double newTemp = CONVERTTOFAHRENHEIT * temperature + CONVERSIONTOADD;
        return MessageFormat.format("I am in {0}, and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocation(), checkTemperature(), newTemp);
    }

    private String checkLocation(){
        if(location.equals(LONDON)){

            return "🌦";

        }else if (location.equals(CALIFORNIA)){

            return "🌅";
        }else if (location.equals(CAPETOWN)){

            return "🌤";
        }
        return "🔆";
    }

    private String checkTemperature(){
        if (temperature > THIRTYCELSIUS){

            return "It's too hot 🥵!";

        } else if (temperature < TENCELSIUS){

            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }
}
