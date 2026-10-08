import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0;
        int col = 0;
        
     
        for (String command : commands) {
           
            char dir = command.charAt(0); 
            
            if (dir == 'R') {
                col++; 
            } else if (dir == 'L') {
                col--; 
            } else if (dir == 'D') {
                row++; 
            } else if (dir == 'U') {
                row--; 
            }
        }
        
   
        return (row * n) + col;
    }
}