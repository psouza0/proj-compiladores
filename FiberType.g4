grammar FiberType;

// Define a regra para um número inteiro positivo
NUMBER: [0-9]+;

// Define a regra para ignorar espaços em branco, tabulações e quebras de linha
SPACES: [ \t\n\r]+ -> skip;

// Define as regras da gramática
distance: NUMBER;
fiberType: 'A' | 'B' | 'C' | 'D';
opticalComponent: 'OADM' | 'ROADM';
fibertypeSelection: 'Use fiber type' fiberType;
opticalComponentAddition: 'Add' NUMBER opticalComponent 'every' NUMBER 'km';
distanceAndFiberTypeSelection: fibertypeSelection 'for distances up to' distance 'km' (opticalComponentAddition)?;

//Define a regra para um número inteiro positivo
INT: [0-9]+;
