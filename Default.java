package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning!");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording a 4k video...");
    }
}

interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String Network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " +phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking a picture...");
    }

    public void recordVideo(){
        System.out.println("Recording a video...");
    }

    public String[] getNetwork(){
        System.out.println("Getting a list of available networks...");
        String[] networkList = {"Ankit", "Harry", "John"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to " +network);
    }
    //public void record4kVideo(){
    //    System.out.println("Recording a 4k video in smartphone...");
    //}
}



public class Default {
    public static void main(String[] args) {
        MySmartPhone samsung = new MySmartPhone();
        String[] wifi = samsung.getNetwork();

        for (String item: wifi){
            System.out.println(item);
        }
        samsung.connectToNetwork("Ankit");
        samsung.record4kVideo();
    }
}
