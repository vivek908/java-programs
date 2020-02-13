import java.util.*;
class mapexample{
    public static void main(String[] args) {
            Map<Integer,String> map=new HashMap<>();
            map.put(1,"vivek");
            map.put(3,"arun");
            map.put(2,"akash");
            map.put(3,"aaun");
            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            map.remove(4);
            map.replace(1,"rakesh");
            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            System.out.println(map);
            System.out.println(map.keySet());
            System.out.println(map.values());
            System.out.println(map.entrySet());
    }
}