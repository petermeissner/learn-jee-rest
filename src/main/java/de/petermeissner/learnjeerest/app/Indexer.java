package de.petermeissner.learnjeerest.app;

public class Indexer {
    String str = "<html>" +
            "<h1>Index</h1><br>";

    public void add(String entry){
        this.str = str + String.format("<a href=\"%s\"> %s </a><br>\n", entry, entry);
    }

    public String toString(){
        return this.str;
    }
}
