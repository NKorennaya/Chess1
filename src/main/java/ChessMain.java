import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player: players){
            System.out.println(player);
        }
   HashMap<String,Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
    }

            // System.out.println("The player 1 name is " + whitePlayer.getName() + " email: " +whitePlayer.getEmail() + "; chess playing " +whitePlayer.isWhite() + "; rank: " + whitePlayer.getRank()+ "; age " + whitePlayer.getAge());
            // System.out.println("The player 2 name is " + blackPlayer.getName()+ " email: " + blackPlayer.getEmail() + "; chess playing " +blackPlayer.isWhite() + "; rank: " + blackPlayer.getRank()+ "; age " + blackPlayer.getAge());
            //   System.out.println(whitePlayer);
            // System.out.println(blackPlayer);

            //  whitePlayer.setRank(1000);
            // blackPlayer.setRank(-1);

            // try {
            //   whitePlayer.setRank(10000);}
            //catch (IllegalArgumentException err){
            //     System.out.println("please update rank to valid");
            //  }

            public ArrayList<Player> createPlayers () {
            Player whitePlayer = new Player("Beth Harmor", "beth.harmon@gmail.com", true, 2000, 20);
            Player blackPlayer = new Player("Vasily Borgov", "vasiliy.borgov@yandex.ru", false, 2500, 45);
            ArrayList<Player> players = new ArrayList<>();
            players.add(whitePlayer);
            players.add(blackPlayer);
            return players;
        }
public HashMap<String,Piece> createPieces(){
        King whiteKing = new King (new Spot("h", 7), "White King", true);
    //System.out.println(whiteKing);
    King blackKing = new King (new Spot("d", 8), "Black King", false);
   // System.out.println(blackKing);
    Queen whiteQueen = new Queen (new Spot("g", 7), "White Queen", true);
   // System.out.println(whiteQueen);
    Queen blackQueen = new Queen (new Spot("a", 1), "Black Queen", false);
  //  System.out.println(blackQueen);
    Pawn whitePawn = new Pawn (new Spot("f", 6), "White Pawn", true);
  //  System.out.println(whitePawn);
    Rook whiteRock1 = new Rook(new Spot("a", 7), "White Rock1", true);
  //  System.out.println(whiteRock1);
    Rook whiteRock2 = new Rook(new Spot("g", 7), "White Rock2", true);
  //  System.out.println(whiteRock2);
    Knight blackKnight1 = new Knight (new Spot("d", 6), "Black Knight1", false);
  //  System.out.println(blackKnight1);
    Bishop blackBishop = new Bishop (new Spot("c", 1), "Black Bishop", false);
  //  System.out.println(blackBishop);

HashMap<String, Piece> pieceHashMap = new HashMap<>();
    pieceHashMap.put(whiteKing.getId(),whiteKing);
    pieceHashMap.put(blackKing.getId(), blackKing);
    pieceHashMap.put(blackBishop.getId(), blackBishop);
    pieceHashMap.put(whitePawn.getId(),whitePawn);
    pieceHashMap.put(whiteRock1.getId(),whiteRock1);
    pieceHashMap.put(whiteRock2.getId(),whiteRock2);
    pieceHashMap.put(whiteQueen.getId(),whiteQueen);
    pieceHashMap.put(blackQueen.getId(),blackQueen);
    pieceHashMap.put(blackKnight1.getId(), blackKnight1);
    return pieceHashMap;
        }
public void play (ArrayList<Player> players, HashMap<String, Piece> hashMap){
        //move 1
    try{
    players.get(0).movePiece(hashMap.get("Black King"), new Spot("a", 8));}
    catch (IllegalArgumentException error){
        System.out.println("The move is incorrect, please try again!");
        //retry functionality
    }
    players.get(1).movePiece(hashMap.get("Black Knight1"), new Spot("c", 8));
}
}
