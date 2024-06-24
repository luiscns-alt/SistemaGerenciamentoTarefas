# **Projeto de Gerenciamento de Tarefas**

Este é um projeto de exemplo que demonstra um sistema simples de gerenciamento de tarefas implementado em Java com a utilização de Spring Boot, Hibernate (JPA), e outros frameworks. O projeto apresenta uma arquitetura em camadas com entidades, repositórios, serviços, controladores e uma fachada para manipulação de tarefas.

## **Tecnologias Utilizadas**

- Java
- Spring Boot
- Hibernate (JPA)
- Maven

## **Arquitetura e Funcionalidades**

O projeto segue as seguintes características principais:

1. **Entidades**: Define a estrutura das entidades, como a entidade `Task`.
2. **Repositórios**: Implementa operações de persistência e consultas personalizadas com o banco de dados.
3. **Serviços**: Lógica de negócio para manipulação das tarefas.
4. **Controladores**: Recebem e respondem a requisições HTTP relativas às tarefas.
5. **Fachada (TaskFacade)**: Unifica o acesso aos serviços relacionados às tarefas, simplificando a interação.

## **Padrões de Design**

O projeto incorpora boas práticas de design e utiliza os seguintes padrões de design:

- **Factory Method**: Utilizado na criação de instâncias de diferentes tipos de tarefas.
- **Injeção de Dependência**: Através das anotações do Spring (`@Autowired`) para facilitar a modularidade e reutilização de componentes.

## **Configuração e Execução**

1. Clone o repositório do projeto.
2. Importe o projeto em sua IDE preferida.
3. Certifique-se de ter o Maven configurado.
4. Execute o projeto utilizando o comando `mvn spring-boot:run`.
5. Acesse os endpoints a partir do seu navegador ou ferramenta de teste de API REST.
