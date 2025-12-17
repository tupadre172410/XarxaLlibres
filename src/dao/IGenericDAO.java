package dao;

public interface IGenericDAO <Libro>{
    List <Libro> findAll();
    Libro findById(int id_Libro);
    boolean insert(Libro t);
    boolean update(Libro t);
    boolean delete(int id_Libro);
}
