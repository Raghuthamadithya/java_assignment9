package com.company;

public class Project {
    private BackEndDeveloper bd=new BackEndDeveloper();
    private FrontEndDeveloper fd=new FrontEndDeveloper();
    public void implement()
    {
        bd.writeJava();
        fd.writeJavaScript();
    }
}
