/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author Estudiante
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String nombre = "Leonardo";
        Persona per = new Persona(nombre);
        per.setApellido("De la cruz");
        per.setDni("41526422");
        per.setEdad(18);
        
        String nombre2 = "Pedro";
        String apellido = "Perez";
        String dni = "54873156";
        Persona per2 = new Persona(
                nombre2, apellido, dni);
        
        System.out.println(per.getConsole());
        System.out.println("--------------");
        System.out.println(per2.getConsole());
        
        
    }
    
}
