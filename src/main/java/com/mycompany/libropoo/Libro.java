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
   public Libro (String titulo, String autor,String genero){
   this.titulo=titulo;
   this.autor=autor;
   this.genero=genero;
   this.leido=false;

   }
   
   public  String mostrarInformacion(){
   return("Título:"+titulo+","+"Autor:"+autor+","+"Año de publicación:"+anoPublicacion+"Género:"+genero);
}
   public void marcarleido(){
       leido =true;
   }
   
   public boolean esantiguo (){
   int validarAntiguedad= anoPublicacion-anoAtual;
   return (validarAntiguedad>=50 );
   
   }
 
  
}
