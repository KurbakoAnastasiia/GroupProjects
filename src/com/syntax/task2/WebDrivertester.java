package com.syntax.task2;

public class WebDrivertester {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.getTitle();
        chrome.open();
        chrome.navigate();
        chrome.getScreenshot();
        chrome.close();



    }
}
