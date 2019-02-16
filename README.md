# sistema-pedidos-spring

API REST escrita em Java (projeto prático do curso https://www.udemy.com/uml-diagrama-de-classes/)

## Diagrama de classes UML

![](https://raw.githubusercontent.com/carlosdaniiel07/sistema-pedidos-spring/master/Diagrama%20de%20classes%20UML%20(Astah)/Diagrama%20de%20classes.png)

## Principais endpoints

| Descrição                                                                              | Endpoint       |
|----------------------------------------------------------------------------------------|----------------|
| Exibe os todos os clientes, seus endereços e seus telefones                            | /clientes      |
| Exibe um cliente específico junto com os seus endereços e seus telefones               | /clientes/{id} |
| Exibe todos os pedidos, os seus itens, os produtos, o pagamento e também o cliente     | /pedidos       |
| Exibe um pedido específico, os seus itens, os produtos, o pagamento e também o cliente | /pedidos/{id}  |
