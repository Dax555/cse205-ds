class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }

        HashMap<Character,String> m = new HashMap<Character,String>();
        for(int i = 0 ; i < arr.length ; i++){
            char c = pattern.charAt(i);
            String str = arr[i];

            if(m.containsKey(c)){
                if(!m.get(c).equals(str)){
                    return false;
                }
                
            }
            else{
                    if(m.containsValue(str)){
                        return false;
                    }
                    m.put(c,str);
                }

            
        }
        return true;
    }
}