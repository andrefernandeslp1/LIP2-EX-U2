import java.io.*;

public class LerDados {

  // ler número inteiro do usuário
  public int lerInteiro() {
    int n = 0;
    try {
      n = Integer.parseInt(System.console().readLine());
    } catch (NumberFormatException e) {
      System.out.println("Erro: " + e.getMessage());
    }
    return n;
  }
  /*
  // ler numero inteiro do usuário usando scanner
  public int lerInteiro() {
    int n = 0;
    try {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Erro: " + e.getMessage());
    }
    return n;
  }
  */

  public void lerArquivo(String nomeArquivo) {
    try {
      FileReader fr = new FileReader(nomeArquivo);
      BufferedReader br = new BufferedReader(fr);
      String linha = br.readLine();
      while (linha != null) {
        System.out.println(linha);
        linha = br.readLine();
      }
      br.close();
      fr.close();
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
