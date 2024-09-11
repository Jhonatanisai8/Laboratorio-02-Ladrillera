package modelo;

//librerias
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Informacion {

    //método para mostrar los datos de la lista en el JTextArea 
    public static void mostrarTextArea(JTextArea txArea, List<Embarque> lista) {
        txArea.setText("");
        txArea.append(lista.toString());
    }

    //método para mostrar los datos de la lista en el Jtable 
    public static void mostrarJtable(DefaultTableModel miModelo, List<Embarque> lista) {
        for (Embarque embarque : lista) {
            Object fila[] = {
                embarque.getNumero(),
                embarque.getCodigo(),
                embarque.getNombreDistribuidor(),
                embarque.getTipoCamion(),
                embarque.getTipoLadrillos(),
                embarque.getCantidadLadrillos(),
                embarque.getPrecioUnidad(),
                embarque.getCostoTotalEmbarque()
            };
            miModelo.addRow(fila);
        }

    }

}
