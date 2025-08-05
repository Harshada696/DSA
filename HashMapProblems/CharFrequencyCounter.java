import java.util.*;
class CharFrequencyCounter{
    public static void main(String [] args){
       String name="harsha";
       HashMap <Character,Integer> map=new HashMap<>();
       for(char i:name.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Character,Integer>entry:map.entrySet()){
        System.out.println("character:"+entry.getKey()+"count :"+entry.getValue());
       }
       

    }
}