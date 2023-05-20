class Solution {
    public String simplifyPath(String path) {
       Stack<String> st1=new Stack<>();
       Set<String> skip=new HashSet<>(Arrays.asList(".","..",""));
       
        for(String dir:path.split("/"))
        {
            if(!st1.isEmpty() && dir.equals(".."))
            {
                st1.pop();
            }
            else if(!skip.contains(dir))
            {
                st1.push(dir);
            }
        }
        
        StringBuilder str1=new StringBuilder();
        while(!st1.isEmpty())
            str1.insert(0,st1.pop()).insert(0,"/");
        
        return str1.isEmpty()?"/":str1.toString();
        
        
        }
}