package codefinity.Task;

public interface BrowserHistory {
    void visitPage(String url);

    void goBack();

    void goForward();

    String getCurrentPage();
}
