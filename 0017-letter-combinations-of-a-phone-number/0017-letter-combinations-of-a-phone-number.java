class Solution {
       
    String[] dial={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
     if(digits.isEmpty())
     {
         return new ArrayList<>();
     }
        
    helper("",0,digits);
        return ans;
    
    
    }
public void helper(String comb,int index,String digits)
{
    if(index==digits.length())
    {
        ans.add(comb);
        return;
    }
    String letters=dial[digits.charAt(index)-'0'];
   for(char ch:letters.toCharArray())
   {
       helper(comb+ch,index+1,digits);
   }
    
}
    
}