package controller;

import dao.AlumnoDAO;
import dao.EjemplarDAO;
import dao.PrestamoDAO;

public class AlumnoController {
    private PrestamoDAO prestamoDAO = new PrestamoDAO();
    private EjemplarDAO ejemplarDAO = new EjemplarDAO();
    private AlumnoDAO alumnoDAO = new AlumnoDAO();
}
