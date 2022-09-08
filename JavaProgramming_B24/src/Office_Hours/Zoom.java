package Office_Hours;

public class Zoom {
    public static void main(String[] args) {


        ZoomMeeting classZoom = new ZoomMeeting(100,true,"learningJava",1234647L);

        System.out.println(classZoom);
        classZoom.joinMeeting();
        classZoom.leaveMeeting();
        System.out.println(classZoom);




    }
}
