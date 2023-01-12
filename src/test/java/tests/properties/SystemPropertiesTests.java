package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void simplePropertyTest(){
        String browserName= System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property")
    void simpleProperty4Test(){
        String browserName = System.getProperty("browser","firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("hello")
    void simpleProperty5Test(){
        System.out.println("Hello, " + System.getProperty("user_name","unknown student"));
    }
}
