import java.util.*;
class Demohash{
    public static void main(String args[]){
       // int arr[]={1,2,3,4,5,6};
        HashMap<String,Integer> map=new HashMap<>();
        map.put("harshu",1);
        map.put("banty",2);
        //iteroator using for each loop
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("hash keys"+ entry.getKey()+"hash values"+entry.getValue());
           
        }
        
    }
}