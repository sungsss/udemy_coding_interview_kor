package recursion.closedImagePaint;

public class Main {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1, 1, 1, 1, 1, 1},
                              {1, 1, 1, 1, 1, 1, 0, 0},
                              {1, 0, 0, 1, 1, 0, 1, 1},
                              {1, 2, 2, 2, 2, 0, 1, 0},
                              {1, 1, 1, 2, 2, 0, 1, 0},
                              {1, 1, 1, 2, 2, 2, 2, 0},
                              {1, 1, 1, 1, 1, 2, 1, 1},
                              {1, 1, 1, 1, 1, 2, 2, 1},
                             };
        
        int[][] result = Practice_01.paint(image, 4, 4, 3);
        
        for (int i=0; i<result.length; i++)
        {
            for (int j=0; j<result[0].length; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }        
    }
}
