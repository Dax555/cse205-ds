class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>(); 

        for(int i = 0 ; i<s.length();i++){

            char c = s.charAt(i);

            if(c=='*'){
                stack.pop();
            }

            else{
                stack.push(c);
            }

        }

        char[] result = new char[stack.size()];
        int index = stack.size() - 1;

        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }

        return new String(result);




    }
}
