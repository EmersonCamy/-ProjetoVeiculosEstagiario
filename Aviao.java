package ProjetoVeiculosEstagiario;

// Classe Aviao herda de Atributos da classe Veiculo.
public class Aviao extends Veiculo 
{
	
    private String fabricante;
    private int capacidadePassageiros;
    private double velocidadeMaxima;

    // Chama o construtor da classe Aviao
    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, String fabricante, int capacidadePassageiros, double velocidadeMaxima) 
    {
    	// Chama o construtor da classe pai (Veiculo)
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao);
        // Atribui os valores específicos de Aviao
        this.fabricante = fabricante;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Utilização de get e set para modificar e acessar os atributos encapsulados.
    public String getFabricante() 
    {
        return fabricante;
    }

    public void setFabricante(String fabricante) 
    {
        this.fabricante = fabricante;
    }

    public int getCapacidadePassageiros() 
    {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) 
    {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getVelocidadeMaxima() 
    {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) 
    {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
