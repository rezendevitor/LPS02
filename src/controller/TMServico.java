package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.AbstractTableModel;
import model.Servico;

public class TMServico extends AbstractTableModel{
    private ArrayList<Servico> lstServicos;

    private final int COL_ID = 0;
    private final int COL_TIPO = 1;
    private final int COL_VALOR = 2;
    private final int COL_DATA = 3;
    private final int COL_CONTRATANTE = 4;
    private final int COL_LOCAL = 5;
    
    public TMServico(ArrayList<Servico> lst) {
        this.lstServicos = lst;
    }
   
    @Override
    public int getRowCount() {
        return lstServicos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Servico usr = this.lstServicos.get(row);
        if(col == COL_ID){
            return usr.getId();
        }else if(col == COL_TIPO){
            return usr.getTipo();
        }else if(col == COL_VALOR){
            return usr.getValor();
        }else if(col == COL_DATA){
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNasc = usr.getData();
            String dataString = formatoData.format(dataNasc);
            return dataString;
        }else if(col == COL_CONTRATANTE){
            return usr.getContratante().getCpf();
        }else if(col == COL_LOCAL){
            return usr.getLocal().getId();
        }
        return "-";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == COL_ID){
            return "ID";
        }else if(columnIndex == COL_TIPO){
            return "Tipo";
        }else if(columnIndex == COL_VALOR){
            return "Valor";
        }else if(columnIndex == COL_DATA){
            return "Data";
        }else if(columnIndex == COL_CONTRATANTE){
            return "Contratante";
        }else if(columnIndex == COL_LOCAL){
            return "Local";
        }
        return "-";
    }
}

