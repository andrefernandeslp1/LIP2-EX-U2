public class App {

  public static void main(String[] args) {

    String operacao = args[0];

    Calculadora calc = new Calculadora();
    LerDados ler = new LerDados();

    if(operacao.equals("divisao")){
      System.out.println("Digite dois números inteiros:");
      int a = ler.lerInteiro();
      int b = ler.lerInteiro();
      calc.divide(a, b);
    }

    else if(operacao.equals("media")){
      //converter args[1] para array de inteiros
      int[] array = new int[args.length - 1];
      for (int i = 0; i < array.length; i++) {
        array[i] = Integer.parseInt(args[i + 1]);
      }
      System.out.println(calc.calcularMedia(array));
    }

    //ler arquivo da linha de comando com o método lerArquivo
    else if(operacao.equals("lerarquivo")){
      String nomeArquivo = args[1];
      ler.lerArquivo(nomeArquivo);
    }

    else{
      System.out.println("Operação inválida");
    }
  }
}
