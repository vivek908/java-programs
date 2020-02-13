class array{
    public static void main(String args[]){
        String arr[]=new String[5];
        char ch[]={'v','i','v','e','k'};
        System.out.println(ch);
        String s=new String(ch);       
        System.out.println(s);
        System.out.println(arr.length);
        arr[0]="vivek";
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}