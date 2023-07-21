class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> stack1=new Stack<>();
      Stack<Character> stack2=new Stack<>();
        
    for(char ch:s.toCharArray())
    {
        if(ch=='#')
        {
            if(!stack1.isEmpty())
            {
                stack1.pop();
            }
            continue;
        }
        stack1.push(ch);
    }
        
  for(char ch:t.toCharArray())
    {
        if(ch=='#')
        {
            if(!stack2.isEmpty())
            {
                stack2.pop();
            }
            continue;
        }
        stack2.push(ch);
    }
        
        String res1="";
        String res2="";
        
        while(!stack1.isEmpty())
        {
            res1+=stack1.pop();
        }
        while(!stack2.isEmpty())
        {
            res2+=stack2.pop();
        }
        
        return  res1.equals(res2);
    }
        
        
}