/*******************************************************************************
 * Copyright (c) 2013 EMF-REST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Camilo Alvarez (cadorca@gmail.com)  - initial API and implementation
 ******************************************************************************/
package com.emf.rest.standalone;

import java.awt.Color;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import com.mtcflow.engine.IMTCConsole;

public class StandaloneConsole implements IMTCConsole {

	public final static Color ERROR_COLOR = new Color(255, 0, 0);
	public final static Color INTERNAL_COLOR = new Color(84, 84, 84);
	public final static Color INFO_COLOR = new Color(0, 0, 255);

	public PrintStream getPrintStream() {
		return System.out;
	}

	public void println(final String message) {
		System.out.println(message);
	}

	public void print(final String message) {
		System.out.print(message);
	}

	public void clear() {
	}

	public void printError(final String message) {
		System.out.print("Error: " + message);

	}

	public void logException(final String message, final Throwable t) {
		if (message != null) {
			System.out.println(message);
		}
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw, true);
		t.printStackTrace(pw);
		printError(sw.getBuffer().toString());
	}

}
