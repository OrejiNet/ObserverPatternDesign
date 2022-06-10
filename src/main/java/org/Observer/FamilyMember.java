
package org.Observer;

import org.Observable.Dog;
import org.Observable.Pet;

public class FamilyMember implements IFamilyMember {

    private Pet pet;
    public String name;

    public FamilyMember(Pet _pet, String _name) {
        pet  = _pet;
        name = _name;
    }

    public void update() {
        System.out.println(name+": It seems "+pet.name+" is saying something");
    }



}