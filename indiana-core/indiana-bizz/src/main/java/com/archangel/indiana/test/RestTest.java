package com.archangel.indiana.test;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihael on 29.12.2014.
 */


@Path("/library")
@Stateless
@Consumes({"application/json"})
@Produces({"application/json"})
public class RestTest
{


    // url http://localhost:8080/indiana/rest/library/json
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObjectList getListJSON ()

    {
        ArrayList<TestObject> list = new ArrayList();
        list.add(new TestObject("aAAafwf"));
        list.add(new TestObject("awegawef"));
        list.add(new TestObject("hreherha"));
        TestObjectList testObjectList = new TestObjectList();
        testObjectList.setList(list);
        return testObjectList;
    }



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject getByName(@QueryParam("name") String name)
    {
        return new TestObject(name);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject getById(@PathParam("id") String id)
    {
        return new TestObject("TestObject-" + id);
    }

}
