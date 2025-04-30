package com.midterm.product;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/product")
@Slf4j
public class ProductController {

	// ProductService 객체 주입
	ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	// 상품 목록 조회 
	@RequestMapping(value="/list", method)
	public ModelAndView getProductList() {
		ModelAndView mv = new ModelAndView();
		log.info("list controller");
		Map<String, Object> result=productService.getProductList();
		
		mv.addObject("result",result);
		return mv;
	}
	
	// 상품 상세 조회 
    public ModelAndView getProduct() {
    	ModelAndView mv = new ModelAndView();
    	
    	
        return mv;
    }
}
