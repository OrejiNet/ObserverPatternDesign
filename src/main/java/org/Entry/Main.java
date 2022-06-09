package org.Entry;

import org.Observable.Dog;
import org.Observer.FamilyMember;

public class Main {
    public static void main(String[] args) {


        Dog rex = new Dog("rex");
        FamilyMember emma = new FamilyMember(rex,"emma");
        //FamilyMember cris = new FamilyMember(rex,"cris");

        rex.attach(emma);
        //rex.attach(cris);

        rex.play();
        rex.sick();


    }
}