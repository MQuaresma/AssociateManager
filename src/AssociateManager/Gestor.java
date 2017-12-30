/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssociateManager;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.stream.Collectors;


/**
 *
 * @author miguelq
 */
public class Gestor extends Observable implements Serializable{
    
    private Map<Integer,Aluno> socios;
    
    public Gestor(){
        this.socios = new HashMap<>();
    }
    
    public Gestor(Gestor cpGestor){
        this.socios = cpGestor.getSocios();
    }
    
    public Map<Integer,Aluno> getSocios(){    
        return this.socios.entrySet().stream()
                   .collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
    }
    
    public List<Aluno> getAlunos(){    
        return this.socios.values().stream().map(Aluno::clone)
                          .collect(Collectors.toList());
    }
    
    public Aluno getAluno(int num) throws AlunoInexistenteException{
        if(this.socios.containsKey(num)) return this.socios.get(num).clone();
        else throw new AlunoInexistenteException(String.valueOf(num));
    }
    
    public void addAluno(Aluno nAl) throws AlunoExistenteException{
        if(this.socios.containsKey(nAl.getNro()))
            throw new AlunoExistenteException(nAl.toString());
        else{ 
            this.socios.put(nAl.getNro(), nAl.clone());
            System.out.println(nAl.toString());
            this.setChanged();
            this.notifyObservers();
        }
    }
    
    public void updateAluno(int nro, Aluno nInfo)throws AlunoExistenteException{
        if(nro != nInfo.getNro() && this.socios.containsKey(nInfo.getNro()))
            throw new AlunoExistenteException();
        else{
            this.socios.remove(nro);
            this.socios.put(nInfo.getNro(), nInfo.clone());
            System.out.println(nInfo.toString());
            this.setChanged();
            this.notifyObservers();
        }
    }
    
    public void removeAluno(int nro){
        if(this.socios.containsKey(nro))
            this.socios.remove(nro);
        this.setChanged();
        this.notifyObservers();
    }
    
    public void pagarQuota(Integer nro, Double valor){
        if(this.socios.containsKey(nro)) this.socios.get(nro).addQuota(valor, LocalDate.now());
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Aluno a: this.socios.values())
            sb.append(a.toString());
        return sb.toString();
    }
}
