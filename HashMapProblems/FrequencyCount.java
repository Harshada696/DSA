import java.util.*;
class FrequencyCount{
    public static void main(String [] args){
        String name[]={"apple","apple","banana","mango","mango"};
        HashMap <String ,Integer> map=new HashMap<>();
        for(String i:name){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<String ,Integer> entry:map.entrySet()){
            System.out.println("key :"+entry.getKey()+" value :"+entry.getValue());
        }




            }
}