package org.jplate.foundation.parser;

import org.jplate.foundation.gof.factory.FactoryIfc;


/**
 
    Factory for creating implementations of JPlateParserIfc's.


    <pre>
Modifications:
    $Date: 2008-12-02 12:32:45 -0500 (Tue, 02 Dec 2008) $
    $Revision: 479 $
    $Author: sfloess $
    $HeadURL: https://jplate.svn.sourceforge.net/svnroot/jplate/trunk/src/dev/java/org/jplate/foundation/parser/JPlateParserFactoryIfc.java $
    </pre>

    @param <V> The JPlateParserIfc created.

*/
public interface JPlateParserFactoryIfc <V extends JPlateParserIfc <?>>
    extends FactoryIfc <V>
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
    // Instance class definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Instance method definitions follow...
    //
    // ----------------------------------------------------------------------

}
