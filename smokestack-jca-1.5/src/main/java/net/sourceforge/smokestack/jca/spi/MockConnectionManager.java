/**
 * 
 */
package net.sourceforge.smokestack.jca.spi;

import javax.resource.ResourceException;
import javax.resource.spi.ConnectionManager;
import javax.resource.spi.ConnectionRequestInfo;
import javax.resource.spi.ManagedConnectionFactory;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import net.sourceforge.smokestack.exception.NeedsMockDefinitionException;

/**
 * @author gliptak
 *
 */
public class MockConnectionManager implements ConnectionManager {

	/**
	 * Generated
	 */
	private static final long serialVersionUID = -2078067656911839453L;

	/* (non-Javadoc)
	 * @see javax.resource.spi.ConnectionManager#allocateConnection(javax.resource.spi.ManagedConnectionFactory, javax.resource.spi.ConnectionRequestInfo)
	 */
	@Override
	public Object allocateConnection(ManagedConnectionFactory managedConnectionFactory,
			ConnectionRequestInfo connectionRequestInfo) throws ResourceException {
		throw new NeedsMockDefinitionException();
	}
	
	@Override
	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
