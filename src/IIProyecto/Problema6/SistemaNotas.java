package IIProyecto.Problema6;




public class SistemaNotas {
    int maxRegistros=100;
    Examenes[] examenes = new Examenes[maxRegistros];
    int cont=0;
    Alumno [] alumnos=new Alumno[maxRegistros];
    public SistemaNotas(){
    }
    
    //elimina el ult examen del arreglo
    public boolean eliminarEx(){
        boolean resultado=false;
        if(cont!=0){
            examenes[cont-1]=null;
            cont--;
            resultado=true;
        }
        return resultado;
    }
    
    //agregar un examen al arreglo
    public boolean agregarEx(Examenes ex){
        boolean resultado=false;
        if(cont<maxRegistros){ //el arreglo tiene espacio
            examenes[cont]=ex;
            cont++;
            resultado=true;
        }
        return resultado;
    }
    public boolean mostrarExAgregado(Examenes ex){
        boolean resultado=false;
        if(cont<maxRegistros){ //el arreglo tiene espacio
            examenes[cont]=ex;
            cont++;
            resultado=true;
            System.out.println(ex.toString());
        }
        return resultado;
    }
    //agregar un examen al arreglo
    public boolean agregarAlum(Alumno a){
        boolean resultado=false;
        if(cont<maxRegistros){ //el arreglo tiene espacio
            alumnos[cont]=a;
            cont++;
            resultado=true;
        }
        return resultado;
    }
    
    //mostrar examenes
    public void mostrarExamenes(){
        for(int i=0;i<cont;i++){
            if(examenes[i]!=null)
                System.out.println(examenes[i].toString());
        }
    }
     //mostrar alumnos
    public void mostrarAlumnos(){
        for(int i=0;i<cont;i++){
            if(alumnos[i]!=null)
                System.out.println(alumnos[i].toString());
        }
    }
    
    //calcular promedio
    public float promedioNotas(){
        float retorno=0f;
        
        return retorno;
    }

    void mostrarExAgregado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
