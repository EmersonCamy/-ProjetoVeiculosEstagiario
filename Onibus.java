package ProjetoVeiculosEstagiario;

public class Onibus extends Veiculo 
{
    private int numeroAssentos;
    private int numeroPortas;

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, int numeroAssentos, int numeroPortas) 
    {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao);
        this.numeroAssentos = numeroAssentos;
        this.numeroPortas = numeroPortas;
    }

    // Utilização de get e set para modificar e acessar os atributos encapsulados.
    public int getNumeroAssentos() 
    {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) 
    {
        this.numeroAssentos = numeroAssentos;
    }

    public int getNumeroPortas() 
    {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) 
    {
        this.numeroPortas = numeroPortas;
    }
}