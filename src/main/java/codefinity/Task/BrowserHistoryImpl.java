package codefinity.Task;

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistoryImpl implements BrowserHistory {
    private Deque<String> backStack, forwardStack;
    private String currentUrl;
    public BrowserHistoryImpl(Deque<String> backStack, Deque<String> forwardStack, String initialUrl) {
        this.backStack = backStack;
        this.forwardStack = forwardStack;
        this.currentUrl = initialUrl;
    }
    public BrowserHistoryImpl() {
        backStack = new LinkedList<>();
        forwardStack = new LinkedList<>();
        currentUrl = "";
    }
    @Override
    public void visitPage(String url) {
        backStack.push(currentUrl);
        forwardStack.clear();

        currentUrl = url;
        System.out.println("Currently at: " + currentUrl);

    }

    @Override
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentUrl);
            currentUrl = backStack.pop();
            System.out.println("Go back: " + currentUrl);
        } else {
            System.out.println("Cannot go back. Already at the beginning.");
        }
    }

    @Override
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentUrl);
            currentUrl = forwardStack.pop();
            System.out.println("Go forward: " + currentUrl);
        } else {
            System.out.println("Cannot go forward. Already at the latest page.");
        }
    }

    @Override
    public String getCurrentPage() {
        return currentUrl;
    }
}
