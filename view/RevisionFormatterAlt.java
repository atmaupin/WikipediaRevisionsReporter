package edu.bsu.cs.view;
import com.google.inject.AbstractModule;
import edu.bsu.cs.view.RevisionFormatter;

public class RevisionFormatterAlt extends AbstractModule {
    @Override
    protected void configure(){
        bind(RevisionInterface.class).to(RevisionFormatter.class);
    }
}
