package org.curso.jsfproject.scopes;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author Mauri
 */
public abstract class AbstractTestScopeController implements Serializable{

    protected String tag = "AbstractTestScopeController";
    protected Date createDate = null;

        
    @PostConstruct
    public void PostConstruct() {
        System.out.println(tag + "- PostConstruct");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println(tag + "- PreDestroy");
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
