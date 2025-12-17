package model;

public class devolucion {


    public class Devolucion {
        private int id;
        private String fechaDevolucion;
        private String estadoDevolucion;
        private int id_Prestamo;

        public Devolucion(){}

        public Devolucion(int id, String fechaDevolucion, String estadoDevolucion, int id_Prestamo){
            this.id = id;
            this.fechaDevolucion = fechaDevolucion;
            this.estadoDevolucion = estadoDevolucion;
            this.id_Prestamo = id_Prestamo;
        }

        // Getters y Setters
        public int getId(){
            return id;}
        public void setId(int id){
            this.id = this.id;}
        public String getFechaDevolucion(){
            return fechaDevolucion;}
        public void setFechaDevolucion(String fechaDevolucion){
            this.fechaDevolucion = fechaDevolucion;}
        public String getEstadoDevolucion(){
            return estadoDevolucion;}
        public void setEstadoDevolucion(String estadoDevolucion){
            this.estadoDevolucion = estadoDevolucion;}
        public int getId_Prestamo(){
            return id_Prestamo;}
        public void setIdPrestamo(int idPrestamo){
            this.id_Prestamo = id_Prestamo;}
    }

}
