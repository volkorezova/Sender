import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by tatyanavolkorezova on 25.05.17.
 */
public class SimpleTest {
    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;


    @BeforeTest
    public void setUp() {

    }

    @Test
    public void searchItemTest(){
        MainPage mainPage = new MainPage(/*driver*/);
        SearchResultsPage searchResultPage = mainPage.performSearch("Artdeco");
        searchResultPage.waitForSearchResults();
        List<WebElement> links = driver.findElements(By.partialLinkText("Artdeco"));
        for (WebElement link : links) {
            assertTrue(link.getText().contains("Artdeco"));
        }
        searchResultPage.checkNumberOfItemsPerSearchPage();
        searchResultPage.checkItemLinkContainsTrademark();
        searchResultPage.clickFirstItemLink();weaf,dhmabsfjhgmdxcvbsdf
    }
}wesfdcasdf

@test
gvlhbkjnlkm

        test


