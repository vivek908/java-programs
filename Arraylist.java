import java.util.*;
class Arraylist{
    public static void main(String args[]){
        List<String> men=new ArrayList<>();
        men.add("ramu");
        men.add("aamu");
        men.add("yamu");
        men.add("wamu");
        List<String> women=new ArrayList<>();
        women.add("kamlesh");
        women.addAll(men);
        System.out.println(women);
        for(String s:women){
            System.out.println(s);
        }
        System.out.println(women.get(1));
        Integer arr[]=new Integer[5];
        arr[0]=11;
        arr[1]=22;
        arr[2]=33;
        arr[3]=44;
        arr[4]=55;
        List<Integer> list=Arrays.asList(arr);
        list.set(2,66);
        Collections.sort(list);
        System.out.println(list);

        int a[]=new int[4];
        a[0]=2;
        a[1]=5;
        a[2]=7;
        List <Integer> aa=new ArrayList<>();
      for(int i=0;i<a.length;i++){
            aa.add(a[i]);
      }
      System.out.println(aa);

//===================================================================================================
      List<String> ss=new ArrayList<>();
      ss.add("vinod");
      ss.add("vikas");
      String ar[]=new String[ss.size()]; 
      ss.toArray(ar);
      for(String s:ar){
          System.out.println(s);
      }
      
    }
}