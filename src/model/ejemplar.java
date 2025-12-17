package model;

import model.enums.EstadoEjemplar;

public class ejemplar {
    private int Id;
    private int Codigo_unico;
    private EstadoEjemplar Estado_actual;
    private int Id_libro;

public ejemplar (){}
    public ejemplar(int id, int codigo_unico, EstadoEjemplar estado_actual, int id_libro){
        this.Id = id;
        this.Codigo_unico = codigo_unico;
        this.Estado_actual = estado_actual;
        this.Id_libro = id_libro;
    }

    //Getters y Setters
    public int getId(){
        return Id;}
    public void setId(int id){
        this.Id = id;}
    public int getCodigo_unico() {
        return Codigo_unico;}
    public void setCodigo_unico(int codigo_unico){
        this.Codigo_unico = codigo_unico;}
    public EstadoEjemplar getEstado_actual(){
        return Estado_actual;}
    public void setEstado_actual(EstadoEjemplar estado_actual) {
        this.Estado_actual = estado_actual;}
    public int getId_libro() {
        return Id_libro;}
    public void setId_libro(int id_libro) {
        this.Id_libro = id_libro;}


}
