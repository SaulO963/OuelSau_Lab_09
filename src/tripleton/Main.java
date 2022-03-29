/**
 * Name: Saul Ouellet
 * Date: Mar 29th 2022
 * Description: Program implements a Tripleton class which only allows for 3 unique instances to
 * be created. Runs some verbose tests to see if instances are indeed unique.
 */
package tripleton;

/**
 * Main class
 */
public class Main {

    /**
     * It's a main, what else is there to say?
     * @param arg supplies args to main
     */
    public static void main(String[] arg){

        System.out.println("\nCreating 4 Tripleton Objects (only 4th one will return 3rd though)");
        Tripleton t1 = Tripleton.getInstance(); //Instance 1
        Tripleton t2 = Tripleton.getInstance(); //Instance 2
        Tripleton t3 = Tripleton.getInstance(); //Instance 3
        Tripleton t4 = Tripleton.getInstance(); //Instance 3 repeat

        System.out.println("\nInstance Address Checking");

        System.out.println("Instance 1: " + t1);
        System.out.println("Instance 2: " + t2);
        System.out.println("Instance 3: " + t3);
        System.out.println("Instance 4: " + t4);

        System.out.println("\nInstance Equality Check");
        System.out.println("t1 == t2 " + (t1 == t2));
        System.out.println("t1 == t3 " + (t1 == t3));
        System.out.println("t1 == t4 " + (t1 == t4));

        System.out.println("\nInstance Equality Check");
        System.out.println("t2 == t3 " + (t2 == t3));
        System.out.println("t2 == t4 " + (t2 == t4));

        System.out.println("\nInstance Equality Check");
        System.out.println("t3 == t4 " + (t3 == t4));

        System.out.println("\nChecking static access to Instances through getInstanceN");
        System.out.println(Tripleton.getInstanceN(1));
        System.out.println(Tripleton.getInstanceN(2));
        System.out.println(Tripleton.getInstanceN(3));
    }

}
