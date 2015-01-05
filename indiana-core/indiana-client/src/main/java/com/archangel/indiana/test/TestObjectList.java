package com.archangel.indiana.test;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Mihael on 29.12.2014.
 */
@XmlRootElement(name = "testObjects")
public class TestObjectList
{

    private List<TestObject> list;

    public TestObjectList()
    {
    }

    public List<TestObject> getList()
    {
        return list;
    }

    public void setList(List<TestObject> list)
    {
        this.list = list;
    }

}
