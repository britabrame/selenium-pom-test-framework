package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    final int retryLimit = 2;

    @Override
    public boolean retry(ITestResult result) {
        if(counter < retryLimit) {
            counter++;
            return true;
        }
        return false;
    }
}
