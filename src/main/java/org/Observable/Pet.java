package org.Observable;

import org.Observer.IFamilyMember;

import java.util.ArrayList;
import java.util.List;


public abstract class  Pet {

    private List<IFamilyMember> familyMembers = new ArrayList<>();

    public String name = null;

    public Pet(String _name) {
        name = _name;
    }

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



}