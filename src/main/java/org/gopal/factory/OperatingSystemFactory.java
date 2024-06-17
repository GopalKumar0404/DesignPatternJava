package org.gopal.factory;

public class OperatingSystemFactory {

    public OperatingSystem getInstance(String str) {
        if (str.equals("Android")) {
            return new Android();
        } else if (str.equals("Windows"))
            return new Windows();
        else if (str.equals("Mac")) {
            return new Mac();
        } else {
            System.out.println("No Defined instance provided, returning default instance of Android");
            return new Android();
        }
    }
}
