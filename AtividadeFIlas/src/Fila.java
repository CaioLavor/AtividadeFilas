public class Fila
{

    private Elemento inicio;
    private Elemento fim;
    private int tamanho;

    public Fila()
    {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean isEmpty()
    {
        return this.tamanho == 0;
    }

    public int tamanho()
    {
        return this.tamanho;
    }

    public void enfileirar(Object dado)
    {
        Elemento elemento = new Elemento(dado);
        if(isEmpty())
        {
            this.inicio = elemento;
            this.fim = elemento;
        }else
        {
            this.fim.seguinte = elemento;
            this.fim = elemento;
        }
        this.tamanho++;
    }

    public void desenfileirar()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Não há objeto na fila");
        }
        this.inicio = this.inicio.seguinte;
        this.tamanho--;
        if(this.tamanho == 0)
        {
            this.fim = null;
        }
    }

    public Object inicio()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Não há objeto na fila");
        }
        return this.inicio.dado;
    }

    @Override
    public String toString()
    {
        if(isEmpty())
        {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Elemento atual = this.inicio;
        while(atual != null)
        {
            builder.append(atual.dado);
            builder.append(", ");
            atual = atual.seguinte;
        }
        builder.append("]");
        return builder.toString();
    }

    public void inverter()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Não há objeto na fila");
        }

        Pilha pilha = new Pilha();

        while(!isEmpty())
        {
            pilha.push((char) inicio());
            desenfileirar();
        }

        while(pilha.tamanho > 0)
        {
            enfileirar(pilha.pop());
        }
    }

    public int contador(Object dado)
    {   
        if(isEmpty())
        {
            throw new IllegalStateException("Não há objeto na fila");
        }

        int conta = 0;
        int tamanhoOri = this.tamanho;

        for(int i = 0; i < tamanhoOri; i++)
        {
            Object elementoAtual = inicio();
            desenfileirar();

            if(elementoAtual.equals(dado))
            {
                conta++;
            }
            enfileirar(elementoAtual);
        }
        return conta;
    }

}
