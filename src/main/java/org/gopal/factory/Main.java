package org.gopal.factory;

public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OperatingSystem operatingSystem = operatingSystemFactory.getInstance("Macjjk");
        operatingSystem.showSpec();
    }
}
