## COMO EXECUTAR

### Pré-Requisítos
  - JDK11: https://jdk.java.net/java-se-ri/11
  - Maven: https://downloads.apache.org/maven/maven-3/3.6.3/binaries/


 ### Fazer download ou clonar do projeto:
- Para análise do código você pode utilizar a IDE de sua preferência para abrir o projeto.
- Para executar o projeto:
    - mvn clean install
    - Nevagar via terminal até o diretório do projeto, entrar no diretorio target e executar o seguinte comando:
    - java -jar validate-password-0.0.1-SNAPSHOT.jar
- Se o status tiver started, só acessar o link no navegador:
    - http://localhost:8080/challenge/swagger-ui/index.html#
    
## SOLUÇÃO

- Devido já ter utilizado Expressão Regular em alguns projetos Javascript, foi a primeira solução que veio na minha cabeça.
    
  - Aí pensei em utilizar o Bean Validation, para validar null, tamanho inicial, vazio, etc, só que teria que substituir a exceção dele.
  - Optei por utilizar a Classe Pattern do java util regex e fazer todas as validações nela.
  - Alguns minutos de google para relembrar as validações e montei no site: https://regex101.com/r/0lEuae/
 - Desenvolvimento da aplicação:
    
    - Swagger, Javadoc, Log info, princípio de inversão de dependecia, segregação de interface, nomes de variaveis e métodos de acordo com a classe, testes unitários.  
