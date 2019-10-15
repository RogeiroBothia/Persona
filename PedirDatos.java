import javax.swing.JOptionPane;

public class PedirDatos
{
    Persona persona = new Persona();
    Scanner scanner = new Scanner(System.in);
    
    
    String nombre = scanner.next();
    Short edad = scanner.nextShort();
    Character sexo = scanner.nextCharAt();
}
