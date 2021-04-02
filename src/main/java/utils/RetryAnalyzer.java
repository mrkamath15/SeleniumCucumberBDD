package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int count = 0;
    int retryCount = 1;

    //Retry logic - run failed scenario once again
    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count < retryCount) {
            count++;
            return true;
        }
        return false;
    }
}
