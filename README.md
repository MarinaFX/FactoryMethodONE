3. Factory Method
3.1.Exercício:
Construa um programa que receba como parâmetro um ou mais nomes, cada um podendo estar em um dos
seguintes formatos:
§ "nome sobrenome";
§ "sobrenome, nome".
Escreva duas aplicações de construção de nomes, uma para cada formato. Cada uma deve ser responsável
por armazenar os nomes criados e imprimi-los quando requisitado. Implemente o padrão Factory Method de
forma que somente a criação do nome seja delegada às aplicações concretas (subclasses). Seu programa
deve criar as duas aplicações e construir objetos da classe Nome, que deve ter propriedades nome e
sobrenome para armazenar as informações em separado. Os nomes não precisam ser impressos em ordem.
Ex.:
$ java Nomes "McNealy, Scott" "James Gosling" "Naughton, Patrick"
James Gosling
Scott McNealy
Patrick Naughton
