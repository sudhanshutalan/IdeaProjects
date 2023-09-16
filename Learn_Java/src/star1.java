public class star1 {
    public static void main(String[] args){
        int row,col,n=9;
        /*for(row=0;row<n;row++){
            for(col=0;col<n;col++){
                if((col==0||col==n-1)&&row!=0 ||(row==0||row==(n-1)/2)&&(col>0&&col<n-1)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        //A pattern 2nd method
        for(row=0;row<n;row++){
            for(col=0;col<n;col++){
                if(row==0&col>0&&col<n-1||col==0&&row>0||col==n-1&&row>0||row==n-3){
                    System.out.print(" A ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
