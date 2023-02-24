
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = " Abner Alain",
           apellido_paterno = " Gil",
           apellido_materno = " Garcia";
    int edad = 30;
    String materias = " Calculo Diferencial, Programacion, Teoria de sistem., Teoria de algorit, Ingles, Circuitos";
    String numero_cuenta = " 2271040";
    String semestre = " Segundo semestre";
    
    
    public void nombre(){
        System.out.println("Hola "+ nombre + " " + apellido_paterno + " " + apellido_materno);
    }            
    
    public void numero(){
        System.out.println("Numero de cuenta: "+ numero_cuenta);
    }
    
    public void semestre(){ 
        System.out.println(" Semestre que cursa: "+ semestre);
    }
    public void materias(){
       System.out.println(" Materias: "+ materias);
    }
    
    
    public static void main(String[] args) {
        
        InformacionPersonal nombre = new InformacionPersonal();
        nombre.nombre();
        
        InformacionPersonal numero_cuenta = new InformacionPersonal();
        numero_cuenta.numero(); 
        
        InformacionPersonal semestre= new InformacionPersonal();
        semestre.semestre();
        InformacionPersonal materias = new InformacionPersonal();
        materias.materias();
    }
    
}
