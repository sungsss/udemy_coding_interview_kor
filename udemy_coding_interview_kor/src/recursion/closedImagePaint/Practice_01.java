package recursion.closedImagePaint;

public class Practice_01 {
    public static int[][] paint(int[][] image, int x, int y, int newC){
        return paintRec(image, x, y, newC, image[y][x]);
    }
    
    public static int[][] paintRec(int[][] image, int x, int y, int newC, int targetC){
        if(y<0 || x<0 || y>=image.length || x>=image[0].length)    return image;
        
        if(image[y][x]==newC || image[y][x] != targetC) return image;
        
        image[y][x] = newC; 
        paintRec(image, x+1, y, newC, targetC);
        paintRec(image, x, y+1, newC, targetC);
        paintRec(image, x-1, y, newC, targetC);
        paintRec(image, x, y-1, newC, targetC);
        
        return image;
    }
}
