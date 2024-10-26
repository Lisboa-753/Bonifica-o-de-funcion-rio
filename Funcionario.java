/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author Gabriel
 */
public class Funcionario {
    private String nome;
    private String dep;
    private float salario;
    private String data;
    private String rg;
    private String estado;

    
    public Funcionario(String nome, String dep, float salario, String data, String rg, String estado) {
        this.nome = nome;
        this.dep = dep;
        this.salario = salario;
        this.data = data;
        this.rg = rg;
        this.estado = estado;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dep
     */
    public String getDep() {
        return dep;
    }

    /**
     * @param dep the dep to set
     */
    public void setDep(String dep) {
        this.dep = dep;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void Bonificacao(float percentual){
        if(percentual > 0){
            this.salario += this.salario * (percentual / 100);
            System.out.println("Bonificacao aplicada! salario apos aumento: "+this.salario);
        } else {
            System.out.println("Bonificacao invalida!!!");
        }
        
    }
    
    public void demissao(){
        if(!this.estado.equals("Desligado")){
            this.estado = "Desligado";
            System.out.println("Funcionario demitido! Estado atual: "+estado);                
        } else {
            System.out.println("Funcinario ja foi desligado!");
        }
    }
    
    public void Penalizacao(float percentual){
        if(percentual > 0){
            this.salario -= this.salario * (percentual / 100);
            System.out.println("Penalizacao aplicada! salario apos reducao: "+this.salario);
        } else {
            System.out.println("Penalizacao invalida!!!");
        }
        
    }
    
    public void exibirInfor() {
        System.out.println("********* infomacoes do funcionario ***************");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.dep);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de Entrada: " + this.data);
        System.out.println("RG: " + this.rg);
        System.out.println("Estado: " + this.estado);
    }
}
