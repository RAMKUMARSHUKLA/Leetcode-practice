class Solution {
    public int addDigits(int num) {
       
        // while(num>=10)
        // {
        // int sum=0;
        // while(num>0)
        // {
        //    sum+=(num%10);
        //     num=num/10;
        // }
        // num=sum;
        // }
        // return num;
        
         if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}