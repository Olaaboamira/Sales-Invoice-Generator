/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

/**
 *
 * @author Ola
 */
public class Invoiceline {
   
    String name;
    int count;
    double price;
    invoiceheader inv;

    public Invoiceline(String name, int count, double price, invoiceheader inv) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.inv = inv;
    }

    Invoiceline(String itemName, double itemPrice, int itemCount, InvoiceFrame1 header) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTotal(){
        return count *price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public invoiceheader getInv() {
        return inv;
    }

    public void setInv(invoiceheader inv) {
        this.inv = inv;
    }

    @Override
    public String toString() {
        return "Invoiceline{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    
    
    
    
    
}
