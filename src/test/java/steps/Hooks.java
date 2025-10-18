package steps;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import support.PlaywrightManager;

public class Hooks {

    @Before
    public void beforeScenario() {
        PlaywrightManager.launch();
    }

    @After
    public void afterScenario() {
        PlaywrightManager.close();
    }
}
