package org.jplate.foundation.gof.visitor;

import org.jplate.foundation.gof.GOFException;

/**

    Base exception for all visitor errors.

    <p/>
    <pre>
Modifications:
    $Date: 2008-12-02 12:32:45 -0500 (Tue, 02 Dec 2008) $
    $Revision: 479 $
    $Author: sfloess $
    $HeadURL: https://jplate.svn.sourceforge.net/svnroot/jplate/trunk/src/dev/java/org/jplate/foundation/gof/visitor/VisitException.java $
    </pre>

*/
public class VisitException extends GOFException
{
    // ----------------------------------------------------------------------
    //
    // Interface definitions follow...
    //
    // ----------------------------------------------------------------------

    
    // ----------------------------------------------------------------------
    //
    // Static class definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Static member definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Static methods follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Instance class definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Instance member definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Constructor definitions follow...
    //
    // ----------------------------------------------------------------------


    /**
     *
     * Default constructor.
     *
     */
    public VisitException ()
    {
    }

    /**
     *
     * This constructor sets the message.
     *
     * @param msg A message about why self was raised.
     *
     */
    public VisitException ( final String msg )
    {
        super ( msg );
    }

    /**
     *
     * This constructor sets the root cause.
     *
     * @param rootCause The exception that caused self to be raised.
     *
     */
    public VisitException ( final Throwable rootCause )
    {
        super ( rootCause );
    }

    /**
     *
     * This constructor sets the message and root cause.
     *
     * @param msg       A message about why self was raised.
     *
     * @param rootCause The exception that caused self to be raised.
     *
     */
    public VisitException ( final String msg, final Throwable rootCause )
    {
        super ( msg, rootCause );
    }


    // ----------------------------------------------------------------------
    //
    // Instance method definitions follow...
    //
    // ----------------------------------------------------------------------
}
