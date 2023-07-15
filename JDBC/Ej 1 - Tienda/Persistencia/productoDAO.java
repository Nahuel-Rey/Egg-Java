package tienda.Persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.Entidades.Producto;

public final class productoDAO extends DAO {

    public void cargarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("producto nulo");
            }
            String sql = "INSERT INTO producto"
                    + "(codigo,nombre,precio,codigo_fabricante) "
                    + "VALUES ( " + producto.getCodigo() + " ' , ' " + producto.getNombre() + " ' , ' " + producto.getPrecio() + " ' , ' " + producto.getCodigo_fabricante() + " ' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("producto nulo");
            }
            String sql = "UPDATE producto SET "
                    + "nombre = ' " + producto.getNombre() + " ' , "
                    + "precio = " + producto.getPrecio() + ", "
                    + "codigo_fabricante = " + producto.getCodigo_fabricante()
                    + " WHERE codigo = " + producto.getCodigo() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("producto nulo");
            }
            String sql = "DELETE FROM producto WHERE codigo = '" + producto.getCodigo() + "' ;";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProducto() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";

            consultarBase(sql);

            Producto producto = null;
            
            Collection<Producto> listaProducto = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));
                listaProducto.add(producto);
            }
            return listaProducto;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
     public Collection<Producto> listarxNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%" + nombre + "%';";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> listaProducto = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                
                producto.setNombre(resultado.getString(1));
                
                listaProducto.add(producto);
            }
            return listaProducto;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
 
      public Collection<Producto> listarxRango(double num1 , double num2) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE PRECIO between  " + num1 +"  AND  " + num2 +" ; ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> listaProducto = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));
                listaProducto.add(producto);
            }
            return listaProducto ;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
   
}
