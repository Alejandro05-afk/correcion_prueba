public class Postulante {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String nacionalidad;
    private String condicion;
    private String carrera;
    private double promedio;

    public Postulante (String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Postulante (String nombre, String apellido, String carrera){
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }
    public Postulante (String nombre,String apellido,int edad,String telefono,String correo,String nacionalida,String condicion,String carrera,double promedio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalida;
        this.condicion = condicion;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean cumpleRequisitos() {
        return (edad > 18 && promedio > 85 && condicion.equals("baja"));
    }

    public void mostrarDatos() {
        if (cumpleRequisitos()) {
            System.out.print("\n----Postulante Apto----");
            System.out.print("\nNombre: " + nombre + " " + apellido);
            System.out.print("\nEdad: " + edad);
            System.out.print("\nCarrera: " + carrera);
            System.out.print("\nPromedio: " + promedio);
            System.out.print("\nNacionalidad: " + nacionalidad);
            System.out.print("\nCondición socioeconómica: " + condicion);
        } else {
            System.out.print("\n----Postulante No Apto----");
            System.out.print("\nEl postulante no cumple los requisitos para aplicar a la beca");
        }
    }


}
