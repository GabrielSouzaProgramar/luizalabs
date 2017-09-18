package br.luizalabs.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Currency;
import java.util.HashMap;

/**
 * Classe responsável por conter os atributos do objeto Produto
 *
 * @author Gabriel.Souza
 * @since 17/09/2017
 * @version 1.0
*/
@XmlRootElement
public class Produto {

    private String id;
    private String ean;
    private String title;
    private String brand;
    private Currency price;
    private Integer stock;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return "Produto [id=" + id + ", ean=" + ean + ", title=" + title + ", brand=" + brand
                + ", price=" + price + ", stock=" + stock + "]";
    }


}
