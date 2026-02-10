public class Leetcode1295 {
    public static void main(String args[]){
        int[] arr={555,901,482,1771};
        int n=evenNoDigits(arr);
        System.out.println(n);

    }
    static int evenNoDigits(int[] arr){
        int evendigits=0;
        for(int  num:arr){
            boolean isEven=digits(num);
            if(isEven){
                evendigits+=1;
            }

        }
        return evendigits;
    }
    static boolean digits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count+=1;
        }
        return count%2==0;
    }
}
