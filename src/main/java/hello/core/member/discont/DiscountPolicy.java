package hello.core.member.discont;

import hello.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
