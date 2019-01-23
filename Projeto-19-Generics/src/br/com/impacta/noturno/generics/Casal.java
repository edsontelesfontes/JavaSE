package br.com.impacta.noturno.generics;

public class Casal<T> {

  private T marido;
  private T mulher;

  public T getMarido() {
    return marido;
  }
  
  public void setMarido(T marido) {
    this.marido = marido;
  }
  
  public T getMulher() {
    return mulher;
  }
  
  public void setMulher(T mulher) {
    this.mulher = mulher;
  }
}
