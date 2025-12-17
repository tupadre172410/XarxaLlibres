package dao;
import java.util.List;
import model.alumno;
public class AlumnoDAO implements IGenericDAO<alumno> {
    @Override
    public List<alumno> findAll() { return null; }
    @Override
    public alumno findById(int id) { return null; }
    @Override
    public boolean insert(alumno alumno) { return false; }
    @Override
    public boolean update(alumno alumno) { return false; }
    @Override
    public boolean delete(int id) { return false; }


    //Métodos ALUMNODAO
    public buscarporNIA(int NIA){
    }
    public buscarpornombre(String Nombre){
    }
    public listarporcurso(String Curso){
    }

}
