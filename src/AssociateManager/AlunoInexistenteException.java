/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssociateManager;

/**
 *
 * @author miguelq
 */
public class AlunoInexistenteException extends Exception{
    
    public AlunoInexistenteException(){
        super();
    }
    
    public AlunoInexistenteException(String msg){
        super(msg);
    }
}