package activities;

import controlAppium.Button;
import org.openqa.selenium.By;

public class Sleep {

    public Button buttonDone = new Button(By.id("com.google.android.deskclock:id/bedtime_onboarding_done"));
    public Button buttonProgram = new Button(By.id("com.google.android.deskclock:id/wake_clock"));
}
