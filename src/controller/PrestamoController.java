package controller;

import dao.AlumnoDAO;
import dao.EjemplarDAO;
import dao.PrestamoDAO;

public class PrestamoController {
    private PrestamoDAO prestamoDAO = new PrestamoDAO();
    private EjemplarDAO ejemplarDAO = new EjemplarDAO();
    private AlumnoDAO alumnoDAO = new AlumnoDAO();
}
