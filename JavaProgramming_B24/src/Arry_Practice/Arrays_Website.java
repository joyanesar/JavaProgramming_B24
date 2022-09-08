package Arry_Practice;

import java.util.Arrays;

public class Arrays_Website {
    /*
    Website checker
Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu,
     */
    public static void main(String[] args) {

        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp",
                "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org",
                "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0, org = 0, edu =0, gov=0, net=0, other =0;

        int [] counter = new int[6];

        for(String eachSite : websites){

            if(eachSite.endsWith(".com")){
                com++;
                counter[0]++;
            }else if(eachSite.endsWith(".org")){
                org++;
                counter[1]++;
            }else if(eachSite.endsWith("edu")){
                edu++;
                counter[2]++;
            }else if(eachSite.endsWith(".gov")) {
                gov++;
                counter[3]++;
            }else if(eachSite.endsWith(".net")){
                net++;
                counter[4]++;
            }else {
                other++;
                counter[5]++;
            }

        }

        System.out.println(".com: " + counter[0]);
        System.out.println(".edu: " + counter[1]);
        System.out.println(".org: " + counter[2]);
        System.out.println(".net: " + counter[3]);
        System.out.println(".gov: " + counter[4]);
        System.out.println("other: " + counter[5]);
//        System.out.println(".com: " + com);
//        System.out.println(".edu: " + edu);
//        System.out.println(".org: " + org);
//        System.out.println(".net: " + net);
//        System.out.println("gov : " + gov);
//        System.out.println("other:" + other);
        System.out.println(Arrays.toString(counter));
    }

}
