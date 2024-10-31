public class Elemento
{
    
    final Object dado;
    Elemento seguinte;

    public Elemento(Object dado)
    {
        this.dado = dado;
        this.seguinte = null;
    }

    @Override
    public String toString()
    {
        return this.dado.toString();
    }

}

