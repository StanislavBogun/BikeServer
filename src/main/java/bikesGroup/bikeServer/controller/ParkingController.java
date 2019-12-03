package bikesGroup.bikeServer.controller;

import bikesGroup.bikeServer.model.Parking;
import bikesGroup.bikeServer.sevice.ParkingService;
import bikesGroup.bikeServer.sevice.ParkingServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ParkingController {
    @Resource(name = "parkingService")
    private ParkingService parkingService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allParking(){
        List<Parking> parkingList = parkingService.allParking();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("allParking");
        modelAndView.addObject("parkingList", parkingList);
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Parking parking = parkingService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("parking", parking);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editParking(@ModelAttribute("parking") Parking parking) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        parkingService.edit(parking);
        return modelAndView;
    }
}
