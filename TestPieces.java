import java.util.Scanner;

public class TestPieces
{
public static void main(String[] args)
{
  ChessPiece obj1 = new ChessPiece();        //Creating objects i.e. Chess pieces
  ChessPiece obj2 = new ChessPiece();

  obj1.setPosition(4,6);
  obj1.setColor("Black");
  obj1.setPieceType("Knight");
  System.out.println("Position: " + obj1.getPositionRow() + "," + obj1.getPositionColumn());
  System.out.println("Color: " + obj1.getColor());
  System.out.println("Name: " + obj1.getPieceType() + "\n");

  obj2.setPosition(3,8);
  obj2.setColor("White");
  obj2.setPieceType("Bishop");
  System.out.println("Position: " + obj2.getPositionRow() + "," + obj2.getPositionColumn());
  System.out.println("Color: " + obj2.getColor());
  System.out.println("Name: " + obj2.getPieceType() + "\n");

  obj1.printInfo();
  obj2.printInfo();

}
}