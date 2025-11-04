public class Pilha {
  int tamanho;
  int topo;
  int vetor[];

  Pilha(int tam) {
    topo = -1;
    tamanho = tam;
    vetor = new int[tam];
  }
  
  public boolean pilhaVazia() {
    if (topo == -1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean pilhaCheia() {
    if (topo >= tamanho - 1) {
      return true;
    } else {
      return false;
    }
  }

  public void empilhar(int elemento) {
    if (!pilhaCheia()) {
      topo = topo + 1;
      vetor[topo] = elemento;
    } else {
      System.out.println("Pilha cheia");
    }
  }

  public int desempilhar() {
    int desempilhado = 0;
    
    if (pilhaVazia()) {
      System.out.println("Pilha Vazia");
    } else {
      desempilhado = vetor[topo];
      topo = topo -1;
    }

    return desempilhado;
  }

  public void elementoTopo() {
    if (topo >= 0) {
      System.out.println("O elemento do topo é " + vetor[topo]);
    } else {
      System.out.println("Pilha Vazia");
    }
  }

  public void mostrarPilha() {
    int i;

    for (i = topo; i >= 0; i--) {
      System.out.println("Elemento " + vetor[i] + " posição " + i + " da Pilha");
    }
  }
}
