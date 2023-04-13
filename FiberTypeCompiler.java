public class FiberTypeCompiler {
    
    // Calcula o número de componentes ópticos necessários para uma determinada distância e tipo de fibra
    public int calculateOpticalComponents(int distance, String fiberType) {
        int numComponents = 0;
        
        if (fiberType.equals("A")) {
            numComponents = 0; // Não são necessários componentes ópticos para a fibra A
        } else if (fiberType.equals("B")) {
            if (distance > 7 && distance <= 25) {
                numComponents = (distance - 7) / 7; // Adiciona um OADM a cada 7km a partir de 7,001km
            } else if (distance > 25 && distance <= 50) {
                numComponents = (distance - 25) / 10; // Adiciona um ROADM a cada 10km a partir de 25,001km
            } else if (distance > 50 && distance <= 80) {
                numComponents = ((distance - 50) / 10) * 2; // Adiciona dois ROADMs a cada 10km a partir de 50,001km
            }
        } else if (fiberType.equals("C")) {
            if (distance > 25 && distance <= 50) {
                numComponents = (distance - 25) / 10; // Adiciona um ROADM a cada 10km a partir de 25,001km
            } else if (distance > 50 && distance <= 80) {
                numComponents = ((distance - 50) / 10) * 2; // Adiciona dois ROADMs a cada 10km a partir de 50,001km
            }
        } else if (fiberType.equals("D")) {
            if (distance > 50 && distance <= 80) {
                numComponents = ((distance - 50) / 10) * 2; // Adiciona dois ROADMs a cada 10km a partir de 50,001km
            }
        }
        
        return numComponents;
    }
}
