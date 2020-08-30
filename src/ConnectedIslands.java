public class ConnectedIslands {
    static int arr[][];
    static boolean visited[][];
    static  int counter;

    static  boolean canVisit(int i, int j){
        if (i>=0 && i<arr.length && j>=0 && j<arr[0].length)
            if (arr[i][j]==1)
                return  true;
        return false;
    }

    static  void doDFS(int i, int j){
        if (visited[i][j])
            return;
        else
            counter++;
        visited[i][j] = true;
        for(int p=-1;p<2;p++){
            for (int q=-1;q<2;q++){
                if(p==0 && q==0){
                    continue;
                }
                if(canVisit(i+p,j+q))
                    doDFS(i+p,j+q);
            }
        }

    }

    static int countConnected(){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==1 && !visited[i][j]){

                    doDFS(i,j);
                    count++;
                    System.out.println(counter);
                    counter =0 ;
                }
            }
        }
        return count;
    }

    public static  void  main(String args[]){
        arr = new int[][]{
                {1,0,1,0,1},
                {1,1,0,0,0},
                {0,1,0,1,1}
        };
        visited = new boolean[arr.length][arr[0].length];
        System.out.println(countConnected());
    }
}
