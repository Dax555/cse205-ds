class q682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();   

        for(String s : operations){

            if(s.equals("C")){
                stack.pop();
            }

            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }

            else if (s.equals("+")){

                if(stack.size()>=2){
                    int no1 = stack.pop();
                    int no2 = stack.pop();

                    int res = no1+no2;
                    stack.push(no2);
                    stack.push(no1);
                    stack.push(res);
                }
                

            }

            else{
                stack.push(Integer.parseInt(s));
            }

            

           


        }
        int ans = 0;
        while(!stack.isEmpty())
        {
                ans+= stack.pop();
        }
        
        return ans;

    }
}