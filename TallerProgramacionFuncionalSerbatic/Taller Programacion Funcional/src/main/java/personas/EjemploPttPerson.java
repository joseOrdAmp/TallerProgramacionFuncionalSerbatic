package personas;


public class EjemploPttPerson {

    public static void main(String[] args) {
        Trabajador  t1= new Trabajador();
    }
    
}



class Persona {

    private String name;
    private int    age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
}


class Trabajador extends Persona{

    private String trabajo;
    private float    sueldo;
    
    /**
     * @return the trabajo
     */
    public String getTrabajo() {
        return trabajo;
    }
    
    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    
    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }
    
    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    }
    
}
