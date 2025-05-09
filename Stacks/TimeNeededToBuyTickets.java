class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
     Queue<int[]> q= new LinkedList<>();

     for(int i=0;i<tickets.length;i++){
        q.offer(new int[]{i,tickets[i]});
     }   
     int time=0;
     while(!q.isEmpty()){
        int person[]=q.poll();
        int index=person[0];
        int tc=person[1];

        tc--;
        time++;

        if(tc>0){
            q.offer(new int[]{index,tc});
        }
        if(index==k && tc==0){
            return time;

        }
     }
     return time;
    }
}
