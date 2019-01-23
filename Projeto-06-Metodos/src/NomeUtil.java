public class NomeUtil {

  static void exibirNome(String nome, int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      System.out.println(nome);
    }
  }

  static void exibirNome(String nome) {
    exibirNome(nome, 10);
  }

  static void exibirNome() {
    exibirNome("Manuel", 10);
  }

  public static void main(String[] args) {
    exibirNome("Lucas");
    exibirNome("Gomes", 2);
    exibirNome();
    exibirNome("Ricardo");
    exibirNome("Gomes", 8);
    exibirNome();
    exibirNome("Augusto");
    exibirNome("Silvio", 16);
    exibirNome();
  }
}
