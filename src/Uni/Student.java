/**
 * Refer to main
 */
package Uni;

import java.util.Observable;
import java.util.Observer;

/**
 * Student class, observers Professor of the course it registers to
 */
public class Student implements Observer {

    public String name;
    public int roomNumber;
    public Course course;

    /**
     * Student Constructor
     * @param n supplies name of student
     */
    public Student(String n){
        this.name = n;
    }

    /**
     * Student name Getter
     * @return returns String of student name
     */
    public String getName(){
        return name;
    }

    /**
     * Sets the course variable, observes Prof set to Course.
     * @param c supplies Course object to method
     */
    public void registerToCourse(Course c){
        System.out.println(name + " is registering to: " + c.getName());
        this.course = c;
        c.getProf().addObserver(this);
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
        if(arg instanceof Integer){     //We passed an integer... so we must be updating roomNumber!
            roomNumber = (Integer)arg;
            System.out.println("Student " + name + " has a midterm in room number: " + roomNumber + "\n");
            return; //leave!
        }
        //If not integer... must be new Midterm date!! Adding Student to Prof's student list
        System.out.println("Student " + name + " says ..Doh got it dude!");
        System.out.println( ((Prof)o).getName() + " says " + arg + "\n");
        ((Prof)o).takingTheMidterm(this);
    }





}
