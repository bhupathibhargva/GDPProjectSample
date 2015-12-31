package entities;

import entities.Mappingtable;
import entities.Nwcourse;
import entities.StuRecordPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-22T12:18:07")
@StaticMetamodel(StuRecord.class)
public class StuRecord_ { 

    public static volatile SingularAttribute<StuRecord, StuRecordPK> stuRecordPK;
    public static volatile SingularAttribute<StuRecord, String> grade;
    public static volatile SingularAttribute<StuRecord, Mappingtable> mappingtable;
    public static volatile SingularAttribute<StuRecord, Nwcourse> nwcourse;

}