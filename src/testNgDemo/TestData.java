package testNgDemo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "testData")
    public Object[][] testDataProvider(){
        Object[][] data = new Object[3][2];
        data[0][0] = "user1";
        data[0][1] = "pass1";
        data[1][0] = "user2";
        data[1][1] = "pass2";
        data[2][0] = "user3";
        data[2][1] = "pass3";

        return data;
    }
}
