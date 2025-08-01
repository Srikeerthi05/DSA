class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
     Queue<Integer> q= new LinkedList<>();

     for(int i=0;i<tickets.length;i++){
        q.offer(i);
     }   
     int time=0;
     while(!q.isEmpty()){
        time++;
        int person=q.poll();
        if(tickets[person]>=1){
            tickets[person]=tickets[person]-1;
        }
        if(person!=k && tickets[person]==0){
            continue;
        }
        if(person==k && tickets[person]==0){
            break;
        }
        q.offer(person);
        
     }
     return time;
    }
}
