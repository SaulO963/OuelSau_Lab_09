/**
 * Keeps track of course name and assigned prof
 */
package Uni;

/**
 * Course class
 */
public class Course {

    public String name;
    public Prof prof;

    /**
     * Course Constructor
     * @param n supplies name of course
     * @param p supplies prof assigned to course
     */
    public Course(String n, Prof p){
        this.name = n;
        this.prof = p;
    }

    /**
     * Course name Getter
     * @return returns String of course name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Course prof Getter
     * @return returns Prof object supplied to course
     */
    public Prof getProf(){
        return this.prof;
    }

}
