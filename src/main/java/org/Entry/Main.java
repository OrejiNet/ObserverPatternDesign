package org.Entry;

import org.Observable.Cat;
import org.Observable.Dog;
import org.Observer.FamilyMember;

public class Main {
    public static void main(String[] args) {


        Dog rex = new Dog("rex");
        FamilyMember emma = new FamilyMember(rex,"emma");
        FamilyMember cris = new FamilyMember(rex,"cris");

        rex.attach(emma);
        rex.attach(cris);

        rex.play();
        rex.sick();

        Cat snowBall = new Cat("snowball");
        FamilyMember rob = new FamilyMember(snowBall,"rob");
        FamilyMember bob = new FamilyMember(snowBall,"bob");

        snowBall.attach(bob);
        snowBall.attach(rob);

        snowBall.hungry();
        snowBall.detach(bob);
        snowBall.thirsty();


    }
}