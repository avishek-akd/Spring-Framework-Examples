package com.avishek.spring;



import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController{
	
	@RequestMapping(value="/uploadfile.abhi", method=RequestMethod.POST)
	public String uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile []allfile, HttpServletRequest req){
		System.out.println("uploadFile()");
		
		String view="";
		
		
		
		for (MultipartFile myfile : allfile) {
			
			
			String filename = myfile.getOriginalFilename();
			System.out.println(filename);
			
			
			
			if (myfile.isEmpty()) {
				
				req.setAttribute("EMSG", "Choose File");
				view = "index";
				break;
				
			}else if(myfile.getSize()>=500000){
				req.setAttribute("EMSG", "File Size Exceed");
				view = "index";
				break;
			}else{
				
				try {
					String path = "/Debian/STUDY/SPRING/DOCUMENTS/SPRING/UploadFile";   //Where To Store File
					File dir = new File(path);                                           //Create Directory
					
					if (!dir.exists()){ 
						dir.mkdirs();													 //Create Directory
					}else{
						
						File file = new File(path,filename);								//Create file in path directory
						FileOutputStream fos = new FileOutputStream(file);
						
						byte[] filedata = myfile.getBytes();   // Get binary data from file
						fos.write(filedata);					//Write binary data into file
						
						view = "success";
						req.setAttribute("NMSG", name);
					}
				} catch (Exception e) {
					req.setAttribute("EMSG", e.getMessage());
					view = "index";
					e.printStackTrace();
				}
			}
		
		}
		return view;
		
	}
	
}
