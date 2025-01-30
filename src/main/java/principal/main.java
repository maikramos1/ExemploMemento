/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package principal;

import memento.Zelador;
import model.Produto;

/**
 *
 * @author maik.maifredo
 */
public class main {

    public static void main(String[] args) {
        Produto produto = new Produto("Caderno", 13.20, "escolar");
        Zelador.getInstancia().add(produto.criar());
        produto.setPreco(21.0);
        System.out.println(produto);
        //Undo!
        produto.restaurar(Zelador.getInstancia().getUltimo());
        System.out.println(produto);
        
    }
    
}
