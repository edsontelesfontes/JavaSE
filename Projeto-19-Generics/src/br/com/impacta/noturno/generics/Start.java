package br.com.impacta.noturno.generics;

public class Start {

  public static void main(String[] args) {
    
    /* Define o casal de cachorros */
    Casal<Cachorro> casal1 = new Casal<>();
    
    Cachorro c1 = new Cachorro("Rex", "Pastor Alemão");
    Cachorro c2 = new Cachorro("July", "Boxer");
    
    casal1.setMarido(c1);
    casal1.setMulher(c2);
    
    /* Define o casal de gatos */
    Casal<Gato> casal2 = new Casal<>();
    
    Gato g1 = new Gato("Nino", "Amarelo");
    Gato g2 = new Gato("Susie", "Branco");
    
    casal2.setMarido(g1);
    casal2.setMulher(g2);
    
    /* Define o casal de pessoas */
    Casal<Pessoa> casal3 = new Casal<>();
    
    Pessoa p1 = new Pessoa("Joao", 26);
    Pessoa p2 = new Pessoa("Maria", 22);
    
    casal3.setMarido(p1);
    casal3.setMulher(p2);
    
    System.out.println("Casal de cachorros");
    System.out.println("Marido: " +
        casal1.getMarido().getNome() + " - " +
        casal1.getMarido().getRaca());
    System.out.println("Mulher: " +
        casal1.getMulher().getNome() + " - " +
        casal1.getMulher().getRaca());
    
    System.out.println();
    
    System.out.println("Casal de gatos");
    System.out.println("Marido: " +
        casal2.getMarido().getNome() + " - " +
        casal2.getMarido().getCor());
    System.out.println("Mulher: " +
        casal2.getMulher().getNome() + " - " +
        casal2.getMulher().getCor());
    
    System.out.println();
    
    System.out.println("Casal de pessoas");
    System.out.println("Marido: " +
        casal3.getMarido().getNome() + " - " +
        casal3.getMarido().getIdade() + " anos");
    System.out.println("Mulher: " +
        casal3.getMulher().getNome() + " - " +
        casal3.getMulher().getIdade() + " anos");
  }
}
