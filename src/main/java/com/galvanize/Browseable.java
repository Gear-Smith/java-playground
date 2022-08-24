package com.galvanize;

import java.net.URI;

interface Browseable {
    public void visit(URI uri);

    public URI getCurrentPage();

}
