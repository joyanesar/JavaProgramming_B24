public class practice {
    public static void main(String[] args) {

        String[] arr = {"monkey","donkey","camel","strawberry"};//{"java","longer word","civic","apple","racecar","mom","anna"};

        String longest = arr[0];
        for(String each: arr){

            if(each.length() > longest.length()){
                longest=each;
            }
        }
        System.out.println(longest);

        String[] arr1={"It started to snow in Chicago"};

        String reverse = "";

//        for(int index=0; index<arr1.length -1;

    }
}
