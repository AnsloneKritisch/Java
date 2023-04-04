// Harsh Map -> fuction -> help in accessing array , dictonary and make changes in it 

//  { Key -> Value }

import java.util.HashMap;

 public class da{

    public static void main(String[] args) {

        HashMap < String , Integer > map = new HashMap<String , Integer>();

        // adding elements in my dictionary name map

        map.put("Ritu", 2);
        map.put("Reeta", 3);
        map.put("Rina", 4);
        map.put("Rupa", 6);

        // show Dictonay

        System.out.println(map);

        // values

        for (Integer i : map.values())
        {
            System.out.println(i);
            
        }

        for (String i : map.keySet())
        {
            System.out.println(i);
            
        }

        for (String i : map.keySet())
        {
            System.out.println("Key "+i+" Value is -> "+ map.get(i) );
        }

        // access items inside my dictionary 

        int a = map.get("Ritu");

        System.out.println(a);

        // delete items in my dictionary

        map.remove("Rina");

        System.out.println(map);
        
        // Delete all keys and values in my dictionary
        
        map.clear();
        System.out.println(map);

        // size of my dictionary
        int a1 = map.size();
        System.out.println(a1);

        


    }
 }