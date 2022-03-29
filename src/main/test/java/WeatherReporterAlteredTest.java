import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.techreturners.encapsulation.bankaccount.model.WeatherReporterAltered;



public class WeatherReporterAlteredTest {
    @Test
    public void checkLocationLondonEightCelsius(){
        //Arrange
        WeatherReporterAltered weatherReporterAltered = new WeatherReporterAltered("London", 8.00);
        String expectedResult = "I am in London, and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 46.4.";
        //Act
        String actualResult = weatherReporterAltered.formatMessage();
        //Assert
       Assertions.assertEquals(expectedResult,  actualResult);
    }

    @Test
    public void checkLocationCaliforniaTenCelsius(){
        //Arrange
        WeatherReporterAltered weatherReporterAltered = new WeatherReporterAltered("California", 40.00);
        String expectedResult = "I am in California, and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 104.";
        //Act
        String actualResult = weatherReporterAltered.formatMessage();
        //Assert
        Assertions.assertEquals(expectedResult,  actualResult);
    }
    @Test
    public void checkLocationCapeTownFiveCelsius(){
        //Arrange
        WeatherReporterAltered weatherReporterAltered = new WeatherReporterAltered("Cape Town", 5.00);
        String expectedResult = "I am in Cape Town, and it is 🌤. It's too cold 🥶!. The temperature in Fahrenheit is 41.";
        //Act
        String actualResult = weatherReporterAltered.formatMessage();
        //Assert
        Assertions.assertEquals(expectedResult,  actualResult);
    }
    @Test
    public void checkLocationKeralaTwentyCelsius(){
        //Arrange
        WeatherReporterAltered weatherReporterAltered = new WeatherReporterAltered("Kerala", 20.00);
        String expectedResult = "I am in Kerala, and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 68.";
        //Act
        String actualResult = weatherReporterAltered.formatMessage();
        //Assert
        Assertions.assertEquals(expectedResult,  actualResult);
    }
}




