
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RA21550389
 */

@Entity
public class Pincel {
    private String cor;
    private String fabriante;
    @Id
    private int num_serie;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabriante() {
        return fabriante;
    }

    public void setFabriante(String fabriante) {
        this.fabriante = fabriante;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }
    
    
}