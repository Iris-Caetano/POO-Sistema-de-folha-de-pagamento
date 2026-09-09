public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    @Override
    public float calcularBonificacao() {
        return getSalario() * 0.20f;
    }
}
