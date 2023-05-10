class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int average=salary.length-2;
       double sum=0;
       for(int i:salary)
       {
           sum+=i;
       }
       double remove=salary[0]+salary[salary.length-1];
        double ans=(sum-remove)/average;
        return ans;
        
    }
}