# Adicionando e listando itens

O programa deve ler itens do usuário. Quando todos os itens do usuário forem lidos, o programa imprime as informações de cada item.

Para cada item deverá ser lido seu identificador e nome. Se o identificador ou nome estiver vazio, o programa para de solicitar entrada e imprime todas as informações do item.

### Exemplo de impressão:

Exemplo de saída

Identificador? (vazio irá parar)

B07H8ND8HH

Nome? (vazio irá parar)

Figura do He-Man

Identificador? (vazio irá parar)

B07H8ND8HH

Nome? (vazio irá parar)

He-Man

Identificador? (vazio irá parar)

B07NQFMZYG

Nome? (vazio irá parar)

Figura do He-Man

Identificador? (vazio irá parar)

B07NQFMZYG

Nome? (vazio irá parar)

Figura do He-Man

Identificador? (vazio irá parar)

==Itens==

B07H8ND8HH: Figura do He-Man

B07H8ND8HH: He-Man

B07NQFMZYG: Figura do He-Man

B07NQFMZYG: Figura do He-Man

O formato de impressão dos itens deve ser identifier: name.

Atenção! Não imprima os dois pontos (:) em nenhum outro lugar da saída do programa.

## Você imprime apenas uma vez (por item)

Modifique o programa para que após inserir os itens, cada item seja impresso no máximo uma vez. Dois itens devem ser considerados iguais se os seus identificadores forem iguais (pode haver variação nos seus nomes em diferentes países, por exemplo).

Se o usuário inserir o mesmo item diversas vezes, a impressão utilizará o item que foi adicionado primeiro.

### Exemplo de saída

Identificador? (vazio irá parar)

B07H8ND8HH

Nome? (vazio irá parar)

Figura do He-Man

Identificador? (vazio irá parar)

B07H8ND8HH

Nome? (vazio irá parar)

He-Man

Identificador? (vazio irá parar)

B07NQFMZYG

Nome? (vazio irá parar)

Figura do He-Man

Identificador? (vazio irá parar)

B07NQFMZYG

Nome? (vazio irá parar)

Figura do He-Man

Identificador? (vazio irá parar)

==Itens==

B07H8ND8HH: Figura do He-Man

B07NQFMZYG: Figura do He-Man

Dica! Provavelmente é inteligente adicionar cada item à lista no máximo uma vez – compare a igualdade dos objetos com base em seus identificadores.
