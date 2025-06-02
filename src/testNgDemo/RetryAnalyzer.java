package testNgDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    int retryCount = 3; // Number of retries

    @Override
    public boolean retry(ITestResult iTestResult) {

        if (counter < retryCount) {
            counter++;
            System.out.println("Retrying test " + iTestResult.getName() + " for the " + counter + " time.");
            return true; // Retry the test
        }
        return false; // Do not retry the test anymore

    }
}

