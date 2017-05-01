package com.chaintronics.the78mole.reqtool.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class ReqXMLEditor extends TextEditor {

	private ColorManager colorManager;

	public ReqXMLEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
