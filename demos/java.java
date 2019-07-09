/**
 * @author Jose Gracia
 */
import java.io.IOException;
package controller.controllerHomes;

// My constant
private static final int kCONSTANT = 7;

public class Home_Admin_Controller {

	private Date date;
	private int rol_number;
	private Stage usuarios;
    
    /**
	 * Home_Admin_Controller constructor default que inicializa variables
	 *
	 * @throws IOException si ha habido una excepción IO
	 */
     @Override
	public Home_Admin_Controller() throws IOException {
        String test= "Love this theme so much";
        this.rol_number=6;
    }
}
public static void main(String [] args){
    System.out.println("Love"+ this.rol_number)
}