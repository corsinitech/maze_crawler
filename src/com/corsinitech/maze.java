package com.corsinitech;

public class maze{
    
   public static void main(String[] args){
        char[][] mazeMap = {
            {'O','O','O','O','O','O','O',' ','O','O',},
            {'O','o','o','o','o','o',' ',' ','o','O',},
            {'O','o','o','o','o','o',' ','o','o','O',},
            {'O','o','o','o','o','o',' ','o','o','O',},
            {'O','o','o','o','o','o',' ',' ',' ','O',},
            {'O',' ',' ',' ',' ',' ','o','o',' ','O',},
            {'O',' ','o','o','o',' ','o','o',' ','O',},
            {'O',' ',' ','o','o',' ',' ',' ',' ','O',},
            {'O','o',' ','o','o','o','o','o','o','O',},
            {'O','O','x','O','O','O','O','O','O','O',},
        };

        printMaze(mazeMap);
   }

    private static void printMaze(char[][] mazeMap) {
        for (char[] row : mazeMap){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    } 
}
