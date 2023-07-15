package tienda.Persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.Entidades.Fabricante;

public final class fabricanteDAO extends DAO {

    public void cargarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception("fabricante nulo");
            }
            String sql = "INSERT INTO fabricante"
                    + "(codigo,nombre) "
                    + "VALUES ( ' " + fabricante.getCodigo() + " ' , ' " + fabricante.getNombre() + " ');";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception("fabricante nulo");
            }

            String sql = "UPDATE fabricante SET "
                    + "nombre = " + fabricante.getNombre() + ", "
                    + " WHERE codigo = " + fabricante.getCodigo() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarFabricante(String nombre) throws Exception {

        try {
            if (nombre == null) {
                throw new Exception("fabricante nulo");
            }

            String sql = "DELETE FROM fabricante WHERE codigo = ' " + nombre + " ' ; ";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Fabricante> listarFabricante() throws Exception {

        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);

            Fabricante fabricante = null;
            Collection<Fabricante> listaFabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));

                listaFabricantes.add(fabricante);
            }

            return listaFabricantes;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
