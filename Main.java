package ProjetoVeiculosEstagiario;

public class Main 
{
    public static void main(String[] args) 
    {
        // Criando um objeto de cada classe desenvolvida.
        Caminhao caminhao = new Caminhao(123, "Ford Cargo", "Modelo A", "Branco", "123456789", "ABC1234", 2022, 2022, 2, 5000.0, 10000.0);
        Aviao aviao = new Aviao(456, "Boeing 747", "Modelo B", "Branco", "987654321", "DEF5678", 2020, 2020, "Boeing", 300, 900.0);
        Carro carro = new Carro(789, "Toyota Corolla", "Modelo C", "Prata", "246813579", "GHI9012", 2021, 2021, 4, 5);
        Motocicleta motocicleta = new Motocicleta(101112, "Honda CG 150", "Modelo D", "Preto", "135792468", "JKL3456", 2022, 2022, true, "Esportiva");
        Onibus onibus = new Onibus(131415, "Mercedes-Benz", "Modelo E", "Azul", "864209753", "MNO7890", 2022, 2022, 40, 2);

        // Imprimindo as informações de cada objeto.
        System.out.println("Informações do Caminhão:");
        System.out.println("Código: " + caminhao.getCodigo());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Chassi: " + caminhao.getChassi());
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Ano de Modelo: " + caminhao.getAnoModelo());
        System.out.println("Ano de Fabricação: " + caminhao.getAnoFabricacao());
        System.out.println("Eixos: " + caminhao.getEixos());
        System.out.println("Peso Líquido: " + caminhao.getPesoLiquido());
        System.out.println("Peso Total: " + caminhao.getPesoTotal());

        System.out.println();

        System.out.println("Informações do Avião:");
        System.out.println("Código: " + aviao.getCodigo());
        System.out.println("Modelo: " + aviao.getModelo());
        System.out.println("Cor: " + aviao.getCor());
        System.out.println("Chassi: " + aviao.getChassi());
        System.out.println("Placa: " + aviao.getPlaca());
        System.out.println("Ano de Modelo: " + aviao.getAnoModelo());
        System.out.println("Ano de Fabricação: " + aviao.getAnoFabricacao());
        System.out.println("Fabricante: " + aviao.getFabricante());
        System.out.println("Capacidade de Passageiros: " + aviao.getCapacidadePassageiros());
        System.out.println("Velocidade Máxima: " + aviao.getVelocidadeMaxima());

        System.out.println();

        System.out.println("Informações do Carro:");
        System.out.println("Código: " + carro.getCodigo());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Chassi: " + carro.getChassi());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Ano de Modelo: " + carro.getAnoModelo());
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Número de Portas: " + carro.getNumeroPortas());
        System.out.println("Capacidade de Pessoas: " + carro.getCapacidadePessoas());

        System.out.println();

        System.out.println("Informações da Motocicleta:");
        System.out.println("Código: " + motocicleta.getCodigo());
        System.out.println("Tipo: " + motocicleta.getTipo());
        System.out.println("Modelo: " + motocicleta.getModelo());
        System.out.println("Cor: " + motocicleta.getCor());
        System.out.println("Chassi: " + motocicleta.getChassi());
        System.out.println("Placa: " + motocicleta.getPlaca());
        System.out.println("Ano de Modelo: " + motocicleta.getAnoModelo());
        System.out.println("Ano de Fabricação: " + motocicleta.getAnoFabricacao());
        System.out.println("Possui Partida Elétrica: " + motocicleta.isPartidaEletrica());;

        System.out.println();

        System.out.println("Informações do Ônibus:");
        System.out.println("Código: " + onibus.getCodigo());
        System.out.println("Modelo: " + onibus.getModelo());
        System.out.println("Cor: " + onibus.getCor());
        System.out.println("Chassi: " + onibus.getChassi());
        System.out.println("Placa: " + onibus.getPlaca());
        System.out.println("Ano de Modelo: " + onibus.getAnoModelo());
        System.out.println("Ano de Fabricação: " + onibus.getAnoFabricacao());
        System.out.println("Capacidade de Passageiros: " + onibus.getNumeroAssentos());
        System.out.println("Número de Portas: " + onibus.getNumeroPortas());

        System.out.println();
    }
}

