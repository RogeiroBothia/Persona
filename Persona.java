
public class Persona {

    private String nombre;
    private Short edad;
    private Long dni;
    private Character sexo;
    private Double peso;
    private Double altura;

    public Persona() { 
        nombre = "";
        edad = 0;
        dni = 0l;
        sexo = 'H';
        peso = 0.0;
        altura = 0.0;
    }

    public Persona(String nombre, Short edad, Character sexo) {
        this.edad = edad;
        this.sexo = sexo;
        this.dni = 0l;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Short edad, long dni, Character sexo, Double peso, Double altura) { 
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

        public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getEdad() {
        return edad;
    }
    
    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }
    
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }
    
    public void setAltura(Double altura) {
        this.altura = altura;
    }
        
    public void calcularIMC() {
        final int DEBAJO_PESO_IDEAL = -1;
        final int PESO_IDEAL = 0;
        final int SOBREPESO = 1;
        double imc;
        imc = peso / altura * altura;

        if (imc < 18.5) {
            System.out.println(DEBAJO_PESO_IDEAL);
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println(PESO_IDEAL);
        } else {
            System.out.println(SOBREPESO);
        }

    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private void comprobarSexo(Character sexo) {
        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }
    }

    private void generaDNI() {
        double numero;
        int numero2;
        char letra;

        for (int i = 0; i < 9; i++) {
            numero = Math.random() * (0 - 9 + 1) + 9;
            numero2 = (int) numero;
            System.out.print(numero2);
        }
        numero = Math.random() * (65 - 90 + 1) + 90;
        numero2 = (int) numero;
        letra = (char) numero2;
        System.out.println(letra);
    }
}