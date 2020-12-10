import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HolidayShopping extends BaseTest {

    @BeforeClass
    public static void startVisualTestSuite(){
        eyesManager.setBatchName("Holiday Shopping");
        eyesManager.setSequenceName("Sequence");
        driver.get(System.getProperty("site.applifashion.url"));

    }
    @Test()
    public void test1(){

        eyesManager.validateWindow("Test 1", "main page");

    }
    @Test()
    public void test2(){
        HomePage homePage= new HomePage(driver);
       homePage.filterByColor();
//        eyesManager.setStepName("Filter by color");
        eyesManager.validateRegion(homePage.gridRegion(), "Test 2", "filter by color");

        Assert.assertEquals(homePage.getSortedProductList().size(), 2);

    }
    @Test()
    public void test3(){
        HomePage homePage= new HomePage(driver);
        homePage.goToProductDetail();
//        eyesManager.setStepName("Product Detail");
        eyesManager.validateWindow("Test 3", "product details");


    }




}

