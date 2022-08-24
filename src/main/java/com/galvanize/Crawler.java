package com.galvanize;

import java.net.URI;

public class Crawler implements Browseable{
    private URI currentPage;

    public void setCurrentPage(URI uri){
        currentPage = uri;
    }

    @Override
    public URI getCurrentPage() {
        return currentPage;
    }

    @Override
    public void visit(URI uri){
        setCurrentPage(uri);
    }

}
