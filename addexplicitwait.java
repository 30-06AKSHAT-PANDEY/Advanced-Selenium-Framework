import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

// Example inside LoginPage
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

public void clickLogin() {
    wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
}
