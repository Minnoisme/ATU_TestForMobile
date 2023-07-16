package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Pages;

import org.openqa.selenium.By;

public class ProductViewPage {
    public By image = By.id("vn.tiki.app.tikiandroid.productDetail2:id/image");

    public By cancelBtn = By.id("vn.tiki.app.tikiandroid.productDetail2:id/pdp3_main_cta_button");

    public By name = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.TextView");

    public By price = By.id("vn.tiki.app.tikiandroid.productDetail2:id/tvPrice");

    public By buy = By.id("vn.tiki.app.tikiandroid.productDetail2:id/pdp3_main_cta_button");
}
