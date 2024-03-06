import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Matriz app = new Matriz();
        app.start();

    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero de linhas e colunas: ");
        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();

            }

        }
        int n = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == n) {
                    try {
                        System.out.println("posision " + i + "," + j + ":");
                        if(i>0) {
                            System.out.println("up: " + matriz[i - 1][j]);
                        }
                        if(i< matriz.length) {
                            System.out.println("DOWN: " + matriz[i + 1][j]);
                        }
                        if (j>0) {
                            System.out.println("esquerda: " + matriz[i][j - 1]);
                        }
                        if(j< matriz.length) {
                            System.out.println("direita: " + matriz[i][j + 1]);
                        }

                    } catch (Exception exception) {
                        break;
                    }

                }

            }
        }

    }
}
