
package modelo;

public class EntidadRegistro {
    int Idre;
    String Nombres;
    String Telefono;
    String Correo;
    String Contrasena;
    
    public EntidadRegistro(){
    
    }
    
    public EntidadRegistro(int Idre,String Nombres,String Telefono,String Correo,String Contrasena ){
        this.Idre = Idre;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Contrasena = Contrasena;
    }

    public int getIdre() {
        return Idre;
    }

    public void setIdre(int Idre) {
        this.Idre = Idre;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
}
