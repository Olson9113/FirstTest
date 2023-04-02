import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class UltimateQATest extends PageSetup {



    @Test
   public void testOne() {
      WebElement buttonUsingId = driver.findElement(By.id("idExample"));
      buttonUsingId.click();


      WebElement buttonSuccessText = driver. findElement(By.className("entry-title"));
        Assertions.assertEquals(  "Button success", buttonSuccessText.getText());
    }



}
