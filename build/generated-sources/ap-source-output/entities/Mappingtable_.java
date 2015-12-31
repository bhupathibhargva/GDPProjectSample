package entities;

import entities.StuRecord;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-22T12:18:07")
@StaticMetamodel(Mappingtable.class)
public class Mappingtable_ { 

    public static volatile SingularAttribute<Mappingtable, Integer> studentkey;
    public static volatile SingularAttribute<Mappingtable, Integer> num919;
    public static volatile CollectionAttribute<Mappingtable, StuRecord> stuRecordCollection;
    public static volatile SingularAttribute<Mappingtable, String> sid;

}