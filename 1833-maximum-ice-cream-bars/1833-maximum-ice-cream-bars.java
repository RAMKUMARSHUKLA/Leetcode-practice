class Solution {
    public int maxIceCream(int[] costs, int coins) {
         Arrays.sort(costs);
    int n=costs.length;
    for (int i = 0; i <n;i++)
    //we will check we can buy bar or not
        if (coins >= costs[i])
            coins -= costs[i];//update the coins value
        else
            return i;//we can't purchase anymore
    return n; 
    }
}