package ua.org.alex.smartgwt.appui.client.ui;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.HLayout;

public class HeaderArea extends HLayout {

	private static final int HEADER_AREA_HEIGHT = 60;

	public HeaderArea() {

		super();

		this.setHeight(HEADER_AREA_HEIGHT);

		Img logo = new Img("logo.png", 110, 112);

		Label name = new Label();
		name.setOverflow(Overflow.HIDDEN);
		name.setContents("Java 2 Java Developers Resource Center");

		HLayout westLayout = new HLayout();
		westLayout.setHeight(HEADER_AREA_HEIGHT);
		westLayout.setAlign(Alignment.CENTER);
		westLayout.setWidth("70%");
		westLayout.addMember(logo);
		westLayout.addMember(name);

		Label signedInUser = new Label();
		signedInUser.setContents("<strong>Alex Atanor</strong>");

		HLayout eastLayout = new HLayout();
		eastLayout.setAlign(Alignment.RIGHT);
		eastLayout.setHeight(HEADER_AREA_HEIGHT);
		eastLayout.setWidth("30%");
		eastLayout.addMember(signedInUser);

		this.addMember(westLayout);
		this.addMember(eastLayout);

	}
}
