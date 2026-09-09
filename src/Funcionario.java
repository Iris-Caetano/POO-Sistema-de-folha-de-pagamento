public abstract class Funcionario {
    private String nome;
    private String cpf;
    private float salario;

    public Funcionario (String nome, String cpf, float salario){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        if (cpf == null || cpf.isEmpty()){
            throw new IllegalArgumentException("O cpf não pode ser vazio");
        }
        if (salario <= 0){
            throw new IllegalArgumentException("Salário deve ser maior que zero");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public float getSalario(){
        return salario;
    }

    public abstract float calcularBonificacao();

    public float calcularRemuneracaoTotal(){
        return this.salario + this.calcularBonificacao();
    }

    public void exibirHolerite(){
        IO.println("Nome: " + nome);
        IO.println("Cpf: " + cpf);
        IO.println("Salário: " + salario);
        IO.println("Bonificação: " + calcularBonificacao());
        IO.println("Remuneração Total: R$ " + calcularRemuneracaoTotal());
    }
}
