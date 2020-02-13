import java.util.*;
class setEx{
    public static void main(String args[]){
       HashSet<String> st=new LinkedHashSet<>();
        st.add("raju");
        st.add("ramu");
        st.add("aparikshit");
        for(String s:st){
            System.out.println("Hashset :"+s);
        }
        //Java TreeSet class access and retrieval times are quiet fast.
        //Java TreeSet class doesn't allow null element.
        //Java TreeSet class maintains ascending order.

        TreeSet<String> ts=new TreeSet<>();
        ts.add("raju");
        ts.add("ramu");
        ts.add("aparikshit");
        for(String s:ts){
            System.out.println("Treeset :"+s);
        }
        Iterator it=ts.descendingIterator();//descending order iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}