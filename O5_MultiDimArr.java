public class O5_MultiDimArr {
  public static void main(String[] args) {
    int n=3;
    int m=4;
    int mat[][] = new int[n][m];
    int randomno=(int)(Math.random()*100);
    System.out.println(randomno);
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat[i][j]=(int)(Math.random()*100);
      }
    }

    for(int i =0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(mat[i][j]+ " ");
      }
      System.out.println();
    }

    for(int i[]:mat){
      for(int j :i){
        System.out.print(j+ " ");
      }
      System.out.println();
    }
    
  }



}
