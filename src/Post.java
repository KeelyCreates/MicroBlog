import java.util.Iterator;

public class Post {

//one post to one author (one-to-one)
//one author to many posts (one-to-many)

    //information that will be connected to a post will go here

    //Static variable that stores how many posts have been created
    //So the id of each post is unique
    private static int postCounter = 0;

    private User user;
    private int id;
    private String content;
    private String url;

    //Constructor to create a new Post object with just user and content
    public Post(User user, int id, String content, String url) {
        postCounter++;   //Updates static post counter variable by 1

        this.id = postCounter;  //Sets post id to current post counter value

        //Fills fields with data added with the constructor
        this.user = user;
        this.content = content;
        this.url = url;
    }

    public static int getPostCounter() {return postCounter;}
    public static void setPostCounter(int postCounter) {Post.postCounter = postCounter;}

    public User getUser() {return user; }
    public void setUser(User user) {this.user = user;}

    public int getId() {return id; }
    public void setId(int id) {this.id = id;}

    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}

    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}

    //Getter to return the post id
    public int getID() {return this.id;}

    //Method to override the built-in toString method
    //and display a post in a format of our choosing

    @Override
    public String toString(){
        return user+""+id+""+content+""+url;
    }
  //}

    //public add(Post p) {
    //    posts.add(p);
    //}

    /*
    for(in count = 0; count< posts.size(); count++){
        Post p = (post) posts.get(count); //return (value), 1st object, this makes it type post (forcing the cast)
        System.out.println(p);
        //this allows each post # (sequential) to be pulled and then printed (print individual fields)
     */
}

