/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author s519458
 */
@Entity
@Table(name = "stu_record")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StuRecord.findAll", query = "SELECT s FROM StuRecord s"),
    @NamedQuery(name = "StuRecord.findByStudentKey", query = "SELECT s FROM StuRecord s WHERE s.stuRecordPK.studentKey = :studentKey"),
    @NamedQuery(name = "StuRecord.findByCourseNum", query = "SELECT s FROM StuRecord s WHERE s.stuRecordPK.courseNum = :courseNum"),
    @NamedQuery(name = "StuRecord.findByGrade", query = "SELECT s FROM StuRecord s WHERE s.grade = :grade")})
public class StuRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StuRecordPK stuRecordPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Grade")
    private String grade;
    @JoinColumn(name = "courseNum", referencedColumnName = "courseNum", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Nwcourse nwcourse;
    @JoinColumn(name = "studentKey", referencedColumnName = "studentkey", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Mappingtable mappingtable;

    public StuRecord() {
    }

    public StuRecord(StuRecordPK stuRecordPK) {
        this.stuRecordPK = stuRecordPK;
    }

    public StuRecord(StuRecordPK stuRecordPK, String grade) {
        this.stuRecordPK = stuRecordPK;
        this.grade = grade;
    }

    public StuRecord(int studentKey, int courseNum) {
        this.stuRecordPK = new StuRecordPK(studentKey, courseNum);
    }

    public StuRecordPK getStuRecordPK() {
        return stuRecordPK;
    }

    public void setStuRecordPK(StuRecordPK stuRecordPK) {
        this.stuRecordPK = stuRecordPK;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Nwcourse getNwcourse() {
        return nwcourse;
    }

    public void setNwcourse(Nwcourse nwcourse) {
        this.nwcourse = nwcourse;
    }

    public Mappingtable getMappingtable() {
        return mappingtable;
    }

    public void setMappingtable(Mappingtable mappingtable) {
        this.mappingtable = mappingtable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stuRecordPK != null ? stuRecordPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StuRecord)) {
            return false;
        }
        StuRecord other = (StuRecord) object;
        if ((this.stuRecordPK == null && other.stuRecordPK != null) || (this.stuRecordPK != null && !this.stuRecordPK.equals(other.stuRecordPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return stuRecordPK.toString();
    }
    
}
