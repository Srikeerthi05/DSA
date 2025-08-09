class Main {
    public static void TowerOfHanoi(int n, String src, String h, String des){
        if(n==1){
            System.out.println("Transfer "+n+ " from "+ src+ " to "+des );
            return;
        }
        TowerOfHanoi(n-1, src, des, h);
        System.out.println("Transfer "+n+ " from "+ src+ " to "+des );
        TowerOfHanoi(n-1, h, src,des);
        
    }
    public static void main(String[] args) {
       int n=4;
       TowerOfHanoi(n,"S","H","D");
       
    }
}
