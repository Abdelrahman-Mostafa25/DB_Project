/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;

/**
 *
 * @author 3bdo Mostafa
 */
@Entity
public class DEPENDENT implements Serializable {
    
   private static final long serialVersionUID = 1L;
   /*
   In software, we come across many use cases when we need to have a composite primary key to define an entry in a table.
   Composite primary keys are keys that use more than one column to identify a row in the table uniquely.
   We represent a composite primary key in Spring Data by using the @Embeddable annotation on a class. 
   This key is then embedded in the table's corresponding entity class as the composite primary key by using the @EmbeddedId annotation on a field of the @Embeddable type.
   */
   @EmbeddedId
    protected DependentPK dependentPK;
    @Column(name="Sex")
    private char sex;
    @Column(name="Bdate")
    @Temporal(javax.persistence.TemporalType.DATE)
    //it helps to convert the date and time values from Java object to compatible database type and will retrieve it back to the application.
    private Date bdate;
    @Column(name="Relationship")
    private String relationship;
    @JoinColumn(name = "Essn", referencedColumnName = "Ssn", insertable = false, updatable = false)
    //insertable = false, updatable = false: You would do that when the responsibility of creating/updating the referenced column isn't in the current entity, but in another entity.
    @ManyToOne(optional = false ) //for no null falue
    private Employee employee;
     
    public DEPENDENT() {
    }

    public DEPENDENT(DependentPK dependentPK) {
        this.dependentPK = dependentPK;
    }
    
    public DEPENDENT(char sex, Date bdate, String relationship) {
        this.sex = sex;
        this.bdate = bdate;
        this.relationship = relationship;
    }

    public DependentPK getDependentPK() {
        return dependentPK;
    }

    public void setDependentPK(DependentPK dependentPK) {
        this.dependentPK = dependentPK;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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

    @Override
    public String toString() {
        return "Entities.DB_Project.DEPENDENT[ Essn=" + " ]";
    }
    
}
