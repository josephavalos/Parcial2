package armas;
//Se crea la clase abstracta padre
public abstract class ArmasPadre {
    int valorPadre; 
    String objetoPadre;
    
//Se crea una propiedad privada
    private String nombreArma;
    
//Se crean los metodos de acceso a dicha propiedad..
    public void setnombreArma(String nombreArma) {
	this.nombreArma = nombreArma;
    }
    public String getnombreArma(){
        return nombreArma;
    }
    
    //Se crean los tres metodos solicitados..
    public abstract int metodo1();
    public abstract int metodo2();
    //public abstract int metodo3();
    
    //Se crean 2 constructores..
    public ArmasPadre(int valorPadre){
        this.valorPadre=valorPadre;
    }
    public ArmasPadre(Armas obj){
        this.objetoPadre=objetoPadre;
    }
}
