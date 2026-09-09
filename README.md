# POO-Sistema-de-folha-de-pagamento

## Atividade Desenvolvida

Este projeto implementa um sistema de folha de pagamento para a empresa fictícia TechSolutions, capaz de calcular automaticamente a remuneração de diferentes categorias de funcionários. O sistema foi desenvolvido em Java e permite cadastrar gerentes, desenvolvedores e vendedores, cada um com sua própria regra de bonificação, sem a necessidade de recalcular manualmente os valores em planilhas.

O projeto contempla:

uma classe abstrata Funcionario, responsável pelos dados e regras comuns a todo funcionário;

três classes especializadas (Gerente, Desenvolvedor e Vendedor), cada uma com sua própria regra de bonificação;

uma classe Main, que demonstra a criação dos funcionários, o cálculo individual da remuneração e o cálculo do total da folha de pagamento da empresa.

Conceitos Aplicados
Herança: as classes Gerente, Desenvolvedor e Vendedor estendem Funcionario, reaproveitando atributos e comportamentos comuns (nome, CPF, salário, validação e cálculo da remuneração total).

Classes abstratas e métodos abstratos: Funcionario é abstrata e não pode ser instanciada diretamente; o método calcularBonificacao() é declarado como abstrato, obrigando cada subclasse a fornecer sua própria implementação.

Polimorfismo: o método calcularRemuneracaoTotal(), definido uma única vez na superclasse, invoca calcularBonificacao() e se comporta de forma diferente dependendo do tipo real do objeto em tempo de execução.

Encapsulamento: os atributos nome, cpf e salario são privados e acessíveis apenas por meio de métodos de consulta (getters), sem a existência de métodos que alterem esses dados livremente após a criação do objeto.

Tratamento de exceções: dados inválidos (nome vazio, CPF vazio, salário menor ou igual a zero, total vendido negativo) disparam IllegalArgumentException, impedindo a criação de um objeto com estado inconsistente.

Coleções genéricas: uso de ArrayList<Funcionario> para armazenar funcionários de tipos diferentes em uma única estrutura, percorrida com laço for-each.

Solução Adotada

A validação dos dados de cadastro (nome, CPF, salário e total vendido) foi implementada diretamente nos construtores, utilizando throw new IllegalArgumentException(...). Essa abordagem impede que um objeto com dados inválidos chegue a ser criado, em vez de apenas exibir uma mensagem de erro e permitir que o objeto exista de forma inconsistente. Na Main, essas tentativas de cadastro inválido são tratadas com blocos try/catch, permitindo que o programa continue a execução normalmente após capturar e reportar o erro.

Cada subclasse implementa calcularBonificacao() de acordo com sua regra específica:

Gerente: 20% do salário;
Desenvolvedor: 10% do salário;
Vendedor: 5% do salário mais uma comissão de 5% sobre o total vendido no mês (atributo exclusivo desta classe).

O cálculo do total da folha de pagamento é feito percorrendo a ArrayList<Funcionario> e somando o retorno de calcularRemuneracaoTotal() de cada funcionário, sem que a Main precise conhecer as regras internas de cada categoria — toda a lógica de cálculo fica encapsulada nas respectivas classes.

