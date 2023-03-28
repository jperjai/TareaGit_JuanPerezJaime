/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareagit_juan_perez_jaime;

/**
 *
 * @author alumnociclo
 */
public class Tabla {
        public int numero;
public Tabla ( int numero){
 this.numero=numero;}
public String multiplicacion(){
    StringBuilder tabla= new StringBuilder();
    for (int contador=0; contador<11;contador++){
        int resultado=contador*this.numero;
    tabla.append(contador+" * "+this.numero+" = "+resultado+"/n");

}
return tabla.toString();
    }
}
