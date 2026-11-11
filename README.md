🍽️ Restaurante Delivery (Trabalho desenvolvido em equipe)

Sistema de gerenciamento de restaurante delivery desenvolvido em Java, como projeto acadêmico em equipe, aplicando conceitos de Programação Orientada a Objetos (POO).

📌 Sobre o projeto

O Restaurante Delivery é uma aplicação desenvolvida para simular o funcionamento de um restaurante que trabalha com pedidos e entregas.

O sistema permite organizar pessoas, funcionários, clientes, produtos, cardápios e pedidos, utilizando uma estrutura baseada em classes, objetos e relacionamentos entre diferentes entidades.

O projeto foi desenvolvido com foco na aplicação prática dos conceitos de programação orientada a objetos, organização de código e desenvolvimento de sistemas.

🎯 Objetivos do projeto

- Desenvolver uma aplicação utilizando Java.
- Aplicar os princípios da Programação Orientada a Objetos.
- Trabalhar com herança, encapsulamento, abstração e polimorfismo.
- Implementar funcionalidades de gerenciamento de pessoas e produtos.
- Desenvolver uma estrutura para organização de cardápios e pedidos.
- Praticar o desenvolvimento colaborativo em equipe.

🚀 Funcionalidades

👥 Gerenciamento de pessoas

- Cadastro e gerenciamento de clientes.
- Representação de funcionários.
- Diferenciação de cargos e funções.
- Gerenciamento de informações pessoais.
- Organização e armazenamento de pessoas em repositórios.

🍕 Gerenciamento de produtos e cardápio

- Cadastro de entradas.
- Cadastro de pratos principais.
- Cadastro de sobremesas.
- Cadastro de bebidas.
- Organização dos produtos por categorias.
- Exibição do cardápio.
- Disponibilidade de produtos conforme os dias da semana.
- Informações sobre ingredientes, preços, tempo de preparo e características alimentares.

🛒 Gerenciamento de pedidos

- Realização de pedidos.
- Associação dos pedidos aos clientes.
- Organização dos produtos selecionados.
- Gerenciamento dos itens dos pedidos.
- Controle de status dos pedidos.

🚚 Funcionários e entregas

- Representação de gerentes.
- Representação de cozinheiros.
- Representação de motoboys.
- Organização das responsabilidades dos funcionários.

🛠️ Tecnologias utilizadas

- Java: linguagem utilizada no desenvolvimento da aplicação.
- Eclipse IDE: ambiente de desenvolvimento utilizado.
- JDK: compilação e execução dos códigos Java.

🧠 Conceitos de programação aplicados

Durante o desenvolvimento foram trabalhados conceitos importantes da Programação Orientada a Objetos:

- Classes e objetos: representação das entidades do sistema.
- Encapsulamento: organização e proteção dos atributos e métodos.
- Herança: reutilização de características entre classes relacionadas.
- Abstração: representação de elementos essenciais do sistema.
- Polimorfismo: utilização de diferentes implementações dentro de uma estrutura orientada a objetos.
- Construtores: inicialização dos objetos.
- Enums: representação de categorias e estados definidos.
- Collections: utilização de listas para armazenar e organizar informações.
- Relacionamento entre classes: integração dos diferentes componentes da aplicação.

📂 Estrutura do projeto

Restaurante-Delivery/
│
├── README.md
│
└── src/
    │
    ├── Pessoa/
    │   ├── Cliente.java
    │   ├── ControlePedidos.java
    │   ├── Cozinheiro.java
    │   ├── Funcionario.java
    │   ├── Gerente.java
    │   ├── Motoboy.java
    │   ├── Pessoa.java
    │   ├── PessoaControler.java
    │   ├── RepositorioPessoa.java
    │   └── TestarPessoas.java
    │
    ├── Produtos/
    │   ├── Bebida.java
    │   ├── Entrada.java
    │   ├── FazerPedido.java
    │   ├── IniciarProdutos.java
    │   ├── ItemCardapio.java
    │   ├── MostrarCardapio.java
    │   ├── Pedido.java
    │   ├── PratoPrincipal.java
    │   ├── Produto.java
    │   ├── RepositorioCardapio.java
    │   ├── Sobremesa.java
    │   ├── StatusPedido.java
    │   └── testarCardapios.java
    │
    └── module-info.java

📁 Organização dos pacotes

Pacote Pessoa

Responsável pelas classes relacionadas às pessoas que fazem parte do sistema, incluindo clientes e funcionários.

Contém classes como "Pessoa", "Cliente", "Funcionario", "Gerente", "Cozinheiro" e "Motoboy", além de classes responsáveis pelo controle e armazenamento dessas informações.

Pacote Produtos

Responsável pela estrutura dos produtos, cardápio e pedidos do restaurante.

Contém classes para representar diferentes categorias de alimentos e bebidas, organizar os itens do cardápio, realizar pedidos e controlar seus respectivos status.

▶️ Como executar o projeto

Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- Java JDK.
- Eclipse IDE.

Executando pelo Eclipse

1. Faça o download do projeto ou clone o repositório.
2. Abra o Eclipse IDE.
3. Selecione File → Import → Existing Projects into Workspace, caso tenha baixado o projeto completo.
4. Se necessário, crie um projeto Java e importe os arquivos da pasta "src", preservando os pacotes "Pessoa" e "Produtos".
5. Aguarde a compilação dos arquivos.
6. Para iniciar a aplicação, localize a classe "Pessoa.TestarPessoas".
7. Clique com o botão direito sobre o arquivo.
8. Selecione Run As → Java Application.

Executando o teste do cardápio

Também é possível executar a classe "Produtos.testarCardapios", que possui um método "main" e permite visualizar o funcionamento da estrutura de cardápio.

👩‍💻 Minha contribuição- Stéfani Rodrigues Neves 

O projeto foi desenvolvido em equipe, com divisão de responsabilidades entre os integrantes.

Minha participação foi voltada ao desenvolvimento das classes relacionadas aos produtos e pedidos, sendo responsável pela implementação de cinco classes do pacote "Produtos":

Classe| Responsabilidade
"Entrada.java"| Representação dos produtos da categoria de entradas.
"Sobremesa.java"| Representação dos produtos da categoria de sobremesas.
"PratoPrincipal.java"| Representação dos pratos principais do restaurante.
"Bebida.java"| Representação dos produtos da categoria de bebidas.
"Pedido.java"| Representação e gerenciamento dos pedidos realizados pelos clientes.

Durante essa etapa, trabalhei na implementação das classes, definição de atributos, construtores e métodos, aplicando conceitos de Programação Orientada a Objetos em Java.

🤝 Desenvolvimento em equipe

O projeto foi realizado de forma colaborativa, com cada integrante responsável por diferentes partes da aplicação.

A integração das funcionalidades permitiu construir um sistema com diferentes módulos, trabalhando conjuntamente para representar as operações de um restaurante delivery.

📚 Aprendizados

O desenvolvimento deste projeto proporcionou experiência prática com:

- Desenvolvimento de aplicações utilizando Java.
- Aplicação de conceitos de Programação Orientada a Objetos.
- Criação e organização de classes.
- Relacionamento entre diferentes componentes de um sistema.
- Organização de projetos em pacotes.
- Trabalho em equipe e divisão de tarefas.
- Desenvolvimento de funcionalidades de gerenciamento de produtos e pedidos.
- Utilização do GitHub para documentação e compartilhamento de projetos.

🎓 Finalidade acadêmica

Projeto desenvolvido com finalidade acadêmica para consolidar conhecimentos de Java e Programação Orientada a Objetos, simulando a estrutura e as funcionalidades de um sistema de restaurante delivery.
