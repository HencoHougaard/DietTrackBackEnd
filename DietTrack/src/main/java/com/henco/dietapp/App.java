package com.henco.dietapp;

import com.google.gson.Gson;
import com.henco.dietapp.Domain.*;
import com.henco.dietapp.Factories.*;
import com.henco.dietapp.Services.Impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
@RequestMapping(path = "/dietApp")
public class App 
{

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BantingServiceImpl bantingService;

    @Autowired
    private EatingPlanServiceImpl eatingPlanService;

    @Autowired
    private RegistrationServiceImpl registrationService;

    @Autowired
    private TADayServiceImpl taDayService;


//User mapping
    @GetMapping(path = "/addUser/{id}/{fname}/{sname}/{age}/{length}/{weight}/{stomach}/{waist}/{thigh}/{upperBody}/{arm}")
    public @ResponseBody String addUser(@PathVariable String id, @PathVariable String fname, @PathVariable String sname, @PathVariable int age, @PathVariable String length, @PathVariable String weight, @PathVariable String stomach, @PathVariable String waist, @PathVariable String thigh, @PathVariable String upperBody, @PathVariable String arm)
    {
        User user = UserFactory.buildUser(id, fname, sname, age, length, weight, stomach, waist, thigh, upperBody, arm);
        userService.save(user);
        return new Gson().toJson(user);
    }
//All users
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userService.findAll();
    }
////

    @GetMapping(path = "/readUser/{id}")
    public @ResponseBody String readUser(@PathVariable String id)
    {
        User user = userService.findById(id);
        return new Gson().toJson(user);
    }

    @GetMapping(path = "/updateUser/{id}/{fname}/{sname}/{age}/{length}/{weight}/{stomach}/{waist}/{thigh}/{upperBody}/{arm}")
    public @ResponseBody String updateUser(@PathVariable String id, @PathVariable String fname, @PathVariable String sname, @PathVariable int age, @PathVariable String length, @PathVariable String weight, @PathVariable String stomach, @PathVariable String waist, @PathVariable String thigh, @PathVariable String upperBody, @PathVariable String arm)
    {
        User user = userService.findById(id);

        if(user == null)
        {
            return new Gson().toJson("User does not exist");
        }

        User userUpdate = UserFactory.buildUser(id, fname, sname, age, length, weight, stomach, waist, thigh, upperBody, arm);
        userService.update(userUpdate);
        return new Gson().toJson(userUpdate);
    }

    @GetMapping(path = "/deleteUser/{id}")
    public @ResponseBody void deleteUser(@PathVariable String id)
    {
        User user = userService.findById(id);
        if (user == null)
        {
            System.out.println("User does not exist");
        }
        else
            {
            userService.delete(user);
            System.out.println("User deleted");
        }
    }
//End of user

//Registration
    @GetMapping(path = "/addRegistration/{id}/{username}/{email}/{password}/{gender}/{dateOfBirth}")
    public @ResponseBody String addRegistraion(@PathVariable String id, @PathVariable String username, @PathVariable String email, @PathVariable String password, @PathVariable String gender, @PathVariable Date dateOfBirth)
    {
        Registration registration = RegistrationFactory.buildRegistration(id, username, email, password, gender, dateOfBirth);
        registrationService.save(registration);
        return new Gson().toJson(registration);
    }

    @GetMapping(path = "/readRegistration/{id}")
    public @ResponseBody String readRegistration(@PathVariable String id)
    {
        Registration registration = registrationService.findById(id);
        return new Gson().toJson(registration);
    }

    @GetMapping(path = "/updateRegistration/{id}/{username}/{email}/{password}/{gender}/{dateOfBirth}")
    public @ResponseBody String updateRegistraion(@PathVariable String id, @PathVariable String username, @PathVariable String email, @PathVariable String password, @PathVariable String gender, @PathVariable Date dateOfBirth)
    {
        Registration registration = registrationService.findById(id);

        if(registration == null)
        {
            return new Gson().toJson("User does not exist");
        }

        Registration registration1 = RegistrationFactory.buildRegistration(id, username, email, password, gender, dateOfBirth);
        registrationService.update(registration1);
        return new Gson().toJson(registration1);
    }

    @GetMapping(path = "/deleteRegistraion/{id}")
    public @ResponseBody void deleteRegistraion(@PathVariable String id)
    {
        Registration registraion = registrationService.findById(id);
        if (registraion == null)
        {
            System.out.println("User does not exist");
        }
        else
        {
            registrationService.delete(registraion);
            System.out.println("User deleted");
        }
    }
//End of Registration

//EatingPlan
    @GetMapping(path = "/addEatingPlan/{id}/{day}/{foodType}/{fluids}")
    public @ResponseBody String addEatingPlan(@PathVariable String id,@PathVariable int day, @PathVariable String foodType, @PathVariable String fluids)
    {
        EatingPlan eatingPlan = EatingPlanFactory.buildEatingPlan(id, day, foodType, fluids);
        eatingPlanService.save(eatingPlan);
        return new Gson().toJson(eatingPlan);
    }

    @GetMapping(path = "/readEatingPlan/{id}")
    public @ResponseBody String readEatingPlan(@PathVariable String id)
    {
        EatingPlan eatingPlan = eatingPlanService.findById(id);
        return new Gson().toJson(eatingPlan);
    }

    @GetMapping(path = "/updateEatingPlan/{id}/{day}/{foodType}/{fluids}")
    public @ResponseBody String updateEatingPlan(@PathVariable String id,@PathVariable int day, @PathVariable String foodType, @PathVariable String fluids)
    {
        EatingPlan eatingPlan1 = EatingPlanFactory.buildEatingPlan(id, day, foodType, fluids);
        eatingPlanService.update(eatingPlan1);
        return new Gson().toJson(eatingPlan1);
    }

    @GetMapping(path = "/deleteEatingPlan/{id}")
    public @ResponseBody void deleteEatingPlan(@PathVariable String id)
    {
        EatingPlan eatingPlan = eatingPlanService.findById(id);

        eatingPlanService.delete(eatingPlan);
    }
//End of EatingPlan

//Banting
    @GetMapping(path = "/addBanting/{id}/{day}/{foodType}/{fluids}")
    public @ResponseBody String addBanting(@PathVariable String id, @PathVariable int day, @PathVariable String foodType, @PathVariable String fluids)
    {
        Banting banting = BantingFactory.buildBanting(id, day, foodType, fluids);
        bantingService.save(banting);
        return new Gson().toJson(banting);
    }

    @GetMapping(path = "/readBanting/{id}")
    public @ResponseBody String readBanting(@PathVariable String id)
    {
        Banting banting = bantingService.findById(id);
        return new Gson().toJson(banting);
    }

    @GetMapping(path = "/updateBanting/{id}/{day}/{foodType}/{fluids}")
    public @ResponseBody String updateBanting(@PathVariable String id, @PathVariable int day, @PathVariable String foodType, @PathVariable String fluids)
    {
        Banting banting = BantingFactory.buildBanting(id, day, foodType, fluids);
        bantingService.update(banting);
        return new Gson().toJson(banting);
    }

    @GetMapping(path = "/deleteBanting/{id}")
    public @ResponseBody void deleteBanting(@PathVariable String id)
    {
        Banting banting = bantingService.findById(id);

        eatingPlanService.delete(banting);
    }
//End of Banting

//TADay
    @GetMapping(path = "/addTADay/{id}/{day}/{foodType}/{fluids}")
    public @ResponseBody String addTADay(@PathVariable String id, @PathVariable int day, @PathVariable String foodType, @PathVariable String fluids)
    {
        TADay taDay = TADayFactory.buildTADay(id, day, foodType, fluids);
        taDayService.save(taDay);
        return new Gson().toJson(taDay);
    }

    @GetMapping(path = "/readTADay/{id}")
    public @ResponseBody String readTADay(@PathVariable String id)
    {
        TADay taDay = taDayService.findById(id);
        return new Gson().toJson(taDay);
    }

    @GetMapping(path = "/updateTADay/{id}/{day}/{foodType}/{fluids}")
    public @ResponseBody String updateTADay(@PathVariable String id, @PathVariable int day, @PathVariable String foodType, @PathVariable String fluids)
    {
        TADay taDay = TADayFactory.buildTADay(id, day, foodType, fluids);
        taDayService.update(taDay);
        return new Gson().toJson(taDay);
    }

    @GetMapping(path = "/deleteTADay/{id}")
    public @ResponseBody void deleteTADay(@PathVariable String id)
    {
        TADay taDay = taDayService.findById(id);

        taDayService.delete(taDay);
    }
//End of TADay


}
