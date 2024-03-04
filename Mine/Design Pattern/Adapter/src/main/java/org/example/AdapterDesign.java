package org.example;

public class AdapterDesign {
    public static void main(String [] args){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getElement();
        chromeDriver.setElement();

       IEDriver ieDriver = new IEDriver();
//        ieDriver.findElement();
//        ieDriver.clickElement();

        WebDriverAdapter webDriverAdapter = new WebDriverAdapter(ieDriver);
        webDriverAdapter.getElement();
        webDriverAdapter.setElement();
    }
}
