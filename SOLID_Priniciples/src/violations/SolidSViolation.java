/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S - single responsibility principle - a class should have one and only one reason to change.
 * O -
 * L -
 * I -
 * D -
 */
package violations;

class AccountServices{//This class is handling three responsibilities at a time
    public void openAccount(){
        System.out.println("Fill account internal details");
        System.out.println("Store account object in database");
        System.out.println("Send welcome notification message");
    }
}

public class SolidSViolation {
    public static void main(String[] args) {
        AccountServices services = new AccountServices();
        services.openAccount();
    }
}
