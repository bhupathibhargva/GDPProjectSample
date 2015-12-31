/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author s519458
 */
@Entity
@Table(name = "mappingtable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mappingtable.findAll", query = "SELECT m FROM Mappingtable m"),
    @NamedQuery(name = "Mappingtable.findBySid", query = "SELECT m FROM Mappingtable m WHERE m.sid = :sid"),
    @NamedQuery(name = "Mappingtable.findByStudentkey", query = "SELECT m FROM Mappingtable m WHERE m.studentkey = :studentkey"),
    @NamedQuery(name = "Mappingtable.findByNum919", query = "SELECT m FROM Mappingtable m WHERE m.num919 = :num919")})
public class Mappingtable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SID")
    private String sid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "studentkey")
    private Integer studentkey;
    @Column(name = "num919")
    private Integer num919;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mappingtable")
    private Collection<StuRecord> stuRecordCollection;

    public Mappingtable() {
    }

    public Mappingtable(Integer studentkey) {
        this.studentkey = studentkey;
    }

    public Mappingtable(Integer studentkey, String sid) {
        this.studentkey = studentkey;
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getStudentkey() {
        return studentkey;
    }

    public void setStudentkey(Integer studentkey) {
        this.studentkey = studentkey;
    }

    public Integer getNum919() {
        return num919;
    }

    public void setNum919(Integer num919) {
        this.num919 = num919;
    }

    @XmlTransient
    public Collection<StuRecord> getStuRecordCollection() {
        return stuRecordCollection;
    }

    public void setStuRecordCollection(Collection<StuRecord> stuRecordCollection) {
        this.stuRecordCollection = stuRecordCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentkey != null ? studentkey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mappingtable)) {
            return false;
        }
        Mappingtable other = (Mappingtable) object;
        if ((this.studentkey == null && other.studentkey != null) || (this.studentkey != null && !this.studentkey.equals(other.studentkey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mappingtable[ studentkey=" + studentkey + " ]";
    }
    
}
