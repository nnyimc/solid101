package fr.nnyimc.patterns.strategy;

public class ImageManager {
	
	private Object renderer;
	
	public void setRenderer(Object renderer) {
		this.renderer = renderer;
	}
	
	public void show() {
		if (renderer instanceof TVRenderer) {
			TVRenderer tvRenderer = (TVRenderer) renderer;
			tvRenderer.showImage();
		} else if (renderer instanceof LaptopRenderer) {
			LaptopRenderer laptopRenderer = (LaptopRenderer) renderer;
			laptopRenderer.showImage();
		} else if (renderer instanceof SmartphoneRenderer) {
			SmartphoneRenderer smartphoneRenderer = (SmartphoneRenderer) renderer;
			smartphoneRenderer.showImage();
		}
	}

}
