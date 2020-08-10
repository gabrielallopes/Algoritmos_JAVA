
package condicionais;

import javax.swing.JOptionPane;


public class categoriasPeso {


    public static void main(String[] args) {
 double peso;
 peso= Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg:"));
 
   if (peso<=46.27) {
JOptionPane.showMessageDialog(null, "Categoria: PALHA LIGEIRO");
 }
if ((peso>46.27) && (peso<=47.63)) {
JOptionPane.showMessageDialog(null, "Categoria: PALHA");
 }
if ((peso>47.63) && (peso<=48.99)) {
JOptionPane.showMessageDialog(null, "Categoria: MOSCA LIGEIRO");
 }
if ((peso>48.99) && (peso<=50.35)) {
JOptionPane.showMessageDialog(null, "Categoria: MOSCA");
 }
if ((peso>50.35) && (peso<=51.71)) {
JOptionPane.showMessageDialog(null, "Categoria: SUPER MOSCA");
 }
if ((peso>51.71) && (peso<=53.52)) {
JOptionPane.showMessageDialog(null, "Categoria: GALO");
 }
if ((peso>53.52) && (peso<=55.34)) {
JOptionPane.showMessageDialog(null, "Categoria: SUPER GALO");
 }
if ((peso>55.34) && (peso<=57.15)) {
JOptionPane.showMessageDialog(null, "Categoria: PENA");
 }
if ((peso>57.15) && (peso<=58.97)) {
JOptionPane.showMessageDialog(null, "Categoria: SUPER PENA");
 }
if ((peso>58.97) && (peso<=61.23)) {
JOptionPane.showMessageDialog(null, "Categoria: LEVE");
 }
if ((peso>61.23) && (peso<=63.5)) {
JOptionPane.showMessageDialog(null, "Categoria: SUPER LEVE");
 }
if ((peso>63.5) && (peso<=66.68)) {
JOptionPane.showMessageDialog(null, "Categoria: MEIO-MÉDIO");
 }
if ((peso>66.68) && (peso<=69.85)) {
JOptionPane.showMessageDialog(null, "Categoria: SUPER MEIO-MÉDIO");
 }
if ((peso>69.85) && (peso<=73.03)) {
JOptionPane.showMessageDialog(null, "Categoria:  MÉDIO");
 }
if ((peso>73.03) && (peso<=76.2)) {
JOptionPane.showMessageDialog(null, "Categoria: SUPER MÉDIO");
 }
if ((peso>76.2) && (peso<=79.38)) {
JOptionPane.showMessageDialog(null, "Categoria: MEIO-PESADO");
 }
if ((peso>79.38) && (peso<=90.72)) {
JOptionPane.showMessageDialog(null, "Categoria: CRUZADOR");
 }
if (peso>90.72) {
JOptionPane.showMessageDialog(null, "Categoria: PESADO");
 }
    }
    
}
