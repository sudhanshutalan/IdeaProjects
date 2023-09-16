public class star1copy {
    public static void main(String[] args){
    int i,j,n=7;
    //A pattern
    /*for(i=0;i<n;i++){
        for(j=0;j<n;j++){
          if(i==0&&j>0&&j<n-1||j==0&i>0||i==(n-1)/2&&j<n-1||j==n-1&&i>0){
              System.out.print(" # ");
          }else{
              System.out.print("   ");
          }
        }
        System.out.println();
    }*/
        //H pattern
        /*for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==0||j==n-1||i==(n-1)/2){
                    System.out.print(" H ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        //E pattern
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==0||i==0||i==n-1||i==(n-1)/2&&j<n-2){
                    System.out.print(" E ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
