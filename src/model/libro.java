package model;

public class libro {
    private int Id;
    private String Titulo;
    private String Autor;
    private String Isbn;
    private String CursoRecomendado;

    public libro(){}
        public libro(int id,String titulo,String autor, String isbn, String cursoRecomendado){
            this.Id = id;
            this.Titulo = titulo;
            this.Autor = autor;
            this.Isbn = isbn;
            this.CursoRecomendado = cursoRecomendado;
        }

    //Getters y Setters
    public int getId(){
        return Id; }
    public void setId(int id){
        this.Id = id; }
    public String getTitulo(){
        return Titulo;  }
    public void setTitulo(String titulo){
        this.Titulo = titulo; }
    public String getAutor(){
        return Autor;  }
    public void setAutor(String autor){
        this.Autor = autor; }
    public String getIsbn(){
        return Isbn; }
    public void setIsbn(String isbn){
        this.Isbn = isbn; }
    public String getCursoRecomendado(){
        return CursoRecomendado;}
    public void setCursoRecomendado(String cursoRecomendado){
        this.CursoRecomendado = cursoRecomendado;}


}
