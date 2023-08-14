class Solution {
    public static void reverse(char []s, int i){
        if(i>=s.length/2){
            return;
        }
        reverse(s,i+1);

        char temp;
        temp=s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=temp;
        



    }
    
    
    
    
    public void reverseString(char[] s) {
       
       reverse(s,0);

       
}
}