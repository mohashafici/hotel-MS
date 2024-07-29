package com.hotelmanagement.hotelmanagement.controller;

import com.hotelmanagement.hotelmanagement.entity.Guest;
import com.hotelmanagement.hotelmanagement.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String getAllGuests(Model model) {
        List<Guest> guests = guestService.getAllGuests();
        model.addAttribute("guests", guests);
        return "guest-list";
    }

    @GetMapping("/new")
    public String createGuestForm(Model model) {
        model.addAttribute("guest", new Guest());
        return "guest-form";
    }

    @PostMapping
    public String saveGuest(Guest guest) {
        guestService.saveGuest(guest);
        return "redirect:/guests";
    }

    @GetMapping("/{id}")
    public String getGuestById(@PathVariable Long id, Model model) {
        Guest guest = guestService.getGuestById(id);
        model.addAttribute("guest", guest);
        return "guest-detail";
    }

    @GetMapping("/edit/{id}")
    public String editGuestForm(@PathVariable Long id, Model model) {
        Guest guest = guestService.getGuestById(id);
        model.addAttribute("guest", guest);
        return "guest-form";
    }

    @PostMapping("/update/{id}")
    public String updateGuest(@PathVariable Long id, Guest guest) {
        guest.setId(id);
        guestService.saveGuest(guest);
        return "redirect:/guests";
    }

    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable Long id) {
        guestService.deleteGuest(id);
        return "redirect:/guests";
    }
}
