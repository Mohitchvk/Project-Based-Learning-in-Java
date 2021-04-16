package labMst1;

public class Question2 {
    static void sumexcludingrange(int li[],int a, int b){
        int sum = 0;
        boolean add = true;

        for (int i = 0;i < li.length; i++){
            if (li[i] != a && add == true){
                sum = sum + li[i];
            }
            else if (li[i] == a)
                add = false;
            else if( li[i] == b)
                add = true;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {

        int lis[] = {10,3,6,1,2,7,9};
        int a = 6;
        int b = 7;
        System.out.println("The sum of elements excluding 6, 7 and excluding numbers between 6,7 are:");
        sumexcludingrange(lis, a, b);

    }
}
