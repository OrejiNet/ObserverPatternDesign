package org.Observable;
import org.Observer.IFamilyMember;

import java.util.*;


public class Dog implements IPet {


    public Dog(String _name){
        name = _name;
    }

    public String name;
    private List<IFamilyMember> familyMembers = new ArrayList<>();

    public void attach(IFamilyMember f) {
        familyMembers.add(f);
    }

    public void detach(IFamilyMember f) {
        familyMembers.remove(f);
    }

    public void notifyToAll() {
        for (IFamilyMember f : familyMembers) {
            f.update();
        }
    }

    public void hungry() {
        notifyToAll();
        System.out.println("I am hungry");
    }

    public void thirsty() {
        notifyToAll();
        System.out.println("I am thirsty");
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