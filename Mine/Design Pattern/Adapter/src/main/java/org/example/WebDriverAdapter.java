package org.example;

public class WebDriverAdapter implements WebDriver {
    IEDriver ieDriver;
    public WebDriverAdapter(IEDriver ieDriver){
        this.ieDriver=ieDriver;
    }

    @Override
    public void getElement(){
        ieDriver.findElement();
    }

    @Override
    public void setElement(){
        ieDriver.clickElement();
    }
}
