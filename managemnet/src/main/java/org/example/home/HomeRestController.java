package org.example.home;

import org.example.home.DTO.SYS_LOC_CD;
import org.example.home.DTO.SYS_MODEL_CD;
import org.example.home.DTO.SYS_SUPP_CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeRestController {


    @Autowired
    public HomeService service;

    @RequestMapping(value = "/get_list", method = RequestMethod.POST)
    public List<SYS_LOC_CD> viewall(SYS_LOC_CD list){

        return service.viewall(list);
    }

    @RequestMapping(value = "/Loc_Updated", method = RequestMethod.POST)
    public SYS_LOC_CD insertLoc(SYS_LOC_CD sys_loc_cd){
        System.out.println(sys_loc_cd);
        return service.insertall(sys_loc_cd);
    }

    @RequestMapping(value = "/Sup_Updated", method = RequestMethod.POST)
    public SYS_SUPP_CD insertSupp(SYS_SUPP_CD sys_supp_cd){
        System.out.println(sys_supp_cd);
        return service.insert_supp(sys_supp_cd);
    }



    @GetMapping("/getOption")
    public List<SYS_SUPP_CD> get_selectbox() {
        return service.get_supp_selectbox();
    }

    @GetMapping("/getOption1")
    public List<SYS_SUPP_CD> get_selectbox1() {
        return service.get_supp_selectbox1();
    }

    @GetMapping("/getMOption")
    public List<SYS_MODEL_CD> get_Mselectbox() {
        return service.get_Mselectbox();
    }

    @RequestMapping(value = "/get_supp_list", method = RequestMethod.POST)
    public List<SYS_SUPP_CD> view_supp(SYS_SUPP_CD supp_list){
        return service.view_supp(supp_list);
    }


    @RequestMapping(value = "/get_model_list", method = RequestMethod.POST)
    public List<SYS_MODEL_CD> view_model(SYS_MODEL_CD model_list) {
        return service.view_model(model_list);
    }



}






