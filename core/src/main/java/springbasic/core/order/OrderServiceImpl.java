package springbasic.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springbasic.core.discount.DiscountPolicy;
import springbasic.core.member.Member;
import springbasic.core.member.MemberRepository;

@Component
public class OrderServiceImpl implements OrderService {

    //final 필드는 초기값이 저장되면 최종적인 값이 되어 프로그램 실행 도중 수정 불가
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
