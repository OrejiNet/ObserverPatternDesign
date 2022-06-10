
package org.Observer;

import org.Observable.Dog;
import org.Observable.IPet;

public class FamilyMember implements IFamilyMember {

    private Dog pet;
    public String name;

    public FamilyMember(IPet _pet, String _name) {
        pet = (Dog) _pet;
        name = _name;
    }

    public void update() {
        System.out.println(name+": It seems "+pet.name+" is saying something");
    }



}