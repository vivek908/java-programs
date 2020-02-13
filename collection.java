import java.util.*;
class collection{
    public static void main(String args[]){
        List<Integer> la=new ArrayList<>();//it uses dynamic array to store the duplicate element of different data types.
        la.add(10);
        la.add(20);
        la.add(30);
        la.add(5);
        Iterator<Integer> it =la.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Integer i:la){
            System.out.println(i);
        }
        List<String> ll=new LinkedList<>();//it uses the double linkedlist internally.In LinkedList, the manipulation is fast because no shifting is required.
        ll.add("vivek");
        ll.add("tarun");
        ll.add("satya");
        for(String s:ll){
            System.out.println(s);
        }
        Stack<String> st=new Stack<>();
        st.push("ram");
        st.push("lakhan");
        st.pop();
        for(String ss:st){
            System.out.println(ss);
        }


        //Set interface -- HashSet,TreeSet,LinkedSet
        Set<String> s=new HashSet<>();// It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
        s.add("abc");
        s.add("");
        s.add("");
        s.add("def");
        s.add("def");
        s.add("abd");
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        TreeSet<String> set=new TreeSet<String>();  //unique and ascending 
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//traversing elements  
Iterator<String> it1=set.iterator();  
while(it1.hasNext()){  
System.out.println(it1.next());  
}  
for(int i=0;i<set.size();i++){
    System.out.println(set.get(i));
}
    }
}