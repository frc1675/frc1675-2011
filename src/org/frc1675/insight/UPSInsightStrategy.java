/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.frc1675.insight;

/**
 *
 * @author jpordon
 */
public interface UPSInsightStrategy {
    
    /**
     * @return a string with less than 20 characters for the Insight display's 
     * first line.
     */
    public String buildLine1();
    
    /**
     * @return a string with less than 20 characters for the Insight display's 
     * second line.
     */
    public String buildLine2();
}
