import java.lang.String;

class StringMethods
{
       public static void main(String args[]){  
        String s="javatpoint";
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                System.out.println(s.charAt(i));//charAt(index)
            }
        }
        System.out.println(s.contains("pot"));
        System.out.println(s.endsWith("tpoint"));
        System.out.println(s.startsWith("javap"));
        String s1="hello";
        String s2="yellow";
        String s3="helol";
        String s4="paji";
        s4=s1.concat(s2).concat(s3).concat(s4);//concat()
        System.out.println(s4);
        System.out.println(s1.compareTo(s2));//s1<s2 result in negative
        System.out.println(s1.compareTo(s3)); 
        System.out.println(s2.compareTo(s3)); //s2>s3 result in positive 

        String s5="hindustan";
        String s6="hinDusTan";
        System.out.println(s5.equals(s6)); // it will return true or false
        System.out.println(s5.equalsIgnoreCase(s6));
        System.out.println(s5.indexOf("ta")); //return position of given index
        System.out.println(s1.isEmpty());
        if(s1.isEmpty()){
            System.out.println("String empty");
        }
        else{
            System.out.println(s1);
        }
        String s7=s1.replace('h','y');
        System.out.println(s7);

        String s8="java string split method by javatpoint";  
String[] words=s8.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
System.out.println(s1.substring(2,4));
char[] ch=s1.toCharArray();//converts string into character array
for(int i=0;i<ch.length;i++){
    System.out.println(ch[i]);
}
int val=30;
String s10=String.valueOf(val);//valueOf() converts any datatype to String
System.out.println(s10); 
        }

}