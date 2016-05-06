package hw4;
import java.util.*;
public class Mobile implements Comparable<Mobile>{
	String type;
	Double processor;
	int battery;
	int ram;
	int storage;
	Double camera;
	int price;
	public Mobile(String type, Double processor, int battery, int ram, int storage, Double camera, int price) {
		this.type = type;
		this.processor = processor;
		this.battery = battery;
		this.ram = ram;
		this.storage = storage;
		this.camera = camera;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getProcessor() {
		return processor;
	}
	public void setProcessor(Double processor) {
		this.processor = processor;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public Double getCamera() {
		return camera;
	}
	public void setCamera(Double camera) {
		this.camera = camera;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Mobile compareMobile) {
		// TODO Auto-generated method stub
		int compareRAM = ((Mobile)compareMobile).getRam()-this.ram;
		if(compareRAM == 0)
		{
			int compareBattery = ((Mobile)compareMobile).getBattery()-this.battery;
			if(compareBattery==0)
			{
				Double compareProcessor = ((Mobile)compareMobile).getProcessor()-this.processor;
				if(compareProcessor==0)
				{
					int compareStorage = ((Mobile)compareMobile).getStorage()-this.storage;
					if(compareStorage==0)
					{
						Double compareCamera = ((Mobile)compareMobile).getCamera()-this.camera;
						if(compareCamera==0)
						{
							int comparePrice = ((Mobile)compareMobile).getPrice()-this.price;
							if(comparePrice==0)
							{
								return 0;
							}
							else if(comparePrice>0){return 1;} else return -1;
						}
						else if(compareCamera>0){return 1;} else return -1;
					}
					else if(compareStorage>0){return 1;} else return -1;
				}
				else if(compareProcessor>0){return 1;} else return -1;
			}
			else if(compareBattery>0){return 1;} else return -1;
		}
		else if(compareRAM>0){return 1;} else return -1;
	}
}
