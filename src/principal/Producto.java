/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
/**
 * Escaner de variables.
 */
import java.util.Scanner;

/**
 *
 * @author Ronald Jefrey Moreno Mora
 * PROGRAMACION II
 * SIS 301
 * Universidad de Cundinamarca - Facatativa
 */
public class Producto {
    
    public String nombre;
    public float precio = 0;
    int cantidadVentas;
    int cantidadAlmacenada;
    public float ganancias = 0;
    int cantidadAgregada;
    Producto(){
        
    }
    /**
     * 
     * @param nombre
     * @param precio
     * @param cantidadAlmacenada 
     */
    Producto(String nombre,float precio,int cantidadAlmacenada ){
         this();
        this.nombre=nombre;
        this.precio=precio;
        this.ganancias=ganancias;
        this.cantidadAgregada=cantidadAgregada;
        this.cantidadAlmacenada=cantidadAlmacenada;
    }
    /**
     * Metodo para comprar una unidad del producto.
     */
    protected void comprar(){
        if(this.cantidadAlmacenada<=0){
            System.out.println("El producto se ha agotado. Intentelo mas tarde.");
        }else{
            System.out.println("Ha comprado "+this.nombre+". Gracias por su compra.");
            this.cantidadAlmacenada--;
            this.cantidadVentas++;
            System.out.println("La nueva cantidad de "+this.nombre+" almacenados es: "+this.cantidadAlmacenada);
        }
    }
    /**
     * Metodo para almacenar una cantidad del producto.
     */
    protected void cantidad(){
        Scanner lecturaVar = new Scanner(System.in);
        System.out.print("Digite la cantidad de "+this.nombre+" que desea almacenar: ");
        do{
        this.cantidadAgregada=lecturaVar.nextInt();
        }while(this.cantidadAgregada<0);
        this.cantidadAlmacenada=this.cantidadAlmacenada+this.cantidadAgregada;
        System.out.println("La nueva cantidad de "+this.nombre+" almacenados es: "+this.cantidadAlmacenada);
    }
    /**
     * Metodo para ver la cantidad de Ventas del producto.
     */
    protected void verCantidadVentas(){
        System.out.println("La cantidad de "+this.nombre+" vendidos es: "+this.cantidadVentas);
        System.out.println("El porcenaje de ventas es del: %"+(this.cantidadVentas*100)/(this.cantidadVentas+this.cantidadAlmacenada));
    }
    /**
     * Metodo para ver las ganancias.
     */
    protected void verGanancias(){
        this.ganancias=this.cantidadVentas*this.precio;
        System.out.println("El total de ganancias de "+this.nombre+" vendidos es: "+this.ganancias);
        
    }
    /**
     * Metodo para agregar un producto al dispensador.
     */
    protected void agregarProducto(){
        Scanner lecturaVar = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        this.nombre=lecturaVar.nextLine();
        System.out.println("Precio del producto: ");
        this.precio=lecturaVar.nextFloat();
        System.out.println("Cantidad a almacenar: ");
        this.cantidadAlmacenada=lecturaVar.nextInt();
        System.out.println("El nuevo producto ha sido añadido.");
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Precio: "+precio+" Cantidad Ventas: "+cantidadVentas+" Cantidad Almacenada: "+cantidadAlmacenada+" Ganancias: "+ganancias+" Cantidad Agregada: "+cantidadAgregada ;
    };
    
}
