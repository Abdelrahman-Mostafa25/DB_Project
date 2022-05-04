/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author 3bdo Mostafa
 */
@Entity
public class DEPENDENT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Essn;
    private String Dependent_name;
    
    @Column(name="Sex")
    private char sex;
    @Column(name="Bdate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date bdate;
    @Column(name="Relationship")
    private String relationship;
    
    public DEPENDENT() {
    }

    public DEPENDENT(Long Essn, String Dependent_name, char sex, Date bdate, String relationship) {
        this.Essn = Essn;
        this.Dependent_name = Dependent_name;
        this.sex = sex;
        this.bdate = bdate;
        this.relationship = relationship;
    }

    

    public Long getEssn() {
        return Essn;
    }

    public void setEssn(Long Essn) {
        this.Essn = Essn;
    }

    public String getDependent_name() {
        return Dependent_name;
    }

    public void setDependent_name(String Dependent_name) {
        this.Dependent_name = Dependent_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    
    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    
    

    
 /*   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Essn != null ? Essn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DEPENDENT)) {
            return false;
        }
        DEPENDENT other = (DEPENDENT) object;
        if ((this.Essn == null && other.Essn != null) || (this.Essn != null && !this.Essn.equals(other.Essn))) {
            return false;
        }
        return true;
    }
*/
    @Override
    public String toString() {
        return "Entities.DB_Project.DEPENDENT[ Essn=" + Essn + " ]";
    }
    
}
