/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supfighter;
import fighterlist.*;
/**
 *
 * @author Francisco
 */
public abstract class SupportFighter extends Fighter {
    @Override
    public abstract String nombre();
    
    @Override
    public abstract int calcularPoder();
}
