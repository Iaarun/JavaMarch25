package testNgDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

 //   @Test
 //   @Parameters({"username","password"})
    public void login(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
    }

  //  @Test
 //   @Parameters("searchdata")
    public void search(String query) {
        System.out.println("Searching for: " + query);
    }

    @Test
    @Parameters("testMessage")
    public void optionalParamterTest (@Optional("I love selenium")String message){
        System.out.println("Message is: " + message);
    }
}
