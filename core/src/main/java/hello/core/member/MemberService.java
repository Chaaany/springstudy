package hello.core.member;

public interface MemberService {
    //๊ฐ์, ์กฐํ

    void join(Member member);

    Member findMember(Long memberId);

}
