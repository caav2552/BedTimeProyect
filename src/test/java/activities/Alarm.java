package activities;

import controlAppium.Button;
import org.openqa.selenium.By;

public class Alarm {
    public Button buttonLess = new Button(By.id("com.google.android.deskclock:id/minus_button"));
    public Button buttonDaySaturday = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[6]"));
    public Button buttonDaySunday = new Button(By.xpath("//android.widget.CheckBox[@content-desc='domingo']"));
    public Button buttonNext = new Button(By.id("com.google.android.deskclock:id/bedtime_onboarding_next"));
}
