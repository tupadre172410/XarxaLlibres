package dao;
import java.util.List;
import model.libro;
public class LibroDAO implements IGenericDAO<libro> {
    @Override
    public List<libro> findAll() { return null; }
    @Override
    public libro findById(int id) { return null; }
    @Override
    public boolean insert(libro libro) { return false; }
    @Override
    public boolean update(libro libro) { return false; }
    @Override
    public boolean delete(int id) { return false; }

//Métodos LibroDAO
    public buscarporISBN(int Isbn){
    }
    public buscarporTítulo(String Titulo){
    }
}
