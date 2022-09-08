package day32_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";



        String zones = "us-east-1,us-west-2,us-wes-3,us-west-4";


        // you could also do:
        String [] allZones = zones.split(",");  // this is for arrays

        for (String each : zones.split(",")) {  // this is for String

            System.out.println("Deploying " + app + " to " + each.trim());

        }
//        for(int i=0; i<allZones.length;i++){
//            System.out.println("Deploying " + app + " to " + allZones[i]);
        }
    }
//}