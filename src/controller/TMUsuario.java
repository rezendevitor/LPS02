package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.AbstractTableModel;
import model.Pessoa;

public class TMUsuario extends AbstractTableModel{
    private ArrayList<Pessoa> lstUsuarios;

    private final int COL_NOME = 0;
    private final int COL_CPF = 1;
    private final int COL_TELEFONE = 2;
    private final int COL_EMAIL = 3;
    private final int COL_SENHA = 4;
    private final int COL_SEXO = 5;
    private final int COL_DATANASC = 6;
    
    public TMUsuario(ArrayList<Pessoa> lst) {
        this.lstUsuarios = lst;
    }

    
    @Override
    public int getRowCount() {
        return lstUsuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Pessoa usr = this.lstUsuarios.get(row);
        if(col == COL_NOME){
            return usr.getNome();
        }else if(col == COL_CPF){
            return usr.getCpf();
        }else if(col == COL_TELEFONE){
            return usr.getTelefone();
        }else if(col == COL_EMAIL){
            return usr.getEmail();
        }else if(col == COL_SENHA){
            return usr.getSenha();
        }else if(col == COL_SEXO){
            return usr.getSexo();
        }else if(col == COL_DATANASC){
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNasc = usr.getDataNasc();
            String dataString = formatoData.format(dataNasc);
            return dataString;
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
        }else if(columnIndex == COL_SENHA){
            return "Senha";
        }else if(columnIndex == COL_SEXO){
            return "Sexo";
        }else if(columnIndex == COL_DATANASC){
            return "Data Nascimento";
        }
        return "-";
    }
}

