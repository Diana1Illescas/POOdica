package Dianapaquete;

public class MainDiana  {
    public static void main(String[] args) {
    	//y se crearán dos pedidos de productos estándar
        ProductoEstandar productoEstandar1 = new ProductoEstandar("Producto 1", 10.0, "Seccion 1");
        ProductoEstandar productoEstandar2 = new ProductoEstandar("Producto 2", 15.0, "Seccion 2");
        //3 de productos ofertados con ofertas que caducan en 2 días
        ProductoOfertado productoOfertado1 = new ProductoOfertado("Producto 3", 20.0, 2);
        ProductoOfertado productoOfertado2 = new ProductoOfertado("Producto 4", 25.0, 2);
        ProductoOfertado productoOfertado3 = new ProductoOfertado("Producto 5", 30.0, 2);
        
        int unidadesPedidas = 5;
        double totalPedido = 0.0;
        //  Después mostrar el total del pedido teniendo en cuenta que se compran 5 unidades de cada uno
        totalPedido += productoEstandar1.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoEstandar2.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado1.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado2.obtenerPrecioPedido(unidadesPedidas);
        totalPedido += productoOfertado3.obtenerPrecioPedido(unidadesPedidas);
        
        System.out.println("Total del pedido: " + totalPedido);
    }
}