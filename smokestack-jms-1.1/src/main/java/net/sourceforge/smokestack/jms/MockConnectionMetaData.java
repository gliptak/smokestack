/**
 * 
 */
package net.sourceforge.smokestack.jms;

import java.util.Enumeration;
import java.util.Vector;

import javax.jms.ConnectionMetaData;
import javax.jms.JMSException;

/**
 * @author gliptak
 *
 */
public class MockConnectionMetaData implements ConnectionMetaData {

	protected Vector jmsxProperties=new Vector();
	
	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getJMSMajorVersion()
	 */
	public int getJMSMajorVersion() throws JMSException {
		return 1;
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getJMSMinorVersion()
	 */
	public int getJMSMinorVersion() throws JMSException {
		return 1;
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getJMSProviderName()
	 */
	public String getJMSProviderName() throws JMSException {
		return "Smokestack";
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getJMSVersion()
	 */
	public String getJMSVersion() throws JMSException {
		return "1.1";
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getJMSXPropertyNames()
	 */
	public Enumeration getJMSXPropertyNames() throws JMSException {
		return jmsxProperties.elements();
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getProviderMajorVersion()
	 */
	public int getProviderMajorVersion() throws JMSException {
		return 1;
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getProviderMinorVersion()
	 */
	public int getProviderMinorVersion() throws JMSException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see javax.jms.ConnectionMetaData#getProviderVersion()
	 */
	public String getProviderVersion() throws JMSException {
		return "1.0";
	}

}
