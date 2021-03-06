package event;

import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MailDelivery extends Event {
	private double weight;
	private double volume;
	private static final String eventType = "mailDelivery";
	

	public MailDelivery(ZonedDateTime dateTime, String user, String origin, String destination, double weight, double volume, String priority) {
		super(dateTime, user, origin, destination, priority);
		this.weight = weight;
		this.volume = volume;
		
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MailDelivery Event");
		sb.append("\nOrigin: " + this.origin);
		sb.append("\nDestination: " + this.destination);
		sb.append("\nPriority: " + this.priority);
		sb.append("\nPrice per kg: " + this.weight);
		sb.append("\nPrice per cubic cm: " + this.volume);
		//sb.append("\nUser: "+ this.user);
		
		return sb.toString();
	}
	//For XML purposes don't remove
	public MailDelivery(){}
	
	@XmlAttribute
	public String getEventType(){
		return eventType;
	}
	
	@XmlElement
	public double getWeight() {
		return weight;
	}
	
	@XmlElement
	public double getVolume() {
		return volume;
	}
	
	@XmlElement
	public String getPriority() {
		return priority;
	}
}
