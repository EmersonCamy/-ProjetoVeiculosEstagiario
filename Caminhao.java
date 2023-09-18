package ProjetoVeiculosEstagiario;

public class Caminhao extends Veiculo 
{
    private int eixos; 
    private double pesoLiquido;
    private double pesoTotal; 
    
    // Chama o construtor da classe Caminhao
    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao,int eixos, double pesoLiquido, double pesoTotal) 
    {
        // Chama o construtor da classe pai (Veiculo)
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao);
        // Atribui os valores específicos de Caminhao
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
    }
    
    // Utilização de get e set para modificar e acessar os atributos encapsulados.
    public int getEixos() 
    {
        return eixos;
    }

    public void setEixos(int eixos) 
    {
        this.eixos = eixos;
    }

    public double getPesoLiquido() 
    {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) 
    {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoTotal() 
    {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) 
    {
        this.pesoTotal = pesoTotal;
    }
}
