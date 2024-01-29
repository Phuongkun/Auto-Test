package TestNGdemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
    //Thêm hàm mảng 2 chiêù
    @DataProvider(name = "testData")
    public static Object[][] getData(){
        return new Object[][]{{"admin","123"}, {"nvien","1"}};
    }
   // @Parameters({"username","password"})
    @Test(dataProvider = "testData")
    public void login(String username, String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        //Assert.assertEquals(username,"admin1");
        Assert.assertTrue(username.equals("admin"),"Fail rồi bạn ơi");
    }


}
