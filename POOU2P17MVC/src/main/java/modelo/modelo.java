
package modelo;

public class modelo {
    public int v1;
    public int v2;
    public int total;

    public modelo() {
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int sumar() {
       this.total=this.v1+this.v2;
       return this.total;
    }

    public int restar() {
         this.total=this.v1-this.v2;
       return this.total;
    }
    public int multiplicar() {
         this.total=this.v1*this.v2;
       return this.total;
    }
    public int dividir() {
         this.total=this.v1/this.v2;
       return this.total;
    }
    
}

