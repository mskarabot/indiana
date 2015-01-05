package com.archangel.indiana.test;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Mihael on 29.12.2014.
 */
@XmlRootElement(name = "testObject")
public class TestObject implements Serializable
{

    private String id;

    public TestObject(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
