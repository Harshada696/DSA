import java.util.*;
class FrequencyCount{
    public static void main (String [] args){
        String name[]={"harshu","harshu","khushi"};
        HashMap <String ,Integer > map=new HashMap<>();
        for(String i:name){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("word: "+entry.getKey()+" count: "+entry.getValue());
        }
    }
}