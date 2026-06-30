class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])) hm.put(nums[i],hm.get(nums[i])+1);
            else hm.put(nums[i],1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        for(int key:hm.keySet()) pq.offer(key);
        int [] res=new int[k];
        for(int i=0;i<k;i++) res[i]=pq.poll();
        return res;
    }
}
