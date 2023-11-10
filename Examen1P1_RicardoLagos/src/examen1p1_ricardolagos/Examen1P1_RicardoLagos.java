//Examen primer parcial
// Gracias por su apoyo pero hermanos, pero esto no es mi vocación D:

package examen1p1_ricardolagos;
import java.util.Scanner;
import java.util.Random;
public class Examen1P1_RicardoLagos{
    static Scanner leer = new Scanner (System.in);
        public static void main(String[] args) {
        
        
        System.out.println("Bienvenido(a/e) al examen del primer parcial");
        System.out.println("-----------M E N U-------------");
        System.out.println("Las opciones son: "
                +"\n1.Figth or Fligth"
                +"\n2.Trifuerza, el que no se hace");
        System.out.println("Ingrese una opcion: ");
        int opcion=leer.nextInt();
        
        while(opcion>0&&opcion<3){
            
            switch(opcion){
                
                case 1->{
                    
                    System.out.println("Figth or Fligth");
                    
                    int random = new Random().nextInt((30 - 15) + 1) + 15;
                    int vida_Z=25;
                    int vida_J;
                    int balas=25;
                    char resp='s';
                    
                    System.out.println("Ingrese Maestria: "
                            + "\n1.Principiante (0% de hits)"
                            + "\n2.Intermedio (5% de hits)"
                            + "\n3.Experto (15% de hits)");
                    int maestria=leer.nextInt();
                    
                    if(maestria==1){
                            while(resp=='s'||resp=='S'){
                                int porcentaje=new Random().nextInt((0 - 0) +1 )+0;
                                int avance =new Random().nextInt((5 - 3)+1)+3;
                                int daño = new Random().nextInt((7 - 1) + 1) + 1;
                                
                            System.out.println("¡Has escogido la maestria pincipiante!");
                            System.out.println("El zombie se encuentra a "+random);
                            
                            if (porcentaje>0){
                            System.out.println("Hit! El jugador ha hecho "+daño+" de daño");
                            balas=balas-1;
                            System.out.println("Nuestro crak tiene "+balas+" balas");
                            vida_Z=vida_Z-daño;
                            System.out.println("El HP del zombie es: "+vida_Z);
                            
                            }else if(porcentaje==0){
                             System.out.println("Damn! El jugador ha fallado una bala");
                             random=random-avance; 
                             System.out.println("El zombie se encuentra a "+random);
                             System.out.println("El HP del zombie es: "+vida_Z);
                             balas=balas-1;
                             System.out.println("Nuestro crak tiene "+balas+" balas");
                            }if(vida_Z==0){
                               System.out.println("El maje sobrevivió ni él sabe como");
                               System.out.println("Mi dog gano SIUUUUUUU"); 
                            }else if(balas==0&&vida_Z>0||random==0){
                               System.out.println("Mi dog murió por manco :(");
                            } 
                            
                             
                            System.out.println("¿Desea otra ronda?[S/N]: ");
                            resp=leer.next().charAt(0);
                            
                            }//fin del while                           
                    }//fin del if 1
                        
                    if(maestria==2){
                            while(resp=='s'||resp=='S'){
                                int porcentaje=new Random().nextInt((70 - 0) +1 )+0;
                                int avance =new Random().nextInt((5 - 3)+1)+3;
                                int daño = new Random().nextInt((7 - 1) + 1) + 1;
                                
                            System.out.println("¡Has escogido la maestria pincipiante!");
                            System.out.println("El zombie se encuentra a "+random);
                            
                            if (porcentaje>0){
                            System.out.println("Hit! El jugador ha hecho "+daño+" de daño");
                            balas=balas-1;
                            System.out.println("Nuestro crak tiene "+balas+" balas");
                            vida_Z=vida_Z-daño;
                            System.out.println("El HP del zombie es: "+vida_Z);
                            
                            }else if(porcentaje==0){
                             System.out.println("Damn! El jugador ha fallado una bala");
                             random=random-avance; 
                             System.out.println("El zombie se encuentra a "+random);
                             System.out.println("El HP del zombie es: "+vida_Z);
                             balas=balas-1;
                             System.out.println("Nuestro crak tiene "+balas+" balas");
                            }//fin de la cuestiones normales
                             
                             if(vida_Z==0){
                                 System.out.println("El maje sobrevivió ni él sabe como");
                                 System.out.println("Mi dog gano SIUUUUUUU");
                            }else if(balas==0&&vida_Z>0||random==0){
                                 System.out.println("Mi dog murió por manco :(");
                            }//fin validacion de vida_Z y balas
                             
                            System.out.println("¿Desea otra ronda?[S/N]: ");
                            resp=leer.next().charAt(0);
                            
                            }//fin del while 
                    }//fin if 2
                    
                    if(maestria==3){
                            while(resp=='s'||resp=='S'){
                                int porcentaje=new Random().nextInt((80 - 0) +1 )+0;
                                int avance =new Random().nextInt((5 - 3)+1)+3;
                                int daño = new Random().nextInt((7 - 1) + 1) + 1;
                                
                            System.out.println("¡Has escogido la maestria pincipiante!");
                            System.out.println("El zombie se encuentra a "+random);
                            
                            if (porcentaje>0){
                            System.out.println("Hit! El jugador ha hecho "+daño+" de daño");
                            balas=balas-1;
                            System.out.println("Nuestro crak tiene "+balas+" balas");
                            vida_Z=vida_Z-daño;
                            System.out.println("El HP del zombie es: "+vida_Z);
                            
                            }else if(porcentaje==0){
                             System.out.println("Damn! El jugador ha fallado una bala");
                             random=random-avance; 
                             System.out.println("El zombie se encuentra a "+random);
                             System.out.println("El HP del zombie es: "+vida_Z);
                             balas=balas-1;
                             System.out.println("Nuestro crak tiene "+balas+" balas");
                            }//fin de la cuestiones normales
                             
                             if(vida_Z==0){
                                 System.out.println("El maje sobrevivió ni él sabe como");
                                 System.out.println("Mi dog gano SIUUUUUUU");
                            }else if(balas==0&&vida_Z>0||random==0){
                                 System.out.println("Mi dog murió por manco :(");
                            }//fin validacion de vida_Z y balas
                             
                            System.out.println("¿Desea otra ronda?[S/N]: ");
                            resp=leer.next().charAt(0);
                            
                            }//fin del while 
                    }//fin del if 3
                    
                        
                }//fin del case 1
                
                
                case 2->{
                    trifuerza();
                }//fin del case 2
        
            }//fin del switch
            
         System.out.println("-----------M E N U-------------");
         System.out.println("Las opciones son: "
                +"\n1.Figth or Fligth"
                +"\n2.Trifuerza, el que no se hace");
         System.out.println("Ingrese una opcion: ");
         opcion=leer.nextInt();
        
        }//fin del while
    }//fin del main
    public static void trifuerza(){
        System.out.println("¡¡Trifuerza!!");
        System.out.println("Ingrese el tamaño de esta trifuerza: ");
        int tamano=leer.nextInt();
        int m=(tamano*2)-1;
        for (int i = 0; i < tamano; i++) {
            for (int j = i; j < m; j++) {
                for (int k=i; k < i; j++) {
                System.out.print("*");
            }//todo esto hace un romboide xd
            System.out.print(" ");
            }//pos imprime triagulos va
            System.out.println("*");
        }
        System.out.println(" ");
        
        
    }
}//fin de la clase
