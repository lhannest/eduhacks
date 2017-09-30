package com.eduhacks.project.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class MainUI extends UI{
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();
        
        setContent(layout);
        
        layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        layout.addComponent(new Label("Hello world!"));
        
        Button button = new Button();
        button.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				System.out.println("YAYYY");
			}
        	
        });
    }
}
