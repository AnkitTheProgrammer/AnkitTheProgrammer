package com.company;

interface camera{
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

interface wifi{
    String[] getNetwork();
    void connectToNetwork(String Network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " +phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone extends myCellPhone implements wifi, camera{
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

public class Polymorphism {
    public static void main(String[] args) {
        camera cam = new mySmartPhone();
        cam.record4kVideo();
    }
}
