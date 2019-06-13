
import java.util.Iterator;

public class User {
        private int id; //private
        private int postNum;  //private, will be sequential

        private static int userCount;
        private String avatarUrl;
        private String username;
        private String firstName;
        private String lastName;
        private String email;

        //public add(Users u) {
        //users.add(u);
        //}
//Constructor that requires all User fields at creation
        public User (User user, String avatarUrl, String username, String firstName, String lastName, String email)
        {
            userCount++; //creates users in number order
            //reestablish that the variables declared in 'class User'
            // will be connected to these instances of the variables
            this.avatarUrl = avatarUrl;
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String getAvatarUrl() {return avatarUrl;}  //
        public void setAvatarUrl(String avatarUrl) {this.avatarUrl = avatarUrl;}

        public String getUserame() {return username;}
        public void setUserame(String username) {this.username = username;}

        public String getFirstName() {return firstName;}
        public void setFirstName(String firstName) {this.firstName = firstName;}

        public String getLastName() {return lastName;}
        public void setastName(String lastName) {this.lastName = lastName;}

        public String getEmail() {return email;}
        public void setEmail(String email) {this.email = email;}

        @Override
        public String toString(){
            return avatarUrl+""+username+""+firstName+""+lastName+""+email;
        }
        /* public void add(User) {user.add(u);}  //method to create users

            //lines 18-22 code from lesson94 -->Creates ArrayList of type users,
            //ArrayList users = new ArrayList();

         */
         //public ArrayList getUser() {return user;}  //method to store user info into ArrayList
         //Is this where I will create the for loop to cycle/loop through the list?
         //Iterator iter = users.iterator();
         //end code from lesson94
         /*
         for(in count = 0; count< posts.size(); count++){
             User u = (user) user.get(count); //return (value), 1st object, this makes it type post (forcing the cast)
             System.out.println(u);
             //this allows each post # (sequential) to be pulled and then printed (print individual fields)
          */
}
