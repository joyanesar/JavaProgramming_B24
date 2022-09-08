package day35_Methods;

public class PersonalInformation {
    /*

    building up email

    parameters : name (first and last name) domain

    buildEmail("james bond", "gmail")
    output: james_bond@gmail.com

     */
    public static void main(String[] args) {
        buildEmail("nesar joya", "gmail.com");
        buildEmail("james bond", "gmail");
        buildEmail("adam smith", "yahoo.com");

        login("jbond007","bond007");
    }
    public static void buildEmail(String name,String domain){

        name = name.replace(" ","_");
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.println(name + "@" + domain + ".com");
    }
    public static void login(String  username, String  password){

        if(username.equals("jbond007") && password.equals("bon007")){
            System.out.println("Logged in");
        }else {
            System.out.println("Invalid credentials");
        }



    }
}
