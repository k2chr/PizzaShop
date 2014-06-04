package pizzashop;

import java.net.URL;
import java.util.Date;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String name;
     
    @Persistent
    private String num;

     
    @Persistent
    private Date datetime;
 
    public LinkData(String name, String num, Date datetime) {
        super();
        this.name = name;
        this.num = num;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getNum() {
        return num;
    }
 
    public void setNum(String num) {
        this.num = num;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

}
