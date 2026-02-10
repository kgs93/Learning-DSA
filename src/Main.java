public class Main{
    public static void main(String[] args){
        int n=7679;
        int count=0;
        while(n>0){
            n=n/10;
            count+=1;

        }
        System.out.println(count);
    }
}