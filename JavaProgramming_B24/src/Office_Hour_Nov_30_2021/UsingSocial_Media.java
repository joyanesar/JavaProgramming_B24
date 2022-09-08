package Office_Hour_Nov_30_2021;

public class UsingSocial_Media {
    public static void main(String[] args) {

        FacebookUser nadir = new FacebookUser("Nadir","softskill", "Nadir");

        System.out.println(nadir);

        System.out.println(FacebookUser.platform);
        nadir.post("wow ! today's office hours was amazing!!");
        System.out.println(nadir.getAllPost());

        FacebookUser malika = new FacebookUser("MalikaSDET","djdkjak","Malikda",21,5000);
        System.out.println(malika);
        malika.directMassage(nadir,"Hello , hello !");
    }
}
