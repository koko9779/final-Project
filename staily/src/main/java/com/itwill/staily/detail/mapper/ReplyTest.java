package com.itwill.staily.detail.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.staily.detail.model.dto.Reply;
import com.itwill.staily.util.Product;

@SuppressWarnings("unused")
public class ReplyTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		ReplyMapper rm = applicationContext.getBean(ReplyMapper.class);
		ProductDetailMapper pdm = applicationContext.getBean(ProductDetailMapper.class);
		
		//댓글 단위 테스트
		//List<Reply> replyList = rm.selectReplyList(1);
		//System.out.println(replyList);
		
		//boolean create = rm.createReply(new Reply(1, 1, "내가 니 애비다", 9999, 1));
		//System.out.println(create);
		
		//boolean delete = rm.deleteReply(new Reply(2, 1, 1));
		//System.out.println(delete);
		
		//상품 단위 테스트
		Product product = pdm.selectProductOne(1);
		System.out.println(product);
		
		//boolean create = pdm.createProduct(new Product(4, 6, "BLOOM*IZ", 17000, "http://cafe.daum.net/official-izone", "대한민국", "서울시", "n", 4234245));
		//System.out.println(create);
		
		//boolean create = pdm.createProductDetail(new Product(4, "팀장님", "스고이"));
		//System.out.println(create);
		
		((ConfigurableApplicationContext)applicationContext).close();

		System.out.println("####"); 
		
	}

}
