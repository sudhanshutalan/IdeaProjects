public class dStar {
    public static void main(String[] args){
        int i,j,n=15;
        /*for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==0||i==0&&j<n-1||i==n-1&&j<n-1||j==n-1&&i>0&&i<n-1){
                    System.out.print(" B ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==0&&i<n-2||i==n-2&&j<n-1||j==n-1&&i<n-2){
                    System.out.print(" B ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==0||i==0&&j<n-7||i==(n-1)/2&&j<n-7||j==n-7&&i>0&&i<((n-1)/2)){
                    System.out.print(" p ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
