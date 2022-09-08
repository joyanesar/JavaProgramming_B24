package Practice1;

public class Movie {
    public static void main(String[] args) {

        String      movieName       = "TiTaniC";
        int         generation      =   4;
        String      duration        =  "2:5";
        String      dateOfReleased  = "June";
        byte        dateOfRelease1  =  25;
        int         dateOfRelease2  = 1999;
        String      rating          = "****";
        boolean     isG             = true;
        boolean     isaSequels      = true;
        boolean     isOnDvd         = true;

        System.out.println(movieName +" Movie was released on " + dateOfReleased +"/"+ dateOfRelease1 +"/"+ dateOfRelease2);
        System.out.println("Its " + generation+"th generation");
        System.out.println("Rating is " +rating + " out of "+rating);
        System.out.println("Its  G,PG,R "+ isG);
        System.out.println("Its not Sequel"+isaSequels);
        System.out.println("David type "+ isOnDvd);
        System.out.println("-------Welcome to the Cinema------");
        System.out.println("Tonight we are streaming "+movieName + " Movie which was released on " + dateOfReleased +"/"+dateOfRelease1+"/"+dateOfRelease2+".");
        System.out.println("This " + generation +"th genre movie got a $rottenTomatoesRating " + rating + " on Rotten Tomatoes");
        System.out.println("The rating is " +rating + " and it runs for " +duration + " hours");
        System.out.println("This is a sequel " + isaSequels + ", and is on dvd " + isOnDvd +".");

        movieName =(movieName +" Movie was released on " + dateOfReleased +"/"+ dateOfRelease1 +"/"+ dateOfRelease2 + "Its " + generation+"th generation"+
        "Rating is " +rating + " out of "+rating +"Its  G,PG,R "+ isG +"Its not Sequel"+isaSequels +"David type "+ isOnDvd +"-------Welcome to the Cinema------");

        System.out.println(movieName);
    }
}
