package testNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersDemo {

    @Test(dataProvider = "testData",dataProviderClass = TestData.class)
    public void login(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
    }


}


