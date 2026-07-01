class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
    if(!map.get(a).equals(map.get(b))){
        return map.get(a)-map.get(b);
    }
    return b-a;});
    int a[]=new int[n];
    int freq=0;
    int index=0;
    for(int key:map.keySet()){
        pq.add(key);
    }
    while(!pq.isEmpty()){
        int num=pq.poll();
        freq=map.get(num);
        while(freq>0){
            a[index++]=num;
            freq--;
        }
    }
    return a;
  }
}