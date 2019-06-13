import java.util.Scanner;

public class BlogGenerator {
    private Scanner keyboard;

    public BlogGenerator() {

        this.keyboard = new Scanner(System.in);
    }

    //building blog,

    public BlogGenerator(){

        Post post = createPost();
        String confirm;
        Post newPost;

        do{
            newPost = createPost(post);
            System.out.println("\n" + newPost.toString() + "\n");
            System.out.println("Do you want to continue? (Enter y for yes");
            confirm = keyboard.nextLine();
        }while(!confirm.toLowerCase().equals("y"));
        return newPost;
    }


    //generating posts
    private Post createUser(){
        return new User(String avatarUrl, String username, String firstName, String lastName, String email);
    }

    //creating users
    public Post createPost(User user){
        System.out.println("Create a title for your post: ");
        String title = keyboard.nextLine();
        System.out.println("Create content for your post: ");
        String content = keyboard.nextLine();
        return new Post();
    }

}
