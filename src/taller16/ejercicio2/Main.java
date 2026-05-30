package taller16.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Documento reportePdf = new DocumentoPDF("Reporte_Anual");
        Documento cartaWord = new DocumentoWord("Carta_Despedida");
        Documento balanceExcel = new DocumentoExcel("Balance_Financiero");

        reportePdf.exportar();
        cartaWord.exportar();
        balanceExcel.exportar();
    }
}
