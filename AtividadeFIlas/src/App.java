public class App
{
    public static void main(String[] args) throws Exception
    {
        Fila fila = new Fila();
        
        fila.enfileirar('A');
        fila.enfileirar('B');
        fila.enfileirar('A');
        fila.enfileirar('C');
        fila.enfileirar('A');
        fila.enfileirar('D');

        System.out.println("Fila original: " + fila);

        System.out.println("Número de ocorrências de 'A': " + fila.contador('A'));
        System.out.println("Número de ocorrências de 'B': " + fila.contador('B'));

        fila.inverter();
        System.out.println("Fila após inverter: " + fila);
    }
}