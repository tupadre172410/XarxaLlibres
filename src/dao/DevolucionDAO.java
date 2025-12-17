package dao;
import java.util.List;
import model.devolucion;
public class DevolucionDAO implements IGenericDAO<devolucion> {
    @Override
    public List<devolucion> findAll() { return null; }
    @Override
    public devolucion findById(int id) { return null; }
    @Override
    public boolean insert(devolucion ejemplar) { return false; }
    @Override
    public boolean update(devolucion ejemplar) { return false; }
    @Override
    public boolean delete(int id) { return false; }
}
