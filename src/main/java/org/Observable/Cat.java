package org.Observable;

import org.Observer.IFamilyMember;

public class Cat extends Pet  {


    public Cat(String _name) {
        super(_name);
    }

    public void hungry() {
        notifyToAll();
        System.out.println("I am hungry");
    }

    public void thirsty() {
        notifyToAll();
        System.out.println("I am thirsty");
    }



}
