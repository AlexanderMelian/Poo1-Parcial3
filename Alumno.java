public class Alumno {
    int legajo;
    float nota1, nota2, nota3, promedio;
    String nombre, apellido;

    public Alumno(){

    }

    public Alumno(String nombre, String apellido, float nota1, float nota2, float nota3, int legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.legajo = legajo;
        this.promedio = (nota1+nota2+nota3)/3;
        this.promedio = (float)Math.round(this.promedio * 100.0) / 100;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
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

    @Override
    public String toString() {
        return "Alumno [apellido=" + apellido + ", legajo=" + legajo + ", nombre=" + nombre + ", nota1=" + nota1
                + ", nota2=" + nota2 + ", nota3=" + nota3 + ", promedio=" + promedio + "]";
    }
    
}
