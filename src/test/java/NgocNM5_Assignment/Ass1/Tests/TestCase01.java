package NgocNM5_Assignment.Ass1.Tests;

import NgocNM5_Assignment.Ass1.Core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase01 extends BaseTest {

    @Test
    public void tc_Exercise01(){
        WebElement notNowBtn = this.driver.findElement(By.id("com.shopstyle:id/skipText"));
        notNowBtn.click();
        WebElement shopMen = this.driver.findElement(By.id("com.shopstyle:id/btnMale"));
        shopMen.click();

        WebElement shoesCategory = this.driver.findElement(By.id("com.shopstyle:id/textView1"));
        shoesCategory.click();

        WebElement lowestPriceTab = this.driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Lowest Price']/android.widget.TextView"));
        lowestPriceTab.click();
        WebElement firstProduct = this.driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.RelativeLayout//android.widget.RelativeLayout/android.widget.TextView"));
        firstProduct.click();

        WebElement noThank = this.driver.findElement(By.id("com.shopstyle:id/no_thanks"));
        noThank.click();
        WebElement productName = this.driver.findElement(By.id("com.shopstyle:id/productTitle"));
        System.out.println("Product Name: " + productName.getText());
        WebElement productPrice = this.driver.findElement(By.id("com.shopstyle:id/sale_price"));
        System.out.println("Product Price: " + productPrice.getText());
        WebElement buyNowBtn = this.driver.findElement(By.id("com.shopstyle:id/buyButton"));
        buyNowBtn.click();
    }

    @Test
    public void tc_Exercise02(){

    }

}
