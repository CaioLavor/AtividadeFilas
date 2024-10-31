public class Pilha
{
    Elemento topo;
    int tamanho;

    public Pilha()
    {
        this.topo = null;
        this.tamanho = 0;
    }

    public char pop()
    {
        if (tamanho == 0) {
            throw new IllegalStateException("Não há objeto na pilha");
        }
        Elemento elemento = this.topo;
        char val = (char) elemento.dado;
        topo = topo.seguinte;
        tamanho--;
        return val;
    }

    public void push(char dado)
    {
        Elemento elemen = new Elemento(dado);
        elemen.seguinte = topo;
        topo = elemen;
        tamanho++;
    }
}
