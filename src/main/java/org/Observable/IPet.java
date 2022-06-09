package org.Observable;

import org.Observer.IFamilyMember;


public interface IPet {


    void attach(IFamilyMember f);

    void detach(IFamilyMember f);

    void notifyToAll();

    void hungry();

    void thirsty();

    void play();

    void sick();

}