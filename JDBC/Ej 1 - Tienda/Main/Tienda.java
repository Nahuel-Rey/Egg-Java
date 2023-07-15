
package tienda;

import tienda.Persistencia.productoDAO;
import tienda.Servicios.ProductoService;


public class Tienda {

   
    public static void main(String[] args) throws Exception {
     
        productoDAO pdao = new productoDAO();
        ProductoService ps = new ProductoService(pdao);
        
        ps.buscarxNombre();
        
    }
    
}
