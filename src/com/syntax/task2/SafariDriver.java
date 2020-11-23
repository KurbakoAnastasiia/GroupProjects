package com.syntax.task2;

public class SafariDriver implements RemoteWebDriver {

    @Override
    public void navigate() {
        System.out.println(getTitle() + " can navigate different URL through Google Chrome Browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println(getTitle() + " can take Screenshot");
    }

    @Override
    public void open() {
        System.out.println(getTitle() + " can open Google Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println(getTitle() + " can close Google Chrome Browser");
    }

    @Override
    public String getTitle() {
        String title = "Safari Driver";
        return title;
    }
}
