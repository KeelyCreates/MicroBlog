import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    private ArrayList<User> user;
    //ArrayList newUser = newArray;
    int menuChoice;

    //postGenerator postGenerator = newPost();

    public Menu() {

        this.user = new ArrayList();
        this.menuChoice = menuChoice;
    }

    public void run() {
        // Menu Class to:
        // 1--create a user
        // 2--Log-in as a user
        // 3--Write a post
        // 4--Print all posts (ArrayList w/assigned #)  -->Need to create ArrayList
        // 5--Print all users (ArrayList w/assigned user#)  -->Need to create ArrayList
        do {
            System.out.println("Menu: Choose an option 1, 2, 3, 4, or 0 to exit");
            System.out.print("  1 = Create a user");
            System.out.print("  2 = Create a post");
            System.out.print("  3 = Print all posts");
            System.out.print("  4 = Pint all users");
            menuChoice = keyboard.nextInt();
            keyboard.skip("\n");
            switch (menuChoice) {
                case 1:
                    menuChoice = 1;
                    System.out.println("Now creating a new user.");
                    //call User = new User method
                    break;
                case 2:
                    menuChoice = 2;
                    System.out.println("LNow creating a new post");
                    //call Post = New Post method
                    break;
                case 3:
                    menuChoice = 3;
                    System.out.println("Now printing all posts.");
                    //call method:
                    break;
                case 4:
                    menuChoice = 4;
                    System.out.println("Now printing all users.");
                    //call method:
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }while (menuChoice != 0);
        System.out.println("Good-bye");


        private void viewPosts () {
            for (Post post : postLog) {
                System.out.println("-----");
                System.out.println(post.toString());
            }
            System.out.println("-------");
            System.out.println("");
        }

        private void viewUser () {
            for (User user : userLog) {
                System.out.println("--------");
                System.out.println(post.toString());
            }
            System.out.println("----------");
            System.out.println("");
        }
    }
         /*private User createUser() {
        return new User();
    }
    private void menuChoice(int menuChoice) {
        switch (menuChoice) {
            case 1:
                Post post = postGenerator.generatePost();
                break;
            case 2:
                viewPosts();
                break;
        }
        */
}