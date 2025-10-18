package steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import lombok.extern.slf4j.Slf4j;
import support.PlaywrightManager;

@Slf4j
public class Hooks {

    private Page page;

    @Before
    public void setUp() {
        long id = Thread.currentThread().getId();
        log.info("========== [Thread-{}] Scenario START ==========", id);
        page = PlaywrightManager.getPage();
        log.info("[Thread-{}] Browser started successfully", id);
    }

    @After
    public void tearDown() {
        long id = Thread.currentThread().getId();
        log.info("[Thread-{}] Scenario END — closing Playwright...", id);
        PlaywrightManager.close();
        log.info("[Thread-{}] tearDown completed, scenario fully finished", id);
    }

    @AfterAll
    public static void afterAll() {
        log.info("All scenarios finished — cleaning up Playwright only.");
        try {
            support.PlaywrightManager.close();
        } catch (Exception e) {
            log.error("Error during global cleanup", e);
        }
    }

}
