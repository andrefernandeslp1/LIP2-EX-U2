// classe calculadora
public class Calculadora {
  // método divide
  public void divide(int a, int b) {
    try {
      System.out.println("Divisão = " + a/b);

    } catch (ArithmeticException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  public double calcularMedia(int[] array) {
    double media = 0;
    try {
      for (int i = 0; i < array.length; i++) {
        media += array[i];
      }
      media /= array.length;
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }
    return media;
  }

}
