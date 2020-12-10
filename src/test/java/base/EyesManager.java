package base;

import com.applitools.ICheckSettings;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.config.Configuration;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class EyesManager {
    private Eyes eyes;
    private String appName;
    private WebDriver driver;
    private BatchInfo batchInfo;

    public EyesManager(WebDriver driver){
        this.driver = driver;

        this.appName = "AppliFashion";

        eyes = new Eyes(new VisualGridRunner());
        String desktopBaseline = "desktop baseline";
        String mobileBaseline = "mobile baseline";


        Configuration suiteConfig = new Configuration();
        suiteConfig
                // Visual Grid configuration
                .addBrowser(1200, 800, BrowserType.CHROME, desktopBaseline)
                .addBrowser(1200, 800, BrowserType.FIREFOX, desktopBaseline)
                .addBrowser(1200, 800, BrowserType.SAFARI, desktopBaseline)
                .addBrowser(1200, 800, BrowserType.EDGE_CHROMIUM, desktopBaseline)
                .addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT, mobileBaseline)
                .setMatchLevel(MatchLevel.LAYOUT);

        eyes.setConfiguration(suiteConfig);
        eyes.setApiKey(System.getProperty("applitools.api.key"));
    }

    public void setBatchName(String batchName){

        batchInfo = new BatchInfo(batchName);
        eyes.setBatch(batchInfo);
    }

    public void setSequenceName(String name){
        batchInfo.setSequenceName(name);
    }


    public void validateWindow(String testName, String tag){
        eyes.open(driver, appName, testName);
        eyes.checkWindow(tag);
        eyes.close();
    }

    public void validateRegion(WebElement element, String testName, String tag){
        eyes.open(driver, appName, testName);
        eyes.checkRegion(element, tag);
        eyes.close();
    }


    public void abort(){
        eyes.abortIfNotClosed();
    }

    }

