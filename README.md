## Pesquisa Orientada a Objetos
Realizar uma pesquisa sobre os pilares da programacao orientada a objetos visto em sala de 
aula (**abstracao** e **encapsulamento**). Faca um relatorio escrito com um topico para cada pilar,
ou seja, um topico para abstracao e outro para encapsulamento. 

Para cada topico explique o funcionamento do pilar e apresente um exemplo de uso, de preferencia
que o exemplo seja de sua autoria. A pesquisa deve apresentar as referencias bibliograficas
consulatadas. (Refencias como Wikipedia nao serao aceitas, evite pesquisar somente em sites na 
internet, utilize livros, como o livro disponibilizado para download no google classroom da 
disciplina, ou qualquer outro material didatico de sua preferencia.)*

**Algoritmo**
Livro: Logica de Programaao - A construcao de algoritimos e estruturas de dados 
Capitulo: Estrutura de Controle 03 - Exemplos - b, ALGORITIMO 3.3 
Construa um algoritimo que calcule a quantidade de latas de tinta necessarias e o 
custo para pintar tanques colindricos  * de combustivel, em que sao forncecidos a 
altura(H) e o raio(R) desse cilindro:

**SOLUCAO**
Esvrivi 3 algoritimos. O primeiro resolvendo usando uma estrutura sequencia. _AlgExemplo.java_. 
E em seguida usando uma classe e fazendo a primeira abstracao sem encapsular a classe. No algoritmo
_LataDeTinta01.java, TesteLataDeTinta01.java_ Nesse exemplo os atributos e metodos sao publicos
dando uma nocao de todos os membros acessiveis da classe. No terceiro exemplo  
_LataDeTinta02.java, TesteLataDeTinta02.java, Cilindro.java_ usei tecnicas de encapsulamento
onde alguns metodos e atributos sao privados podendo ser usados paenas pelas classes. 


# Parte I - Abstracao
Quando usamos um artefato atravez de sua interface com o mundo externo, sem necessidade de saber
como e o funcionamento internodesse artefato, estamos praticando a **abstracao**. Abstracao de 
classe e a separacao do _uso_ de uma classe da _implementacao_ dessa clsse. Nesse caso, o 
projetista prove uma descricao desta e deica o usuario saver como ela poder ser usada, sem 
revelar os detalhes da sua implementacao. A  classe e, entao, usada atravez da colecao de metodos
e constantes publicas junto com a descricao de como esses elementos publicos sao esperados se 
comportarem. A implementacao da classe e escondida do usurio, como se fosse uma caixa preta. 
Tambem denominamos essa situacao de **encapsulamento de classe**. Dessa maneira, abstracao e 
encapsulamento sao fundamentais.  

# Parte II - Encapsulamento
Encapsular uma clsse nao e apenas simplificar o seu uso como tambem e util para solucionar
problemas complexos. Podemos usar abstracao quando atacamos um problema complexo dividindo-o
em partes, em que casa parte e uma classe que, por sua vez, e decomposta em outras classe. 
Nesse caso, num primeiro estagio, podemos definir apenas as _assinaturas de metodos_ e 
_constantes publicas_ dessas classes, sem preocupar com a sua implementacao concreta.
Tambem encapsulamos uma classe por seguranca. Tornando uma variavel privada, isto e:
*private static int var = 0;* impedimos a alteracao direta dessa variavel. 
Para poder encapsular os outros campos de dados, precisamos de _metodos de get_ que retornan
valor atual de um campo de dados e de _metodos de set_ que estacem um novo valor para a variavel.
Um metodo get e denominado **metodo de acesso(acessor)**, e um metodo de set e denominado
**metodo modificador(mutator)**.

# Parte II - Modificadores de acesso
Para proteger uma classe a Orientacao a Objetos define formas de acessiblidade aos membros
de uma classe atravez de modificadores. Atravez desses modificadores, o programador pode **encapsular**
os mebros de uma classe, de forma a garantir a sua consistencia. Os membros de uma classe podem ser:

**Publico** - declarado com o modificafor _public_, e acessivel por qualquer objeto instaciado na 
maquina virtual . Normalmente declaramos publicos apenas algumas metodos de uma classe. Os 
membros variaveis sao todos declarados privados rara excecoes. 

**Privado** - declarado com o modificador _private_, e acessivel somente por metodos da propria classe
aonde ja foi declarado.

**Protegido** - declarado com o modificador _protected_, e somente usado somente por metodos de 
sublaclasses da classe onde o mombro foi declarado ou da propria classe aonde o membro doi declarado. 
Esse modificador sera mais aplicado junto com os conceitos de herenca e polimorfismo. 

**Constantes** - um membro declarado com o modificador _final_ nao pode ter sua definicao modificada
por nenhum objeto, nem mesmo um objeto da classe onde o mombro foi declarado. Dizemos que um membro
final e uma constante. No caso da herenca, uma sublasse nao pode sobreccarregar um metodo declarado 
como final na super classe. 


*referencia* 
Introducao a ciencias da computacao com jogos - Aprendendo a programar com entretenimento, Feijo Bruno
Java - Como programar 10 Edicao, Deitel Paul
https://www.w3schools.com/java/java_ref_keywords.asp - Java referencia



# pesquisa_POO
