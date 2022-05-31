/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S - single responsibility principle - a class should have one and only one reason to change.
 * O -
 * L -
 * I -
 * D -
 */
package nonViolations;

class AccountServices {//This class is handling three responsibilities at a time
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();
    public void openAccount(){
        // 1
        System.out.println("Fill account internal details");

        repository.create();

        notificationService.sendNotification();
    }
}

class AccountRepository {
    public void create() {
        // 2
        System.out.println("Store account object in database");
    }
}

class NotificationService {
    public void sendNotification() {
        // 3
        System.out.println("Send welcome notification message");
    }
}

public class SolidS {

    public class SolidSViolations {
        public static void main(String[] args) {
            AccountServices services = new AccountServices();
            services.openAccount();
        }
    }
}




