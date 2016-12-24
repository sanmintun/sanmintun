package com.mbc.Connect4.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FrmConnect4 extends Composite {

	private static FrmConnect4UiBinder uiBinder = GWT.create(FrmConnect4UiBinder.class);

	interface FrmConnect4UiBinder extends UiBinder<Widget, FrmConnect4> {
	}

	public FrmConnect4() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
