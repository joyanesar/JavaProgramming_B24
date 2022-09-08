package day21_loops;

public class Email {
    public static void main(String[] args) {

        String email = "stevjobs@gmail.com";
        int posOfAt = email.indexOf("@");
        String star = "*****";
        String nameBegin = email.substring(0,2) + star + email.substring(6,8);
        String domain = email.substring(posOfAt );


        System.out.println("Name : " + nameBegin + domain);

    }
}
