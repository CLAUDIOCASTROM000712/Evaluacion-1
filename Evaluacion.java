
class Evaluacion{
    public static void main(String args[]){
       usuario=new Usuario();
        System.out.println(usuario);
    }

}

//class father.
class Uber{
   private String nombreConductor;
   private String vehicle;
   private Ubicacion ubicacion;
   private Destino destino;
   private String nombreUsuario;
   
   public Uber(String nombreConductor,String vehicle,Ubicacion ubicacion,Destino destino,String nombreUsuario){
        this.nombreConductor=nombreConductor;
        this.vehicle=vehicle;
        this.ubicacion=ubicacion;
        this.destino=destino;
        this.nombreUsuario=nombreUsuario;
   }

   public String getNombreConductor(){
       return nombreConductor;
   }
   public String getVehicle(){
       return vehicle;
   }
   public Ubicacion getUbicacion(){
       return ubicacion;
   }
   public Destino getDestino(){
       return destino;
   }
   public String getNombreUsuario(){
       return nombreUsuario;
   }

}



class Usuario extends Uber{

    super.Uber(nombreUsuario,destino);
    
    public Usuario(String nombreUsuario,Destino destino){
        nombreUsuario="claudio castro murillo";
        destino=Destino(31,14);
    }
    
}

/*
class Ubicacion extends Uber{
    super.Uber(ubicacion);
    private int px,py;
    public Ubicacion(int px,int py){
        this.px=px;
        this.py=py;
    }

    public int getPx(){
        return px;
    }
    public int getPy(){
        return py;
    }

}*/

class Destino {
    private int posX;
    private int posY;
    
    public Destino(int posX,int posY){
        this.posX=posX;
        this.posY=posY;
        
    }
    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }
    

    public void setPosX(int posX){
        this.posX=posX;
    }
    public void setPosY(int posY){
        this.posY=posY;
    }

}
