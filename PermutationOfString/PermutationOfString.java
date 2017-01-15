import java.util.Map;
import java.util.TreeMap;
import java.util.List;
/**
 * Created by Varun on 1/11/17.
 */
public class PermutationOfString {
    public static void main(String [] args){
        char value []={'a','d','c','a','b'};
        permute(value);

    }
    public static void permute(char input[]){
        //A treemap naturally sorts the Map by the character.
        Map<Character, Integer> countmap= new TreeMap<>();
    /*
    The compute function is part of Java8. If the value doesnt exist at that specific
    key then we can set it equal to 1. If it does exist then we increment the value by 1
     */
        for (char ch : input){
            countmap.compute(ch, (key, val)->{
                if(val==null){
                    return 1;
                }
                else{
                    return val+1;
                }


            });
        }
        //for each character a new sorted character array was created
        char str[]=new char[countmap.size()];
        //for each character a count array was created
        int count[]=new int[countmap.size()];
        int index=0;

        for(Map.Entry<Character, Integer> entry: countmap.entrySet()){
            str[index]=entry.getKey();
            count[index]=entry.getValue();
            index++;
        }
        char result []=new char[input.length];
        permuteUtil(str, count, result, 0);
    }
    public static void permuteUtil(char str[], int count [], char result[], int level){
        if (level == result.length) {
            printArray(result);
            return;
        }
        for (int i=0; i<str.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1);
            count[i]++;
        }
    }
    public static void printArray(char result []){
        for(char ch:result){
            System.out.print(ch);
        }
        System.out.println();
    }
}
