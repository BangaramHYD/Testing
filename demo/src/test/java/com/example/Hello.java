package com.example;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println("Srija");

    }
}
