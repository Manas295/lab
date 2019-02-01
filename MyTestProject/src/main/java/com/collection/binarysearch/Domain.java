package com.collection.binarysearch;
class Domain
{
    private int id;
    private String url;
 
    // Constructor
    public Domain(int id, String url)
    {
        this.id = id;
        this.url = url;
    }
 
    public Integer getId()
    {
        return Integer.valueOf(id);
    }
}
