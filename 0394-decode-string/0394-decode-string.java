class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<String> resStack=new Stack<>();
        String res="";
        int i=0;
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int count=0;
                while(Character.isDigit(s.charAt(i)))
                {
                  count=count*10+(s.charAt(i)-'0');
                i++;  
                }
                countStack.push(count);
                
            }
            else if(s.charAt(i)=='[')
            {
                resStack.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder temp=new StringBuilder(resStack.pop());
                int repeatTimes=countStack.pop();
                
                for(int j=0;j<repeatTimes;j++)
                {
                    temp.append(res);
                }
                
                res=temp.toString();
                i++;
            }
            else
            {
                res+=s.charAt(i++);
                
            }
        }
        return res;
    }
}