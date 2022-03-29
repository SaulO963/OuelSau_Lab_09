/**
 * Observable Prof class will update it's observers of a new Midterm Date and its Room Number.
 * Has a name and a collection of students attending their class
 */
package Uni;

import java.util.*;

/**
 * Prof Class
 */
public class Prof extends Observable {

    public String name;
    public int roomNumber;
    public Date midterm = null;
    public ArrayList<Student> students = new ArrayList<Student>();

    /**
     * Prof Constructor
     * @param n supplies name to constructor
     */
    public Prof(String n){
        this.name = n;
    }

    /**
     * Sets new midterm date to class, notifies all observers
     * @param date supplies Date object to method
     */
    public void setMidterm(Date date){
        System.out.println("\n" + name + " declares the midterm date to be: " + date + "\n");
        midterm = date;
        setChanged();
        notifyObservers(date);
    }

    /**
     * Sets new room number to class, notifies all observers
     * @param rn supplies room number int to method
     */
    public void setRoomNumber(int rn){
        System.out.println(name + " declares the Room Number to be: " + rn + "\n");
        roomNumber = rn;
        setChanged();
        notifyObservers(rn);
    }

    /**
     * name Getter
     * @return returns String of name
     */
    public String getName(){
        return name;
    }

    /**
     * Adds student to collection of students
     * @param obj supplies obj to function (casted to student since we're adding it to our collection)
     */
    public void takingTheMidterm(Observer obj){
        students.add((Student)obj);
    }

    /**
     * Prints all students from collection
     */
    public void printMidtermStudents(){
        Iterator iter = students.iterator();
        System.out.println("All students taking midterm: ");
        while(iter.hasNext()){
            Student s = (Student)iter.next();
            System.out.println(s.getName());
        }

    }


}
