// Cameron Basham // Programming 101 // Coding Assignment 9 // Chess //

import java.util.Scanner;



public class Chess {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int j;
		String PlayerPiece;
		int GridB;
		int GridA;
		String [][] Grid = new String[8][8];
	    for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                Grid[i][j] = " ";
            }
        }
        // Rooks
        Grid [0][0] = "R1";
        Grid [0][7] = "R2";
        Grid [7][0] = "R3";
        Grid [7][7] = "R4";
        
        // Knights
        Grid [0][1] = "N1";
        Grid [0][6] = "N2";
        Grid [7][1] = "N3";
        Grid [7][6] = "N4";

        //Bishops
        Grid [0][2] = "B1";
        Grid [0][5] = "B2";
        Grid [7][2] = "B3";
        Grid [7][5] = "B4";

        //Queens
        Grid [0][3] = "Q1";
        Grid [7][3] = "Q2";

        //Kings
        Grid [0][4] = "K1";
        Grid [7][4] = "K2";

        //Pawns
        for (i = 0; i < 8; i++) {
        	for (j = 0; j < 1; j++) {
        		Grid[1][i] = "P" + (i + 1);
        		Grid[6][i] = "P" + (i + 1);
        	}
        }
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                 System.out.print(Grid[i][j]);
             }
             System.out.println();
         }
        
        
        	System.out.println("Pick the Piece you want to move");
        	PlayerPiece = scnr.next(); 
        	System.out.println("Enter the Grid you would like to move to, starting with only the row");
        	GridA = scnr.nextInt();
        	System.out.println("Enter the Column of your move");
        	GridB = scnr.nextInt();
        	Grid[GridA][GridB] = PlayerPiece;
        	
             for (i = 0; i < 8; i++) {
                 for (j = 0; j < 8; j++) {
                      System.out.print(Grid[i][j]);
                  }
                  System.out.println();
              }
             System.out.println();
        	
        	
             scnr.close();    	
   }
}			