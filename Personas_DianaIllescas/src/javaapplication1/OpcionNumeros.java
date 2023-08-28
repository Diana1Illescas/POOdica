package javaapplication1;
public class OpcionNumeros {
    private double[] notas;
    public OpcionNumeros(double[] notas) {
        this.notas = notas;
    }
    
    public double obtenerMayor() {
        double mayor = notas[0];
        
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        
        return mayor;
    }
    
    public double obtenerMejor() {
        double mejor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < mejor) {
                mejor = notas[i];
            }
        }
        return mejor;
    }
    
    public double obtenerPromedio() {
        double suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        
        double promedio = suma / notas.length;
        return promedio;
    }
    
    public double obtenerPromedioSobre20() {
        double promedio = obtenerPromedio();
        double promedioSobre20 = promedio;
        return promedioSobre20;
    }
    
    public double obtenerSumaTotal() {
        double suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }        
        return suma;
    }
}
