package principal;

import vista.frmRegistro;

public class Principal {
    
    public static void main(String[] args) {
        frmRegistro ventana = new frmRegistro();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Registro de Ladrillos");
    }
    
}
