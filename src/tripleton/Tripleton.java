/**
 * Refer to main
 */
package tripleton;

/**
 * Tripleton Class, holds 3 private static Tripleton object
 */
public class Tripleton{

    private static Tripleton t1;
    private static Tripleton t2;
    private static Tripleton t3;

    /**
     * Private Tripleton constructer, cannot be called by main
     */
    private Tripleton(){
        System.out.print("Tripleton #");
    }

    /**
     * Method used to call private constructor, limits up to 3 legal instances, returns 3rd if
     * called passed 3 times
     * @return returns newly created Tripleton object
     */
    public static Tripleton getInstance(){
        if(t1 == null) {
            t1 = new Tripleton();
            System.out.println("1 created! Returning Tripleton 1");
            return t1;
        }
        if(t2 == null) {
            t2 = new Tripleton();
            System.out.println("2 created! Returning Tripleton 2");
            return t2;
        }
        if(t3 == null) {
            t3 = new Tripleton();
            System.out.println("3 created! Returning Tripleton 3");
            return t3;
        }
        return t3;
    }

    /**
     * Returns particular Tripleton instance between 1 - 3, returns null if instance
     * not created yet or if out of bound
     * @param n supplies number of instance to function
     * @return returns specific Tripleton instance
     */
    public static Tripleton getInstanceN(int n){
        if(n < 1 || n > 3){
            System.out.println("No Tripleton under 1 or above 3, returning null");
            return null;
        }
        if(n == 1 && t1 != null){
            System.out.println("Returning Tripleton 1");
            return t1;
        }
        if(n == 2 && t2 != null){
            System.out.println("Returning Tripleton 2");
            return t2;
        }
        if(n == 3 && t3 != null){
            System.out.println("Returning Tripleton 3");
            return t3;
        }
        System.out.println("t" + n + " instance doesn't exist yet, returning null");
        return null;
    }

}
