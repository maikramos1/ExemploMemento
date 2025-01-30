/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.ArrayList;
import java.util.List;
import model.ProdutoMemento;

/**
 *
 * @author maik.maifredo
 */
public class Zelador {
    
    private List<ProdutoMemento> elementos;
    private static Zelador instancia = null;
    
    public static Zelador getInstancia(){
        if(instancia == null){
            instancia = new Zelador();
        }
        return instancia;
    }
    
    private Zelador() {
        elementos = new ArrayList<>();
    }
    
    public ProdutoMemento getUltimo(){
        return elementos.get( (elementos.size() -1) );
    }
    
    public void add(ProdutoMemento memento){
        if(elementos.size() > 5){
          elementos.remove(0);
        }
        elementos.add(memento);
    }
    
}
