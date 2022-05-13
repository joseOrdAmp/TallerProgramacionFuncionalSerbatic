package personas;
public class Person {

  private final String name;
  private final int age;
  
/**
 * @param gender the gender to set
 */
public void setGender(Gender gender) {
    this.gender = gender;
}


private  Gender gender;
  private  int sueldo;
  private  int altura;
  private  String trabajo;

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

@Override
public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", sueldo=" + sueldo + ", altura=" + altura
            + ", trabajo=" + trabajo + "]";
}


/**
 * @return the sueldo
 */
public int getSueldo() {
    return sueldo;
}


/**
 * @return the altura
 */
public int getAltura() {
    return altura;
}


/**
 * @return the trabajo
 */
public String getTrabajo() {
    return trabajo;
}


/**
 * @param sueldo the sueldo to set
 */
public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
}


/**
 * @param altura the altura to set
 */
public void setAltura(int altura) {
    this.altura = altura;
}


/**
 * @param trabajo the trabajo to set
 */
public void setTrabajo(String trabajo) {
    this.trabajo = trabajo;
}

  
  
  
}
