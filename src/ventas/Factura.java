/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author carlo
 */
public class Factura {
   private float total;
   public Cliente micliente;
   public Producto miproducto;

    public Factura() {
    }

    public Factura(float total, Cliente micliente, Producto miproducto) {
        this.total = total;
        this.micliente = micliente;
        this.miproducto = miproducto;
    }
   public void generarFactura(Cliente cliente, Producto producto)
   {
       micliente=cliente;
       miproducto=producto;
   }
   }

