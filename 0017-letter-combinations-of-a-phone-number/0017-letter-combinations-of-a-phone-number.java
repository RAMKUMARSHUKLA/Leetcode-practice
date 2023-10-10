class Solution {
       
    String dial[]={"1","2","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> list=new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
     if(digits.isEmpty()) 
     {
         return new ArrayList<>();
     }  
     helper("",0,digits);
        return list;
    
    
    }
public void helper(String comb,int index,String digits)
{
   if(index==digits.length())
   {
       list.add(comb);
        return;
    }
    
    String ans=dial[digits.charAt(index)-'0'];
    for(char ch:ans.toCharArray())
    {
        helper(comb+ch,index+1,digits);
    }
}
    
}