import java.util.Random;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    char[][] tablero = {
      { ' ', '|', ' ', '|', ' ' },
      { '-', '+', '-', '+', '-' },
      { ' ', '|', ' ', '|', ' ' },
      { '-', '+', '-', '+', '-' },
      { ' ', '|', ' ', '|', ' ' },
    };
    mostrarTablero(tablero);

    int posicion = pedirPosicion();

    colocarPosicion(tablero, posicion, "Player");
    mostrarTablero(tablero);

    Random rand = new Random();
    int posicionCpu = rand.nextInt(9) + 1;
    colocarPosicion(tablero, posicionCpu, "Cpu");
    mostrarTablero(tablero);
  }

  public static void mostrarTablero(char[][] tablero) {
    for (char[] fila : tablero) {
      for (char c : fila) {
        System.out.print(c);
      }
      System.out.println();
    }
  }

  public static int pedirPosicion() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nIntroduce tu posicion (1-9): ");
    int posicion = sc.nextInt();
    sc.close();
    return posicion;
  }

  public static void colocarPosicion(
    char[][] tablero,
    int posicion,
    String jugador
  ) {
    char simbolo = 'O';

    if (jugador.equals("Player")) {
      simbolo = 'X';
    }

    switch (posicion) {
      case 1:
        tablero[0][0] = simbolo;
        break;
      case 2:
        tablero[0][2] = simbolo;
        break;
      case 3:
        tablero[0][4] = simbolo;
        break;
      case 4:
        tablero[2][0] = simbolo;
        break;
      case 5:
        tablero[2][2] = simbolo;
        break;
      case 6:
        tablero[2][4] = simbolo;
        break;
      case 7:
        tablero[4][0] = simbolo;
        break;
      case 8:
        tablero[4][2] = simbolo;
        break;
      case 9:
        tablero[4][4] = simbolo;
        break;
    }
  }
}
