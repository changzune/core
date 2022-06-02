package hello.core.member.discont;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @param member
     * @param 할인 대상 금액액     * @return
     */

    int discount(Member member, int price);
}
