# Tasker - Projeto Final em JAVA

Este é o README do projeto Tasker, nosso projeto final desenvolvido em JAVA. Ele tem como objetivo fornecer uma visão geral das tecnologias utilizadas e da estrutura do projeto.

## Tecnologias

### O projeto Tasker utiliza as seguintes tecnologias:

Spring Boot: A arquitetura do projeto é baseada no Spring Boot, que oferece uma ampla gama de ferramentas para desenvolvimento web.
Thymeleaf: O Thymeleaf é utilizado para a construção do frontend. É um motor de templates que facilita a criação de páginas dinâmicas e interativas, permitindo a integração com o backend do aplicativo.
Thymeleaf-layout-dialog: Esta biblioteca é adicionada para promover a reutilização de código e melhorar a experiência do usuário ao oferecer diálogos intuitivos.
Lombok: O Lombok é utilizado para acelerar o desenvolvimento, eliminando a necessidade de escrever código boilerplate repetitivo.
ModelMapper: O ModelMapper é utilizado para facilitar o mapeamento e conversão de objetos, permitindo a transferência eficiente de dados entre diferentes camadas do aplicativo.

# Camadas

O projeto Tasker segue a seguinte estrutura de camadas:

Entity (ou Model): Essa camada representa as entidades principais do sistema, que no caso são as tarefas do Tasker.
Repository: O Repository é responsável por salvar e recuperar os dados relacionados às tarefas.
Service: A camada de Service contém as regras de negócio do projeto. Aqui são definidas as operações e validações relacionadas às tarefas.
Controller: O Controller recebe as requisições da interface do usuário e coordena as ações apropriadas na camada de Service.
View: A camada de View é responsável por apresentar a interface do usuário e receber suas interações, permitindo que os usuários interajam com o sistema Tasker.
Esse README.md fornece uma visão geral do projeto Tasker, abordando as tecnologias utilizadas e a estrutura de camadas implementada.
