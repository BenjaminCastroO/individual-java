public class Trabajador {
  // declaración de variables de trabajador
  private String nombres;
  private String apellidos;
  private String run;
  private String telefono;
  private int edad;

  //constructores
  public Trabajador() {
  }

  public Trabajador(String nombres, String apellidos, String run,
                    String telefono, int edad) {
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.run = run;
    this.telefono = telefono;
    this.edad = edad;
  }

  // Método que devuelve string de nombre completo
  public String nombreCompleto(){
    return (nombres + " " + apellidos);
  }

  //método que devuelve un int del rut de los dígitos previos al guión.
  public int descomponerRun(){
    return Integer.parseInt(run.substring(0,run.indexOf('-')));
  }

  // método que devuelve un String con la información de la instancia. 
  @Override
  public String toString() {
    return "Trabajador{" +
            "nombres='" + nombres + '\'' +
            ", apellidos='" + apellidos + '\'' +
            ", run='" + run + '\'' +
            ", telefono='" + telefono + '\'' +
            ", edad=" + edad +
            '}';
  }
}
