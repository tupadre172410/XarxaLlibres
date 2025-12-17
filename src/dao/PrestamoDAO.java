package dao;
import java.util.List;
import model.prestamo;
public class PrestamoDAO implements IGenericDAO<prestamo> {
    @Override
    public List<prestamo> findAll() { return null; }
    @Override
    public prestamo findById(int id) { return null; }
    @Override
    public boolean insert(prestamo ejemplar) { return false; }
    @Override
    public boolean update(prestamo ejemplar) { return false; }
    @Override
    public boolean delete(int id) { return false; }
}
