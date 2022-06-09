
package org.Observer;

import org.Observable.Dog;

public class FamilyMember implements IFamilyMember {

    private Dog pet;
    public String name;

    public FamilyMember(Dog _pet, String _name) {
        pet = _pet;
        name = _name;
    }

    public void update() {
        System.out.println(name+": It seems "+pet.name+" is saying something");
    }



}