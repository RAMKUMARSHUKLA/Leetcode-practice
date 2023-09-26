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
               StringBuilder stringBuilder=new StringBuilder(resStack.pop());
               int len=countStack.pop();
               for(int j=0;j<len;j++)
               {
                   stringBuilder.append(res);
               }
               res=stringBuilder.toString();
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