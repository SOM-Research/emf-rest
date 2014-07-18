package com.emf.rest;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.EMFPlugin.EclipsePlugin;
import org.eclipse.emf.common.util.ResourceLocator;


public class EMFRestPlugin extends EMFPlugin {

	  /**
	   * The singleton instance of the plugin.
	   */
	  public static final EMFRestPlugin INSTANCE = new EMFRestPlugin();

	  /**
	   * The one instance of this class.
	   */
	  private static Implementation plugin;

	  public static final String ID = "emf-rest";

	  /**
	   * Creates the singleton instance.
	   */
	  private EMFRestPlugin()
	  {
	    super(new ResourceLocator [] { });
	  }

	  /*
	   * Javadoc copied from base class.
	   */
	  @Override
	  public ResourceLocator getPluginResourceLocator()
	  {
	    return plugin;
	  }

	  /**
	   * Returns the singleton instance of the Eclipse plugin.
	   * @return the singleton instance.
	   */
	  public static Implementation getPlugin()
	  {
	    return plugin;
	  }

	  /**
	   * The actual implementation of the Eclipse <b>Plugin</b>.
	   */
	  public static class Implementation extends EclipsePlugin
	  {
	    /**
	     * Creates an instance.
	     */
	    public Implementation()
	    {
	      super();
	      // Remember the static instance.
	      //
	      plugin = this;
	    }
	  }

}
