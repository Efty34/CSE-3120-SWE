package org.example;

public class ChromeDriver implements WebDriver {
    @Override
    public void getElement(){
        System.out.println("Get Element from Chrome Driver");
    }

    @Override
    public void setElement(){
        System.out.println("Set Element from Chrome Driver");
    }
}
