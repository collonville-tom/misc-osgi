package org.tc.osgi.bundle.groovy.interf.exception;

import org.tc.osgi.bundle.utils.interf.exception.TcOsgiException;

public class GroovyExecutionException extends TcOsgiException {


  
    public GroovyExecutionException(final String _message) {
        super(_message);
    }

 
    public GroovyExecutionException(final String _message, final Throwable _e) {
        super(_message, _e);
    }
}
