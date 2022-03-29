/**
 * Name: Saul Ouellet
 * Date: Mar 29th 2022
 * Description: Program simulates a University - tests observer pattern. Creates an Observable Prof class
 * that is observed by Observer Student and Observer Secretary class.
 */

package Uni;

import java.util.Date;

/**
 * University class creates students, a prof, a course, and a secretary. Tests observer pattern
 * by having students register to course -> observer prof, secretary register to prof -> observe prof,
 * then having the prof set a midterm date
 */
public class University {

    /**
     * It's a main, what else is there to say?
     * @param args supplies args to main
     */
    public static void main(String[] args){

        Prof g = new Prof("Greg");

        Course c = new Course("CS321",g);

        Student s1 = new Student("Kramer");
        Student s2 = new Student("Elaine");
        Student s3 = new Student("Jerry");
        Student s4 = new Student("George");

        Secretary s = new Secretary();

        s.registerToProf(g);

        s1.registerToCourse(c);
        s2.registerToCourse(c);
        s3.registerToCourse(c);
        s4.registerToCourse(c);

        g.setMidterm(new Date());

        g.printMidtermStudents();

    }

}
