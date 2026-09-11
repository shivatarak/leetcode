class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int l=0;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    if(digits[i]!=0){
                        l=digits[i]*100 +digits[j]*10 + digits[k];
                        if(l%2==0){
                            s.add(l);
                        }
                    }
                }
            }
        }
        return s.size();
    }
}