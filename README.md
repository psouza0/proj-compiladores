# proj-compiladores
Inicialmente o intuito deste programa seria definir um tipo de fibra ópitca para determiandas distâncias, visando agilizar a escolha da fibra de acordo com as métricas inseridas, que para simplificação de projeto, será a distância.

As regras são:
1. para distância até 7km, será escolhida a fibra do tipo A;
2. para distâncias a patir de 7,001km até 25km, será a fibra do tipo B, com a adição de 1 OADM a cada 7km
3. para distâncias a partir de 25,001km até 50km será a fibra do tipo C, com a adição de 1 ROADM a cada 10km
4. para distâncias a partir de 50,001km até 80km, será a fibra do tipo D, com a adição de 1 ROADM a cada 10km

OADM: equipamento que adiciona ou remove um ou mais comprimentos de onda ópticos (canais) em uma rede óptica

ROADM: equipamento que permite a reconfiguração remota dos comprimentos de onda na rede, facilitando a adição, remoção ou alteração da largura de banda dos canais ópticos sem a necessidade de intervenção manual em pontos específicos da rede.

Este programa está bem simples por que não está levando em consideração as variáves de tipo de terreno, se é distribuição aérea ou subterrânea, comprimento de onda e atenuação de sinal.

Segue passo a passo para execução do mesmo:
