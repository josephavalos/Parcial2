package armas;

public abstract class ArmasHija2 extends ArmasPadre{
    int objetoHija2;
     //Se crearon las propiedades
    private String propiedad1;
    private String propiedad2;
    
    //Metodos accesores a las propiedades
    public void setPropiedad1(String propiedad1) {
	this.propiedad1 = propiedad1;
    }
    public String getPropiedad2(){
        return propiedad2;
    }
    
    //Se crean 6 metodos..
    public void Metodo1(String valor1){

    }
    public void Metodo2(String valor1){

    }
    public void Metodo3(String valor1){

    }
    public void Metodo4(String valor1){

    }
    public void Metodo5(String valor1){

    }
    public void Metodo6(String valor1){
 
    }
    
    //Se crean 2 constructores...
    public ArmasHija2(int objetoHija2){
        super(objetoHija2);
        this.objetoHija2=objetoHija2;
    }
    public ArmasHija2(Armas obj){
        super(obj);
    }
}
