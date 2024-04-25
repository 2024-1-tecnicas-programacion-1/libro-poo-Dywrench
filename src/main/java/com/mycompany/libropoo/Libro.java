package com.mycompany.libropoo;
import java.time.Year;
import java.util.Scanner;
import java.time.LocalDate;

public class Libro {
    
    private String titulo;
    private String autor;
    private String genero;
    boolean leido;
    private int anoPublicacion;
    private int anoAtual = Year.now().getValue(); 
    
   public Libro (String titulo, String autor,String genero,int anoPublicacion ){
   this.titulo=titulo;
   this.autor=autor;
   this.anoPublicacion=anoPublicacion;
   this.genero=genero;
   this.leido=false;

   }
   
   public  String mostrarInformacion(){
   return("Título: "+titulo+", "+"Autor: "+autor+", "+"Año de publicación: "+anoPublicacion+", "+" Género: "+genero);
}
   public void marcarleido(){
       leido =true;
   }
   
    boolean getLeido (){
    return leido;
    }
    
   public boolean esantiguo (){
   int validarAntiguedad= anoAtual-anoPublicacion;
   return (validarAntiguedad>50 );
   
   }
    public int anoact(){
    return anoAtual;
   }
  
}
