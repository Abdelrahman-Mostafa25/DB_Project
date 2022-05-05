/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author 3bdo Mostafa
 */
@Embeddable //@Embeddable annotation to declare that a class will be embedded by other entities.
public class DependentPK implements Serializable {

    @Basic(optional = false)//no constrain on it
    @Column(name = "Essn")
    private String essn;
    @Basic(optional = false)
    @Column(name = "Dependent_name")
    private String dependent_name;

    public DependentPK() {
    }

    public DependentPK(String essn, String dependent_name) {
        this.essn = essn;
        this.dependent_name = dependent_name;
    }

    public String getEssn() {
        return essn;
    }

    public void setEssn(String essn) {
        this.essn = essn;
    }

    public String getDependent_name() {
        return dependent_name;
    }

    public void setDependent_name(String dependent_name) {
        this.dependent_name = dependent_name;
    }

}
