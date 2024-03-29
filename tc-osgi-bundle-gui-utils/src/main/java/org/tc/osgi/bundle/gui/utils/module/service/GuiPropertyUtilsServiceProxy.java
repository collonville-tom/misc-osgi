package org.tc.osgi.bundle.gui.utils.module.service;

import org.tc.osgi.bundle.utils.interf.conf.IYamlProperty;
import org.tc.osgi.bundle.utils.interf.conf.exception.FieldTrackingAssignementException;
import org.tc.osgi.bundle.utils.interf.module.service.IPropertyUtilsService;

public class GuiPropertyUtilsServiceProxy implements IPropertyUtilsService {

	private static GuiPropertyUtilsServiceProxy instance = null;

	public static GuiPropertyUtilsServiceProxy getInstance() {
		if (GuiPropertyUtilsServiceProxy.instance == null) {
			GuiPropertyUtilsServiceProxy.instance = new GuiPropertyUtilsServiceProxy();
		}
		return GuiPropertyUtilsServiceProxy.instance;
	}

	private IPropertyUtilsService service = null;

	private GuiPropertyUtilsServiceProxy() {

	}

	@Override
	public IYamlProperty getYamlPropertyFile(final String propertyFileName) throws FieldTrackingAssignementException {
		return service.getYamlPropertyFile(propertyFileName);
	}

	public void setService(final IPropertyUtilsService service) {
		this.service = service;
	}
}
