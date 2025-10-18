package support;
import com.microsoft.playwright.*;

public final class PlaywrightManager {

    private static final ThreadLocal<Playwright> PW = ThreadLocal.withInitial(Playwright::create);
    private static final ThreadLocal<Browser> BROWSER = new ThreadLocal<>();
    private static final ThreadLocal<BrowserContext> CTX = new ThreadLocal<>();
    private static final ThreadLocal<Page> PAGE = new ThreadLocal<>();

    private PlaywrightManager() {}

    /** Uruchamia Firefoxa (widoczne okno) per wątek/scenariusz */
    public static void launch() {
        Playwright pw = PW.get();

        // ✅ Firefox + widoczne okno
        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
                .setHeadless(false);

        Browser browser = pw.firefox().launch(options);
        BROWSER.set(browser);

        BrowserContext context = browser.newContext();
        CTX.set(context);

        Page page = context.newPage();
        PAGE.set(page);
    }

    /** Zwraca aktywną stronę dla bieżącego wątku */
    public static Page getPage() {
        Page p = PAGE.get();
        if (p == null)
            throw new IllegalStateException("Playwright not launched. Call PlaywrightManager.launch() first.");
        return p;
    }

    /** Zamyka tylko instancje bieżącego wątku */
    public static void close() {
        try {
            if (PAGE.get() != null) PAGE.get().close();
            if (CTX.get() != null) CTX.get().close();
            if (BROWSER.get() != null) BROWSER.get().close();
            if (PW.get() != null) PW.get().close();
        } finally {
            PAGE.remove();
            CTX.remove();
            BROWSER.remove();
            PW.remove();
        }
    }
}
