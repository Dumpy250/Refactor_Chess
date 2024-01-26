// Cameron Basham // Programming 101 // Coding Assignment 9 // Chess //

import java.util.Scanner;

public class Chess {

    public static String [][] Board = new String[8][8];

    public static String[][] initializeBoard() {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            Board[i][j] = " ";
        }
    }
            // Rooks
            Board [0][0] = "R1";
            Board [0][7] = "R2";
            Board [7][0] = "R3";
            Board [7][7] = "R4";
            
            // Knights
            Board [0][1] = "N1";
            Board [0][6] = "N2";
            Board [7][1] = "N3";
            Board [7][6] = "N4";
    
            //Bishops
            Board [0][2] = "B1";
            Board [0][5] = "B2";
            Board [7][2] = "B3";
            Board [7][5] = "B4";
    
            //Queens
            Board [0][3] = "Q1";
            Board [7][3] = "Q2";
    
            //Kings
            Board [0][4] = "K1";
            Board [7][4] = "K2";
    
        //Pawns
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 1; j++) {
                 Board[1][i] = "P" + (i + 1);
                Board[6][i] = "P" + (i + 1);
            }
         }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(Board[i][j]);
            }
                System.out.println();
             }
    return Board;
}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int j;
		String PlayerPiece;
		int BoardB;
		int BoardA;

        initializeBoard();
        
        	System.out.println("Pick the Piece you want to move");
        	PlayerPiece = scnr.next(); 
        	System.out.println("Enter the Grid you would like to move to, starting with only the row");
        	BoardA = scnr.nextInt();
        	System.out.println("Enter the Column of your move");
        	BoardB = scnr.nextInt();
        	Board[BoardA][BoardB] = PlayerPiece;
        	
             for (i = 0; i < 8; i++) {
                 for (j = 0; j < 8; j++) {
                      System.out.print(Board[i][j]);
                  }
                  System.out.println();
              }
             System.out.println();
        	
        	
             scnr.close();    	
   }
}			