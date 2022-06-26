package org.Observable;


public class Dog extends Pet {


    public Dog(String _name){
        super(_name);
    }

    public void play() {
        notifyToAll();
        System.out.println("I want to play");
    }

    public void sick() {
        notifyToAll();
        System.out.println("I feel sick");
    }




}