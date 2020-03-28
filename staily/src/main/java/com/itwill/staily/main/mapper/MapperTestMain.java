package com.itwill.staily.main.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.staily.mypage.model.dto.Bookmark;
import com.itwill.staily.util.Product;
import com.itwill.staily.util.Work;

public class MapperTestMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		MainMapper mainM = applicationContext.getBean(MainMapper.class);
		
		//1. 회원번호를 통해서 즐겨찾기한 목록 찾기
		List<Bookmark> bmList = mainM.selectByBookmark(2);
		for (Bookmark bm : bmList) {
			System.out.println("["+bm.getBmNo()+","+bm.getMember().getmNo()+","+bm.getProduct().getpNo()+":"
								+bm.getProduct().getpName()+","+bm.getProduct().getPdScene()+"]");
		}
		System.out.println("----------------------------------------");	
		
		//2. 인기많은(조회수 높은) 상품 출력
		List<Product> productList = mainM.selectByView();
		for (Product product : productList) {
			System.out.println("["+product.getpNo()+":"+product.getpName()+","+product.getpView()+","+product.getPdScene()+"]");
		}
		System.out.println("----------------------------------------");
		
		//3-1. 카테고리 = 드라마인 작품 출력하기		
		List<Work> workList = mainM.selectByCategory("d");
		for (Work work : workList) {
			System.out.println("["+work.getwNo()+":"+work.getwCategory()+","+work.getwPoster()+"]");
		}
		System.out.println("----------------------------------------");
		
		//4.선택한 작품의 포스터,상품 출력하기(보류)
		/*
		List<Work> workList = mainM.selectByWork(2);
		for (Work work : workList) {
			System.out.println("["+work.getwNo()+","+work.getwCategory()+","+work.getwPoster()+","+work.getwName()+","+work.getwTepisode()
								+","+work.getProduct().getpNo()+","+work.getProduct().getpName()+","+work.getProduct().getPdScene()+"]");
		}
		*/
		//5.선택한 작품의 포스터,해당 회차의 상품들 출력하기(보류)
		/*
		List<Work> wE = mainM.selectByEpisode(1,1);
		for (Work w : wE) {
			System.out.println("["+w.getWdNo()+","+w.getProduct().getpNo()+","+w.getwNo()+","+
								w.getwTepisode()+","+w.getWdEpisode()+","+w.getwPoster()+","+w.getwName()+","+
								w.getProduct().getpName()+","+w.getProduct().getPdScene()+"]");
		}
		*/
		//6.즐겨찾기 등록하기(보류)
		/*
		int result = mainM.createBookmark(1,8);
		System.out.println(result);
		*/
		//7.즐겨찾기 제거하기(보류)
		//int result = mainM.deleteBookmark(2,2);
		//System.out.println(result);
		//8.총회차 찾기(보류)
		int t = mainM.selectTepisode(1);
		System.out.println(t);
		
		
//		AdminServiceImpl as = applicationContext.getBean(AdminServiceImpl.class);
//		ProductDaoImpl ProductDaoImpl = (ProductDaoImpl)applicationContext.getBean(ProductDaoImpl.class);
		
		//2.한페이지에표시할 게시물수 
//		int rowCountPerPage = 5;
//		//3.한페이지에보여줄 페이지번호갯수(<< 1 2 3 4 5 >>)
//		int pageCountPerPage = 10;


		System.out.println("####");


//		Product updateProduct = new Product(80, "징징징징찡", null, "현기증", null, null, null);
//		System.out.println(ProductService.updateProduct(updateProduct));
//		
//		Product sProduct = ProductService.findOneProduct(80);
//		System.out.println(sProduct);
		
//		ProductService.deleteProduct(78);
//		
//		ProductService.createProduct(new Product(null, "신규회원", "경기도 팥죽시", "화이팅면 3302", "080-500-4949", "hero@naver.com", ""));
		

		
	}
	
}
