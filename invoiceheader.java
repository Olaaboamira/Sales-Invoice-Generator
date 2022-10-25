/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ola
 */
public class invoiceheader {
    private int num;
    private Date date;
    private String name;
    private ArrayList<Invoiceline>lincs;

    public invoiceheader(int num, Date date, String name) {
        this.num = num;
        this.date = date;
        this.name = name;
    }
     public double getTotal(){
         double total = 0.0;
           for (int i = 0; i < lines.size??(); i++) {
             Invoiceline line = lines.get(i);
             total +=  line.getTotal();
         }
         return total;
         
         //return getLines().stream().mapToDouble(line -> line.getTotal()).sum();
     }
     
     public ArrayList<Invoiceline> getLines() {
        return lincs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "invoiceheader{" + "num=" + num + ", date=" + date + ", name=" + name + '}';
    }
    
    
}
