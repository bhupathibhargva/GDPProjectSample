package entities;

import entities.StuRecord;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-22T12:18:07")
@StaticMetamodel(Nwcourse.class)
public class Nwcourse_ { 

    public static volatile SingularAttribute<Nwcourse, String> courseName;
    public static volatile SingularAttribute<Nwcourse, Integer> courseNum;
    public static volatile CollectionAttribute<Nwcourse, StuRecord> stuRecordCollection;

}