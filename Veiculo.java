package ProjetoVeiculosEstagiario;

public class Veiculo 
{
	// Declaração dos Atributos relacionados a essa classe.
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected String placa;
    protected int anoModelo;
    protected int anoFabricacao;
    
    // Construtor para a classe Veiculo.
    public Veiculo(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
    }
    
    // Utilização de get e set para modificar e acessar os atributos encapsulados.
    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    public String getChassi() 
    {
        return chassi;
    }

    public void setChassi(String chassi) 
    {
        this.chassi = chassi;
    }

    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public int getAnoModelo() 
    {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) 
    {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() 
    {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) 
    {
        this.anoFabricacao = anoFabricacao;
    }
}