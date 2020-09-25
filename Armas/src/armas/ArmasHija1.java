package armas;

public abstract class ArmasHija1 extends ArmasPadre{
    int objetoHija1;
    //Se crearon las propiedades
    private String propiedad1;
    private String propiedad2;
    
    //Metodos accesores a las propiedades
    public void setPropiedad1(String propiedad1) {
	this.propiedad1 = propiedad1;
    }
    public String getPropiedad1(){
        return propiedad2;
    }
    public void setPropiedad2(String propiedad2) {
	this.propiedad2 = propiedad2;
    }
    public String getPropiedad2(){
        return propiedad2;
    }
    
    //Se crean 6 metodos..
    public void Metodo1(String valor1){
    }
    public void Metodo2(){
    }
    public void Metodo3(){
    }
    public void Metodo4(){
    }
    public void Metodo5(){
    }
    public void Metodo6(){
    }
    
    //Se crean 2 constructores...
    public ArmasHija1(int objetoHija1){
        super(objetoHija1);
        this.objetoHija1=objetoHija1;
    }
    public ArmasHija1(Armas obj){
        super(obj);
    }
}
