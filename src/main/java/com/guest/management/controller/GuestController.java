package com.guest.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guest.management.model.Guest;
import com.guest.management.repository.Guests;

@Controller
@RequestMapping("/guests")
public class GuestController {
	@Autowired
	private Guests guests;
	
	@GetMapping()
	public ModelAndView listGuests() {
		ModelAndView modelAndView = new ModelAndView("GuestList");
		modelAndView.addObject("guests", guests.findAll());
		modelAndView.addObject(new Guest());
		return modelAndView;
	}
	
	@PostMapping()
	public String save(Guest guest) {
		this.guests.save(guest);
		return "redirect:/guests";
	}
}
