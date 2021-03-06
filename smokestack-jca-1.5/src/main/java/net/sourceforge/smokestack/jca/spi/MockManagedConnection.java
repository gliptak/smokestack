/**
 * 
 */
package net.sourceforge.smokestack.jca.spi;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.resource.ResourceException;
import javax.resource.spi.ConnectionEventListener;
import javax.resource.spi.ConnectionRequestInfo;
import javax.resource.spi.LocalTransaction;
import javax.resource.spi.ManagedConnection;
import javax.resource.spi.ManagedConnectionMetaData;
import javax.security.auth.Subject;
import javax.transaction.xa.XAResource;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import net.sourceforge.smokestack.exception.NotYetImplementedException;

/**
 * @author gliptak
 *
 */
public class MockManagedConnection implements ManagedConnection {

	protected PrintWriter printWriter;
	
	protected List<ConnectionEventListener> listeners=new ArrayList<ConnectionEventListener>();

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#addConnectionEventListener(javax.resource.spi.ConnectionEventListener)
	 */
	public void addConnectionEventListener(ConnectionEventListener listener) {
		listeners.add(listener);
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#associateConnection(java.lang.Object)
	 */
	public void associateConnection(Object arg0) throws ResourceException {
		throw new NotYetImplementedException();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#cleanup()
	 */
	public void cleanup() throws ResourceException {
		throw new NotYetImplementedException();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#destroy()
	 */
	public void destroy() throws ResourceException {
		throw new NotYetImplementedException();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#getConnection(javax.security.auth.Subject, javax.resource.spi.ConnectionRequestInfo)
	 */
	public Object getConnection(Subject subject, ConnectionRequestInfo connectionRequestInfo) throws ResourceException {
		throw new NotYetImplementedException();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#getLocalTransaction()
	 */
	public LocalTransaction getLocalTransaction() throws ResourceException {
		throw new NotYetImplementedException();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#getLogWriter()
	 */
	public PrintWriter getLogWriter() throws ResourceException {
		return printWriter;
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#getMetaData()
	 */
	public ManagedConnectionMetaData getMetaData() throws ResourceException {
		return new MockManagedConnectionMetadata();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#getXAResource()
	 */
	public XAResource getXAResource() throws ResourceException {
		throw new NotYetImplementedException();
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#removeConnectionEventListener(javax.resource.spi.ConnectionEventListener)
	 */
	public void removeConnectionEventListener(ConnectionEventListener listener) {
		listeners.remove(listener);
	}

	/* (non-Javadoc)
	 * @see javax.resource.spi.ManagedConnection#setLogWriter(java.io.PrintWriter)
	 */
	public void setLogWriter(PrintWriter printWriter) throws ResourceException {
		this.printWriter=printWriter;
	}

	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
