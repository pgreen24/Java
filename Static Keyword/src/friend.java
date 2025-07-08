public class friend {
    String name;
    static int numberofFriends;

    friend(String name) {
        this.name = name;
        ++numberofFriends;
    }

    static void displayFriends() {
        System.out.println("you have " + numberofFriends + " friends");
    }
}
