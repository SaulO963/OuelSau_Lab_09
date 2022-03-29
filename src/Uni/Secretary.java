/**
 * Refer to main
 */
package Uni;

import java.util.Observable;
import java.util.Observer;
import java.util.Date;
import java.util.Random;

/**
 * Secretary class, can register and observe prof, takes note of new date wanted from prof,
 * gives a random room number back
 */
public class Secretary implements Observer {

    public Date date;

    /**
     * Observes given prof for updates
     * @param p supplies Prof object to method
     */
    public void registerToProf(Prof p){
        p.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an Observable object's
     * notifyObservers method to have all the object's
     * observers notified of the change.
     *
     * @param o the observable object.
     * @param arg an argument passed to the notifyObservers
     * method.
     */
    @Override
    public void update(java.util.Observable o, Object arg) {
        if(arg instanceof Integer){     //We passed an integer... so ignore!
            return; //leave!
        }
        this.date = (Date)arg;
        System.out.println("Secretary set new Date " + date); //If not integer... new Midterm Date!
        Random rand = new Random(); //get a random room number
        int r = rand.nextInt((10 - 1) + 1) + 1;
        System.out.println("Secretary tells prof the room number is: " + r + "\n");
        ((Prof)o).setRoomNumber(r);
    }



}
