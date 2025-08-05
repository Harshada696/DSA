import java.util.*;
class StoreRetrieve{
    public static void main(String [] args){
        String name[]={"harshu","vaishu","ruchi","sneha"};
        int marks[]={70,80,90,100};
        HashMap <String ,Integer> map=new HashMap<>();
        //using for loop to insert into hashmap
        for(int i=0;i<name.length;i++){
            map.put(name[i],marks[i]);
        }
        //using for each for printing 
        for(Map.Entry<String ,Integer> entry:map.entrySet()){
            System.out.println(" name of student: "+ entry.getKey() + " marks of student : "+entry.getValue());

        }
        
    }
}