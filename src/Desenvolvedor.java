public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    @Override
    public float calcularBonificacao() {
        return getSalario() * 0.10f;
    }
}
