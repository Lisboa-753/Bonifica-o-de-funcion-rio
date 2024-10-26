/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

/**
 *
 * @author Gabriel
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario func = new Funcionario("Gabriel","Informatica", 5000, "17/04/2023","37.610.330-9","Ferias");
        
        func.Bonificacao(1);
        
        func.exibirInfor();
        
        func.demissao();
        
        func.Penalizacao(2);
        
    }
    
}
