package ProjetoVeiculosEstagiario;

public class Motocicleta extends Veiculo 
{
    private boolean partidaEletrica;
    private String tipo;

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao,boolean partidaEletrica, String tipo) 
    {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao);
        this.partidaEletrica = partidaEletrica;
        this.tipo = tipo;
    }

    // Utilização de get e set para modificar e acessar os atributos encapsulados.
    public boolean isPartidaEletrica() 
    {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) 
    {
        this.partidaEletrica = partidaEletrica;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }
}