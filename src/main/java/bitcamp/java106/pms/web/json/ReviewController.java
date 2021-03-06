package bitcamp.java106.pms.web.json;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Review;
import bitcamp.java106.pms.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
    
    ReviewService reviewService;
    
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    
  
    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
     public void add(Review review) throws Exception {
    	reviewService.add(review);
    }
    
    
    @RequestMapping("{no}")
    public Review view(@PathVariable int no) throws Exception {
        return reviewService.get(no);  
    }
    
    @RequestMapping("list{page}")
    public List<Review> list( 
    		@RequestParam("pageNo") int pageNo,
    		@RequestParam("pageSize") int pageSize,
            @RequestParam("category") String name) {
    	return reviewService.selectList(pageNo, pageSize, name);
    }
    
    @RequestMapping("listall")
    public List<Review> selectListAll() throws Exception {
    	return reviewService.selectListAll();
    }
    
    
    @RequestMapping("count")
    public List<Review> count() throws Exception {
    	return reviewService.count();
    }
    
    @RequestMapping("countOne")
    public Review countOne(String category) throws Exception {
    	return reviewService.countOne(category);
    }
    
    @RequestMapping("delete")
    public void delete(@RequestParam("no") int no) throws Exception {
        reviewService.delete(no);
    }
    
    
   @RequestMapping("myReview")
    public Review getMyReview(
    		@RequestParam("memNo") int memNo,
    		@RequestParam("studyNo") int studyNo) {
    	return reviewService.getMyReview(memNo, studyNo);
    }
    
    
    @RequestMapping("update")
    public void update(Review review) throws Exception {
        reviewService.update(review);
    }
    
  
    
}
