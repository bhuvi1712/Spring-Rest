package com.nt.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	public LocalDate ldt;
	
	public String generateMessage(String user)
	{
		int month=ldt.getMonthValue();
		if(month<3)
			return "Winter Season "+user;
		else if(month<6)
			return "Summer Season "+user;
		else if(month<9)
			return "Rainy Season "+user;
		else
			return "Spring Season";
	}
}
