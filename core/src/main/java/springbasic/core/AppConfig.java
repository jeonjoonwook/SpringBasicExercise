package springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springbasic.core.discount.DiscountPolicy;
import springbasic.core.discount.FixDiscountPolicy;
import springbasic.core.discount.RateDiscountPolicy;
import springbasic.core.member.MemberRepository;
import springbasic.core.member.MemberService;
import springbasic.core.member.MemberServiceImpl;
import springbasic.core.member.MemoryMemberRepository;
import springbasic.core.order.OrderService;
import springbasic.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
