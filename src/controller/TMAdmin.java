package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.AbstractTableModel;
import model.Administrador;

public class TMAdmin extends AbstractTableModel{
    private ArrayList<Administrador> lstAdmins;

    private final int COL_NOME = 0;
    private final int COL_CPF = 1;
    private final int COL_TELEFONE = 2;
    private final int COL_EMAIL = 3;
    private final int COL_SEXO = 4;
    private final int COL_DATANASC = 5;
    private final int COL_SALARIO = 6;
    
    public TMAdmin(ArrayList<Administrador> lst) {
        this.lstAdmins = lst;
    }

    
    @Override
    public int getRowCount() {
        return lstAdmins.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Administrador usr = this.lstAdmins.get(row);
        if(col == COL_NOME){
            return usr.getNome();
        }else if(col == COL_CPF){
            return usr.getCpf();
        }else if(col == COL_TELEFONE){
            return usr.getTelefone();
        }else if(col == COL_EMAIL){
            return usr.getEmail();
        }else if(col == COL_SEXO){
            return usr.getSexo();
        }else if(col == COL_DATANASC){
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNasc = usr.getDataNasc();
            String dataString = formatoData.format(dataNasc);
            return dataString;
        }else if(col == COL_SALARIO){
            return usr.getSalario();
        }
        return "-";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_CPF){
            return "CPF";
        }else if(columnIndex == COL_TELEFONE){
            return "Telefone";
        }else if(columnIndex == COL_EMAIL){
            return "Email";
        }else if(columnIndex == COL_SEXO){
            return "Sexo";
        }else if(columnIndex == COL_DATANASC){
            return "Data Nascimento";
        }else if(columnIndex == COL_SALARIO){
            return "Salário";
        }
        return "-";
    }
}

