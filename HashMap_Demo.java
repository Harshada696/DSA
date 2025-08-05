import java.util.*;
class HashMap_Demo{
    public static void main(String [] args){
        HashMap <String , Integer> map=new HashMap<>();
        map.put("harshu",8042);
        map.put("snehal",3168);
        map.put("ruchira",4040);
        System.out.println("map:"+ map);
        System.out.println("accesing specific element :"+map.get("harshu"));
        System.out.println("remove :"+map.remove("harshu"));//it will remvoe the value of harshu from map
        System.out.println("map:"+ map);
        System.out.println("map:"+ map.containsKey("snehal"));//check whether key contains (output : true)
        System.out.println("map:"+ map.containsValue(3168));//output true 
        System.out.println("map:"+ map.keySet());//return all keys 
        System.out.println("map:"+ map.values());//return all values
        //for iteration mostly prefered for each loop
       // for(Map.Entry<String ,Integer> entry:map.entrySet()){
            //System.out.println(" key: "+entry.getKey()+" values :"+entry.getValue());
       // }
       for(Map.Entry<String ,Integer> entry: map.entrySet()){
        System.out.println(" key : "+entry.getKey()+" value : "+entry.getValue());
       }
      



        




        
    }
}