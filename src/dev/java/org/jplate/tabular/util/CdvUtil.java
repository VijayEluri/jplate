package org.jplate.tabular.util;


import java.io.File;
import java.io.InputStream;
import java.io.Reader;

import java.util.List;

import org.jplate.tabular.TableIfc;
import org.jplate.tabular.TabularException;

import org.jplate.tabular.cdv.parser.impl.defaults.DefaultCdvParser;

import org.jplate.tabular.parser.impl.defaults.DefaultTableBuilder;
import org.jplate.tabular.parser.impl.defaults.DefaultTabularListBuilder;


/**
 
    CDV related utilities.

    <pre>
Modifications:
    $Date: 2008-12-02 12:32:45 -0500 (Tue, 02 Dec 2008) $
    $Revision: 479 $
    $Author: sfloess $
    $HeadURL: https://jplate.svn.sourceforge.net/svnroot/jplate/trunk/src/dev/java/org/jplate/tabular/util/CdvUtil.java $
    </pre>

*/
public class CdvUtil
{
    // ----------------------------------------------------------------------
    //
    // Interface definitions follow...
    //
    // ----------------------------------------------------------------------

    
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
     * Default constructor not allowed.
     *
     * @throws UnsupportedOperationException If this constructor is called.
     *
     */
    private CdvUtil ()
    {
        throw new UnsupportedOperationException ();
    }



    // ----------------------------------------------------------------------
    //
    // Instance method definitions follow...
    //
    // ----------------------------------------------------------------------


    /**
     *
     * Create a {@link List} of CDV parsed data contained in
     * <code>inputStream</code>.
     *
     * @param inputStream A stream CDV data.
     *
     * @return A list of CSV records and fields.
     *
     * @throws TabularException If any problems arise getting CSV releated
     *         data from <code>inputStream</code>.
     *
     */
    public static List <List <String>> getAsList ( final InputStream inputStream )
            throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTabularListBuilder> csvParser  =
                new DefaultCdvParser <DefaultTabularListBuilder> ();

            final DefaultTabularListBuilder listBuilder =
                new DefaultTabularListBuilder ();

            csvParser.parse ( inputStream, listBuilder );

            return listBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link List} of CDV parsed data contained in
     * <code>reader</code>.
     *
     * @param reader Contains data to be parsed.
     *
     * @return A list of CSV records and fields.
     *
     * @throws TabularException If any problems arise parsing from
     *         <code>reader</code>.
     *
     */
    public static List <List <String>> getAsList ( final Reader reader )
        throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTabularListBuilder> csvParser  =
                new DefaultCdvParser <DefaultTabularListBuilder> ();

            final DefaultTabularListBuilder listBuilder =
                new DefaultTabularListBuilder ();

            csvParser.parse ( reader, listBuilder );

            return listBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link List} of CDV parsed data contained in
     * <code>string</code>.
     *
     * @param string A string containing data to be parsed.
     *
     * @return A list of CSV records and fields.
     *
     * @throws TabularException if any problems arise parsing from
     *         <code>string</code>.
     *
     */
    public static List <List <String>> getAsList ( final String string )
        throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTabularListBuilder> csvParser  =
                new DefaultCdvParser <DefaultTabularListBuilder> ();

            final DefaultTabularListBuilder listBuilder =
                new DefaultTabularListBuilder ();

            csvParser.parse ( string, listBuilder );

            return listBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link List} of CDV parsed data contained in
     * <code>file</code>.
     *
     * @param file is the file containing data to be parsed.
     *
     * @return A list of CSV records and fields.
     *
     * @throws TabularException if any problems arise parsing from
     *         <code>file</code>.
     *
     */
    public static List <List <String>> getAsList ( final File file )
        throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTabularListBuilder> csvParser  =
                new DefaultCdvParser <DefaultTabularListBuilder> ();

            final DefaultTabularListBuilder listBuilder =
                new DefaultTabularListBuilder ();

            csvParser.parse ( file, listBuilder );

            return listBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link TableIfc} of CDV parsed data contained in
     * <code>inputStream</code>.
     *
     * @param inputStream A stream CDV data.
     *
     * @return A table of CSV records and fields.
     *
     * @throws TabularException If any problems arise getting CSV releated
     *         data from <code>inputStream</code>.
     *
     */
    public static TableIfc getAsTable ( final InputStream inputStream )
        throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTableBuilder> csvParser  =
                new DefaultCdvParser <DefaultTableBuilder> ();

            final DefaultTableBuilder tableBuilder = new DefaultTableBuilder ();

            csvParser.parse ( inputStream, tableBuilder );

            return tableBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link TableIfc} of CDV parsed data contained in
     * <code>reader</code>.
     *
     * @param reader Contains data to be parsed.
     *
     * @return A table of CSV records and fields.
     *
     * @throws TabularException If any problems arise parsing from
     *         <code>reader</code>.
     *
     */
    public static TableIfc getAsTable ( final Reader reader )
        throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTableBuilder> csvParser  =
                new DefaultCdvParser <DefaultTableBuilder> ();

            final DefaultTableBuilder tableBuilder = new DefaultTableBuilder ();

            csvParser.parse ( reader, tableBuilder );

            return tableBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link TableIfc} of CDV parsed data contained in
     * <code>string</code>.
     *
     * @param string A string containing data to be parsed.
     *
     * @return A table of CSV records and fields.
     *
     * @throws TabularException if any problems arise parsing from
     *         <code>string</code>.
     *
     */
    public static TableIfc getAsTable ( final String string )
        throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTableBuilder> csvParser  =
                new DefaultCdvParser <DefaultTableBuilder> ();

            final DefaultTableBuilder tableBuilder = new DefaultTableBuilder ();

            csvParser.parse ( string, tableBuilder );

            return tableBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }


    /**
     *
     * Create a {@link TableIfc} of CDV parsed data contained in
     * <code>file</code>.
     *
     * @param file is the file containing data to be parsed.
     *
     * @return A table of CSV records and fields.
     *
     * @throws TabularException if any problems arise parsing from
     *         <code>file</code>.
     *
     */
    public static TableIfc getAsTable ( final File file ) throws TabularException
    {
        try
        {
            final DefaultCdvParser <DefaultTableBuilder> csvParser  =
                new DefaultCdvParser <DefaultTableBuilder> ();

            final DefaultTableBuilder tableBuilder = new DefaultTableBuilder ();

            csvParser.parse ( file, tableBuilder );

            return tableBuilder.getResult ();
        }

        catch ( final Exception exception )
        {
            throw new TabularException ( exception );
        }
    }
}
