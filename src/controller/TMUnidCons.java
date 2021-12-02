package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.AbstractTableModel;
import model.UnidadeConsumidora;

public class TMUnidCons extends AbstractTableModel{
    private ArrayList<UnidadeConsumidora> lstUCs;

    private final int COL_ID = 0;
    private final int COL_TIPO = 1;
    private final int COL_ENDERECO = 2;
    private final int COL_PROPRIETARIO = 3;
    private final int COL_CONSUMO = 4;
    
    public TMUnidCons(ArrayList<UnidadeConsumidora> lst) {
        this.lstUCs = lst;
    }
   
    @Override
    public int getRowCount() {
        return lstUCs.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int col) {
        UnidadeConsumidora usr = this.lstUCs.get(row);
        if(col == COL_ID){
            return usr.getId();
        }else if(col == COL_TIPO){
            return usr.getTipo();
        }else if(col == COL_ENDERECO){
            return usr.getEndereco();
        }else if(col == COL_PROPRIETARIO){
            return usr.getProprietario().getCpf();
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
        }else if(columnIndex == COL_ENDERECO){
            return "Endereço";
        }else if(columnIndex == COL_PROPRIETARIO){
            return "Proprietário";
        }else if(columnIndex == COL_CONSUMO){
            return "Consumo";
        }
        return "-";
    }
}

