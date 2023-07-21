package com.example.demo_spring_v1.controller;

import com.example.demo_spring_v1.dto.StudentDTO;
import com.example.demo_spring_v1.service.impl.StudentServices;
import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller

@MultipartConfig
public class StudentSSRController {
    @Autowired
    private StudentServices studentServices;
    @Value("${upload.path}")
    private String path_file;
    @GetMapping("homepage")
    public String homePage(Model model , @RequestParam("page")Optional<Integer>page,
                                        @RequestParam("size") Optional<Integer> size){
        int pageIndex =page.orElse(1);
        int pagesize = size.orElse(3);
        Pageable pageable = PageRequest.of(pageIndex-1,pagesize);

        Page<StudentDTO> studentDTOList = studentServices.getAll(pageable);
        int totalPage = studentDTOList.getTotalPages();
        model.addAttribute("list_student",studentDTOList);
        model.addAttribute("txt_search","");
        model.addAttribute("totapages",totalPage);
        model.addAttribute("currentpage",pageIndex);
        return "homepage";
    }

    @GetMapping(value = "/save")
    public String save(Model model){
        model.addAttribute("student",new StudentDTO());
        return "add";
    }
    @PostMapping("/save")
    public String saveOrUpdate(Model model, @ModelAttribute StudentDTO studentDTO){
        try {
            MultipartFile multipartFile = studentDTO.getFile();
            String name_image = multipartFile.getOriginalFilename();
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(path_file+File.separator+name_image)));
            stream.write(multipartFile.getBytes());
            stream.close();
            studentDTO.setImage(name_image);
            studentServices.save(studentDTO);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:/admin/homepage";
    }

    @PostMapping("search")
    public String search(Model model, @RequestParam("txt_search") String name_search){
//        List<StudentDTO> studentDTOS = new ArrayList<>();
//        if (name_search.equals("")){
//            studentDTOS= studentServices.getAll();
//        }else {
//            studentDTOS =  studentServices.findByName(name_search);
//        }
//
//        model.addAttribute("list_student",studentDTOS);
//        model.addAttribute("txt_search",name_search);
        return "homepage";
    }


}
