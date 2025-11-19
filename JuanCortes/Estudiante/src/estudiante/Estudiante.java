
package estudiante;


public class Estudiante {
    private float nota1;
    private float nota2;
    
    
    public Estudiante(){}
    public Estudiante(float nota1, float nota2){
       this.nota1=nota1;
       this.nota2=nota2;
    }
    
   
    
    public void setNota1(float nota1){
        this.nota1=nota1;
    }
    public float getNota1(){
        return nota1;
    }
    
    public void setNota2(float nota2){
        this.nota2=nota2;
    }
    public float getNota2(){
        return nota2;
    }
   
    
    public float promedio(){
        return (nota1+nota2)/2;
        
    }
    
    public String aprobo(){
        
        if(promedio()>=3){
            return "Aprobo";
        }else {
            return "Desaprobo";
        }
        
    }
    public static void main(String[] args) {
       Estudiante estudiante1= new Estudiante(2,3);
       
       System.out.println(estudiante1.promedio());
       System.out.println(estudiante1.aprobo());
       
    }
    
}
