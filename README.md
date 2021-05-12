# CoresNoTerminal-Java :coffee:

O seguinte repositório tem como objetivo facilitar o uso de cores no terminal em programas escritos em Java. 

Código escrito em português! 

## Cor no texto :pencil2:

#### **Classe**: [CorTexto](https://github.com/VictorDMe/CoresNoTerminal-Java/blob/main/format/CorTexto.java)

#### **Métodos**: 

1 - ```CorTexto.[cor desejada](String, Boolean);```

  * O **Boolean** é OPCIONAL e assume por padrão o valor true.
    - **true**: Irá retirar a cor após o uso.
    - **false**: Não irá retirar a cor após o uso.

2 - ```CorTexto.resetCor();```
  * Retorna o ANSI code que reseta as cores.

3 - ```CorTexto.resetAll();```
  * Retorna o ANSI code que reseta tudo.
  * Método padrão existente em todos as classes desse programa.

### Exemplo de uso :cd:
```java
import format.CorTexto;

CorTexto cor = new CorTexto();

System.out.println(cor.vermelho("Texto vermelho"));

System.out.println(cor.verde("Texto em verde"));

System.out.println(cor.amarelo("Texto em amarelo"));

System.out.println(cor.azul("Texto em azul"));

System.out.println(cor.rosa("Texto em rosa"));

System.out.println(cor.ciano("Texto em ciano"));

System.out.println(cor.cinza("Texto em cinza"));

```

*Execução*:

![Cor no texto](https://user-images.githubusercontent.com/67445953/117902385-adc95b80-b2a3-11eb-953f-7aac1750e665.png)


## Cor de fundo :mushroom:

#### **Classe**: [CorFundo](https://github.com/VictorDMe/CoresNoTerminal-Java/blob/main/format/CorFundo.java)

#### **Métodos**: 

1 - ```CorFundo.[cor desejada](String, Boolean);```

  * O **Boolean** é OPCIONAL e assume por padrão o valor true.
    - **true**: Irá retirar o fundo após o uso.
    - **false**: Não irá retirar o fundo após o uso.

2 - ```CorTexto.resetFundo();```
  * Retorna o ANSI code que reseta o fundo.

3 - ```CorTexto.resetAll();```
  * Retorna o ANSI code que reseta tudo.
  * Método padrão existente em todos as classes desse programa.

### Exemplo de uso :cd:
```java
import format.CorFundo;

CorFundo fundo = new CorFundo();

System.out.println(fundo.vermelho("Fundo vermelho"));

System.out.println(fundo.verde("Fundo verde"));

System.out.println(fundo.amarelo("Fundo amarelo"));

System.out.println(fundo.azul("Fundo azul"));

System.out.println(fundo.rosa("Fundo rosa"));

System.out.println(fundo.ciano("Fundo ciano"));

System.out.println(fundo.cinza("Fundo cinza"));
```

*Execução*:

![Cor de fundo](https://user-images.githubusercontent.com/67445953/117902420-c9346680-b2a3-11eb-97ad-a75cad6ff449.PNG)

## Outras formatações :black_nib:

#### **Classe**: [Texto](https://github.com/VictorDMe/CoresNoTerminal-Java/blob/main/format/Texto.java)

#### **Métodos**: 

1 - 
```java 
Texto.negrito(String, Boolean);

Texto.italic(String, Boolean);
       
Texto.sublinhado(String, Boolean);
```

  * O **Boolean** é OPCIONAL e assume por padrão o valor true.
    - **true**: Irá retirar o fundo após o uso.
    - **false**: Não irá retirar o fundo após o uso.

2 - ```CorTexto.resetAll();```
  * Retorna o ANSI code que reseta tudo.
  * Método padrão existente em todos as classes desse programa.

### Exemplo de uso :cd:
```java
import format.Texto;

Texto texto = new Texto();

System.out.println(texto.negrito("Texto em negrito"));

System.out.println(texto.italic("Texto em itálico"));

System.out.println(texto.sublinhado("Texto sublinhado"));

```

*Execução*:

![Formações de texto](https://user-images.githubusercontent.com/67445953/117903189-79569f00-b2a5-11eb-811e-1d45ed2eb607.png)



