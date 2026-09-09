void main() {

    Funcionario gerente = new Gerente("joao","53227232855",1000);
    Funcionario desenvolvedor = new Desenvolvedor("maria","1160023800",5000);
    Funcionario vendedor = new Vendedor("Joca","32845668755",2000, 1000);

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(gerente);
    funcionarios.add(desenvolvedor);
    funcionarios.add(vendedor);

    for (Funcionario f : funcionarios){
        f.exibirHolerite();
        IO.println("-----------------------------------");
    }

    double totalFolha = 0;
    for (Funcionario f : funcionarios){
        totalFolha += f.calcularRemuneracaoTotal();
    }
    IO.println("Total da folha de pagamento: R$ " + totalFolha);

    try {
        Funcionario invalido1 = new Gerente("","555555554555",5000);
    }catch (IllegalArgumentException e){
        IO.println("Erro ao criar funcionário (nome vazio): " + e.getMessage());
    }

    try {
        Funcionario invalido2 = new Desenvolvedor("joao","",5000);
    }catch (IllegalArgumentException e){
        IO.println("Erro ao criar funcionário (cpf vazio): " + e.getMessage());
    }

    try {
        Funcionario invalido3 = new Vendedor("joao","22222222222",0,1000);
    }catch (IllegalArgumentException e){
        IO.println("Erro ao criar funcionário (salário zero): " + e.getMessage());
    }


}
