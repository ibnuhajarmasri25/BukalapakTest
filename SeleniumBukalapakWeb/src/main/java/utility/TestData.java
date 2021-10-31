package utility;

import configs.Constant;

public class TestData {

    public static String url;
    public static String username;
    public static String password;
    public static String isHeadless = Constant.no;
    public static String isHeadlessYes = Constant.yes;
    public static String waitElement;
    public static int timeInSeconds;
    public static String closeBrowserEveryScenario = Constant.no;


    //Configuration Browser
    public String getIsHeadlessYes() {
        return isHeadlessYes;
    }

    public void setIsHeadlessYes(String isHeadlessYes) {
        TestData.isHeadlessYes = isHeadlessYes;
    }


    public String getIsHeadless() {
        return isHeadless;
    }

    public void setIsHeadless(String isHeadless) {
        TestData.isHeadless = isHeadless;
    }

    //Url Setting
    public String getUrl() {
        return url;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        TestData.username = username;
    }
    public void setPassword(String password) {
        TestData.password = password;
    }
    public void setUrl(String url) {
        TestData.url = url;
    }
    public String getCloseBrowserEveryScenario() {
        return closeBrowserEveryScenario;
    }
    public void setCloseBrowserEveryScenario(String closeBrowserEveryScenario) {
        if (TestData.isHeadlessYes.equalsIgnoreCase(Constant.yes)
                && closeBrowserEveryScenario.equalsIgnoreCase(Constant.no)) {
            closeBrowserEveryScenario = Constant.yes;
        }
        TestData.closeBrowserEveryScenario = closeBrowserEveryScenario;
    }
}
