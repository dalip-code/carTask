package car;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SplitCarName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        // Initialize the WebDriver (in this case, ChromeDriver)
        WebDriver driver = new ChromeDriver();
        	
        // Navigate to the webpage
        driver.get("https://car.com"); // 
        
        // Find all elements with the class name "cars"
        List<WebElement> carElements = driver.findElements(By.className("cars"));
        
        // Initialize two lists to store car names
        List<String> shortCarNames = new ArrayList<>();
        List<String> longCarNames = new ArrayList<>();
        
        // Loop over the car elements and split names
        for (WebElement carElement : carElements) {
            String carName = carElement.getText().trim();
            
            if (carName.length() < 3) {
                // Add to the list of short car names
                shortCarNames.add(carName);
            } else {
                // Add to the list of long car names
                longCarNames.add(carName);
            }
        }
        
        // Print the short car names
        System.out.println("Short Car Names:");
        for (String name : shortCarNames) {
            System.out.println(name);
        }
        
        // Print the long car names
        System.out.println("\nLong Car Names:");
        for (String name : longCarNames) {
            System.out.println(name);
        }
        
        // Close the WebDriver
        driver.quit();
    }

	}


