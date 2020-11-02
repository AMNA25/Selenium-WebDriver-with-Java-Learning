package navigation;

import base.baseTests;
import org.testng.annotations.Test;

public class NavigationTests extends baseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTabs(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().swithcToTab("New Window");

    }
}
