package lv.rcs.bootcamp.interfaces;

public class UsersMain {

    public static void main(String[] args) {
        UserService userService
                = new UserService(new MongoDbOperations());

        boolean result = userService.isUserRegistered(12);

        System.out.println("isRegistered: " + result);

        ///

    }
}
