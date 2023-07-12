package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Pages;

import org.openqa.selenium.By;

public class ProductGirdPage {
    public By laptop = By.xpath("//androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.view.View");

    public By categories = By.xpath("//androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup/android.view.View");

    public By firstProducts = By.xpath("//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]");

    public By products(int position){
        return By.xpath("//android.view.ViewGroup[" + position + "]/android.view.View");
    }
}
