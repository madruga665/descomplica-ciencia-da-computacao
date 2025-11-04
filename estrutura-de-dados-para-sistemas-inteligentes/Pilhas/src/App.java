public class App {
    public static void main(String[] args) throws Exception {
        Pilha minhaPilha = new Pilha(5);

        minhaPilha.empilhar(1);
        minhaPilha.empilhar(2);

        System.out.println(minhaPilha.tamanho);
        minhaPilha.elementoTopo();
        minhaPilha.mostrarPilha();
    }
}
