package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    private By colorCheckBox= By.xpath("//span[@id='SPAN__checkmark__107']");
    private By filterButton=By.xpath("//button[@id='filterBtn']");
    private By regionElement=By.id("product_grid");
    private By productDivs=By.cssSelector("#product_grid > div");
    private By productElement=By.id("product_1");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void mainPage(){

    }
    public void filterByColor(){
        driver.findElement(colorCheckBox).click();
        driver.findElement(filterButton).click();
    }
    public WebElement gridRegion(){
        return driver.findElement(regionElement);
    }
    public List<WebElement> getSortedProductList(){
        return driver.findElements(productDivs);
    }

    public void goToProductDetail(){
        driver.findElement(productElement).click();
    }

}
