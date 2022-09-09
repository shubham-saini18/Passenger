package com.passenger.passenger.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.passenger.passenger.model.Passenger;

@Service
public class PasServiceImpl implements PasService{
List<Passenger>  list;
public PasServiceImpl() {
	list = new ArrayList<>();
	list.add(new Passenger(201,"Shubham",23,"M"));
	list.add(new Passenger(202,"Aditya",18,"M"));
	list.add(new Passenger(203,"Ritika",23,"F"));
	list.add(new Passenger(204,"Suhani",32,"f"));
	list.add(new Passenger(205,"Manisha",22,"F"));
	list.add(new Passenger(206,"Vijay",36,"M"));
	list.add(new Passenger(207,"Komal",12,"F"));
	list.add(new Passenger(208,"Monika",26,"F"));
	list.add(new Passenger(209,"Tim",45,"M"));
	list.add(new Passenger(210,"Jim",71,"M"));
}
	@Override
	public List<Passenger> getPessenger() {
				return list;
	}

}
