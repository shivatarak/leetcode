class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer>st=new Stack<>();
        for(String a:operations){
            if(a.equals("C")){
                st.pop();
            }
            else if(a.equals("D")){
                st.push(2*st.peek());
            }
            else if(a.equals("+")){
                int top=st.pop();
                int news = top + st.peek();
                st.push(top);
                st.push(news);
            }
            else{
                st.push(Integer.parseInt(a));
            }
        }
        int total=0;
        for(int score:st){
            total+=score;
        }
        return total;
    }
}