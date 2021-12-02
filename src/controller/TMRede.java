package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.AbstractTableModel;
import model.Rede;

public class TMRede extends AbstractTableModel{
    private ArrayList<Rede> lstRedes;

    private final int COL_ID = 0;
    private final int COL_TIPO = 1;
    private final int COL_BAIRRO = 2;
    private final int COL_ALCANCE = 3;
    private final int COL_CONSUMO = 4;
    
    public TMRede(ArrayList<Rede> lst) {
        this.lstRedes = lst;
    }

    
    @Override
    public int getRowCount() {
        return lstRedes.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Rede usr = this.lstRedes.get(row);
        if(col == COL_ID){
            return usr.getId();
        }else if(col == COL_TIPO){
            return usr.getTipo();
        }else if(col == COL_BAIRRO){
            return usr.getBairro();
        }else if(col == COL_ALCANCE){
            return usr.getAlcance();
        }else if(col == COL_CONSUMO){
            return usr.getConsumo();
        }
        return "-";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == COL_ID){
            return "ID";
        }else if(columnIndex == COL_TIPO){
            return "Tipo";
        }else if(columnIndex == COL_BAIRRO){
            return "Bairro";
        }else if(columnIndex == COL_ALCANCE){
            return "Alcance";
        }else if(columnIndex == COL_CONSUMO){
            return "Consumo";
        }
        return "-";
    }
}

