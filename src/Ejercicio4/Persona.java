package Ejercicio4;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void compararEdad(Persona otraPersona) {
        if (this.edad > otraPersona.edad) {
            System.out.println(nombre + " es mayor que " + otraPersona.nombre);
        } else if (this.edad < otraPersona.edad) {
            System.out.println(otraPersona.nombre + " es mayor que " + nombre);
        } else {
            System.out.println(nombre + " y " + otraPersona.nombre + " tienen la misma edad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
