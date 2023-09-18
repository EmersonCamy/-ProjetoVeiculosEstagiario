package ProjetoVeiculosEstagiario;

public class Carro extends Veiculo 
{
    private int numeroPortas;
    private int capacidadePessoas;

    public Carro(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao,int numeroPortas, int capacidadePessoas) 
    {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
        this.capacidadePessoas = capacidadePessoas;
    }

    // Utilização de get e set para modificar e acessar os atributos encapsulados.
    public int getNumeroPortas() 
    {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) 
    {
        this.numeroPortas = numeroPortas;
    }

    public int getCapacidadePessoas() 
    {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) 
    {
        this.capacidadePessoas = capacidadePessoas;
    }
}
