/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author gsp
 */
@Controller
public class SiswaController {

    @RequestMapping(value = {"/siswa"}, method = RequestMethod.GET)
    public String tabelPage(ModelMap model) {
        return "siswa";
    }

}
