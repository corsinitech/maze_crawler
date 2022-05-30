package com.corsinitech;

import java.util.Scanner;
import java.awt.Point;


public class maze{

    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final char playerIcon = '\u2654';
    
   public static void main(String[] args){

       System.out.println(TEXT_RED + """
 ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄            ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄ 
▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌
▐░▌▐░▌ ▐░▌▐░▌▐░▌       ▐░▌          ▐░▌▐░▌               ▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌          ▐░▌       ▐░▌
▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄█░▌ ▄▄▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄      ▐░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌   ▄   ▐░▌▐░▌          ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌
▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀      ▐░▌          ▐░█▀▀▀▀█░█▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌ ▐░▌░▌ ▐░▌▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀ 
▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌               ▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌▐░▌ ▐░▌▐░▌▐░▌          ▐░▌          ▐░▌     ▐░▌  
▐░▌       ▐░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄      ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌ ▐░▌       ▐░▌▐░▌░▌   ▐░▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌ 
▐░▌       ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌
 ▀         ▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀         ▀  ▀▀       ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀ 
                                                                                                                                                   
               """ + TEXT_RESET);
        char[][] mazeMap = {
            {'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O',' ','O','O',},
            {'O','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o',' ','o','O',},
            {'O','o','o','o','o','o','o','o','o','o','o','o',' ',' ',' ',' ','o',' ','o','O',},
            {'O','o','o','o',' ',' ',' ','o','o','o','o','o',' ','o','o',' ',' ',' ','o','O',},
            {'O','o','o','o',' ','o',' ','o','o','o','o','o',' ','o','o','o','o','o','o','O',},
            {'O','o','o','o',' ','o',' ',' ',' ',' ','o','o',' ','o','o','o','o','o','o','O',},
            {'O','o',' ',' ',' ','o','o','o','o',' ','o','o',' ','o','o','o','o','o','o','O',},
            {'O','o',' ','o','o','o','o','o','o',' ','o','o',' ','o','o','o','o','o','o','O',},
            {'O','o',' ','o','o','o','o',' ',' ',' ','o','o',' ',' ',' ','o','o','o','o','O',},
            {'O','o',' ','o','o','o','o',' ','o','o','o','o','o','o',' ','o','o','o','o','O',},
            {'O','o',' ','o','o','o','o',' ','o','o','o','o','o','o',' ','o','o','o','o','O',},
            {'O','o',' ',' ',' ',' ','o',' ',' ',' ',' ',' ',' ',' ',' ','o','o','o','o','O',},
            {'O','o','o','o','o',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O','o','o','o','o',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O','o','o','o','o',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O','o','o',' ',' ',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O',' ',' ',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O',' ','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','o','O',},
            {'O',playerIcon,'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O',},
        };

        printMaze(mazeMap);
        Scanner input = new Scanner(System.in);
        System.out.println("Need some instructions? (y/n)");
        String answer = input.next();

        if (answer.toLowerCase().equals("y")){
            printGameInstructions();
        } else {
            System.out.println("Let's begin!");
        }
        Point playerPos = findPlayerPosition(mazeMap);

        while(true){
            System.out.println("Choose a direction (w, a, s, d): ");
            String playerMove = input.next().toLowerCase();
            try{
                movePlayerPosition(playerPos, mazeMap, playerMove);
            } catch (ArrayIndexOutOfBoundsException badMove){
                System.out.println("Ya can't go out of bounds...");
            }
            printMaze(mazeMap);
            String result = checkWinCondition(playerPos.x, playerPos.y);
            if(result.length() > 0){
               System.out.println(result);
               break;
            }
            System.out.println(result);
        }
   }

	private static void printGameInstructions() {
        System.out.println("""
                Welcome to Maze Crawler! The objective is simple:
                1. Direct the chess piece through the maze via the given options:
                    a. w = UP
                    b. a = LEFT
                    c. s = DOWN
                    b. d = RIGHT
                2. Make it to the end!

                Pretty simple, right?
                """);
}

	private static void printMaze(char[][] mazeMap) {
        for (char[] row : mazeMap){
            for(char c : row){
                System.out.print(" " + c + " ");
            }
            System.out.println();
        }
    } 

    private static Point findPlayerPosition(char[][] mazeMap) {
        Point playerLocation = new Point();
        for(int y = 0; y < mazeMap.length; y++){
            for(int x = 0; x < mazeMap[y].length; x++) {
                if(mazeMap[y][x] == playerIcon){
                    playerLocation.setLocation(y,x);
                }
            }
        }
        return playerLocation;
    }

    private static void movePlayerPosition(Point player, char[][] mazeMap, String playerMove){
        switch(playerMove){
            case "w":
                if(mazeMap[player.x-1][player.y] == ' '){
                    mazeMap[player.x][player.y] = ' ';
                    player.x = player.x - 1;
                    mazeMap[player.x][player.y] = playerIcon;
                } else if(mazeMap[player.x-1][player.y] == 'o' || mazeMap[player.x-1][player.y] == 'O'){
                    System.out.println("Invalid move! There's a wall there!");
                }
                break;
            case "a":
                if(mazeMap[player.x][player.y-1] == ' '){
                    mazeMap[player.x][player.y] = ' ';
                    player.y = player.y - 1;
                    mazeMap[player.x][player.y] = playerIcon;
                } else if(mazeMap[player.x][player.y-1] == 'o' || mazeMap[player.x][player.y-1] == 'O'){
                    System.out.println("Invalid move! There's a wall there!");
                }
                break;
            case "s":
                if(mazeMap[player.x+1][player.y] == ' '){
                    mazeMap[player.x][player.y] = ' ';
                    player.x = player.x + 1;
                    mazeMap[player.x][player.y] = playerIcon;
                } else if(mazeMap[player.x+1][player.y] == 'o' || mazeMap[player.x+1][player.y] == 'O'){
                    System.out.println("Invalid move! There's a wall there!");
                }
                break;
            case "d":
                if(mazeMap[player.x][player.y+1] == ' '){
                    mazeMap[player.x][player.y] = ' ';
                    player.y = player.y + 1;
                    mazeMap[player.x][player.y] = playerIcon;
                } else if(mazeMap[player.x][player.y+1] == 'o' || mazeMap[player.x][player.y+1] == 'O'){
                    System.out.println("Invalid move! There's a wall there!");
                }
                break;
        }
    }

    private static String checkWinCondition(int xPos, int yPos){
        if(xPos == 0 && yPos == 17){
            return "You solved the maze!";
        }
        return "";
    }
}
