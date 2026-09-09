public class Vendedor extends Funcionario{

    private float vendidoMes;

    public Vendedor(String nome, String cpf, float salario, float vendidoMes) {
        super(nome, cpf, salario);

        if(vendidoMes < 0){
            throw new IllegalArgumentException("Total vendido inválido!");
        }
        this.vendidoMes = vendidoMes;
    }



    @Override
    public float calcularBonificacao() {
        return (getSalario() * 0.05f) + (vendidoMes * 0.05f);
    }
}
