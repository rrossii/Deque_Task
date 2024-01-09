package codefinity;

import codefinity.Task.BrowserHistory;
import codefinity.Task.BrowserHistoryImpl;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistoryImpl();

        System.out.println("Default page: " + browser.getCurrentPage());

        browser.visitPage("https://codefinity.com/url1");
        browser.visitPage("https://codefinity.com/url2");
        browser.visitPage("https://codefinity.com/url3");

        System.out.println("Current Page after visiting 3 pages: " + browser.getCurrentPage());

        browser.goBack();
        browser.goBack();
        browser.goBack();

        System.out.println("Current Page after going back 2 times: " + browser.getCurrentPage());

        browser.goForward();
        browser.goForward();
        browser.goForward();
        browser.goForward();

        System.out.println("Current Page after going forward: " + browser.getCurrentPage());

    }
}