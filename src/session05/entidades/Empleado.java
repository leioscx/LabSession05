/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session05.entidades;

/**
 *
 * @author Estudiante
 */
public class Empleado extends Persona {
    
    private String codEmpleado;
    
    public static Empleado fromPersona(Persona per){
        Empleado emp = new Empleado();
        emp.setNombre(per.getNombre());
        emp.setApellido(per.getApellido());
        emp.setDni(per.getDni());
        return emp;
    }

    public Empleado() {
    }

    public Empleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    
    @Override
    public String getText(){
        return "EMPLEADO: " + 
                this.getNombre() + " " 
                + this.getApellido() + " | DNI: " +
                this.getDni();
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    
}
