/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssociateManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;


/**
 *
 * @author miguelq
 */
public class Aluno implements Serializable{
    
    private String nome;
    private int nro;
    private String degree;
    private int yr;
    private String addr;
    private List<Quota> reg;
    
    public Aluno(){
        this.nome = new String();
        this.nro = 0;
        this.degree = new String();
        this.yr = 0;
        this.addr = new String();
        this.reg = new ArrayList<>();
    }
    
    public Aluno(String nNome, int nNro, String nDegree, int nYr, String nAddr, List<Quota> nReg){
        this.nome = nNome;
        this.nro = nNro;
        this.degree = nDegree;
        this.yr = nYr;
        this.addr = nAddr;
        this.reg = nReg.stream().map(Quota::clone).collect(Collectors.toList());
    }
    
    public Aluno(Aluno nAl){
        this.nome = nAl.getNome();
        this.nro = nAl.getNro();
        this.degree = nAl.getDegree();
        this.yr = nAl.getYr();
        this.addr = nAl.getAddr();
        this.reg = nAl.getReg();
    }
    
    //gets & sets
    public String getNome(){
        return this.nome;
    }
    
    public int getNro(){
        return this.nro;
    }
    
    public String getDegree(){
        return this.degree;
    }
    
    public int getYr(){
        return this.yr;
    }
    
    public String getAddr(){
        return this.addr;
    }
    
    public List<Quota> getReg(){
        return this.reg.stream().map(Quota::clone).collect(Collectors.toList());
    }
    
    public void setNome(String nNome){
        this.nome = nNome;
    }
    
    public void setNro(int nNro){
        this.nro = nNro;
    }
    
    public void setDegree(String nDegree){
        this.degree = nDegree;
    }
    
    public void setYr(int nYr){
        this.yr = nYr;
    }
    
    public void setAddr(String nAddr){
        this.addr = nAddr;
    }
    
    public void setQuotas(List<Quota> nReg){
        this.reg = nReg.stream().map(Quota::clone).collect(Collectors.toList());
    }
    
    
    public boolean equals(Object cmp){
        if(this == cmp) return true;
        
        else if(cmp == null || this.getClass() != cmp.getClass())
            return false;
        
        Aluno aux = (Aluno)cmp;
        return this.nome.equals(aux.getNome()) && this.nro == aux.getNro();
    }
    
    public Aluno clone(){
        return new Aluno(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Numero:").append(this.nro).append("\n");
        sb.append("Nome:").append(this.nome).append("\n");
        sb.append("Curso:").append(this.degree).append("\n");
        sb.append("Ano:").append(this.yr).append("\n");
        sb.append("Morada:").append(this.addr).append("\n");
        
        return sb.toString();
    }

    public void addQuota(double valor, LocalDate payDate){
        this.reg.add(new Quota(valor, payDate));
    }
    
    
}