/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Ronald
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
    Producto(String nombre,float precio,int cantidadAlmacenada ){
         this();
        this.nombre=nombre;
        this.precio=precio;
        this.ganancias=ganancias;
        this.cantidadAgregada=cantidadAgregada;
        this.cantidadAlmacenada=cantidadAlmacenada;
    }
    
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
    
    protected void cantidad(){
        Scanner lecturaVar = new Scanner(System.in);
        System.out.print("Digite la cantidad de "+this.nombre+" que desea almacenar: ");
        do{
        this.cantidadAgregada=lecturaVar.nextInt();
        }while(this.cantidadAgregada<0);
        this.cantidadAlmacenada=this.cantidadAlmacenada+this.cantidadAgregada;
        System.out.println("La nueva cantidad de "+this.nombre+" almacenados es: "+this.cantidadAlmacenada);
    }
    
    protected void verCantidadVentas(){
        System.out.println("La cantidad de "+this.nombre+" vendidos es: "+this.cantidadVentas);
        System.out.println("El porcenaje de ventas es del: %"+(this.cantidadVentas*100)/(this.cantidadVentas+this.cantidadAlmacenada));
    }
    
    protected void verGanancias(){
        this.ganancias=this.cantidadVentas*this.precio;
        System.out.println("El total de ganancias de "+this.nombre+" vendidos es: "+this.ganancias);
        
    }
    
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
    
}
