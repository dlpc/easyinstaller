package com.jianglibo.vaadin.dashboard.view.box;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.google.common.eventbus.EventBus;
import com.jianglibo.vaadin.dashboard.domain.Box;
import com.jianglibo.vaadin.dashboard.domain.Domains;
import com.jianglibo.vaadin.dashboard.repositories.BoxRepository;
import com.jianglibo.vaadin.dashboard.uicomponent.form.FormBase;
import com.jianglibo.vaadin.dashboard.util.FormFieldsFactory;

@SuppressWarnings("serial")
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BoxForm extends FormBase<Box> {
	
	private final BoxRepository repository;
	
	@Autowired
	public BoxForm(MessageSource messageSource, Domains domains, FormFieldsFactory formFieldsFactory, BoxRepository repository) {
		super(Box.class, messageSource, domains, formFieldsFactory);
		this.repository = repository;
	}
	
	public BoxForm afterInjection(EventBus eventBus) {
		defaultAfterInjection(eventBus);
		return this;
	}

	@Override
	public boolean saveToRepo() {
        repository.save(getWrappedBean());
		return true;
	}
}