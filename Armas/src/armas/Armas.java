package armas;

public class Armas {
    /* Se crearon las 2 interfaces con sus 
       2 metodos correspondientes...*/
    public interface Interface1{
        void getSeleccioneArma();
        void getHistoria();
    }
    public interface Interface2{
        void getFichaTecnica();
        void get();
    }
    
    
    public static void main(String[] args) {
        Armas obj=new Armas();
    }
    
}
