import  java.util.HashSet; // it only contains the unique elements
public class exercise_recursion {
    public static void subsequence(String str , int index , String newString , HashSet<String> set){
        if (index==str.length()){
            if (set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(index);
        subsequence(str , index+1 , newString+currentChar,  set); // add character
        subsequence(str,index+1, newString ,set);

    }

    public static void towerOfHanoi(int disk , String source , String helper , String destination){
        if (disk == 1){
            System.out.printf("Transfer %d disk from %s to %s\n" , disk , source ,destination);
            return;
        }
        towerOfHanoi(disk-1 , source,destination,helper);
        System.out.printf("Transfer %d disk from %s to %s \n", disk ,source , destination);
        towerOfHanoi(disk-1 , helper,source,destination);
    }

    public static void reverseString(String str , int index , String newString){
        if(index ==0){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index-1);
        newString += currentChar;
        reverseString(str , index-1 ,newString);
    }

    public static String []keyPad = {"." , "abc" , "def" ,"ghi" ,"jkl" , "mno" ,"pqrs" ,"tu" , "vwx" , "yz"};
    public static void combinationOfString(String str , int index , String combination){
        if (index == str.length()){
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keyPad[currentChar-'0'];
        for (int i = 0; i < mapping.length(); i++){
            combinationOfString(str , index +1 , combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
//        String str ="abc";
//        HashSet<String> set = new HashSet<>();
//        subsequence(str,0,"" ,set);

//        int disk = 3;
//        towerOfHanoi(disk , "S" , "H" , "D");

//        String str = "sakshi";
//        reverseString(str , str.length(), "");

//        String str = "0";
//        combinationOfString(str,0,"");
    }
}
