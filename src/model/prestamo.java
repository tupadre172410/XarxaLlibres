package model;
import model.enums.EstadoPrestamo;
import java.time.LocalDate;

public class prestamo {
    private int Id;
    private LocalDate Fecha_devolucion;
    private EstadoPrestamo Estado_inicial;
    private String Curso_academico;
    private int Id_alumno;
    private int Id_ejemplar;

    public prestamo(){}
    public prestamo(int id, LocalDate fecha_devolucion, EstadoPrestamo estado_inicial, String curso_academico, int id_alumno, int id_ejemplar){
        this.Id = id;
        this.Fecha_devolucion = fecha_devolucion;
        this.Estado_inicial = estado_inicial;
        this.Curso_academico = curso_academico;
        this.Id_alumno = id_alumno;
        this.Id_ejemplar = id_ejemplar;
    }
    public int getId(){
        return Id;}
    public void setId(int id) {
        this.Id = id;}
    public LocalDate getFecha_devolucion() {
        return Fecha_devolucion;}
    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.Fecha_devolucion = fecha_devolucion;}
    public EstadoPrestamo getEstado_inicial() {
        return Estado_inicial;}
    public void setEstado_inicial(EstadoPrestamo estado_inicial) {
        this.Estado_inicial = estado_inicial;}
    public String getCurso_academico() {
        return Curso_academico;}
    public void setCurso_academico(String curso_academico) {
        this.Curso_academico = curso_academico;}
    public int getId_alumno() {
        return Id_alumno;}
    public void setId_alumno(int id_alumno) {
        this.Id_alumno = id_alumno;}
    public int getId_ejemplar() {
        return Id_ejemplar;}
    public void setId_ejemplar(int id_ejemplar) {
        this.Id_ejemplar = id_ejemplar;}
}
