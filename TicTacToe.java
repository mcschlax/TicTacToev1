//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Mark Schlax
//TicTacToe
//10/25/2012
//Play TicTacToe with a friend or an procedure guided computer
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
import java.util.*;
public class TicTacToe
{
 public static void main(String [] args)
 {
  String player = "Player One", winner = "Nobody", a = "1", b = "2", c = "3", d = "4", e = "5", f = "6", g = "7", h = "8", i = "9";
  int userGameChoice, userDifficulty, userChoice = 0, computerChoice = 0, win = 0, playAgain = 1, chooseAgain = 0, A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, I = 0;
  Random generator = new Random();
  Scanner scan = new Scanner(System.in);
  System.out.println("Welcome To Tic-Tac-Toe");
  do
  {
   System.out.print("Choose One Of The Options Below:\nPlayer One v. Computer(1)\nPlayer One v. Player Two(2)\nYour Choice: ");
   userGameChoice = scan.nextInt();
   System.out.println();
   if (userGameChoice >= 3 || userGameChoice <= 0)
    System.out.print("Please, ");
  } while (userGameChoice >= 3 || userGameChoice <= 0);
  while (playAgain == 1)
  {
   if (userGameChoice == 1)
   {
    do
    {
     System.out.print("Pick The Difficulty Of The Computer\nEasy(1)\nOr\nImpossible(2)\nYour Choice: ");
     userDifficulty = scan.nextInt();
     System.out.println();
    } while (userDifficulty >= 3 || userDifficulty <= 0);
    for (int turn = 0; win != 1 && turn < 9; turn++)
    {
     System.out.print(player + ",\nChoose One Of The Options Below:\n\n\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n\n" + player + "'s Choice: ");
     if ((turn % 2) == 0)
     {
      userChoice = scan.nextInt();
      System.out.println();
      if (userChoice >= 10 || userChoice <= 0)
       do
       {
        System.out.print("Please,\n" + player + ",\nChoose One Of The Options Below:\n\n\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n\n" + player + "'s Choice: ");
        userChoice = scan.nextInt();
        System.out.println();
       } while (userChoice >= 10 || userChoice <= 0);
      do
      {
       if (userChoice == 1)
       {
        if ( a == "1")
        {
         a = "X";
         A = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 2)
       {
        if ( b == "2")
        {
         b = "X";
         B = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 3)
       {
        if (c == "3")
        {
         c = "X";
         C = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 4)
       {
        if ( d == "4")
        {
         d = "X";
         D = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 5)
       {
        if ( e == "5")
        {
         e = "X";
         E = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 6)
       {
        if ( f == "6")
        {
         f = "X";
         F = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 7)
       {
        if ( g == "7")
        {
         g = "X";
         G = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 8)
       {
        if ( h == "8")
        {
         h = "X";
         H = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 9)
       {
        if ( i == "9")
        {
         i = "X";
         I = 1;
         chooseAgain = 1;
        }
       }
       if (chooseAgain == 0)
       {
        System.out.print("Please,\n" + player + ",\nChoose One Of The Options Below:\n\n\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n\n" + player + "'s Choice: ");
        userChoice = scan.nextInt();
        System.out.println();
       }
      } while (chooseAgain == 0);
      player = "Computer";
      chooseAgain = 0;
     }
     if ((turn % 2) != 0)
     {
      if (userDifficulty == 1)
      {
       do
       {
        computerChoice = generator.nextInt(9) + 1;
        if (computerChoice == 1)
        {
          if (a == "1")
          {
           a = "O";
           A = 2;
           chooseAgain = 1;
          }
        }
        if (computerChoice == 2)
        {
         if (b == "2")
         {
          b = "O";
          B = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 3)
        {
         if (c == "3")
         {
          c = "O";
          C = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 4)
        {
         if (d == "4")
         {
          d = "O";
          D = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 5)
        {
         if (e == "5")
         {
          e = "O";
          E = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 6)
        {
         if (f == "6")
         {
          f = "O";
          F = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 7)
        {
         if (g == "7")
         {
          g = "O";
          G = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 8)
        {
         if (h == "8")
         {
          h = "O";
          H = 2;
          chooseAgain = 1;
         }
        }
        if (computerChoice == 9)
        {
         if (i == "9")
         {
          i = "O";
          I = 2;
          chooseAgain = 1;
         }
        }
       } while (chooseAgain == 0);
       chooseAgain = 0;
      }
      if (userDifficulty == 2)
      {
       if (turn == 1)
       {
        if (e == "5")
        {
         e = "O";
         E = 2;
         computerChoice = 5;
        }
        else
        {
         if (a == "1")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
        }
       }
       if (turn == 3)
       {
        if (e == "O")
        {
         if (a == "X" && b == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (a == "X" && c == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (b == "X" && c == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (g == "X" && h == "X")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (g == "X" && i == "X")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (h == "X" && i == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (a == "X" && d == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (a == "X" && g == "X")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (d == "X" && g == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (c == "X" && f == "X")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (c == "X" && i == "X")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (f == "X" && i == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (b == "X" && d == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (b == "X" && f == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (f == "X" && h == "X")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (d == "X" && h == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (a == "X" && h == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (a == "X" && f == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (c == "X" && h == "X")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (c == "X" && d == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (b == "X" && g == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (f == "X" && g == "X")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (d == "X" && i == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (b == "X" && i == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (a == "X" && i == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (c == "X" && g == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (b == "X" && h == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (d == "X" && f == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
        }
        else if (e == "X")
        {
         if (i == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (h == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (g == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (d == "X")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (b == "X")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (c == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (f == "X")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
        } 
       }
       if (turn == 5)
       {
        if (e == "O")
        {
         if (a == "O" && i == "9")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (b == "O" && h == "8")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (c == "O" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (f == "O" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (i == "O" && a == "1")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (h == "O" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (g == "O" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (d == "O" && f == "6")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (g == "7" && h == "X" && i == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (b == "O" && h == "X" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (b == "2" && d == "X" && f == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (b == "X" && f == "6" && h == "O")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (d == "O" && f == "O" && h == "8")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (a == "X" && d == "4" && g == "X")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (c == "X" && f == "6" && i == "X")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (a == "X" && b == "2" && c == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (g == "X" && h == "8" && i == "X")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (g == "X" && h == "X" && i == "9")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (a == "1" && d == "X" && g == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (b == "X" && c == "O" && f == "X")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (a == "O" && b == "X" && d == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (d == "X" && g == "O" &&  h == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (f == "X" && h == "X" && i == "O")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
        }
        else if (e == "X")
        {
         if (g == "O" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 2;
         }
         else if (d == "O" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (c == "O" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (b == "O" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (c == "O" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (d == "X" && f  == "6")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (g == "X" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (h == "X" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (f == "X" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (c == "X" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (b == "X" && h == "8")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (b == "X" && h == "O")
         {
          c = "O";
          C = 2;
          computerChoice = 4;
         }
         else if (d == "X" && f == "O")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
        }
       }
       if (turn == 7)
       {
        if (e == "O")
        {
         if (a == "O" && i == "9")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (b == "O" && h == "8")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (c == "O" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (f == "O" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (i == "O" && a == "1")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (h == "O" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (g == "O" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (d == "O" && f == "6")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (a == "O" && d == "4" && g == "O")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (a == "O" && b == "2" && c == "O")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (c == "X" && f == "X" && i == "9")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (g == "7" && h == "X" && i == "X")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (a == "1" && d == "X" && g == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (a == "X" && b == "X" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (c == "X" && f == "6" && i == "X")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (g == "X" && h == "8" && i == "X")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (a == "X" && d == "4" && g == "X")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (a == "X" && b == "2" && c == "X")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (g == "X" && h == "X" && i == "9")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (a == "X" && d == "X" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (a == "1" && b == "X" && c == "X")
         {
          a = "O";
          A = 2;
          computerChoice = 1;
         }
         else if (c == "3" && f == "X" && i == "X")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if(h == "8" && i == "9")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (g == "7" && h == "8")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if(d == "4" && g == "7")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (a == "1" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 4; 
         }
         else if (a == "1" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (b == "2" && c == "3")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (c == "3" && f == "6")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (f == "6" && i == "9")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
        }
        else if (e == "X")
        {
         if (b == "2" && c == "O")
         {
          b = "O";
          B =  2;
          computerChoice = 2;
         }
         else if (d == "4" && g == "O")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (g == "O" && h == "O" && i == "9")
         {
          i = "O";
          I = 2;
          computerChoice = 9;
         }
         else if (d == "O" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (b == "O" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (b == "X" && h == "8")
         {
          h = "O";
          H = 2;
          computerChoice = 8;
         }
         else if (f == "X" && d == "4")
         {
          d = "O";
          D = 2;
          computerChoice = 4;
         }
         else if (g == "X" && c == "3")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
         else if (h == "X" && b == "2")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (d == "X" && f == "6")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (c == "X" && g == "7")
         {
          g = "O";
          G = 2;
          computerChoice = 7;
         }
         else if (b == "2" && h == "8")
         {
          b = "O";
          B = 2;
          computerChoice = 2;
         }
         else if (d == "4" && f == "6")
         {
          f = "O";
          F = 2;
          computerChoice = 6;
         }
         else if (c == "3" && g == "7")
         {
          c = "O";
          C = 2;
          computerChoice = 3;
         }
        }
       }
      }
      System.out.println(computerChoice + "\n");
      player = "Player One";
     }
     if (A == 1 && B == 1 && C == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (A == 1 && D == 1 && G == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (A == 1 && E == 1 && I == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (D == 1 && E == 1 && F == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (B == 1 && E == 1 && H == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (C == 1 && E == 1 && G == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (G == 1 && H == 1 && I == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (C == 1 && F == 1 && I == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (A == 2 && B == 2 && C == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (A == 2 && D == 2 && G == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (A == 2 && E == 2 && I == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (D == 2 && E == 2 && F == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (B == 2 && E == 2 && H == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (C == 2 && E == 2 && G == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (G == 2 && H == 2 && I == 2)
     {
      win = 1;
      winner = "Computer";
     }
     if (C == 2 && F == 2 && I == 2)
     {
      win = 1;
      winner = "Computer";
     }
    }
    System.out.println("\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n");
    //prints the winner
    System.out.println("The Winner Is: " + winner + "\n");
    do
    {
     System.out.print("Do You Want To Play Again?\nYes(1)\nNo(2)\nYour Choice: ");
     playAgain = scan.nextInt();
     System.out.println();
     if (playAgain >= 3 || playAgain <= 0)
     {
      System.out.println("Please, Pick One Of The Options");
     }
    } while (playAgain >= 3 || playAgain <= 0);
   }
   if (userGameChoice == 2)
   {
    for (int turn = 0; win != 1 && turn < 9; turn++)
    {
     do
     {
      System.out.print(player + ",\nChoose One Of The Options Below:\n\n\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n\n" + player + "'s Choice: ");
      userChoice = scan.nextInt();
      System.out.println();
      if (userChoice >= 10 || userChoice <= 0)
      {
       System.out.print("Please ");
      }
     } while (userChoice >= 10 || userChoice <= 0);
     if ((turn %2) == 0)
     {
      do
      {
       if (userChoice == 1)
       {
        if ( a == "1")
        {
         a = "X";
         A = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 2)
       {
        if ( b == "2")
        {
         b = "X";
         B = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 3)
       {
        if (c == "3")
        {
         c = "X";
         C = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 4) 
       {
        if ( d == "4")
        {
         d = "X";
         D = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 5) 
       {
        if ( e == "5")
        {
         e = "X";
         E = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 6) 
       {
        if ( f == "6")
        {
         f = "X";
         F = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 7) 
       {
        if ( g == "7")
        {
         g = "X";
         G = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 8) 
       {
        if ( h == "8")
        {
         h = "X";
         H = 1;
         chooseAgain = 1;
        }
       }
       if (userChoice == 9) 
       {
        if ( i == "9")
        {
         i = "X";
         I = 1;
         chooseAgain = 1;
        }
       }
       if (chooseAgain == 0)
       {
        System.out.print("Please,\n" + player + ",\nChoose One Of The Options Below:\n\n\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n\n" + player + "'s Choice: ");        
        userChoice = scan.nextInt();
        System.out.println();
       }
      } while (chooseAgain == 0);
      chooseAgain = 0;
      player = "Player Two";
     }
     if ((turn %2) != 0)
     {
      do
      {
       if (userChoice == 1)
       {
        if ( a == "1")
        {
         a = "O";
         A = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 2)
       {
        if ( b == "2")
        {
         b = "O";
         B = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 3)
       {
        if (c == "3")
        {
         c = "O";
         C = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 4)
       {
        if ( d == "4")
        {
         d = "O";
         D = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 5)
       {
        if ( e == "5")
        {
         e = "O";
         E = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 6)
       {
        if ( f == "6")
        {
         f = "O";
         F = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 7)
       {
        if ( g == "7")
        {
         g = "O";
         G = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 8)
       {
        if ( h == "8")
        {
         h = "O";
         H = 2;
         chooseAgain = 1;
        }
       }
       if (userChoice == 9)
       {
        if ( i == "9")
        {
         i = "O";
         I = 2;
         chooseAgain = 1;
        }
       }
       if (chooseAgain == 0)
       {
        System.out.print("Please,\n" + player + ",\nChoose One Of The Options Below:\n\n\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n\n" + player + "'s Choice: ");
        userChoice = scan.nextInt();
        System.out.println();
       }
      } while (chooseAgain == 0);
      chooseAgain = 0;
      player = "Player One";
     }
     if (A == 1 && B == 1 && C == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (A == 1 && D == 1 && G == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (A == 1 && E == 1 && I == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (D == 1 && E == 1 && F == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (B == 1 && E == 1 && H == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (C == 1 && E == 1 && G == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (G == 1 && H == 1 && I == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (C == 1 && F == 1 && I == 1)
     {
      win = 1;
      winner = "Player One";
     }
     if (A == 2 && B == 2 && C == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (A == 2 && D == 2 && G == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (A == 2 && E == 2 && I == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (D == 2 && E == 2 && F == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (B == 2 && E == 2 && H == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (C == 2 && E == 2 && G == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (G == 2 && H == 2 && I == 2)
     {
      win = 1;
      winner = "Player Two";
     }
     if (C == 2 && F == 2 && I == 2)
     {
      win = 1;
      winner = "Player Two";
     }
    }
    System.out.println("\t(" + a + ")(" + b + ")(" + c + ")\n\t(" + d + ")(" + e + ")(" + f + ")\n\t(" + g + ")(" + h + ")(" + i + ")\n");
    System.out.println("The Winner Is: " + winner + "\n");
    do
    {
     System.out.print("Do You Want To Play Again?\nYes(1)\nNo(2)\nYour Choice: ");
     playAgain = scan.nextInt();
     System.out.println();
     if (playAgain >= 3 || playAgain <= 0)
     {
      System.out.println("Please, Pick One Of The Options");
     }
    } while (playAgain >= 3 || playAgain <= 0);
   }
   if (playAgain == 1)
   {
     do//kindly forces the user to pick one of the options
     {
      System.out.print("Do you want to play:\nPlayer v. Computer(1)\nPlayer v. Player(2)\nYour Choice: ");
      userGameChoice = scan.nextInt();
      System.out.println();
     } while (userGameChoice >= 3 || userGameChoice <= 0);
     win = 0;
     a = "1"; b = "2"; c = "3"; d = "4"; e = "5"; f = "6"; g = "7"; h = "8"; i = "9";
     A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0; I = 0;
     winner = "Nobody";
     player = "Player One";
   }
  }
  System.out.println("Thanks For Playing!\nHave A Nice Day!");
 }
}