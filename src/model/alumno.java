package model;

public class alumno {
    private int Id_alumno;
    private String Nia;
    private String Nombre;
    private String Apellidos;
    private String Curso;
    private String Grupo;

    public alumno(){}
        public alumno(int id_alumno, String nia, String nombre, String apellidos, String curso, String grupo){
            this.Id_alumno = id_alumno;
            this.Nia = nia;
            this.Nombre = nombre;
            this.Apellidos = apellidos;
            this.Curso = curso;
            this.Grupo = grupo;
        }
    //Getters y Setters
    public int getId_alumno() {
        return Id_alumno;}
    public void setId_alumno(int id_alumno) {
        this.Id_alumno = id_alumno;}
    public String getNia(){
        return Nia;}
    public void setNia(String nia) {
        this.Nia = nia;}
    public String getNombre(){
        return Nombre;}
    public void setNombre(String nombre){
        this.Nombre = nombre;}
    public String getApellidos(){
        return Apellidos;}
    public void setApellidos(String Apellidos){
        this.Apellidos = Apellidos;}
    public String getCurso() {
        return Curso;}
    public void setCurso(String curso) {
        Curso = curso;}
    public String getGrupo() {
        return Curso;}
    public void setGrupo(String grupo) {
        Grupo = grupo;}
}
